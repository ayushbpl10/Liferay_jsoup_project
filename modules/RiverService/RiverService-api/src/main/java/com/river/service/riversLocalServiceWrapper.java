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

package com.river.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link riversLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see riversLocalService
 * @generated
 */
@ProviderType
public class riversLocalServiceWrapper implements riversLocalService,
	ServiceWrapper<riversLocalService> {
	public riversLocalServiceWrapper(riversLocalService riversLocalService) {
		_riversLocalService = riversLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _riversLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _riversLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _riversLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _riversLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _riversLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the rivers to the database. Also notifies the appropriate model listeners.
	*
	* @param rivers the rivers
	* @return the rivers that was added
	*/
	@Override
	public com.river.model.rivers addrivers(com.river.model.rivers rivers) {
		return _riversLocalService.addrivers(rivers);
	}

	/**
	* Creates a new rivers with the primary key. Does not add the rivers to the database.
	*
	* @param riverid the primary key for the new rivers
	* @return the new rivers
	*/
	@Override
	public com.river.model.rivers createrivers(int riverid) {
		return _riversLocalService.createrivers(riverid);
	}

	/**
	* Deletes the rivers from the database. Also notifies the appropriate model listeners.
	*
	* @param rivers the rivers
	* @return the rivers that was removed
	*/
	@Override
	public com.river.model.rivers deleterivers(com.river.model.rivers rivers) {
		return _riversLocalService.deleterivers(rivers);
	}

	/**
	* Deletes the rivers with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param riverid the primary key of the rivers
	* @return the rivers that was removed
	* @throws PortalException if a rivers with the primary key could not be found
	*/
	@Override
	public com.river.model.rivers deleterivers(int riverid)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _riversLocalService.deleterivers(riverid);
	}

	@Override
	public com.river.model.rivers fetchrivers(int riverid) {
		return _riversLocalService.fetchrivers(riverid);
	}

	/**
	* Returns the rivers with the primary key.
	*
	* @param riverid the primary key of the rivers
	* @return the rivers
	* @throws PortalException if a rivers with the primary key could not be found
	*/
	@Override
	public com.river.model.rivers getrivers(int riverid)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _riversLocalService.getrivers(riverid);
	}

	/**
	* Updates the rivers in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param rivers the rivers
	* @return the rivers that was updated
	*/
	@Override
	public com.river.model.rivers updaterivers(com.river.model.rivers rivers) {
		return _riversLocalService.updaterivers(rivers);
	}

	/**
	* Returns the number of riverses.
	*
	* @return the number of riverses
	*/
	@Override
	public int getriversesCount() {
		return _riversLocalService.getriversesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _riversLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _riversLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.river.model.impl.riversModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _riversLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.river.model.impl.riversModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _riversLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the riverses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.river.model.impl.riversModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of riverses
	* @param end the upper bound of the range of riverses (not inclusive)
	* @return the range of riverses
	*/
	@Override
	public java.util.List<com.river.model.rivers> getriverses(int start, int end) {
		return _riversLocalService.getriverses(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _riversLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _riversLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public riversLocalService getWrappedService() {
		return _riversLocalService;
	}

	@Override
	public void setWrappedService(riversLocalService riversLocalService) {
		_riversLocalService = riversLocalService;
	}

	private riversLocalService _riversLocalService;
}