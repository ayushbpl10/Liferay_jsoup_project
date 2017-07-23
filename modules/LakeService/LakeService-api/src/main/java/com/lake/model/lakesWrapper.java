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

package com.lake.model;

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
 * This class is a wrapper for {@link lakes}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see lakes
 * @generated
 */
@ProviderType
public class lakesWrapper implements lakes, ModelWrapper<lakes> {
	public lakesWrapper(lakes lakes) {
		_lakes = lakes;
	}

	@Override
	public Class<?> getModelClass() {
		return lakes.class;
	}

	@Override
	public String getModelClassName() {
		return lakes.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("lakeid", getLakeid());
		attributes.put("name", getName());
		attributes.put("url", getUrl());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer lakeid = (Integer)attributes.get("lakeid");

		if (lakeid != null) {
			setLakeid(lakeid);
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
		return _lakes.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _lakes.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _lakes.isNew();
	}

	@Override
	public com.lake.model.lakes toEscapedModel() {
		return new lakesWrapper(_lakes.toEscapedModel());
	}

	@Override
	public com.lake.model.lakes toUnescapedModel() {
		return new lakesWrapper(_lakes.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _lakes.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.lake.model.lakes> toCacheModel() {
		return _lakes.toCacheModel();
	}

	@Override
	public int compareTo(com.lake.model.lakes lakes) {
		return _lakes.compareTo(lakes);
	}

	/**
	* Returns the lakeid of this lakes.
	*
	* @return the lakeid of this lakes
	*/
	@Override
	public int getLakeid() {
		return _lakes.getLakeid();
	}

	/**
	* Returns the primary key of this lakes.
	*
	* @return the primary key of this lakes
	*/
	@Override
	public int getPrimaryKey() {
		return _lakes.getPrimaryKey();
	}

	@Override
	public int hashCode() {
		return _lakes.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _lakes.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new lakesWrapper((lakes)_lakes.clone());
	}

	/**
	* Returns the name of this lakes.
	*
	* @return the name of this lakes
	*/
	@Override
	public java.lang.String getName() {
		return _lakes.getName();
	}

	/**
	* Returns the url of this lakes.
	*
	* @return the url of this lakes
	*/
	@Override
	public java.lang.String getUrl() {
		return _lakes.getUrl();
	}

	@Override
	public java.lang.String toString() {
		return _lakes.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _lakes.toXmlString();
	}

	@Override
	public void persist() {
		_lakes.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_lakes.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_lakes.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_lakes.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_lakes.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the lakeid of this lakes.
	*
	* @param lakeid the lakeid of this lakes
	*/
	@Override
	public void setLakeid(int lakeid) {
		_lakes.setLakeid(lakeid);
	}

	/**
	* Sets the name of this lakes.
	*
	* @param name the name of this lakes
	*/
	@Override
	public void setName(java.lang.String name) {
		_lakes.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_lakes.setNew(n);
	}

	/**
	* Sets the primary key of this lakes.
	*
	* @param primaryKey the primary key of this lakes
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_lakes.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_lakes.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the url of this lakes.
	*
	* @param url the url of this lakes
	*/
	@Override
	public void setUrl(java.lang.String url) {
		_lakes.setUrl(url);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof lakesWrapper)) {
			return false;
		}

		lakesWrapper lakesWrapper = (lakesWrapper)obj;

		if (Objects.equals(_lakes, lakesWrapper._lakes)) {
			return true;
		}

		return false;
	}

	@Override
	public lakes getWrappedModel() {
		return _lakes;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _lakes.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _lakes.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_lakes.resetOriginalValues();
	}

	private final lakes _lakes;
}