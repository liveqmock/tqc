package com.pinganfu.tqc.common.dal.base;

import java.util.List;

import com.pinganfu.tqc.common.dal.pagination.Page;
import com.pinganfu.tqc.common.dal.pagination.PaginationBean;

public abstract interface BaseDao<T> {
	
	public abstract int insertData(T paramT);

	public abstract int deleteDataByPK(Object paramObject);

	public abstract int deleteData(T paramT);

	public abstract int updateData(T paramT);

	public abstract int updateDataByPK(T paramT);

	public abstract Object queryObjectByPK(Object paramObject);

	public abstract int queryForInt(T paramT);
	
	public abstract T queryObject(T paramT);

	public abstract List<T> queryForListAll();

	public abstract List<T> queryForList(T paramT);

	public abstract List<T> queryForList(T paramT, int paramInt1, int paramInt2);
	
	public abstract PaginationBean<T> queryForListByPagination(T paramT,
			Page paramPage);
	
	public abstract List<T> queryForList(String sql, Object ...args);
	
	/**
	 * 
	 * @param countSQL 查询页数SQL
	 * @param pageSQL 查询数据SQL
	 * @param args args[0]=${currentPage}, args[1]=${pageSize}
	 * @return
	 */
	public abstract PaginationBean<T> queryForListByPagination(String countSQL, String pageSQL,
			Object ...args);
	

}