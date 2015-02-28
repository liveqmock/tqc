package com.pinganfu.tqc.common.dal.hibernate;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.pinganfu.tqc.common.dal.base.BaseDao;
import com.pinganfu.tqc.common.dal.constant.DalConstant;
import com.pinganfu.tqc.common.dal.pagination.Page;
import com.pinganfu.tqc.common.dal.pagination.PaginationBean;

/**
 * 
 * @author yanjiawei 2015.01.15
 *
 * @param <T> 模型DO
 */
public class HibernateBaseDaoImpl <T> implements BaseDao<T>{

	private SessionFactory sessionFactory;
	
	protected String entityClassName;
	private Class<T> entityClass;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	/**
	 * 根据查询函数与参数列表创建Query对象,后续可进行更多处理,辅助函数.<br>
	 * 对于需要first,max,fetchsize,cache,cacheRegion等诸多设置的函数,可以在返回Query后自行设置.
	 * 
	 * @param hql
	 * @param values
	 * @return
	 */
	protected Query createQuery(String hql, Object... values) {
		// 这里的false表示不创建session保证,当前操作在spring同一个事务的管理下
		Query query = getSession().createQuery(hql);
		if (values != null) {
			for (int i = 0; i < values.length; i++) {
				query.setParameter(i, values[i]);
			}
		}
		return query;
	}
	
	@Override
	public int insertData(T paramT) {
		getSession().save(paramT);
		return 0;
	}

	@Override
	public int deleteDataByPK(Object pk) {
		getSession().delete(this.queryObjectByPK(pk));
		return 0;
	}

	@Override
	public int deleteData(T paramT) {
		getSession().delete(paramT);
		return 0;
	}

	@Override
	public int updateData(T paramT) {
		getSession().update(paramT);
		return 0;
	}

	@Override
	public int updateDataByPK(T paramT) {
		getSession().update(paramT);
		return 0;
	}

	@Override
	public Object queryObjectByPK(Object pk) {
		return getSession().get(this.entityClass, (Serializable) pk);
	}

	@Override
	public int queryForInt(T paramT) {
		return 0;
	}
	
	@Override
	public T queryObject(T paramT) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> queryForListAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<T> queryForList(T paramT) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> queryForList(T paramT, int paramInt1, int paramInt2) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<T> queryForList(String hql, Object... args) {
		return createQuery(hql, args).list();
	}

	@Override
	public PaginationBean<T> queryForListByPagination(T paramT, Page paramPage) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public PaginationBean<T> queryForListByPagination(String countSQL, String pageSQL,
			Object ...args){
		// 计算总记录数
		List<T> countlist = queryForList(countSQL, args);
		Integer totalRecords = (Integer) countlist.get(0);
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
		PaginationBean<T> paginationBean = new PaginationBean<T>(page, totalRecords);
		Query query = createQuery(pageSQL, args);
		List<T> pageList = query.setFirstResult(paginationBean.getBeginIndex())
				.setMaxResults(paginationBean.getPageSize()).list();
		paginationBean.setPageList(pageList);
		return paginationBean;
	}
	
}
