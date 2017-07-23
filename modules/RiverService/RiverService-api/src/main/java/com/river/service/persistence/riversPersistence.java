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

package com.river.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.river.exception.NoSuchriversException;

import com.river.model.rivers;

/**
 * The persistence interface for the rivers service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.river.service.persistence.impl.riversPersistenceImpl
 * @see riversUtil
 * @generated
 */
@ProviderType
public interface riversPersistence extends BasePersistence<rivers> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link riversUtil} to access the rivers persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the rivers in the entity cache if it is enabled.
	*
	* @param rivers the rivers
	*/
	public void cacheResult(rivers rivers);

	/**
	* Caches the riverses in the entity cache if it is enabled.
	*
	* @param riverses the riverses
	*/
	public void cacheResult(java.util.List<rivers> riverses);

	/**
	* Creates a new rivers with the primary key. Does not add the rivers to the database.
	*
	* @param riverid the primary key for the new rivers
	* @return the new rivers
	*/
	public rivers create(int riverid);

	/**
	* Removes the rivers with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param riverid the primary key of the rivers
	* @return the rivers that was removed
	* @throws NoSuchriversException if a rivers with the primary key could not be found
	*/
	public rivers remove(int riverid) throws NoSuchriversException;

	public rivers updateImpl(rivers rivers);

	/**
	* Returns the rivers with the primary key or throws a {@link NoSuchriversException} if it could not be found.
	*
	* @param riverid the primary key of the rivers
	* @return the rivers
	* @throws NoSuchriversException if a rivers with the primary key could not be found
	*/
	public rivers findByPrimaryKey(int riverid) throws NoSuchriversException;

	/**
	* Returns the rivers with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param riverid the primary key of the rivers
	* @return the rivers, or <code>null</code> if a rivers with the primary key could not be found
	*/
	public rivers fetchByPrimaryKey(int riverid);

	@Override
	public java.util.Map<java.io.Serializable, rivers> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the riverses.
	*
	* @return the riverses
	*/
	public java.util.List<rivers> findAll();

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
	public java.util.List<rivers> findAll(int start, int end);

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
	public java.util.List<rivers> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<rivers> orderByComparator);

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
	public java.util.List<rivers> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<rivers> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the riverses from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of riverses.
	*
	* @return the number of riverses
	*/
	public int countAll();
}