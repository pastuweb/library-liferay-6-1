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

package com.appuntivari.mylibrary.service.base;

import com.appuntivari.mylibrary.model.MyLibrary;
import com.appuntivari.mylibrary.service.MyLibraryLocalService;
import com.appuntivari.mylibrary.service.MyLibraryService;
import com.appuntivari.mylibrary.service.persistence.MyLibraryPersistence;

import com.liferay.counter.service.CounterLocalService;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.ResourceLocalService;
import com.liferay.portal.service.ResourceService;
import com.liferay.portal.service.UserLocalService;
import com.liferay.portal.service.UserService;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * The base implementation of the my library local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.appuntivari.mylibrary.service.impl.MyLibraryLocalServiceImpl}.
 * </p>
 *
 * @author Pasturenzi Francesco
 * @see com.appuntivari.mylibrary.service.impl.MyLibraryLocalServiceImpl
 * @see com.appuntivari.mylibrary.service.MyLibraryLocalServiceUtil
 * @generated
 */
public abstract class MyLibraryLocalServiceBaseImpl extends BaseLocalServiceImpl
	implements MyLibraryLocalService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.appuntivari.mylibrary.service.MyLibraryLocalServiceUtil} to access the my library local service.
	 */

	/**
	 * Adds the my library to the database. Also notifies the appropriate model listeners.
	 *
	 * @param myLibrary the my library
	 * @return the my library that was added
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	public MyLibrary addMyLibrary(MyLibrary myLibrary)
		throws SystemException {
		myLibrary.setNew(true);

		return myLibraryPersistence.update(myLibrary, false);
	}

	/**
	 * Creates a new my library with the primary key. Does not add the my library to the database.
	 *
	 * @param id_book the primary key for the new my library
	 * @return the new my library
	 */
	public MyLibrary createMyLibrary(long id_book) {
		return myLibraryPersistence.create(id_book);
	}

	/**
	 * Deletes the my library with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id_book the primary key of the my library
	 * @return the my library that was removed
	 * @throws PortalException if a my library with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	public MyLibrary deleteMyLibrary(long id_book)
		throws PortalException, SystemException {
		return myLibraryPersistence.remove(id_book);
	}

	/**
	 * Deletes the my library from the database. Also notifies the appropriate model listeners.
	 *
	 * @param myLibrary the my library
	 * @return the my library that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	public MyLibrary deleteMyLibrary(MyLibrary myLibrary)
		throws SystemException {
		return myLibraryPersistence.remove(myLibrary);
	}

	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(MyLibrary.class,
			clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return myLibraryPersistence.findWithDynamicQuery(dynamicQuery);
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
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return myLibraryPersistence.findWithDynamicQuery(dynamicQuery, start,
			end);
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
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return myLibraryPersistence.findWithDynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	 * Returns the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	public long dynamicQueryCount(DynamicQuery dynamicQuery)
		throws SystemException {
		return myLibraryPersistence.countWithDynamicQuery(dynamicQuery);
	}

	public MyLibrary fetchMyLibrary(long id_book) throws SystemException {
		return myLibraryPersistence.fetchByPrimaryKey(id_book);
	}

	/**
	 * Returns the my library with the primary key.
	 *
	 * @param id_book the primary key of the my library
	 * @return the my library
	 * @throws PortalException if a my library with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public MyLibrary getMyLibrary(long id_book)
		throws PortalException, SystemException {
		return myLibraryPersistence.findByPrimaryKey(id_book);
	}

	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return myLibraryPersistence.findByPrimaryKey(primaryKeyObj);
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
	public List<MyLibrary> getMyLibraries(int start, int end)
		throws SystemException {
		return myLibraryPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of my libraries.
	 *
	 * @return the number of my libraries
	 * @throws SystemException if a system exception occurred
	 */
	public int getMyLibrariesCount() throws SystemException {
		return myLibraryPersistence.countAll();
	}

	/**
	 * Updates the my library in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param myLibrary the my library
	 * @return the my library that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	public MyLibrary updateMyLibrary(MyLibrary myLibrary)
		throws SystemException {
		return updateMyLibrary(myLibrary, true);
	}

	/**
	 * Updates the my library in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param myLibrary the my library
	 * @param merge whether to merge the my library with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	 * @return the my library that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	public MyLibrary updateMyLibrary(MyLibrary myLibrary, boolean merge)
		throws SystemException {
		myLibrary.setNew(false);

		return myLibraryPersistence.update(myLibrary, merge);
	}

	/**
	 * Returns the my library local service.
	 *
	 * @return the my library local service
	 */
	public MyLibraryLocalService getMyLibraryLocalService() {
		return myLibraryLocalService;
	}

	/**
	 * Sets the my library local service.
	 *
	 * @param myLibraryLocalService the my library local service
	 */
	public void setMyLibraryLocalService(
		MyLibraryLocalService myLibraryLocalService) {
		this.myLibraryLocalService = myLibraryLocalService;
	}

	/**
	 * Returns the my library remote service.
	 *
	 * @return the my library remote service
	 */
	public MyLibraryService getMyLibraryService() {
		return myLibraryService;
	}

	/**
	 * Sets the my library remote service.
	 *
	 * @param myLibraryService the my library remote service
	 */
	public void setMyLibraryService(MyLibraryService myLibraryService) {
		this.myLibraryService = myLibraryService;
	}

	/**
	 * Returns the my library persistence.
	 *
	 * @return the my library persistence
	 */
	public MyLibraryPersistence getMyLibraryPersistence() {
		return myLibraryPersistence;
	}

	/**
	 * Sets the my library persistence.
	 *
	 * @param myLibraryPersistence the my library persistence
	 */
	public void setMyLibraryPersistence(
		MyLibraryPersistence myLibraryPersistence) {
		this.myLibraryPersistence = myLibraryPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the resource remote service.
	 *
	 * @return the resource remote service
	 */
	public ResourceService getResourceService() {
		return resourceService;
	}

	/**
	 * Sets the resource remote service.
	 *
	 * @param resourceService the resource remote service
	 */
	public void setResourceService(ResourceService resourceService) {
		this.resourceService = resourceService;
	}

	/**
	 * Returns the resource persistence.
	 *
	 * @return the resource persistence
	 */
	public ResourcePersistence getResourcePersistence() {
		return resourcePersistence;
	}

	/**
	 * Sets the resource persistence.
	 *
	 * @param resourcePersistence the resource persistence
	 */
	public void setResourcePersistence(ResourcePersistence resourcePersistence) {
		this.resourcePersistence = resourcePersistence;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();

		PersistedModelLocalServiceRegistryUtil.register("com.appuntivari.mylibrary.model.MyLibrary",
			myLibraryLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"com.appuntivari.mylibrary.model.MyLibrary");
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return MyLibrary.class;
	}

	protected String getModelClassName() {
		return MyLibrary.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = myLibraryPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = MyLibraryLocalService.class)
	protected MyLibraryLocalService myLibraryLocalService;
	@BeanReference(type = MyLibraryService.class)
	protected MyLibraryService myLibraryService;
	@BeanReference(type = MyLibraryPersistence.class)
	protected MyLibraryPersistence myLibraryPersistence;
	@BeanReference(type = CounterLocalService.class)
	protected CounterLocalService counterLocalService;
	@BeanReference(type = ResourceLocalService.class)
	protected ResourceLocalService resourceLocalService;
	@BeanReference(type = ResourceService.class)
	protected ResourceService resourceService;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserLocalService.class)
	protected UserLocalService userLocalService;
	@BeanReference(type = UserService.class)
	protected UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private MyLibraryLocalServiceClpInvoker _clpInvoker = new MyLibraryLocalServiceClpInvoker();
}