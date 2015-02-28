package com.pinganfu.tqc.common.dal.spring;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.pinganfu.tqc.common.dal.constant.DalConstant;
import com.pinganfu.tqc.common.dal.pagination.Page;
import com.pinganfu.tqc.common.dal.pagination.PaginationBean;

public class SpringBaseDaoImpl{
	
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	/**
	 * 执行sql语句,如DDL语句.
	 * 
	 * @param sql
	 */
	public void execute(String sql) {
		jdbcTemplate.execute(sql);
	}

	/**
	 * 提供对表的增加、删除、修改操作
	 * 
	 * @param sql
	 *            要执行的sql语句
	 * @param args
	 *            可变变参
	 * @return 受影响的行数
	 */
	public int update(String sql, Object... args) {
		return jdbcTemplate.update(sql, args);
	}

	/**
	 * 批量更新多条记录
	 * 
	 * @param sql
	 *            多条sql组成的数组(不带参数的)
	 * @return 影响行数数组
	 */
	public int[] batchUpdate(String[] sql) {
		return jdbcTemplate.batchUpdate(sql);
	}

	/**
	 * 查询得到一个List
	 * @param sql   查询语句
	 * @param rowMapper  
	 * @param args  补充参数
	 * @return
	 */
	public <T> List<T> query(String sql, RowMapper<T> rowMapper, Object... args) {
		return jdbcTemplate.query(sql, rowMapper, args);
	}

	public int queryForInt(String sql, Object... args) {
		return jdbcTemplate.queryForObject(sql, Integer.class, args);
	}

	public long queryForLong(String sql, Object... args) {
		return jdbcTemplate.queryForObject(sql, Long.class, args);
	}
	
	public <T> T queryForObject(String sql, Class<T> requiredType, Object... args){
		return jdbcTemplate.queryForObject(sql, requiredType, args);
	}

	public <T> T queryForObject(String sql, RowMapper<T> rowMapper,
			Object... args) {
		return jdbcTemplate.queryForObject(sql, rowMapper, args);
	}

	public List<Map<String, Object>> queryForList(String sql, Object... args) {
		return jdbcTemplate.queryForList(sql, args);
	}

	public SqlRowSet queryForRowSet(String sql, Object... args) {
		return jdbcTemplate.queryForRowSet(sql, args);
	}

	/**
	 * 分页查询
	 * @param countSQL  计算总记录数sql语句  如select count(id) from table
	 * @param pageSQL   分页查询语句,根据不同数据库有不同的sql语句  如select * from table limit offset,maxRow
	 * @param rowMapper 为了便于将Model类逐一赋值到List中
	 * @param args[0] pageNumber 请求页
	 * @param args[1] pageSize 每页容量
	 * @param args...  其他查询参数
	 * @return
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public PaginationBean queryForListByPagination(String countSQL, String pageSQL, Object... args) {
		// 计算总记录数
		Integer totalRecords = (Integer) queryForInt(countSQL, args);;
		int currentPage = DalConstant.DEFAULT_CURRENT_PAGE;
		int pageSize = DalConstant.DEFAULT_PAGE_SIZE;
		if (totalRecords > 0) {
			try {
				currentPage = Integer.valueOf(String.valueOf(args[0]));
				pageSize = Integer.valueOf(String.valueOf(args[1]));
			} catch (NumberFormatException nfe) {
				currentPage = DalConstant.DEFAULT_CURRENT_PAGE;
				pageSize = DalConstant.DEFAULT_PAGE_SIZE;
			}
		}
		Page page = new Page(pageSize, currentPage);
		PaginationBean paginationBean = new PaginationBean(page, totalRecords);
		List<Map<String, Object>> pageList = new ArrayList<Map<String, Object>>();
		pageList = queryForList(pageSQL, args);
		paginationBean.setPageList(pageList);
		return paginationBean;
	}

}
