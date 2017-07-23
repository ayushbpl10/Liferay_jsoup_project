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
		StringBundler sb = new StringBundler(7);

		sb.append("{lakeid=");
		sb.append(lakeid);
		sb.append(", name=");
		sb.append(name);
		sb.append(", url=");
		sb.append(url);
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

		lakesImpl.resetOriginalValues();

		return lakesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		lakeid = objectInput.readInt();
		name = objectInput.readUTF();
		url = objectInput.readUTF();
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
	}

	public int lakeid;
	public String name;
	public String url;
}