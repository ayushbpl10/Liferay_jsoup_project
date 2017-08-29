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

package com.lake.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.lake.model.lakes;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing lakes in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see lakes
 * @generated
 */
@ProviderType
public class lakesCacheModel implements CacheModel<lakes>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof lakesCacheModel)) {
			return false;
		}

		lakesCacheModel lakesCacheModel = (lakesCacheModel)obj;

		if (lakeid == lakesCacheModel.lakeid) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, lakeid);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{lakeid=");
		sb.append(lakeid);
		sb.append(", name=");
		sb.append(name);
		sb.append(", url=");
		sb.append(url);
		sb.append(", jan=");
		sb.append(jan);
		sb.append(", feb=");
		sb.append(feb);
		sb.append(", mar=");
		sb.append(mar);
		sb.append(", apr=");
		sb.append(apr);
		sb.append(", may=");
		sb.append(may);
		sb.append(", june=");
		sb.append(june);
		sb.append(", july=");
		sb.append(july);
		sb.append(", aug=");
		sb.append(aug);
		sb.append(", sep=");
		sb.append(sep);
		sb.append(", oct=");
		sb.append(oct);
		sb.append(", nov=");
		sb.append(nov);
		sb.append(", dec_=");
		sb.append(dec_);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public lakes toEntityModel() {
		lakesImpl lakesImpl = new lakesImpl();

		lakesImpl.setLakeid(lakeid);

		if (name == null) {
			lakesImpl.setName(StringPool.BLANK);
		}
		else {
			lakesImpl.setName(name);
		}

		if (url == null) {
			lakesImpl.setUrl(StringPool.BLANK);
		}
		else {
			lakesImpl.setUrl(url);
		}

		lakesImpl.setJan(jan);
		lakesImpl.setFeb(feb);
		lakesImpl.setMar(mar);
		lakesImpl.setApr(apr);
		lakesImpl.setMay(may);
		lakesImpl.setJune(june);
		lakesImpl.setJuly(july);
		lakesImpl.setAug(aug);
		lakesImpl.setSep(sep);
		lakesImpl.setOct(oct);
		lakesImpl.setNov(nov);
		lakesImpl.setDec_(dec_);

		lakesImpl.resetOriginalValues();

		return lakesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		lakeid = objectInput.readInt();
		name = objectInput.readUTF();
		url = objectInput.readUTF();

		jan = objectInput.readDouble();

		feb = objectInput.readDouble();

		mar = objectInput.readDouble();

		apr = objectInput.readDouble();

		may = objectInput.readDouble();

		june = objectInput.readDouble();

		july = objectInput.readDouble();

		aug = objectInput.readDouble();

		sep = objectInput.readDouble();

		oct = objectInput.readDouble();

		nov = objectInput.readDouble();

		dec_ = objectInput.readDouble();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(lakeid);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (url == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(url);
		}

		objectOutput.writeDouble(jan);

		objectOutput.writeDouble(feb);

		objectOutput.writeDouble(mar);

		objectOutput.writeDouble(apr);

		objectOutput.writeDouble(may);

		objectOutput.writeDouble(june);

		objectOutput.writeDouble(july);

		objectOutput.writeDouble(aug);

		objectOutput.writeDouble(sep);

		objectOutput.writeDouble(oct);

		objectOutput.writeDouble(nov);

		objectOutput.writeDouble(dec_);
	}

	public int lakeid;
	public String name;
	public String url;
	public double jan;
	public double feb;
	public double mar;
	public double apr;
	public double may;
	public double june;
	public double july;
	public double aug;
	public double sep;
	public double oct;
	public double nov;
	public double dec_;
}