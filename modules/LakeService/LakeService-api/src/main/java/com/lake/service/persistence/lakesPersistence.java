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

package com.lake.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.lake.exception.NoSuchlakesException;

import com.lake.model.lakes;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the lakes service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.lake.service.persistence.impl.lakesPersistenceImpl
 * @see lakesUtil
 * @generated
 */
@ProviderType
public interface lakesPersistence extends BasePersistence<lakes> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link lakesUtil} to access the lakes persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the lakes in the entity cache if it is enabled.
	*
	* @param lakes the lakes
	*/
	public void cacheResult(lakes lakes);

	/**
	* Caches the lakeses in the entity cache if it is enabled.
	*
	* @param lakeses the lakeses
	*/
	public void cacheResult(java.util.List<lakes> lakeses);

	/**
	* Creates a new lakes with the primary key. Does not add the lakes to the database.
	*
	* @param lakeid the primary key for the new lakes
	* @return the new lakes
	*/
	public lakes create(int lakeid);

	/**
	* Removes the lakes with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param lakeid the primary key of the lakes
	* @return the lakes that was removed
	* @throws NoSuchlakesException if a lakes with the primary key could not be found
	*/
	public lakes remove(int lakeid) throws NoSuchlakesException;

	public lakes updateImpl(lakes lakes);

	/**
	* Returns the lakes with the primary key or throws a {@link NoSuchlakesException} if it could not be found.
	*
	* @param lakeid the primary key of the lakes
	* @return the lakes
	* @throws NoSuchlakesException if a lakes with the primary key could not be found
	*/
	public lakes findByPrimaryKey(int lakeid) throws NoSuchlakesException;

	/**
	* Returns the lakes with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param lakeid the primary key of the lakes
	* @return the lakes, or <code>null</code> if a lakes with the primary key could not be found
	*/
	public lakes fetchByPrimaryKey(int lakeid);

	@Override
	public java.util.Map<java.io.Serializable, lakes> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the lakeses.
	*
	* @return the lakeses
	*/
	public java.util.List<lakes> findAll();

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
	public java.util.List<lakes> findAll(int start, int end);

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
	public java.util.List<lakes> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<lakes> orderByComparator);

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
	public java.util.List<lakes> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<lakes> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the lakeses from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of lakeses.
	*
	* @return the number of lakeses
	*/
	public int countAll();
}