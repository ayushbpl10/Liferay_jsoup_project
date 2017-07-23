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

package com.river.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link rivers}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see rivers
 * @generated
 */
@ProviderType
public class riversWrapper implements rivers, ModelWrapper<rivers> {
	public riversWrapper(rivers rivers) {
		_rivers = rivers;
	}

	@Override
	public Class<?> getModelClass() {
		return rivers.class;
	}

	@Override
	public String getModelClassName() {
		return rivers.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("riverid", getRiverid());
		attributes.put("name", getName());
		attributes.put("url", getUrl());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer riverid = (Integer)attributes.get("riverid");

		if (riverid != null) {
			setRiverid(riverid);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String url = (String)attributes.get("url");

		if (url != null) {
			setUrl(url);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _rivers.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _rivers.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _rivers.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _rivers.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.river.model.rivers> toCacheModel() {
		return _rivers.toCacheModel();
	}

	@Override
	public com.river.model.rivers toEscapedModel() {
		return new riversWrapper(_rivers.toEscapedModel());
	}

	@Override
	public com.river.model.rivers toUnescapedModel() {
		return new riversWrapper(_rivers.toUnescapedModel());
	}

	@Override
	public int compareTo(com.river.model.rivers rivers) {
		return _rivers.compareTo(rivers);
	}

	/**
	* Returns the primary key of this rivers.
	*
	* @return the primary key of this rivers
	*/
	@Override
	public int getPrimaryKey() {
		return _rivers.getPrimaryKey();
	}

	/**
	* Returns the riverid of this rivers.
	*
	* @return the riverid of this rivers
	*/
	@Override
	public int getRiverid() {
		return _rivers.getRiverid();
	}

	@Override
	public int hashCode() {
		return _rivers.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _rivers.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new riversWrapper((rivers)_rivers.clone());
	}

	/**
	* Returns the name of this rivers.
	*
	* @return the name of this rivers
	*/
	@Override
	public java.lang.String getName() {
		return _rivers.getName();
	}

	/**
	* Returns the url of this rivers.
	*
	* @return the url of this rivers
	*/
	@Override
	public java.lang.String getUrl() {
		return _rivers.getUrl();
	}

	@Override
	public java.lang.String toString() {
		return _rivers.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _rivers.toXmlString();
	}

	@Override
	public void persist() {
		_rivers.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_rivers.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_rivers.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_rivers.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_rivers.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the name of this rivers.
	*
	* @param name the name of this rivers
	*/
	@Override
	public void setName(java.lang.String name) {
		_rivers.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_rivers.setNew(n);
	}

	/**
	* Sets the primary key of this rivers.
	*
	* @param primaryKey the primary key of this rivers
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_rivers.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_rivers.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the riverid of this rivers.
	*
	* @param riverid the riverid of this rivers
	*/
	@Override
	public void setRiverid(int riverid) {
		_rivers.setRiverid(riverid);
	}

	/**
	* Sets the url of this rivers.
	*
	* @param url the url of this rivers
	*/
	@Override
	public void setUrl(java.lang.String url) {
		_rivers.setUrl(url);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof riversWrapper)) {
			return false;
		}

		riversWrapper riversWrapper = (riversWrapper)obj;

		if (Objects.equals(_rivers, riversWrapper._rivers)) {
			return true;
		}

		return false;
	}

	@Override
	public rivers getWrappedModel() {
		return _rivers;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _rivers.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _rivers.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_rivers.resetOriginalValues();
	}

	private final rivers _rivers;
}