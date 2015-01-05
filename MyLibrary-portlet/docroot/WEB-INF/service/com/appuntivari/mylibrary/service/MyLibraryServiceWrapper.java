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

package com.appuntivari.mylibrary.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link MyLibraryService}.
 * </p>
 *
 * @author    Pasturenzi Francesco
 * @see       MyLibraryService
 * @generated
 */
public class MyLibraryServiceWrapper implements MyLibraryService,
	ServiceWrapper<MyLibraryService> {
	public MyLibraryServiceWrapper(MyLibraryService myLibraryService) {
		_myLibraryService = myLibraryService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _myLibraryService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_myLibraryService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _myLibraryService.invokeMethod(name, parameterTypes, arguments);
	}

	public com.appuntivari.mylibrary.model.MyLibrary addBook_Fake(
		com.appuntivari.mylibrary.model.MyLibrary newBook)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _myLibraryService.addBook_Fake(newBook);
	}

	public java.util.List<com.appuntivari.mylibrary.model.MyLibrary> getAllBooks()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _myLibraryService.getAllBooks();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public MyLibraryService getWrappedMyLibraryService() {
		return _myLibraryService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedMyLibraryService(MyLibraryService myLibraryService) {
		_myLibraryService = myLibraryService;
	}

	public MyLibraryService getWrappedService() {
		return _myLibraryService;
	}

	public void setWrappedService(MyLibraryService myLibraryService) {
		_myLibraryService = myLibraryService;
	}

	private MyLibraryService _myLibraryService;
}