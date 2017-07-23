/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.river.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.spring.extender.service.ServiceReference;

import com.river.exception.NoSuchriversException;

import com.river.model.impl.riversImpl;
import com.river.model.impl.riversModelImpl;
import com.river.model.rivers;

import com.river.service.persistence.riversPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the rivers service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see riversPersistence
 * @see com.river.service.persistence.riversUtil
 * @generated
 */
@ProviderType
public class riversPersistenceImpl extends BasePersistenceImpl<rivers>
	implements riversPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link riversUtil} to access the rivers persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = riversImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(riversModelImpl.ENTITY_CACHE_ENABLED,
			riversModelImpl.FINDER_CACHE_ENABLED, riversImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(riversModelImpl.ENTITY_CACHE_ENABLED,
			riversModelImpl.FINDER_CACHE_ENABLED, riversImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(riversModelImpl.ENTITY_CACHE_ENABLED,
			riversModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public riversPersistenceImpl() {
		setModelClass(rivers.class);
	}

	/**
	 * Caches the rivers in the entity cache if it is enabled.
	 *
	 * @param rivers the rivers
	 */
	@Override
	public void cacheResult(rivers rivers) {
		entityCache.putResult(riversModelImpl.ENTITY_CACHE_ENABLED,
			riversImpl.class, rivers.getPrimaryKey(), rivers);

		rivers.resetOriginalValues();
	}

	/**
	 * Caches the riverses in the entity cache if it is enabled.
	 *
	 * @param riverses the riverses
	 */
	@Override
	public void cacheResult(List<rivers> riverses) {
		for (rivers rivers : riverses) {
			if (entityCache.getResult(riversModelImpl.ENTITY_CACHE_ENABLED,
						riversImpl.class, rivers.getPrimaryKey()) == null) {
				cacheResult(rivers);
			}
			else {
				rivers.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all riverses.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(riversImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the rivers.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(rivers rivers) {
		entityCache.removeResult(riversModelImpl.ENTITY_CACHE_ENABLED,
			riversImpl.class, rivers.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<rivers> riverses) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (rivers rivers : riverses) {
			entityCache.removeResult(riversModelImpl.ENTITY_CACHE_ENABLED,
				riversImpl.class, rivers.getPrimaryKey());
		}
	}

	/**
	 * Creates a new rivers with the primary key. Does not add the rivers to the database.
	 *
	 * @param riverid the primary key for the new rivers
	 * @return the new rivers
	 */
	@Override
	public rivers create(int riverid) {
		rivers rivers = new riversImpl();

		rivers.setNew(true);
		rivers.setPrimaryKey(riverid);

		return rivers;
	}

	/**
	 * Removes the rivers with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param riverid the primary key of the rivers
	 * @return the rivers that was removed
	 * @throws NoSuchriversException if a rivers with the primary key could not be found
	 */
	@Override
	public rivers remove(int riverid) throws NoSuchriversException {
		return remove((Serializable)riverid);
	}

	/**
	 * Removes the rivers with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the rivers
	 * @return the rivers that was removed
	 * @throws NoSuchriversException if a rivers with the primary key could not be found
	 */
	@Override
	public rivers remove(Serializable primaryKey) throws NoSuchriversException {
		Session session = null;

		try {
			session = openSession();

			rivers rivers = (rivers)session.get(riversImpl.class, primaryKey);

			if (rivers == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchriversException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(rivers);
		}
		catch (NoSuchriversException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected rivers removeImpl(rivers rivers) {
		rivers = toUnwrappedModel(rivers);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(rivers)) {
				rivers = (rivers)session.get(riversImpl.class,
						rivers.getPrimaryKeyObj());
			}

			if (rivers != null) {
				session.delete(rivers);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (rivers != null) {
			clearCache(rivers);
		}

		return rivers;
	}

	@Override
	public rivers updateImpl(rivers rivers) {
		rivers = toUnwrappedModel(rivers);

		boolean isNew = rivers.isNew();

		Session session = null;

		try {
			session = openSession();

			if (rivers.isNew()) {
				session.save(rivers);

				rivers.setNew(false);
			}
			else {
				rivers = (rivers)session.merge(rivers);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		entityCache.putResult(riversModelImpl.ENTITY_CACHE_ENABLED,
			riversImpl.class, rivers.getPrimaryKey(), rivers, false);

		rivers.resetOriginalValues();

		return rivers;
	}

	protected rivers toUnwrappedModel(rivers rivers) {
		if (rivers instanceof riversImpl) {
			return rivers;
		}

		riversImpl riversImpl = new riversImpl();

		riversImpl.setNew(rivers.isNew());
		riversImpl.setPrimaryKey(rivers.getPrimaryKey());

		riversImpl.setRiverid(rivers.getRiverid());
		riversImpl.setName(rivers.getName());
		riversImpl.setUrl(rivers.getUrl());

		return riversImpl;
	}

	/**
	 * Returns the rivers with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the rivers
	 * @return the rivers
	 * @throws NoSuchriversException if a rivers with the primary key could not be found
	 */
	@Override
	public rivers findByPrimaryKey(Serializable primaryKey)
		throws NoSuchriversException {
		rivers rivers = fetchByPrimaryKey(primaryKey);

		if (rivers == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchriversException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return rivers;
	}

	/**
	 * Returns the rivers with the primary key or throws a {@link NoSuchriversException} if it could not be found.
	 *
	 * @param riverid the primary key of the rivers
	 * @return the rivers
	 * @throws NoSuchriversException if a rivers with the primary key could not be found
	 */
	@Override
	public rivers findByPrimaryKey(int riverid) throws NoSuchriversException {
		return findByPrimaryKey((Serializable)riverid);
	}

	/**
	 * Returns the rivers with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the rivers
	 * @return the rivers, or <code>null</code> if a rivers with the primary key could not be found
	 */
	@Override
	public rivers fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(riversModelImpl.ENTITY_CACHE_ENABLED,
				riversImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		rivers rivers = (rivers)serializable;

		if (rivers == null) {
			Session session = null;

			try {
				session = openSession();

				rivers = (rivers)session.get(riversImpl.class, primaryKey);

				if (rivers != null) {
					cacheResult(rivers);
				}
				else {
					entityCache.putResult(riversModelImpl.ENTITY_CACHE_ENABLED,
						riversImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(riversModelImpl.ENTITY_CACHE_ENABLED,
					riversImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return rivers;
	}

	/**
	 * Returns the rivers with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param riverid the primary key of the rivers
	 * @return the rivers, or <code>null</code> if a rivers with the primary key could not be found
	 */
	@Override
	public rivers fetchByPrimaryKey(int riverid) {
		return fetchByPrimaryKey((Serializable)riverid);
	}

	@Override
	public Map<Serializable, rivers> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, rivers> map = new HashMap<Serializable, rivers>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			rivers rivers = fetchByPrimaryKey(primaryKey);

			if (rivers != null) {
				map.put(primaryKey, rivers);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(riversModelImpl.ENTITY_CACHE_ENABLED,
					riversImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (rivers)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_RIVERS_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append(String.valueOf(primaryKey));

			query.append(StringPool.COMMA);
		}

		query.setIndex(query.index() - 1);

		query.append(StringPool.CLOSE_PARENTHESIS);

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (rivers rivers : (List<rivers>)q.list()) {
				map.put(rivers.getPrimaryKeyObj(), rivers);

				cacheResult(rivers);

				uncachedPrimaryKeys.remove(rivers.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(riversModelImpl.ENTITY_CACHE_ENABLED,
					riversImpl.class, primaryKey, nullModel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the riverses.
	 *
	 * @return the riverses
	 */
	@Override
	public List<rivers> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the riverses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link riversModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of riverses
	 * @param end the upper bound of the range of riverses (not inclusive)
	 * @return the range of riverses
	 */
	@Override
	public List<rivers> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the riverses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link riversModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of riverses
	 * @param end the upper bound of the range of riverses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of riverses
	 */
	@Override
	public List<rivers> findAll(int start, int end,
		OrderByComparator<rivers> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the riverses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link riversModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of riverses
	 * @param end the upper bound of the range of riverses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of riverses
	 */
	@Override
	public List<rivers> findAll(int start, int end,
		OrderByComparator<rivers> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<rivers> list = null;

		if (retrieveFromCache) {
			list = (List<rivers>)finderCache.getResult(finderPath, finderArgs,
					this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_RIVERS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_RIVERS;

				if (pagination) {
					sql = sql.concat(riversModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<rivers>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<rivers>)QueryUtil.list(q, getDialect(), start,
							end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the riverses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (rivers rivers : findAll()) {
			remove(rivers);
		}
	}

	/**
	 * Returns the number of riverses.
	 *
	 * @return the number of riverses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_RIVERS);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return riversModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the rivers persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(riversImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_RIVERS = "SELECT rivers FROM rivers rivers";
	private static final String _SQL_SELECT_RIVERS_WHERE_PKS_IN = "SELECT rivers FROM rivers rivers WHERE riverid IN (";
	private static final String _SQL_COUNT_RIVERS = "SELECT COUNT(rivers) FROM rivers rivers";
	private static final String _ORDER_BY_ENTITY_ALIAS = "rivers.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No rivers exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(riversPersistenceImpl.class);
}