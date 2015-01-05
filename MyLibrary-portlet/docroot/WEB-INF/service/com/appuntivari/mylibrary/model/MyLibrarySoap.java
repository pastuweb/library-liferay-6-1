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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.appuntivari.mylibrary.service.http.MyLibraryServiceSoap}.
 *
 * @author    Pasturenzi Francesco
 * @see       com.appuntivari.mylibrary.service.http.MyLibraryServiceSoap
 * @generated
 */
public class MyLibrarySoap implements Serializable {
	public static MyLibrarySoap toSoapModel(MyLibrary model) {
		MyLibrarySoap soapModel = new MyLibrarySoap();

		soapModel.setId_book(model.getId_book());
		soapModel.setTitolo(model.getTitolo());
		soapModel.setDescrizione(model.getDescrizione());
		soapModel.setAutori(model.getAutori());
		soapModel.setStato(model.getStato());
		soapModel.setLink_more_info(model.getLink_more_info());
		soapModel.setNote(model.getNote());

		return soapModel;
	}

	public static MyLibrarySoap[] toSoapModels(MyLibrary[] models) {
		MyLibrarySoap[] soapModels = new MyLibrarySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static MyLibrarySoap[][] toSoapModels(MyLibrary[][] models) {
		MyLibrarySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new MyLibrarySoap[models.length][models[0].length];
		}
		else {
			soapModels = new MyLibrarySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static MyLibrarySoap[] toSoapModels(List<MyLibrary> models) {
		List<MyLibrarySoap> soapModels = new ArrayList<MyLibrarySoap>(models.size());

		for (MyLibrary model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new MyLibrarySoap[soapModels.size()]);
	}

	public MyLibrarySoap() {
	}

	public long getPrimaryKey() {
		return _id_book;
	}

	public void setPrimaryKey(long pk) {
		setId_book(pk);
	}

	public long getId_book() {
		return _id_book;
	}

	public void setId_book(long id_book) {
		_id_book = id_book;
	}

	public String getTitolo() {
		return _titolo;
	}

	public void setTitolo(String titolo) {
		_titolo = titolo;
	}

	public String getDescrizione() {
		return _descrizione;
	}

	public void setDescrizione(String descrizione) {
		_descrizione = descrizione;
	}

	public String getAutori() {
		return _autori;
	}

	public void setAutori(String autori) {
		_autori = autori;
	}

	public String getStato() {
		return _stato;
	}

	public void setStato(String stato) {
		_stato = stato;
	}

	public String getLink_more_info() {
		return _link_more_info;
	}

	public void setLink_more_info(String link_more_info) {
		_link_more_info = link_more_info;
	}

	public String getNote() {
		return _note;
	}

	public void setNote(String note) {
		_note = note;
	}

	private long _id_book;
	private String _titolo;
	private String _descrizione;
	private String _autori;
	private String _stato;
	private String _link_more_info;
	private String _note;
}