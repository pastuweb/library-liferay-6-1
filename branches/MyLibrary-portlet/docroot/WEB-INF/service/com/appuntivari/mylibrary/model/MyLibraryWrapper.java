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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link MyLibrary}.
 * </p>
 *
 * @author    Pasturenzi Francesco
 * @see       MyLibrary
 * @generated
 */
public class MyLibraryWrapper implements MyLibrary, ModelWrapper<MyLibrary> {
	public MyLibraryWrapper(MyLibrary myLibrary) {
		_myLibrary = myLibrary;
	}

	public Class<?> getModelClass() {
		return MyLibrary.class;
	}

	public String getModelClassName() {
		return MyLibrary.class.getName();
	}

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

	/**
	* Returns the primary key of this my library.
	*
	* @return the primary key of this my library
	*/
	public long getPrimaryKey() {
		return _myLibrary.getPrimaryKey();
	}

	/**
	* Sets the primary key of this my library.
	*
	* @param primaryKey the primary key of this my library
	*/
	public void setPrimaryKey(long primaryKey) {
		_myLibrary.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the id_book of this my library.
	*
	* @return the id_book of this my library
	*/
	public long getId_book() {
		return _myLibrary.getId_book();
	}

	/**
	* Sets the id_book of this my library.
	*
	* @param id_book the id_book of this my library
	*/
	public void setId_book(long id_book) {
		_myLibrary.setId_book(id_book);
	}

	/**
	* Returns the titolo of this my library.
	*
	* @return the titolo of this my library
	*/
	public java.lang.String getTitolo() {
		return _myLibrary.getTitolo();
	}

	/**
	* Sets the titolo of this my library.
	*
	* @param titolo the titolo of this my library
	*/
	public void setTitolo(java.lang.String titolo) {
		_myLibrary.setTitolo(titolo);
	}

	/**
	* Returns the descrizione of this my library.
	*
	* @return the descrizione of this my library
	*/
	public java.lang.String getDescrizione() {
		return _myLibrary.getDescrizione();
	}

	/**
	* Sets the descrizione of this my library.
	*
	* @param descrizione the descrizione of this my library
	*/
	public void setDescrizione(java.lang.String descrizione) {
		_myLibrary.setDescrizione(descrizione);
	}

	/**
	* Returns the autori of this my library.
	*
	* @return the autori of this my library
	*/
	public java.lang.String getAutori() {
		return _myLibrary.getAutori();
	}

	/**
	* Sets the autori of this my library.
	*
	* @param autori the autori of this my library
	*/
	public void setAutori(java.lang.String autori) {
		_myLibrary.setAutori(autori);
	}

	/**
	* Returns the stato of this my library.
	*
	* @return the stato of this my library
	*/
	public java.lang.String getStato() {
		return _myLibrary.getStato();
	}

	/**
	* Sets the stato of this my library.
	*
	* @param stato the stato of this my library
	*/
	public void setStato(java.lang.String stato) {
		_myLibrary.setStato(stato);
	}

	/**
	* Returns the link_more_info of this my library.
	*
	* @return the link_more_info of this my library
	*/
	public java.lang.String getLink_more_info() {
		return _myLibrary.getLink_more_info();
	}

	/**
	* Sets the link_more_info of this my library.
	*
	* @param link_more_info the link_more_info of this my library
	*/
	public void setLink_more_info(java.lang.String link_more_info) {
		_myLibrary.setLink_more_info(link_more_info);
	}

	/**
	* Returns the note of this my library.
	*
	* @return the note of this my library
	*/
	public java.lang.String getNote() {
		return _myLibrary.getNote();
	}

	/**
	* Sets the note of this my library.
	*
	* @param note the note of this my library
	*/
	public void setNote(java.lang.String note) {
		_myLibrary.setNote(note);
	}

	public boolean isNew() {
		return _myLibrary.isNew();
	}

	public void setNew(boolean n) {
		_myLibrary.setNew(n);
	}

	public boolean isCachedModel() {
		return _myLibrary.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_myLibrary.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _myLibrary.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _myLibrary.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_myLibrary.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _myLibrary.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_myLibrary.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new MyLibraryWrapper((MyLibrary)_myLibrary.clone());
	}

	public int compareTo(com.appuntivari.mylibrary.model.MyLibrary myLibrary) {
		return _myLibrary.compareTo(myLibrary);
	}

	@Override
	public int hashCode() {
		return _myLibrary.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.appuntivari.mylibrary.model.MyLibrary> toCacheModel() {
		return _myLibrary.toCacheModel();
	}

	public com.appuntivari.mylibrary.model.MyLibrary toEscapedModel() {
		return new MyLibraryWrapper(_myLibrary.toEscapedModel());
	}

	public com.appuntivari.mylibrary.model.MyLibrary toUnescapedModel() {
		return new MyLibraryWrapper(_myLibrary.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _myLibrary.toString();
	}

	public java.lang.String toXmlString() {
		return _myLibrary.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_myLibrary.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof MyLibraryWrapper)) {
			return false;
		}

		MyLibraryWrapper myLibraryWrapper = (MyLibraryWrapper)obj;

		if (Validator.equals(_myLibrary, myLibraryWrapper._myLibrary)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public MyLibrary getWrappedMyLibrary() {
		return _myLibrary;
	}

	public MyLibrary getWrappedModel() {
		return _myLibrary;
	}

	public void resetOriginalValues() {
		_myLibrary.resetOriginalValues();
	}

	private MyLibrary _myLibrary;
}