package com.pinganfu.tqc.common.dal.suning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.pinganfu.tqc.common.dal.constant.DalConstant;
import com.pinganfu.tqc.common.dal.pagination.Page;
import com.pinganfu.tqc.common.dal.pagination.PaginationBean;
import com.suning.framework.dal.client.support.DefaultDalClient;

public class BaseDalClient extends DefaultDalClient {

	private Logger logger = LoggerFactory.getLogger(BaseDalClient.class);

	/**
	 * 
	 * @param countSqlId
	 * @param pageSqlId
	 * @param args[0] pageNumber 请求页
	 * @param args[1] pageSize 每页容量
	 * @param args...  其他查询参数
	 * @return
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public PaginationBean queryForPage(String countSqlId, String pageSqlId,
			Map<String, Object> paramMap) {
		// 得到总记录数
		Integer totalRecords = super.queryForObject(countSqlId, paramMap,
				Integer.class);
		int currentPage = DalConstant.DEFAULT_CURRENT_PAGE;
		int pageSize = DalConstant.DEFAULT_PAGE_SIZE;
		if (totalRecords > 0) {
			try {
				currentPage = Integer.valueOf((String)paramMap
						.get(DalConstant.STR_CURRENT_PAGE));
				pageSize = Integer.valueOf((String)paramMap
						.get(DalConstant.STR_PAGE_SIZE));
			} catch (NumberFormatException nfe) {
				currentPage = DalConstant.DEFAULT_CURRENT_PAGE;
				pageSize = DalConstant.DEFAULT_PAGE_SIZE;
			}
		}
		Page page = new Page(pageSize, currentPage);
		PaginationBean paginationBean = new PaginationBean(page, totalRecords);
		if(null == paramMap){
			paramMap = new HashMap<String, Object>();
		}
		paramMap.put("beginIndex", paginationBean.getBeginIndex());
		paramMap.put("maxRow", paginationBean.getPageSize());
		List<Map<String, Object>> pageList = new ArrayList<Map<String, Object>>();
		pageList = super.queryForList(pageSqlId, paramMap);
		paginationBean.setPageList(pageList);
		return paginationBean;
	}

}
