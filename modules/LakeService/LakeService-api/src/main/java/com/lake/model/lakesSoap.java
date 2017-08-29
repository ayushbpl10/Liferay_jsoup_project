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
		soapModel.setJan(model.getJan());
		soapModel.setFeb(model.getFeb());
		soapModel.setMar(model.getMar());
		soapModel.setApr(model.getApr());
		soapModel.setMay(model.getMay());
		soapModel.setJune(model.getJune());
		soapModel.setJuly(model.getJuly());
		soapModel.setAug(model.getAug());
		soapModel.setSep(model.getSep());
		soapModel.setOct(model.getOct());
		soapModel.setNov(model.getNov());
		soapModel.setDec_(model.getDec_());

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

	public double getJan() {
		return _jan;
	}

	public void setJan(double jan) {
		_jan = jan;
	}

	public double getFeb() {
		return _feb;
	}

	public void setFeb(double feb) {
		_feb = feb;
	}

	public double getMar() {
		return _mar;
	}

	public void setMar(double mar) {
		_mar = mar;
	}

	public double getApr() {
		return _apr;
	}

	public void setApr(double apr) {
		_apr = apr;
	}

	public double getMay() {
		return _may;
	}

	public void setMay(double may) {
		_may = may;
	}

	public double getJune() {
		return _june;
	}

	public void setJune(double june) {
		_june = june;
	}

	public double getJuly() {
		return _july;
	}

	public void setJuly(double july) {
		_july = july;
	}

	public double getAug() {
		return _aug;
	}

	public void setAug(double aug) {
		_aug = aug;
	}

	public double getSep() {
		return _sep;
	}

	public void setSep(double sep) {
		_sep = sep;
	}

	public double getOct() {
		return _oct;
	}

	public void setOct(double oct) {
		_oct = oct;
	}

	public double getNov() {
		return _nov;
	}

	public void setNov(double nov) {
		_nov = nov;
	}

	public double getDec_() {
		return _dec_;
	}

	public void setDec_(double dec_) {
		_dec_ = dec_;
	}

	private int _lakeid;
	private String _name;
	private String _url;
	private double _jan;
	private double _feb;
	private double _mar;
	private double _apr;
	private double _may;
	private double _june;
	private double _july;
	private double _aug;
	private double _sep;
	private double _oct;
	private double _nov;
	private double _dec_;
}