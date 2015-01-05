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

package com.appuntivari.mylibrary.service.persistence;

import com.appuntivari.mylibrary.model.MyLibrary;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the my library service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Pasturenzi Francesco
 * @see MyLibraryPersistenceImpl
 * @see MyLibraryUtil
 * @generated
 */
public interface MyLibraryPersistence extends BasePersistence<MyLibrary> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MyLibraryUtil} to access the my library persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the my library in the entity cache if it is enabled.
	*
	* @param myLibrary the my library
	*/
	public void cacheResult(com.appuntivari.mylibrary.model.MyLibrary myLibrary);

	/**
	* Caches the my libraries in the entity cache if it is enabled.
	*
	* @param myLibraries the my libraries
	*/
	public void cacheResult(
		java.util.List<com.appuntivari.mylibrary.model.MyLibrary> myLibraries);

	/**
	* Creates a new my library with the primary key. Does not add the my library to the database.
	*
	* @param id_book the primary key for the new my library
	* @return the new my library
	*/
	public com.appuntivari.mylibrary.model.MyLibrary create(long id_book);

	/**
	* Removes the my library with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id_book the primary key of the my library
	* @return the my library that was removed
	* @throws com.appuntivari.mylibrary.NoSuchMyLibraryException if a my library with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.appuntivari.mylibrary.model.MyLibrary remove(long id_book)
		throws com.appuntivari.mylibrary.NoSuchMyLibraryException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.appuntivari.mylibrary.model.MyLibrary updateImpl(
		com.appuntivari.mylibrary.model.MyLibrary myLibrary, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the my library with the primary key or throws a {@link com.appuntivari.mylibrary.NoSuchMyLibraryException} if it could not be found.
	*
	* @param id_book the primary key of the my library
	* @return the my library
	* @throws com.appuntivari.mylibrary.NoSuchMyLibraryException if a my library with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.appuntivari.mylibrary.model.MyLibrary findByPrimaryKey(
		long id_book)
		throws com.appuntivari.mylibrary.NoSuchMyLibraryException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the my library with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id_book the primary key of the my library
	* @return the my library, or <code>null</code> if a my library with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.appuntivari.mylibrary.model.MyLibrary fetchByPrimaryKey(
		long id_book)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the my libraries where titolo = &#63;.
	*
	* @param titolo the titolo
	* @return the matching my libraries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.appuntivari.mylibrary.model.MyLibrary> findByTitolo(
		java.lang.String titolo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the my libraries where titolo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param titolo the titolo
	* @param start the lower bound of the range of my libraries
	* @param end the upper bound of the range of my libraries (not inclusive)
	* @return the range of matching my libraries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.appuntivari.mylibrary.model.MyLibrary> findByTitolo(
		java.lang.String titolo, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the my libraries where titolo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param titolo the titolo
	* @param start the lower bound of the range of my libraries
	* @param end the upper bound of the range of my libraries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching my libraries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.appuntivari.mylibrary.model.MyLibrary> findByTitolo(
		java.lang.String titolo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first my library in the ordered set where titolo = &#63;.
	*
	* @param titolo the titolo
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching my library
	* @throws com.appuntivari.mylibrary.NoSuchMyLibraryException if a matching my library could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.appuntivari.mylibrary.model.MyLibrary findByTitolo_First(
		java.lang.String titolo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.appuntivari.mylibrary.NoSuchMyLibraryException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first my library in the ordered set where titolo = &#63;.
	*
	* @param titolo the titolo
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching my library, or <code>null</code> if a matching my library could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.appuntivari.mylibrary.model.MyLibrary fetchByTitolo_First(
		java.lang.String titolo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last my library in the ordered set where titolo = &#63;.
	*
	* @param titolo the titolo
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching my library
	* @throws com.appuntivari.mylibrary.NoSuchMyLibraryException if a matching my library could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.appuntivari.mylibrary.model.MyLibrary findByTitolo_Last(
		java.lang.String titolo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.appuntivari.mylibrary.NoSuchMyLibraryException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last my library in the ordered set where titolo = &#63;.
	*
	* @param titolo the titolo
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching my library, or <code>null</code> if a matching my library could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.appuntivari.mylibrary.model.MyLibrary fetchByTitolo_Last(
		java.lang.String titolo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the my libraries before and after the current my library in the ordered set where titolo = &#63;.
	*
	* @param id_book the primary key of the current my library
	* @param titolo the titolo
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next my library
	* @throws com.appuntivari.mylibrary.NoSuchMyLibraryException if a my library with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.appuntivari.mylibrary.model.MyLibrary[] findByTitolo_PrevAndNext(
		long id_book, java.lang.String titolo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.appuntivari.mylibrary.NoSuchMyLibraryException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the my libraries where autori = &#63;.
	*
	* @param autori the autori
	* @return the matching my libraries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.appuntivari.mylibrary.model.MyLibrary> findByAutori(
		java.lang.String autori)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the my libraries where autori = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param autori the autori
	* @param start the lower bound of the range of my libraries
	* @param end the upper bound of the range of my libraries (not inclusive)
	* @return the range of matching my libraries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.appuntivari.mylibrary.model.MyLibrary> findByAutori(
		java.lang.String autori, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the my libraries where autori = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param autori the autori
	* @param start the lower bound of the range of my libraries
	* @param end the upper bound of the range of my libraries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching my libraries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.appuntivari.mylibrary.model.MyLibrary> findByAutori(
		java.lang.String autori, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first my library in the ordered set where autori = &#63;.
	*
	* @param autori the autori
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching my library
	* @throws com.appuntivari.mylibrary.NoSuchMyLibraryException if a matching my library could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.appuntivari.mylibrary.model.MyLibrary findByAutori_First(
		java.lang.String autori,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.appuntivari.mylibrary.NoSuchMyLibraryException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first my library in the ordered set where autori = &#63;.
	*
	* @param autori the autori
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching my library, or <code>null</code> if a matching my library could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.appuntivari.mylibrary.model.MyLibrary fetchByAutori_First(
		java.lang.String autori,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last my library in the ordered set where autori = &#63;.
	*
	* @param autori the autori
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching my library
	* @throws com.appuntivari.mylibrary.NoSuchMyLibraryException if a matching my library could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.appuntivari.mylibrary.model.MyLibrary findByAutori_Last(
		java.lang.String autori,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.appuntivari.mylibrary.NoSuchMyLibraryException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last my library in the ordered set where autori = &#63;.
	*
	* @param autori the autori
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching my library, or <code>null</code> if a matching my library could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.appuntivari.mylibrary.model.MyLibrary fetchByAutori_Last(
		java.lang.String autori,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the my libraries before and after the current my library in the ordered set where autori = &#63;.
	*
	* @param id_book the primary key of the current my library
	* @param autori the autori
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next my library
	* @throws com.appuntivari.mylibrary.NoSuchMyLibraryException if a my library with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.appuntivari.mylibrary.model.MyLibrary[] findByAutori_PrevAndNext(
		long id_book, java.lang.String autori,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.appuntivari.mylibrary.NoSuchMyLibraryException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the my libraries where stato = &#63;.
	*
	* @param stato the stato
	* @return the matching my libraries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.appuntivari.mylibrary.model.MyLibrary> findByStato(
		java.lang.String stato)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the my libraries where stato = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param stato the stato
	* @param start the lower bound of the range of my libraries
	* @param end the upper bound of the range of my libraries (not inclusive)
	* @return the range of matching my libraries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.appuntivari.mylibrary.model.MyLibrary> findByStato(
		java.lang.String stato, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the my libraries where stato = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param stato the stato
	* @param start the lower bound of the range of my libraries
	* @param end the upper bound of the range of my libraries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching my libraries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.appuntivari.mylibrary.model.MyLibrary> findByStato(
		java.lang.String stato, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first my library in the ordered set where stato = &#63;.
	*
	* @param stato the stato
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching my library
	* @throws com.appuntivari.mylibrary.NoSuchMyLibraryException if a matching my library could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.appuntivari.mylibrary.model.MyLibrary findByStato_First(
		java.lang.String stato,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.appuntivari.mylibrary.NoSuchMyLibraryException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first my library in the ordered set where stato = &#63;.
	*
	* @param stato the stato
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching my library, or <code>null</code> if a matching my library could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.appuntivari.mylibrary.model.MyLibrary fetchByStato_First(
		java.lang.String stato,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last my library in the ordered set where stato = &#63;.
	*
	* @param stato the stato
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching my library
	* @throws com.appuntivari.mylibrary.NoSuchMyLibraryException if a matching my library could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.appuntivari.mylibrary.model.MyLibrary findByStato_Last(
		java.lang.String stato,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.appuntivari.mylibrary.NoSuchMyLibraryException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last my library in the ordered set where stato = &#63;.
	*
	* @param stato the stato
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching my library, or <code>null</code> if a matching my library could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.appuntivari.mylibrary.model.MyLibrary fetchByStato_Last(
		java.lang.String stato,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the my libraries before and after the current my library in the ordered set where stato = &#63;.
	*
	* @param id_book the primary key of the current my library
	* @param stato the stato
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next my library
	* @throws com.appuntivari.mylibrary.NoSuchMyLibraryException if a my library with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.appuntivari.mylibrary.model.MyLibrary[] findByStato_PrevAndNext(
		long id_book, java.lang.String stato,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.appuntivari.mylibrary.NoSuchMyLibraryException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the my libraries.
	*
	* @return the my libraries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.appuntivari.mylibrary.model.MyLibrary> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the my libraries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of my libraries
	* @param end the upper bound of the range of my libraries (not inclusive)
	* @return the range of my libraries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.appuntivari.mylibrary.model.MyLibrary> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the my libraries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of my libraries
	* @param end the upper bound of the range of my libraries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of my libraries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.appuntivari.mylibrary.model.MyLibrary> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the my libraries where titolo = &#63; from the database.
	*
	* @param titolo the titolo
	* @throws SystemException if a system exception occurred
	*/
	public void removeByTitolo(java.lang.String titolo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the my libraries where autori = &#63; from the database.
	*
	* @param autori the autori
	* @throws SystemException if a system exception occurred
	*/
	public void removeByAutori(java.lang.String autori)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the my libraries where stato = &#63; from the database.
	*
	* @param stato the stato
	* @throws SystemException if a system exception occurred
	*/
	public void removeByStato(java.lang.String stato)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the my libraries from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of my libraries where titolo = &#63;.
	*
	* @param titolo the titolo
	* @return the number of matching my libraries
	* @throws SystemException if a system exception occurred
	*/
	public int countByTitolo(java.lang.String titolo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of my libraries where autori = &#63;.
	*
	* @param autori the autori
	* @return the number of matching my libraries
	* @throws SystemException if a system exception occurred
	*/
	public int countByAutori(java.lang.String autori)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of my libraries where stato = &#63;.
	*
	* @param stato the stato
	* @return the number of matching my libraries
	* @throws SystemException if a system exception occurred
	*/
	public int countByStato(java.lang.String stato)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of my libraries.
	*
	* @return the number of my libraries
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}