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

package com.appuntivari.mylibrary.model.impl;

import com.appuntivari.mylibrary.model.MyLibrary;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing MyLibrary in entity cache.
 *
 * @author Pasturenzi Francesco
 * @see MyLibrary
 * @generated
 */
public class MyLibraryCacheModel implements CacheModel<MyLibrary>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{id_book=");
		sb.append(id_book);
		sb.append(", titolo=");
		sb.append(titolo);
		sb.append(", descrizione=");
		sb.append(descrizione);
		sb.append(", autori=");
		sb.append(autori);
		sb.append(", stato=");
		sb.append(stato);
		sb.append(", link_more_info=");
		sb.append(link_more_info);
		sb.append(", note=");
		sb.append(note);
		sb.append("}");

		return sb.toString();
	}

	public MyLibrary toEntityModel() {
		MyLibraryImpl myLibraryImpl = new MyLibraryImpl();

		myLibraryImpl.setId_book(id_book);

		if (titolo == null) {
			myLibraryImpl.setTitolo(StringPool.BLANK);
		}
		else {
			myLibraryImpl.setTitolo(titolo);
		}

		if (descrizione == null) {
			myLibraryImpl.setDescrizione(StringPool.BLANK);
		}
		else {
			myLibraryImpl.setDescrizione(descrizione);
		}

		if (autori == null) {
			myLibraryImpl.setAutori(StringPool.BLANK);
		}
		else {
			myLibraryImpl.setAutori(autori);
		}

		if (stato == null) {
			myLibraryImpl.setStato(StringPool.BLANK);
		}
		else {
			myLibraryImpl.setStato(stato);
		}

		if (link_more_info == null) {
			myLibraryImpl.setLink_more_info(StringPool.BLANK);
		}
		else {
			myLibraryImpl.setLink_more_info(link_more_info);
		}

		if (note == null) {
			myLibraryImpl.setNote(StringPool.BLANK);
		}
		else {
			myLibraryImpl.setNote(note);
		}

		myLibraryImpl.resetOriginalValues();

		return myLibraryImpl;
	}

	public long id_book;
	public String titolo;
	public String descrizione;
	public String autori;
	public String stato;
	public String link_more_info;
	public String note;
}