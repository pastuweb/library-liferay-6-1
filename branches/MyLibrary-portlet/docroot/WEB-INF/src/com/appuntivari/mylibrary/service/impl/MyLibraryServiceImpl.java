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

package com.appuntivari.mylibrary.service.impl;

import java.util.List;

import com.appuntivari.mylibrary.model.MyLibrary;
import com.appuntivari.mylibrary.service.MyLibraryLocalServiceUtil;
import com.appuntivari.mylibrary.service.base.MyLibraryServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.jsonwebservice.JSONWebServiceMode;

/**
 * The implementation of the my library remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.appuntivari.mylibrary.service.MyLibraryService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Pasturenzi Francesco
 * @see com.appuntivari.mylibrary.service.base.MyLibraryServiceBaseImpl
 * @see com.appuntivari.mylibrary.service.MyLibraryServiceUtil
 */
@JSONWebService(mode = JSONWebServiceMode.MANUAL)
public class MyLibraryServiceImpl extends MyLibraryServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.appuntivari.mylibrary.service.MyLibraryServiceUtil} to access the my library remote service.
	 */
	
	@JSONWebService(mode = JSONWebServiceMode.IGNORE)
	public MyLibrary addBook_Fake(MyLibrary newBook) throws PortalException, SystemException{
		newBook.setId_book(999);
		return newBook;
		//return MyLibraryLocalServiceUtil.addBook(newBook);
	}
	
	@JSONWebService(value = "get-mybooks-rest", method = "GET")
	public List<MyLibrary> getAllBooks()
			throws PortalException, SystemException {
		return MyLibraryLocalServiceUtil.getAllBooks();
	}
	
}