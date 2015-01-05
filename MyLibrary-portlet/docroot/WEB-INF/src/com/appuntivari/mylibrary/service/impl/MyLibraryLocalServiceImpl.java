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
import com.appuntivari.mylibrary.service.base.MyLibraryLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the my library local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.appuntivari.mylibrary.service.MyLibraryLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Pasturenzi Francesco
 * @see com.appuntivari.mylibrary.service.base.MyLibraryLocalServiceBaseImpl
 * @see com.appuntivari.mylibrary.service.MyLibraryLocalServiceUtil
 */
public class MyLibraryLocalServiceImpl extends MyLibraryLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.appuntivari.mylibrary.service.MyLibraryLocalServiceUtil} to access the my library local service.
	 */
	
	public MyLibrary addBook(MyLibrary newBook)
			throws SystemException, PortalException {


		MyLibrary book = myLibraryPersistence.create(
				counterLocalService.increment(
						MyLibrary.class.getName()));
							
				
		book.setTitolo(newBook.getTitolo());
		book.setDescrizione(newBook.getDescrizione());
		book.setStato(newBook.getStato());
		book.setAutori(newBook.getAutori());
		//modifico il valore di Link_more_info 		
		book.setLink_more_info(newBook.getLink_more_info());
		book.setNote(newBook.getNote());
				
				return myLibraryPersistence.update(book, false);
	}
	
	public void deleteBook(long bookId)
			throws  SystemException, PortalException {
		MyLibrary book =
				myLibraryPersistence.findByPrimaryKey(bookId);
		deleteBook(book);
	}

	public void deleteBook(MyLibrary book)
			throws PortalException, SystemException {
		
		myLibraryPersistence.remove(book);
	}
		
	public List<MyLibrary> getAllBooks()
			throws PortalException, SystemException {
		return MyLibraryLocalServiceUtil.getMyLibraries(0, MyLibraryLocalServiceUtil.getMyLibrariesCount());
	}
	
	
	
}