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

package com.lake.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.lake.exception.NoSuchlakesException;

import com.lake.model.impl.lakesImpl;
import com.lake.model.impl.lakesModelImpl;
import com.lake.model.lakes;

import com.lake.service.persistence.lakesPersistence;

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

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the lakes service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see lakesPersistence
 * @see com.lake.service.persistence.lakesUtil
 * @generated
 */
@ProviderType
public class lakesPersistenceImpl extends BasePersistenceImpl<lakes>
	implements lakesPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link lakesUtil} to access the lakes persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = lakesImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(lakesModelImpl.ENTITY_CACHE_ENABLED,
			lakesModelImpl.FINDER_CACHE_ENABLED, lakesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(lakesModelImpl.ENTITY_CACHE_ENABLED,
			lakesModelImpl.FINDER_CACHE_ENABLED, lakesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(lakesModelImpl.ENTITY_CACHE_ENABLED,
			lakesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public lakesPersistenceImpl() {
		setModelClass(lakes.class);
	}

	/**
	 * Caches the lakes in the entity cache if it is enabled.
	 *
	 * @param lakes the lakes
	 */
	@Override
	public void cacheResult(lakes lakes) {
		entityCache.putResult(lakesModelImpl.ENTITY_CACHE_ENABLED,
			lakesImpl.class, lakes.getPrimaryKey(), lakes);

		lakes.resetOriginalValues();
	}

	/**
	 * Caches the lakeses in the entity cache if it is enabled.
	 *
	 * @param lakeses the lakeses
	 */
	@Override
	public void cacheResult(List<lakes> lakeses) {
		for (lakes lakes : lakeses) {
			if (entityCache.getResult(lakesModelImpl.ENTITY_CACHE_ENABLED,
						lakesImpl.class, lakes.getPrimaryKey()) == null) {
				cacheResult(lakes);
			}
			else {
				lakes.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all lakeses.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(lakesImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the lakes.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(lakes lakes) {
		entityCache.removeResult(lakesModelImpl.ENTITY_CACHE_ENABLED,
			lakesImpl.class, lakes.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<lakes> lakeses) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (lakes lakes : lakeses) {
			entityCache.removeResult(lakesModelImpl.ENTITY_CACHE_ENABLED,
				lakesImpl.class, lakes.getPrimaryKey());
		}
	}

	/**
	 * Creates a new lakes with the primary key. Does not add the lakes to the database.
	 *
	 * @param lakeid the primary key for the new lakes
	 * @return the new lakes
	 */
	@Override
	public lakes create(int lakeid) {
		lakes lakes = new lakesImpl();

		lakes.setNew(true);
		lakes.setPrimaryKey(lakeid);

		return lakes;
	}

	/**
	 * Removes the lakes with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param lakeid the primary key of the lakes
	 * @return the lakes that was removed
	 * @throws NoSuchlakesException if a lakes with the primary key could not be found
	 */
	@Override
	public lakes remove(int lakeid) throws NoSuchlakesException {
		return remove((Serializable)lakeid);
	}

	/**
	 * Removes the lakes with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the lakes
	 * @return the lakes that was removed
	 * @throws NoSuchlakesException if a lakes with the primary key could not be found
	 */
	@Override
	public lakes remove(Serializable primaryKey) throws NoSuchlakesException {
		Session session = null;

		try {
			session = openSession();

			lakes lakes = (lakes)session.get(lakesImpl.class, primaryKey);

			if (lakes == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchlakesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(lakes);
		}
		catch (NoSuchlakesException nsee) {
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
	protected lakes removeImpl(lakes lakes) {
		lakes = toUnwrappedModel(lakes);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(lakes)) {
				lakes = (lakes)session.get(lakesImpl.class,
						lakes.getPrimaryKeyObj());
			}

			if (lakes != null) {
				session.delete(lakes);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (lakes != null) {
			clearCache(lakes);
		}

		return lakes;
	}

	@Override
	public lakes updateImpl(lakes lakes) {
		lakes = toUnwrappedModel(lakes);

		boolean isNew = lakes.isNew();

		Session session = null;

		try {
			session = openSession();

			if (lakes.isNew()) {
				session.save(lakes);

				lakes.setNew(false);
			}
			else {
				lakes = (lakes)session.merge(lakes);
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

		entityCache.putResult(lakesModelImpl.ENTITY_CACHE_ENABLED,
			lakesImpl.class, lakes.getPrimaryKey(), lakes, false);

		lakes.resetOriginalValues();

		return lakes;
	}

	protected lakes toUnwrappedModel(lakes lakes) {
		if (lakes instanceof lakesImpl) {
			return lakes;
		}

		lakesImpl lakesImpl = new lakesImpl();

		lakesImpl.setNew(lakes.isNew());
		lakesImpl.setPrimaryKey(lakes.getPrimaryKey());

		lakesImpl.setLakeid(lakes.getLakeid());
		lakesImpl.setName(lakes.getName());
		lakesImpl.setUrl(lakes.getUrl());
		lakesImpl.setJan(lakes.getJan());
		lakesImpl.setFeb(lakes.getFeb());
		lakesImpl.setMar(lakes.getMar());
		lakesImpl.setApr(lakes.getApr());
		lakesImpl.setMay(lakes.getMay());
		lakesImpl.setJune(lakes.getJune());
		lakesImpl.setJuly(lakes.getJuly());
		lakesImpl.setAug(lakes.getAug());
		lakesImpl.setSep(lakes.getSep());
		lakesImpl.setOct(lakes.getOct());
		lakesImpl.setNov(lakes.getNov());
		lakesImpl.setDec_(lakes.getDec_());

		return lakesImpl;
	}

	/**
	 * Returns the lakes with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the lakes
	 * @return the lakes
	 * @throws NoSuchlakesException if a lakes with the primary key could not be found
	 */
	@Override
	public lakes findByPrimaryKey(Serializable primaryKey)
		throws NoSuchlakesException {
		lakes lakes = fetchByPrimaryKey(primaryKey);

		if (lakes == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchlakesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return lakes;
	}

	/**
	 * Returns the lakes with the primary key or throws a {@link NoSuchlakesException} if it could not be found.
	 *
	 * @param lakeid the primary key of the lakes
	 * @return the lakes
	 * @throws NoSuchlakesException if a lakes with the primary key could not be found
	 */
	@Override
	public lakes findByPrimaryKey(int lakeid) throws NoSuchlakesException {
		return findByPrimaryKey((Serializable)lakeid);
	}

	/**
	 * Returns the lakes with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the lakes
	 * @return the lakes, or <code>null</code> if a lakes with the primary key could not be found
	 */
	@Override
	public lakes fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(lakesModelImpl.ENTITY_CACHE_ENABLED,
				lakesImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		lakes lakes = (lakes)serializable;

		if (lakes == null) {
			Session session = null;

			try {
				session = openSession();

				lakes = (lakes)session.get(lakesImpl.class, primaryKey);

				if (lakes != null) {
					cacheResult(lakes);
				}
				else {
					entityCache.putResult(lakesModelImpl.ENTITY_CACHE_ENABLED,
						lakesImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(lakesModelImpl.ENTITY_CACHE_ENABLED,
					lakesImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return lakes;
	}

	/**
	 * Returns the lakes with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param lakeid the primary key of the lakes
	 * @return the lakes, or <code>null</code> if a lakes with the primary key could not be found
	 */
	@Override
	public lakes fetchByPrimaryKey(int lakeid) {
		return fetchByPrimaryKey((Serializable)lakeid);
	}

	@Override
	public Map<Serializable, lakes> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, lakes> map = new HashMap<Serializable, lakes>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			lakes lakes = fetchByPrimaryKey(primaryKey);

			if (lakes != null) {
				map.put(primaryKey, lakes);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(lakesModelImpl.ENTITY_CACHE_ENABLED,
					lakesImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (lakes)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_LAKES_WHERE_PKS_IN);

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

			for (lakes lakes : (List<lakes>)q.list()) {
				map.put(lakes.getPrimaryKeyObj(), lakes);

				cacheResult(lakes);

				uncachedPrimaryKeys.remove(lakes.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(lakesModelImpl.ENTITY_CACHE_ENABLED,
					lakesImpl.class, primaryKey, nullModel);
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
	 * Returns all the lakeses.
	 *
	 * @return the lakeses
	 */
	@Override
	public List<lakes> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the lakeses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link lakesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of lakeses
	 * @param end the upper bound of the range of lakeses (not inclusive)
	 * @return the range of lakeses
	 */
	@Override
	public List<lakes> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the lakeses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link lakesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of lakeses
	 * @param end the upper bound of the range of lakeses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of lakeses
	 */
	@Override
	public List<lakes> findAll(int start, int end,
		OrderByComparator<lakes> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the lakeses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link lakesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of lakeses
	 * @param end the upper bound of the range of lakeses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of lakeses
	 */
	@Override
	public List<lakes> findAll(int start, int end,
		OrderByComparator<lakes> orderByComparator, boolean retrieveFromCache) {
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

		List<lakes> list = null;

		if (retrieveFromCache) {
			list = (List<lakes>)finderCache.getResult(finderPath, finderArgs,
					this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_LAKES);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_LAKES;

				if (pagination) {
					sql = sql.concat(lakesModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<lakes>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<lakes>)QueryUtil.list(q, getDialect(), start,
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
	 * Removes all the lakeses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (lakes lakes : findAll()) {
			remove(lakes);
		}
	}

	/**
	 * Returns the number of lakeses.
	 *
	 * @return the number of lakeses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_LAKES);

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
		return lakesModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the lakes persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(lakesImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_LAKES = "SELECT lakes FROM lakes lakes";
	private static final String _SQL_SELECT_LAKES_WHERE_PKS_IN = "SELECT lakes FROM lakes lakes WHERE lakeid IN (";
	private static final String _SQL_COUNT_LAKES = "SELECT COUNT(lakes) FROM lakes lakes";
	private static final String _ORDER_BY_ENTITY_ALIAS = "lakes.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No lakes exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(lakesPersistenceImpl.class);
}