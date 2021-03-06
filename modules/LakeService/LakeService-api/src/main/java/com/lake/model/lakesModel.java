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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

/**
 * The base model interface for the lakes service. Represents a row in the &quot;Sample_lakes&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.lake.model.impl.lakesModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.lake.model.impl.lakesImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see lakes
 * @see com.lake.model.impl.lakesImpl
 * @see com.lake.model.impl.lakesModelImpl
 * @generated
 */
@ProviderType
public interface lakesModel extends BaseModel<lakes> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a lakes model instance should use the {@link lakes} interface instead.
	 */

	/**
	 * Returns the primary key of this lakes.
	 *
	 * @return the primary key of this lakes
	 */
	public int getPrimaryKey();

	/**
	 * Sets the primary key of this lakes.
	 *
	 * @param primaryKey the primary key of this lakes
	 */
	public void setPrimaryKey(int primaryKey);

	/**
	 * Returns the lakeid of this lakes.
	 *
	 * @return the lakeid of this lakes
	 */
	public int getLakeid();

	/**
	 * Sets the lakeid of this lakes.
	 *
	 * @param lakeid the lakeid of this lakes
	 */
	public void setLakeid(int lakeid);

	/**
	 * Returns the name of this lakes.
	 *
	 * @return the name of this lakes
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this lakes.
	 *
	 * @param name the name of this lakes
	 */
	public void setName(String name);

	/**
	 * Returns the url of this lakes.
	 *
	 * @return the url of this lakes
	 */
	@AutoEscape
	public String getUrl();

	/**
	 * Sets the url of this lakes.
	 *
	 * @param url the url of this lakes
	 */
	public void setUrl(String url);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(com.lake.model.lakes lakes);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.lake.model.lakes> toCacheModel();

	@Override
	public com.lake.model.lakes toEscapedModel();

	@Override
	public com.lake.model.lakes toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}