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

package com.lake.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link lakesLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see lakesLocalService
 * @generated
 */
@ProviderType
public class lakesLocalServiceWrapper implements lakesLocalService,
	ServiceWrapper<lakesLocalService> {
	public lakesLocalServiceWrapper(lakesLocalService lakesLocalService) {
		_lakesLocalService = lakesLocalService;
	}

	/**
	* Adds the lakes to the database. Also notifies the appropriate model listeners.
	*
	* @param lakes the lakes
	* @return the lakes that was added
	*/
	@Override
	public com.lake.model.lakes addlakes(com.lake.model.lakes lakes) {
		return _lakesLocalService.addlakes(lakes);
	}

	/**
	* Creates a new lakes with the primary key. Does not add the lakes to the database.
	*
	* @param lakeid the primary key for the new lakes
	* @return the new lakes
	*/
	@Override
	public com.lake.model.lakes createlakes(int lakeid) {
		return _lakesLocalService.createlakes(lakeid);
	}

	/**
	* Deletes the lakes from the database. Also notifies the appropriate model listeners.
	*
	* @param lakes the lakes
	* @return the lakes that was removed
	*/
	@Override
	public com.lake.model.lakes deletelakes(com.lake.model.lakes lakes) {
		return _lakesLocalService.deletelakes(lakes);
	}

	/**
	* Deletes the lakes with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param lakeid the primary key of the lakes
	* @return the lakes that was removed
	* @throws PortalException if a lakes with the primary key could not be found
	*/
	@Override
	public com.lake.model.lakes deletelakes(int lakeid)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _lakesLocalService.deletelakes(lakeid);
	}

	@Override
	public com.lake.model.lakes fetchlakes(int lakeid) {
		return _lakesLocalService.fetchlakes(lakeid);
	}

	/**
	* Returns the lakes with the primary key.
	*
	* @param lakeid the primary key of the lakes
	* @return the lakes
	* @throws PortalException if a lakes with the primary key could not be found
	*/
	@Override
	public com.lake.model.lakes getlakes(int lakeid)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _lakesLocalService.getlakes(lakeid);
	}

	/**
	* Updates the lakes in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param lakes the lakes
	* @return the lakes that was updated
	*/
	@Override
	public com.lake.model.lakes updatelakes(com.lake.model.lakes lakes) {
		return _lakesLocalService.updatelakes(lakes);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _lakesLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _lakesLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _lakesLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _lakesLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _lakesLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of lakeses.
	*
	* @return the number of lakeses
	*/
	@Override
	public int getlakesesCount() {
		return _lakesLocalService.getlakesesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _lakesLocalService.getOSGiServiceIdentifier();
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
		return _lakesLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lake.model.impl.lakesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _lakesLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lake.model.impl.lakesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _lakesLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the lakeses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lake.model.impl.lakesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of lakeses
	* @param end the upper bound of the range of lakeses (not inclusive)
	* @return the range of lakeses
	*/
	@Override
	public java.util.List<com.lake.model.lakes> getlakeses(int start, int end) {
		return _lakesLocalService.getlakeses(start, end);
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
		return _lakesLocalService.dynamicQueryCount(dynamicQuery);
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
		return _lakesLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public lakesLocalService getWrappedService() {
		return _lakesLocalService;
	}

	@Override
	public void setWrappedService(lakesLocalService lakesLocalService) {
		_lakesLocalService = lakesLocalService;
	}

	private lakesLocalService _lakesLocalService;
}