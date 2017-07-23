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

package com.river.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import com.river.model.rivers;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing rivers in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see rivers
 * @generated
 */
@ProviderType
public class riversCacheModel implements CacheModel<rivers>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof riversCacheModel)) {
			return false;
		}

		riversCacheModel riversCacheModel = (riversCacheModel)obj;

		if (riverid == riversCacheModel.riverid) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, riverid);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{riverid=");
		sb.append(riverid);
		sb.append(", name=");
		sb.append(name);
		sb.append(", url=");
		sb.append(url);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public rivers toEntityModel() {
		riversImpl riversImpl = new riversImpl();

		riversImpl.setRiverid(riverid);

		if (name == null) {
			riversImpl.setName(StringPool.BLANK);
		}
		else {
			riversImpl.setName(name);
		}

		if (url == null) {
			riversImpl.setUrl(StringPool.BLANK);
		}
		else {
			riversImpl.setUrl(url);
		}

		riversImpl.resetOriginalValues();

		return riversImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		riverid = objectInput.readInt();
		name = objectInput.readUTF();
		url = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(riverid);

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

	public int riverid;
	public String name;
	public String url;
}