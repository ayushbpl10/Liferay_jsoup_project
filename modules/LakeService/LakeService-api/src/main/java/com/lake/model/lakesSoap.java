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
public class lakesSoap implements Serializable {
	public static lakesSoap toSoapModel(lakes model) {
		lakesSoap soapModel = new lakesSoap();

		soapModel.setLakeid(model.getLakeid());
		soapModel.setName(model.getName());
		soapModel.setUrl(model.getUrl());

		return soapModel;
	}

	public static lakesSoap[] toSoapModels(lakes[] models) {
		lakesSoap[] soapModels = new lakesSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static lakesSoap[][] toSoapModels(lakes[][] models) {
		lakesSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new lakesSoap[models.length][models[0].length];
		}
		else {
			soapModels = new lakesSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static lakesSoap[] toSoapModels(List<lakes> models) {
		List<lakesSoap> soapModels = new ArrayList<lakesSoap>(models.size());

		for (lakes model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new lakesSoap[soapModels.size()]);
	}

	public lakesSoap() {
	}

	public int getPrimaryKey() {
		return _lakeid;
	}

	public void setPrimaryKey(int pk) {
		setLakeid(pk);
	}

	public int getLakeid() {
		return _lakeid;
	}

	public void setLakeid(int lakeid) {
		_lakeid = lakeid;
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

	private int _lakeid;
	private String _name;
	private String _url;
}