/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

package com.appuntivari.mylibrary.model;

import com.appuntivari.mylibrary.service.ClpSerializer;
import com.appuntivari.mylibrary.service.MyLibraryLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Pasturenzi Francesco
 */
public class MyLibraryClp extends BaseModelImpl<MyLibrary> implements MyLibrary {
	public MyLibraryClp() {
	}

	public Class<?> getModelClass() {
		return MyLibrary.class;
	}

	public String getModelClassName() {
		return MyLibrary.class.getName();
	}

	public long getPrimaryKey() {
		return _id_book;
	}

	public void setPrimaryKey(long primaryKey) {
		setId_book(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_id_book);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id_book", getId_book());
		attributes.put("titolo", getTitolo());
		attributes.put("descrizione", getDescrizione());
		attributes.put("autori", getAutori());
		attributes.put("stato", getStato());
		attributes.put("link_more_info", getLink_more_info());
		attributes.put("note", getNote());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id_book = (Long)attributes.get("id_book");

		if (id_book != null) {
			setId_book(id_book);
		}

		String titolo = (String)attributes.get("titolo");

		if (titolo != null) {
			setTitolo(titolo);
		}

		String descrizione = (String)attributes.get("descrizione");

		if (descrizione != null) {
			setDescrizione(descrizione);
		}

		String autori = (String)attributes.get("autori");

		if (autori != null) {
			setAutori(autori);
		}

		String stato = (String)attributes.get("stato");

		if (stato != null) {
			setStato(stato);
		}

		String link_more_info = (String)attributes.get("link_more_info");

		if (link_more_info != null) {
			setLink_more_info(link_more_info);
		}

		String note = (String)attributes.get("note");

		if (note != null) {
			setNote(note);
		}
	}

	public long getId_book() {
		return _id_book;
	}

	public void setId_book(long id_book) {
		_id_book = id_book;

		if (_myLibraryRemoteModel != null) {
			try {
				Class<?> clazz = _myLibraryRemoteModel.getClass();

				Method method = clazz.getMethod("setId_book", long.class);

				method.invoke(_myLibraryRemoteModel, id_book);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public String getTitolo() {
		return _titolo;
	}

	public void setTitolo(String titolo) {
		_titolo = titolo;

		if (_myLibraryRemoteModel != null) {
			try {
				Class<?> clazz = _myLibraryRemoteModel.getClass();

				Method method = clazz.getMethod("setTitolo", String.class);

				method.invoke(_myLibraryRemoteModel, titolo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public String getDescrizione() {
		return _descrizione;
	}

	public void setDescrizione(String descrizione) {
		_descrizione = descrizione;

		if (_myLibraryRemoteModel != null) {
			try {
				Class<?> clazz = _myLibraryRemoteModel.getClass();

				Method method = clazz.getMethod("setDescrizione", String.class);

				method.invoke(_myLibraryRemoteModel, descrizione);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public String getAutori() {
		return _autori;
	}

	public void setAutori(String autori) {
		_autori = autori;

		if (_myLibraryRemoteModel != null) {
			try {
				Class<?> clazz = _myLibraryRemoteModel.getClass();

				Method method = clazz.getMethod("setAutori", String.class);

				method.invoke(_myLibraryRemoteModel, autori);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public String getStato() {
		return _stato;
	}

	public void setStato(String stato) {
		_stato = stato;

		if (_myLibraryRemoteModel != null) {
			try {
				Class<?> clazz = _myLibraryRemoteModel.getClass();

				Method method = clazz.getMethod("setStato", String.class);

				method.invoke(_myLibraryRemoteModel, stato);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public String getLink_more_info() {
		return _link_more_info;
	}

	public void setLink_more_info(String link_more_info) {
		_link_more_info = link_more_info;

		if (_myLibraryRemoteModel != null) {
			try {
				Class<?> clazz = _myLibraryRemoteModel.getClass();

				Method method = clazz.getMethod("setLink_more_info",
						String.class);

				method.invoke(_myLibraryRemoteModel, link_more_info);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public String getNote() {
		return _note;
	}

	public void setNote(String note) {
		_note = note;

		if (_myLibraryRemoteModel != null) {
			try {
				Class<?> clazz = _myLibraryRemoteModel.getClass();

				Method method = clazz.getMethod("setNote", String.class);

				method.invoke(_myLibraryRemoteModel, note);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getMyLibraryRemoteModel() {
		return _myLibraryRemoteModel;
	}

	public void setMyLibraryRemoteModel(BaseModel<?> myLibraryRemoteModel) {
		_myLibraryRemoteModel = myLibraryRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _myLibraryRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_myLibraryRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			MyLibraryLocalServiceUtil.addMyLibrary(this);
		}
		else {
			MyLibraryLocalServiceUtil.updateMyLibrary(this);
		}
	}

	@Override
	public MyLibrary toEscapedModel() {
		return (MyLibrary)ProxyUtil.newProxyInstance(MyLibrary.class.getClassLoader(),
			new Class[] { MyLibrary.class }, new AutoEscapeBeanHandler(this));
	}

	public MyLibrary toUnescapedModel() {
		return this;
	}

	@Override
	public Object clone() {
		MyLibraryClp clone = new MyLibraryClp();

		clone.setId_book(getId_book());
		clone.setTitolo(getTitolo());
		clone.setDescrizione(getDescrizione());
		clone.setAutori(getAutori());
		clone.setStato(getStato());
		clone.setLink_more_info(getLink_more_info());
		clone.setNote(getNote());

		return clone;
	}

	public int compareTo(MyLibrary myLibrary) {
		int value = 0;

		if (getId_book() < myLibrary.getId_book()) {
			value = -1;
		}
		else if (getId_book() > myLibrary.getId_book()) {
			value = 1;
		}
		else {
			value = 0;
		}

		value = value * -1;

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof MyLibraryClp)) {
			return false;
		}

		MyLibraryClp myLibrary = (MyLibraryClp)obj;

		long primaryKey = myLibrary.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{id_book=");
		sb.append(getId_book());
		sb.append(", titolo=");
		sb.append(getTitolo());
		sb.append(", descrizione=");
		sb.append(getDescrizione());
		sb.append(", autori=");
		sb.append(getAutori());
		sb.append(", stato=");
		sb.append(getStato());
		sb.append(", link_more_info=");
		sb.append(getLink_more_info());
		sb.append(", note=");
		sb.append(getNote());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("com.appuntivari.mylibrary.model.MyLibrary");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id_book</column-name><column-value><![CDATA[");
		sb.append(getId_book());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>titolo</column-name><column-value><![CDATA[");
		sb.append(getTitolo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>descrizione</column-name><column-value><![CDATA[");
		sb.append(getDescrizione());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>autori</column-name><column-value><![CDATA[");
		sb.append(getAutori());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>stato</column-name><column-value><![CDATA[");
		sb.append(getStato());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>link_more_info</column-name><column-value><![CDATA[");
		sb.append(getLink_more_info());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>note</column-name><column-value><![CDATA[");
		sb.append(getNote());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id_book;
	private String _titolo;
	private String _descrizione;
	private String _autori;
	private String _stato;
	private String _link_more_info;
	private String _note;
	private BaseModel<?> _myLibraryRemoteModel;
}