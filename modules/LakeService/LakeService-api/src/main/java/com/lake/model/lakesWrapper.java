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
		attributes.put("jan", getJan());
		attributes.put("feb", getFeb());
		attributes.put("mar", getMar());
		attributes.put("apr", getApr());
		attributes.put("may", getMay());
		attributes.put("june", getJune());
		attributes.put("july", getJuly());
		attributes.put("aug", getAug());
		attributes.put("sep", getSep());
		attributes.put("oct", getOct());
		attributes.put("nov", getNov());
		attributes.put("dec_", getDec_());

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

		Double jan = (Double)attributes.get("jan");

		if (jan != null) {
			setJan(jan);
		}

		Double feb = (Double)attributes.get("feb");

		if (feb != null) {
			setFeb(feb);
		}

		Double mar = (Double)attributes.get("mar");

		if (mar != null) {
			setMar(mar);
		}

		Double apr = (Double)attributes.get("apr");

		if (apr != null) {
			setApr(apr);
		}

		Double may = (Double)attributes.get("may");

		if (may != null) {
			setMay(may);
		}

		Double june = (Double)attributes.get("june");

		if (june != null) {
			setJune(june);
		}

		Double july = (Double)attributes.get("july");

		if (july != null) {
			setJuly(july);
		}

		Double aug = (Double)attributes.get("aug");

		if (aug != null) {
			setAug(aug);
		}

		Double sep = (Double)attributes.get("sep");

		if (sep != null) {
			setSep(sep);
		}

		Double oct = (Double)attributes.get("oct");

		if (oct != null) {
			setOct(oct);
		}

		Double nov = (Double)attributes.get("nov");

		if (nov != null) {
			setNov(nov);
		}

		Double dec_ = (Double)attributes.get("dec_");

		if (dec_ != null) {
			setDec_(dec_);
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

	/**
	* Returns the apr of this lakes.
	*
	* @return the apr of this lakes
	*/
	@Override
	public double getApr() {
		return _lakes.getApr();
	}

	/**
	* Returns the aug of this lakes.
	*
	* @return the aug of this lakes
	*/
	@Override
	public double getAug() {
		return _lakes.getAug();
	}

	/**
	* Returns the dec_ of this lakes.
	*
	* @return the dec_ of this lakes
	*/
	@Override
	public double getDec_() {
		return _lakes.getDec_();
	}

	/**
	* Returns the feb of this lakes.
	*
	* @return the feb of this lakes
	*/
	@Override
	public double getFeb() {
		return _lakes.getFeb();
	}

	/**
	* Returns the jan of this lakes.
	*
	* @return the jan of this lakes
	*/
	@Override
	public double getJan() {
		return _lakes.getJan();
	}

	/**
	* Returns the july of this lakes.
	*
	* @return the july of this lakes
	*/
	@Override
	public double getJuly() {
		return _lakes.getJuly();
	}

	/**
	* Returns the june of this lakes.
	*
	* @return the june of this lakes
	*/
	@Override
	public double getJune() {
		return _lakes.getJune();
	}

	/**
	* Returns the mar of this lakes.
	*
	* @return the mar of this lakes
	*/
	@Override
	public double getMar() {
		return _lakes.getMar();
	}

	/**
	* Returns the may of this lakes.
	*
	* @return the may of this lakes
	*/
	@Override
	public double getMay() {
		return _lakes.getMay();
	}

	/**
	* Returns the nov of this lakes.
	*
	* @return the nov of this lakes
	*/
	@Override
	public double getNov() {
		return _lakes.getNov();
	}

	/**
	* Returns the oct of this lakes.
	*
	* @return the oct of this lakes
	*/
	@Override
	public double getOct() {
		return _lakes.getOct();
	}

	/**
	* Returns the sep of this lakes.
	*
	* @return the sep of this lakes
	*/
	@Override
	public double getSep() {
		return _lakes.getSep();
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

	/**
	* Sets the apr of this lakes.
	*
	* @param apr the apr of this lakes
	*/
	@Override
	public void setApr(double apr) {
		_lakes.setApr(apr);
	}

	/**
	* Sets the aug of this lakes.
	*
	* @param aug the aug of this lakes
	*/
	@Override
	public void setAug(double aug) {
		_lakes.setAug(aug);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_lakes.setCachedModel(cachedModel);
	}

	/**
	* Sets the dec_ of this lakes.
	*
	* @param dec_ the dec_ of this lakes
	*/
	@Override
	public void setDec_(double dec_) {
		_lakes.setDec_(dec_);
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
	* Sets the feb of this lakes.
	*
	* @param feb the feb of this lakes
	*/
	@Override
	public void setFeb(double feb) {
		_lakes.setFeb(feb);
	}

	/**
	* Sets the jan of this lakes.
	*
	* @param jan the jan of this lakes
	*/
	@Override
	public void setJan(double jan) {
		_lakes.setJan(jan);
	}

	/**
	* Sets the july of this lakes.
	*
	* @param july the july of this lakes
	*/
	@Override
	public void setJuly(double july) {
		_lakes.setJuly(july);
	}

	/**
	* Sets the june of this lakes.
	*
	* @param june the june of this lakes
	*/
	@Override
	public void setJune(double june) {
		_lakes.setJune(june);
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
	* Sets the mar of this lakes.
	*
	* @param mar the mar of this lakes
	*/
	@Override
	public void setMar(double mar) {
		_lakes.setMar(mar);
	}

	/**
	* Sets the may of this lakes.
	*
	* @param may the may of this lakes
	*/
	@Override
	public void setMay(double may) {
		_lakes.setMay(may);
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
	* Sets the nov of this lakes.
	*
	* @param nov the nov of this lakes
	*/
	@Override
	public void setNov(double nov) {
		_lakes.setNov(nov);
	}

	/**
	* Sets the oct of this lakes.
	*
	* @param oct the oct of this lakes
	*/
	@Override
	public void setOct(double oct) {
		_lakes.setOct(oct);
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
	* Sets the sep of this lakes.
	*
	* @param sep the sep of this lakes
	*/
	@Override
	public void setSep(double sep) {
		_lakes.setSep(sep);
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