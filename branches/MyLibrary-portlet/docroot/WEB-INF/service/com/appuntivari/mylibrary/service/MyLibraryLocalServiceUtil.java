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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * The utility for the my library local service. This utility wraps {@link com.appuntivari.mylibrary.service.impl.MyLibraryLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Pasturenzi Francesco
 * @see MyLibraryLocalService
 * @see com.appuntivari.mylibrary.service.base.MyLibraryLocalServiceBaseImpl
 * @see com.appuntivari.mylibrary.service.impl.MyLibraryLocalServiceImpl
 * @generated
 */
public class MyLibraryLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.appuntivari.mylibrary.service.impl.MyLibraryLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the my library to the database. Also notifies the appropriate model listeners.
	*
	* @param myLibrary the my library
	* @return the my library that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.appuntivari.mylibrary.model.MyLibrary addMyLibrary(
		com.appuntivari.mylibrary.model.MyLibrary myLibrary)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addMyLibrary(myLibrary);
	}

	/**
	* Creates a new my library with the primary key. Does not add the my library to the database.
	*
	* @param id_book the primary key for the new my library
	* @return the new my library
	*/
	public static com.appuntivari.mylibrary.model.MyLibrary createMyLibrary(
		long id_book) {
		return getService().createMyLibrary(id_book);
	}

	/**
	* Deletes the my library with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id_book the primary key of the my library
	* @return the my library that was removed
	* @throws PortalException if a my library with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.appuntivari.mylibrary.model.MyLibrary deleteMyLibrary(
		long id_book)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteMyLibrary(id_book);
	}

	/**
	* Deletes the my library from the database. Also notifies the appropriate model listeners.
	*
	* @param myLibrary the my library
	* @return the my library that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.appuntivari.mylibrary.model.MyLibrary deleteMyLibrary(
		com.appuntivari.mylibrary.model.MyLibrary myLibrary)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteMyLibrary(myLibrary);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	public static com.appuntivari.mylibrary.model.MyLibrary fetchMyLibrary(
		long id_book)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchMyLibrary(id_book);
	}

	/**
	* Returns the my library with the primary key.
	*
	* @param id_book the primary key of the my library
	* @return the my library
	* @throws PortalException if a my library with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.appuntivari.mylibrary.model.MyLibrary getMyLibrary(
		long id_book)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getMyLibrary(id_book);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<com.appuntivari.mylibrary.model.MyLibrary> getMyLibraries(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getMyLibraries(start, end);
	}

	/**
	* Returns the number of my libraries.
	*
	* @return the number of my libraries
	* @throws SystemException if a system exception occurred
	*/
	public static int getMyLibrariesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getMyLibrariesCount();
	}

	/**
	* Updates the my library in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param myLibrary the my library
	* @return the my library that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.appuntivari.mylibrary.model.MyLibrary updateMyLibrary(
		com.appuntivari.mylibrary.model.MyLibrary myLibrary)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateMyLibrary(myLibrary);
	}

	/**
	* Updates the my library in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param myLibrary the my library
	* @param merge whether to merge the my library with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the my library that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.appuntivari.mylibrary.model.MyLibrary updateMyLibrary(
		com.appuntivari.mylibrary.model.MyLibrary myLibrary, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateMyLibrary(myLibrary, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static com.appuntivari.mylibrary.model.MyLibrary addBook(
		com.appuntivari.mylibrary.model.MyLibrary newBook)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().addBook(newBook);
	}

	public static void deleteBook(long bookId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteBook(bookId);
	}

	public static void deleteBook(
		com.appuntivari.mylibrary.model.MyLibrary book)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteBook(book);
	}

	public static java.util.List<com.appuntivari.mylibrary.model.MyLibrary> getAllBooks()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getAllBooks();
	}

	public static void clearService() {
		_service = null;
	}

	public static MyLibraryLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					MyLibraryLocalService.class.getName());

			if (invokableLocalService instanceof MyLibraryLocalService) {
				_service = (MyLibraryLocalService)invokableLocalService;
			}
			else {
				_service = new MyLibraryLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(MyLibraryLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(MyLibraryLocalService service) {
	}

	private static MyLibraryLocalService _service;
}