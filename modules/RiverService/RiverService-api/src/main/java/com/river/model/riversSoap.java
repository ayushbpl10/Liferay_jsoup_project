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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class riversSoap implements Serializable {
	public static riversSoap toSoapModel(rivers model) {
		riversSoap soapModel = new riversSoap();

		soapModel.setRiverid(model.getRiverid());
		soapModel.setName(model.getName());
		soapModel.setUrl(model.getUrl());

		return soapModel;
	}

	public static riversSoap[] toSoapModels(rivers[] models) {
		riversSoap[] soapModels = new riversSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static riversSoap[][] toSoapModels(rivers[][] models) {
		riversSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new riversSoap[models.length][models[0].length];
		}
		else {
			soapModels = new riversSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static riversSoap[] toSoapModels(List<rivers> models) {
		List<riversSoap> soapModels = new ArrayList<riversSoap>(models.size());

		for (rivers model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new riversSoap[soapModels.size()]);
	}

	public riversSoap() {
	}

	public int getPrimaryKey() {
		return _riverid;
	}

	public void setPrimaryKey(int pk) {
		setRiverid(pk);
	}

	public int getRiverid() {
		return _riverid;
	}

	public void setRiverid(int riverid) {
		_riverid = riverid;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getUrl() {
		return _url;
	}

	public void setUrl(String url) {
		_url = url;
	}

	private int _riverid;
	private String _name;
	private String _url;
}