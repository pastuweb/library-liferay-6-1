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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the my library service. This utility wraps {@link MyLibraryPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Pasturenzi Francesco
 * @see MyLibraryPersistence
 * @see MyLibraryPersistenceImpl
 * @generated
 */
public class MyLibraryUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(MyLibrary myLibrary) {
		getPersistence().clearCache(myLibrary);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<MyLibrary> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MyLibrary> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MyLibrary> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static MyLibrary update(MyLibrary myLibrary, boolean merge)
		throws SystemException {
		return getPersistence().update(myLibrary, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static MyLibrary update(MyLibrary myLibrary, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(myLibrary, merge, serviceContext);
	}

	/**
	* Caches the my library in the entity cache if it is enabled.
	*
	* @param myLibrary the my library
	*/
	public static void cacheResult(
		com.appuntivari.mylibrary.model.MyLibrary myLibrary) {
		getPersistence().cacheResult(myLibrary);
	}

	/**
	* Caches the my libraries in the entity cache if it is enabled.
	*
	* @param myLibraries the my libraries
	*/
	public static void cacheResult(
		java.util.List<com.appuntivari.mylibrary.model.MyLibrary> myLibraries) {
		getPersistence().cacheResult(myLibraries);
	}

	/**
	* Creates a new my library with the primary key. Does not add the my library to the database.
	*
	* @param id_book the primary key for the new my library
	* @return the new my library
	*/
	public static com.appuntivari.mylibrary.model.MyLibrary create(long id_book) {
		return getPersistence().create(id_book);
	}

	/**
	* Removes the my library with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id_book the primary key of the my library
	* @return the my library that was removed
	* @throws com.appuntivari.mylibrary.NoSuchMyLibraryException if a my library with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.appuntivari.mylibrary.model.MyLibrary remove(long id_book)
		throws com.appuntivari.mylibrary.NoSuchMyLibraryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(id_book);
	}

	public static com.appuntivari.mylibrary.model.MyLibrary updateImpl(
		com.appuntivari.mylibrary.model.MyLibrary myLibrary, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(myLibrary, merge);
	}

	/**
	* Returns the my library with the primary key or throws a {@link com.appuntivari.mylibrary.NoSuchMyLibraryException} if it could not be found.
	*
	* @param id_book the primary key of the my library
	* @return the my library
	* @throws com.appuntivari.mylibrary.NoSuchMyLibraryException if a my library with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.appuntivari.mylibrary.model.MyLibrary findByPrimaryKey(
		long id_book)
		throws com.appuntivari.mylibrary.NoSuchMyLibraryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(id_book);
	}

	/**
	* Returns the my library with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id_book the primary key of the my library
	* @return the my library, or <code>null</code> if a my library with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.appuntivari.mylibrary.model.MyLibrary fetchByPrimaryKey(
		long id_book)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id_book);
	}

	/**
	* Returns all the my libraries where titolo = &#63;.
	*
	* @param titolo the titolo
	* @return the matching my libraries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.appuntivari.mylibrary.model.MyLibrary> findByTitolo(
		java.lang.String titolo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTitolo(titolo);
	}

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
	public static java.util.List<com.appuntivari.mylibrary.model.MyLibrary> findByTitolo(
		java.lang.String titolo, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTitolo(titolo, start, end);
	}

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
	public static java.util.List<com.appuntivari.mylibrary.model.MyLibrary> findByTitolo(
		java.lang.String titolo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTitolo(titolo, start, end, orderByComparator);
	}

	/**
	* Returns the first my library in the ordered set where titolo = &#63;.
	*
	* @param titolo the titolo
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching my library
	* @throws com.appuntivari.mylibrary.NoSuchMyLibraryException if a matching my library could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.appuntivari.mylibrary.model.MyLibrary findByTitolo_First(
		java.lang.String titolo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.appuntivari.mylibrary.NoSuchMyLibraryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTitolo_First(titolo, orderByComparator);
	}

	/**
	* Returns the first my library in the ordered set where titolo = &#63;.
	*
	* @param titolo the titolo
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching my library, or <code>null</code> if a matching my library could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.appuntivari.mylibrary.model.MyLibrary fetchByTitolo_First(
		java.lang.String titolo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByTitolo_First(titolo, orderByComparator);
	}

	/**
	* Returns the last my library in the ordered set where titolo = &#63;.
	*
	* @param titolo the titolo
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching my library
	* @throws com.appuntivari.mylibrary.NoSuchMyLibraryException if a matching my library could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.appuntivari.mylibrary.model.MyLibrary findByTitolo_Last(
		java.lang.String titolo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.appuntivari.mylibrary.NoSuchMyLibraryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTitolo_Last(titolo, orderByComparator);
	}

	/**
	* Returns the last my library in the ordered set where titolo = &#63;.
	*
	* @param titolo the titolo
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching my library, or <code>null</code> if a matching my library could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.appuntivari.mylibrary.model.MyLibrary fetchByTitolo_Last(
		java.lang.String titolo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByTitolo_Last(titolo, orderByComparator);
	}

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
	public static com.appuntivari.mylibrary.model.MyLibrary[] findByTitolo_PrevAndNext(
		long id_book, java.lang.String titolo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.appuntivari.mylibrary.NoSuchMyLibraryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTitolo_PrevAndNext(id_book, titolo, orderByComparator);
	}

	/**
	* Returns all the my libraries where autori = &#63;.
	*
	* @param autori the autori
	* @return the matching my libraries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.appuntivari.mylibrary.model.MyLibrary> findByAutori(
		java.lang.String autori)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByAutori(autori);
	}

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
	public static java.util.List<com.appuntivari.mylibrary.model.MyLibrary> findByAutori(
		java.lang.String autori, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByAutori(autori, start, end);
	}

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
	public static java.util.List<com.appuntivari.mylibrary.model.MyLibrary> findByAutori(
		java.lang.String autori, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAutori(autori, start, end, orderByComparator);
	}

	/**
	* Returns the first my library in the ordered set where autori = &#63;.
	*
	* @param autori the autori
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching my library
	* @throws com.appuntivari.mylibrary.NoSuchMyLibraryException if a matching my library could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.appuntivari.mylibrary.model.MyLibrary findByAutori_First(
		java.lang.String autori,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.appuntivari.mylibrary.NoSuchMyLibraryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByAutori_First(autori, orderByComparator);
	}

	/**
	* Returns the first my library in the ordered set where autori = &#63;.
	*
	* @param autori the autori
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching my library, or <code>null</code> if a matching my library could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.appuntivari.mylibrary.model.MyLibrary fetchByAutori_First(
		java.lang.String autori,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByAutori_First(autori, orderByComparator);
	}

	/**
	* Returns the last my library in the ordered set where autori = &#63;.
	*
	* @param autori the autori
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching my library
	* @throws com.appuntivari.mylibrary.NoSuchMyLibraryException if a matching my library could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.appuntivari.mylibrary.model.MyLibrary findByAutori_Last(
		java.lang.String autori,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.appuntivari.mylibrary.NoSuchMyLibraryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByAutori_Last(autori, orderByComparator);
	}

	/**
	* Returns the last my library in the ordered set where autori = &#63;.
	*
	* @param autori the autori
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching my library, or <code>null</code> if a matching my library could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.appuntivari.mylibrary.model.MyLibrary fetchByAutori_Last(
		java.lang.String autori,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByAutori_Last(autori, orderByComparator);
	}

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
	public static com.appuntivari.mylibrary.model.MyLibrary[] findByAutori_PrevAndNext(
		long id_book, java.lang.String autori,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.appuntivari.mylibrary.NoSuchMyLibraryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAutori_PrevAndNext(id_book, autori, orderByComparator);
	}

	/**
	* Returns all the my libraries where stato = &#63;.
	*
	* @param stato the stato
	* @return the matching my libraries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.appuntivari.mylibrary.model.MyLibrary> findByStato(
		java.lang.String stato)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByStato(stato);
	}

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
	public static java.util.List<com.appuntivari.mylibrary.model.MyLibrary> findByStato(
		java.lang.String stato, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByStato(stato, start, end);
	}

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
	public static java.util.List<com.appuntivari.mylibrary.model.MyLibrary> findByStato(
		java.lang.String stato, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByStato(stato, start, end, orderByComparator);
	}

	/**
	* Returns the first my library in the ordered set where stato = &#63;.
	*
	* @param stato the stato
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching my library
	* @throws com.appuntivari.mylibrary.NoSuchMyLibraryException if a matching my library could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.appuntivari.mylibrary.model.MyLibrary findByStato_First(
		java.lang.String stato,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.appuntivari.mylibrary.NoSuchMyLibraryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByStato_First(stato, orderByComparator);
	}

	/**
	* Returns the first my library in the ordered set where stato = &#63;.
	*
	* @param stato the stato
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching my library, or <code>null</code> if a matching my library could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.appuntivari.mylibrary.model.MyLibrary fetchByStato_First(
		java.lang.String stato,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByStato_First(stato, orderByComparator);
	}

	/**
	* Returns the last my library in the ordered set where stato = &#63;.
	*
	* @param stato the stato
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching my library
	* @throws com.appuntivari.mylibrary.NoSuchMyLibraryException if a matching my library could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.appuntivari.mylibrary.model.MyLibrary findByStato_Last(
		java.lang.String stato,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.appuntivari.mylibrary.NoSuchMyLibraryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByStato_Last(stato, orderByComparator);
	}

	/**
	* Returns the last my library in the ordered set where stato = &#63;.
	*
	* @param stato the stato
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching my library, or <code>null</code> if a matching my library could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.appuntivari.mylibrary.model.MyLibrary fetchByStato_Last(
		java.lang.String stato,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByStato_Last(stato, orderByComparator);
	}

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
	public static com.appuntivari.mylibrary.model.MyLibrary[] findByStato_PrevAndNext(
		long id_book, java.lang.String stato,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.appuntivari.mylibrary.NoSuchMyLibraryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByStato_PrevAndNext(id_book, stato, orderByComparator);
	}

	/**
	* Returns all the my libraries.
	*
	* @return the my libraries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.appuntivari.mylibrary.model.MyLibrary> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.appuntivari.mylibrary.model.MyLibrary> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.appuntivari.mylibrary.model.MyLibrary> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the my libraries where titolo = &#63; from the database.
	*
	* @param titolo the titolo
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByTitolo(java.lang.String titolo)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByTitolo(titolo);
	}

	/**
	* Removes all the my libraries where autori = &#63; from the database.
	*
	* @param autori the autori
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByAutori(java.lang.String autori)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByAutori(autori);
	}

	/**
	* Removes all the my libraries where stato = &#63; from the database.
	*
	* @param stato the stato
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByStato(java.lang.String stato)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByStato(stato);
	}

	/**
	* Removes all the my libraries from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of my libraries where titolo = &#63;.
	*
	* @param titolo the titolo
	* @return the number of matching my libraries
	* @throws SystemException if a system exception occurred
	*/
	public static int countByTitolo(java.lang.String titolo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByTitolo(titolo);
	}

	/**
	* Returns the number of my libraries where autori = &#63;.
	*
	* @param autori the autori
	* @return the number of matching my libraries
	* @throws SystemException if a system exception occurred
	*/
	public static int countByAutori(java.lang.String autori)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByAutori(autori);
	}

	/**
	* Returns the number of my libraries where stato = &#63;.
	*
	* @param stato the stato
	* @return the number of matching my libraries
	* @throws SystemException if a system exception occurred
	*/
	public static int countByStato(java.lang.String stato)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByStato(stato);
	}

	/**
	* Returns the number of my libraries.
	*
	* @return the number of my libraries
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static MyLibraryPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (MyLibraryPersistence)PortletBeanLocatorUtil.locate(com.appuntivari.mylibrary.service.ClpSerializer.getServletContextName(),
					MyLibraryPersistence.class.getName());

			ReferenceRegistry.registerReference(MyLibraryUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(MyLibraryPersistence persistence) {
	}

	private static MyLibraryPersistence _persistence;
}