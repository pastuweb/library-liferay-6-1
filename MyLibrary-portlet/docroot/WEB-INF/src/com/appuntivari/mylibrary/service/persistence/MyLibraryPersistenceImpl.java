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

import com.appuntivari.mylibrary.NoSuchMyLibraryException;
import com.appuntivari.mylibrary.model.MyLibrary;
import com.appuntivari.mylibrary.model.impl.MyLibraryImpl;
import com.appuntivari.mylibrary.model.impl.MyLibraryModelImpl;

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the my library service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Pasturenzi Francesco
 * @see MyLibraryPersistence
 * @see MyLibraryUtil
 * @generated
 */
public class MyLibraryPersistenceImpl extends BasePersistenceImpl<MyLibrary>
	implements MyLibraryPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link MyLibraryUtil} to access the my library persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = MyLibraryImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TITOLO = new FinderPath(MyLibraryModelImpl.ENTITY_CACHE_ENABLED,
			MyLibraryModelImpl.FINDER_CACHE_ENABLED, MyLibraryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByTitolo",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TITOLO =
		new FinderPath(MyLibraryModelImpl.ENTITY_CACHE_ENABLED,
			MyLibraryModelImpl.FINDER_CACHE_ENABLED, MyLibraryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByTitolo",
			new String[] { String.class.getName() },
			MyLibraryModelImpl.TITOLO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TITOLO = new FinderPath(MyLibraryModelImpl.ENTITY_CACHE_ENABLED,
			MyLibraryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTitolo",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_AUTORI = new FinderPath(MyLibraryModelImpl.ENTITY_CACHE_ENABLED,
			MyLibraryModelImpl.FINDER_CACHE_ENABLED, MyLibraryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByAutori",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_AUTORI =
		new FinderPath(MyLibraryModelImpl.ENTITY_CACHE_ENABLED,
			MyLibraryModelImpl.FINDER_CACHE_ENABLED, MyLibraryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByAutori",
			new String[] { String.class.getName() },
			MyLibraryModelImpl.AUTORI_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_AUTORI = new FinderPath(MyLibraryModelImpl.ENTITY_CACHE_ENABLED,
			MyLibraryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByAutori",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_STATO = new FinderPath(MyLibraryModelImpl.ENTITY_CACHE_ENABLED,
			MyLibraryModelImpl.FINDER_CACHE_ENABLED, MyLibraryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByStato",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATO = new FinderPath(MyLibraryModelImpl.ENTITY_CACHE_ENABLED,
			MyLibraryModelImpl.FINDER_CACHE_ENABLED, MyLibraryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByStato",
			new String[] { String.class.getName() },
			MyLibraryModelImpl.STATO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_STATO = new FinderPath(MyLibraryModelImpl.ENTITY_CACHE_ENABLED,
			MyLibraryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByStato",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(MyLibraryModelImpl.ENTITY_CACHE_ENABLED,
			MyLibraryModelImpl.FINDER_CACHE_ENABLED, MyLibraryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(MyLibraryModelImpl.ENTITY_CACHE_ENABLED,
			MyLibraryModelImpl.FINDER_CACHE_ENABLED, MyLibraryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(MyLibraryModelImpl.ENTITY_CACHE_ENABLED,
			MyLibraryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the my library in the entity cache if it is enabled.
	 *
	 * @param myLibrary the my library
	 */
	public void cacheResult(MyLibrary myLibrary) {
		EntityCacheUtil.putResult(MyLibraryModelImpl.ENTITY_CACHE_ENABLED,
			MyLibraryImpl.class, myLibrary.getPrimaryKey(), myLibrary);

		myLibrary.resetOriginalValues();
	}

	/**
	 * Caches the my libraries in the entity cache if it is enabled.
	 *
	 * @param myLibraries the my libraries
	 */
	public void cacheResult(List<MyLibrary> myLibraries) {
		for (MyLibrary myLibrary : myLibraries) {
			if (EntityCacheUtil.getResult(
						MyLibraryModelImpl.ENTITY_CACHE_ENABLED,
						MyLibraryImpl.class, myLibrary.getPrimaryKey()) == null) {
				cacheResult(myLibrary);
			}
			else {
				myLibrary.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all my libraries.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(MyLibraryImpl.class.getName());
		}

		EntityCacheUtil.clearCache(MyLibraryImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the my library.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(MyLibrary myLibrary) {
		EntityCacheUtil.removeResult(MyLibraryModelImpl.ENTITY_CACHE_ENABLED,
			MyLibraryImpl.class, myLibrary.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<MyLibrary> myLibraries) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (MyLibrary myLibrary : myLibraries) {
			EntityCacheUtil.removeResult(MyLibraryModelImpl.ENTITY_CACHE_ENABLED,
				MyLibraryImpl.class, myLibrary.getPrimaryKey());
		}
	}

	/**
	 * Creates a new my library with the primary key. Does not add the my library to the database.
	 *
	 * @param id_book the primary key for the new my library
	 * @return the new my library
	 */
	public MyLibrary create(long id_book) {
		MyLibrary myLibrary = new MyLibraryImpl();

		myLibrary.setNew(true);
		myLibrary.setPrimaryKey(id_book);

		return myLibrary;
	}

	/**
	 * Removes the my library with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id_book the primary key of the my library
	 * @return the my library that was removed
	 * @throws com.appuntivari.mylibrary.NoSuchMyLibraryException if a my library with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public MyLibrary remove(long id_book)
		throws NoSuchMyLibraryException, SystemException {
		return remove(Long.valueOf(id_book));
	}

	/**
	 * Removes the my library with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the my library
	 * @return the my library that was removed
	 * @throws com.appuntivari.mylibrary.NoSuchMyLibraryException if a my library with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MyLibrary remove(Serializable primaryKey)
		throws NoSuchMyLibraryException, SystemException {
		Session session = null;

		try {
			session = openSession();

			MyLibrary myLibrary = (MyLibrary)session.get(MyLibraryImpl.class,
					primaryKey);

			if (myLibrary == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMyLibraryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(myLibrary);
		}
		catch (NoSuchMyLibraryException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected MyLibrary removeImpl(MyLibrary myLibrary)
		throws SystemException {
		myLibrary = toUnwrappedModel(myLibrary);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, myLibrary);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(myLibrary);

		return myLibrary;
	}

	@Override
	public MyLibrary updateImpl(
		com.appuntivari.mylibrary.model.MyLibrary myLibrary, boolean merge)
		throws SystemException {
		myLibrary = toUnwrappedModel(myLibrary);

		boolean isNew = myLibrary.isNew();

		MyLibraryModelImpl myLibraryModelImpl = (MyLibraryModelImpl)myLibrary;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, myLibrary, merge);

			myLibrary.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !MyLibraryModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((myLibraryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TITOLO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						myLibraryModelImpl.getOriginalTitolo()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TITOLO, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TITOLO,
					args);

				args = new Object[] { myLibraryModelImpl.getTitolo() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TITOLO, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TITOLO,
					args);
			}

			if ((myLibraryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_AUTORI.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						myLibraryModelImpl.getOriginalAutori()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_AUTORI, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_AUTORI,
					args);

				args = new Object[] { myLibraryModelImpl.getAutori() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_AUTORI, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_AUTORI,
					args);
			}

			if ((myLibraryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						myLibraryModelImpl.getOriginalStato()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STATO, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATO,
					args);

				args = new Object[] { myLibraryModelImpl.getStato() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STATO, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATO,
					args);
			}
		}

		EntityCacheUtil.putResult(MyLibraryModelImpl.ENTITY_CACHE_ENABLED,
			MyLibraryImpl.class, myLibrary.getPrimaryKey(), myLibrary);

		return myLibrary;
	}

	protected MyLibrary toUnwrappedModel(MyLibrary myLibrary) {
		if (myLibrary instanceof MyLibraryImpl) {
			return myLibrary;
		}

		MyLibraryImpl myLibraryImpl = new MyLibraryImpl();

		myLibraryImpl.setNew(myLibrary.isNew());
		myLibraryImpl.setPrimaryKey(myLibrary.getPrimaryKey());

		myLibraryImpl.setId_book(myLibrary.getId_book());
		myLibraryImpl.setTitolo(myLibrary.getTitolo());
		myLibraryImpl.setDescrizione(myLibrary.getDescrizione());
		myLibraryImpl.setAutori(myLibrary.getAutori());
		myLibraryImpl.setStato(myLibrary.getStato());
		myLibraryImpl.setLink_more_info(myLibrary.getLink_more_info());
		myLibraryImpl.setNote(myLibrary.getNote());

		return myLibraryImpl;
	}

	/**
	 * Returns the my library with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the my library
	 * @return the my library
	 * @throws com.liferay.portal.NoSuchModelException if a my library with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MyLibrary findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the my library with the primary key or throws a {@link com.appuntivari.mylibrary.NoSuchMyLibraryException} if it could not be found.
	 *
	 * @param id_book the primary key of the my library
	 * @return the my library
	 * @throws com.appuntivari.mylibrary.NoSuchMyLibraryException if a my library with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public MyLibrary findByPrimaryKey(long id_book)
		throws NoSuchMyLibraryException, SystemException {
		MyLibrary myLibrary = fetchByPrimaryKey(id_book);

		if (myLibrary == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id_book);
			}

			throw new NoSuchMyLibraryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id_book);
		}

		return myLibrary;
	}

	/**
	 * Returns the my library with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the my library
	 * @return the my library, or <code>null</code> if a my library with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MyLibrary fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the my library with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id_book the primary key of the my library
	 * @return the my library, or <code>null</code> if a my library with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public MyLibrary fetchByPrimaryKey(long id_book) throws SystemException {
		MyLibrary myLibrary = (MyLibrary)EntityCacheUtil.getResult(MyLibraryModelImpl.ENTITY_CACHE_ENABLED,
				MyLibraryImpl.class, id_book);

		if (myLibrary == _nullMyLibrary) {
			return null;
		}

		if (myLibrary == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				myLibrary = (MyLibrary)session.get(MyLibraryImpl.class,
						Long.valueOf(id_book));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (myLibrary != null) {
					cacheResult(myLibrary);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(MyLibraryModelImpl.ENTITY_CACHE_ENABLED,
						MyLibraryImpl.class, id_book, _nullMyLibrary);
				}

				closeSession(session);
			}
		}

		return myLibrary;
	}

	/**
	 * Returns all the my libraries where titolo = &#63;.
	 *
	 * @param titolo the titolo
	 * @return the matching my libraries
	 * @throws SystemException if a system exception occurred
	 */
	public List<MyLibrary> findByTitolo(String titolo)
		throws SystemException {
		return findByTitolo(titolo, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<MyLibrary> findByTitolo(String titolo, int start, int end)
		throws SystemException {
		return findByTitolo(titolo, start, end, null);
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
	public List<MyLibrary> findByTitolo(String titolo, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TITOLO;
			finderArgs = new Object[] { titolo };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TITOLO;
			finderArgs = new Object[] { titolo, start, end, orderByComparator };
		}

		List<MyLibrary> list = (List<MyLibrary>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (MyLibrary myLibrary : list) {
				if (!Validator.equals(titolo, myLibrary.getTitolo())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_MYLIBRARY_WHERE);

			if (titolo == null) {
				query.append(_FINDER_COLUMN_TITOLO_TITOLO_1);
			}
			else {
				if (titolo.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_TITOLO_TITOLO_3);
				}
				else {
					query.append(_FINDER_COLUMN_TITOLO_TITOLO_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(MyLibraryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (titolo != null) {
					qPos.add(titolo);
				}

				list = (List<MyLibrary>)QueryUtil.list(q, getDialect(), start,
						end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(finderPath, finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(finderPath, finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
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
	public MyLibrary findByTitolo_First(String titolo,
		OrderByComparator orderByComparator)
		throws NoSuchMyLibraryException, SystemException {
		MyLibrary myLibrary = fetchByTitolo_First(titolo, orderByComparator);

		if (myLibrary != null) {
			return myLibrary;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("titolo=");
		msg.append(titolo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMyLibraryException(msg.toString());
	}

	/**
	 * Returns the first my library in the ordered set where titolo = &#63;.
	 *
	 * @param titolo the titolo
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching my library, or <code>null</code> if a matching my library could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public MyLibrary fetchByTitolo_First(String titolo,
		OrderByComparator orderByComparator) throws SystemException {
		List<MyLibrary> list = findByTitolo(titolo, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	public MyLibrary findByTitolo_Last(String titolo,
		OrderByComparator orderByComparator)
		throws NoSuchMyLibraryException, SystemException {
		MyLibrary myLibrary = fetchByTitolo_Last(titolo, orderByComparator);

		if (myLibrary != null) {
			return myLibrary;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("titolo=");
		msg.append(titolo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMyLibraryException(msg.toString());
	}

	/**
	 * Returns the last my library in the ordered set where titolo = &#63;.
	 *
	 * @param titolo the titolo
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching my library, or <code>null</code> if a matching my library could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public MyLibrary fetchByTitolo_Last(String titolo,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByTitolo(titolo);

		List<MyLibrary> list = findByTitolo(titolo, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	public MyLibrary[] findByTitolo_PrevAndNext(long id_book, String titolo,
		OrderByComparator orderByComparator)
		throws NoSuchMyLibraryException, SystemException {
		MyLibrary myLibrary = findByPrimaryKey(id_book);

		Session session = null;

		try {
			session = openSession();

			MyLibrary[] array = new MyLibraryImpl[3];

			array[0] = getByTitolo_PrevAndNext(session, myLibrary, titolo,
					orderByComparator, true);

			array[1] = myLibrary;

			array[2] = getByTitolo_PrevAndNext(session, myLibrary, titolo,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected MyLibrary getByTitolo_PrevAndNext(Session session,
		MyLibrary myLibrary, String titolo,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_MYLIBRARY_WHERE);

		if (titolo == null) {
			query.append(_FINDER_COLUMN_TITOLO_TITOLO_1);
		}
		else {
			if (titolo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TITOLO_TITOLO_3);
			}
			else {
				query.append(_FINDER_COLUMN_TITOLO_TITOLO_2);
			}
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		else {
			query.append(MyLibraryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (titolo != null) {
			qPos.add(titolo);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(myLibrary);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<MyLibrary> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the my libraries where autori = &#63;.
	 *
	 * @param autori the autori
	 * @return the matching my libraries
	 * @throws SystemException if a system exception occurred
	 */
	public List<MyLibrary> findByAutori(String autori)
		throws SystemException {
		return findByAutori(autori, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<MyLibrary> findByAutori(String autori, int start, int end)
		throws SystemException {
		return findByAutori(autori, start, end, null);
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
	public List<MyLibrary> findByAutori(String autori, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_AUTORI;
			finderArgs = new Object[] { autori };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_AUTORI;
			finderArgs = new Object[] { autori, start, end, orderByComparator };
		}

		List<MyLibrary> list = (List<MyLibrary>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (MyLibrary myLibrary : list) {
				if (!Validator.equals(autori, myLibrary.getAutori())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_MYLIBRARY_WHERE);

			if (autori == null) {
				query.append(_FINDER_COLUMN_AUTORI_AUTORI_1);
			}
			else {
				if (autori.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_AUTORI_AUTORI_3);
				}
				else {
					query.append(_FINDER_COLUMN_AUTORI_AUTORI_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(MyLibraryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (autori != null) {
					qPos.add(autori);
				}

				list = (List<MyLibrary>)QueryUtil.list(q, getDialect(), start,
						end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(finderPath, finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(finderPath, finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
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
	public MyLibrary findByAutori_First(String autori,
		OrderByComparator orderByComparator)
		throws NoSuchMyLibraryException, SystemException {
		MyLibrary myLibrary = fetchByAutori_First(autori, orderByComparator);

		if (myLibrary != null) {
			return myLibrary;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("autori=");
		msg.append(autori);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMyLibraryException(msg.toString());
	}

	/**
	 * Returns the first my library in the ordered set where autori = &#63;.
	 *
	 * @param autori the autori
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching my library, or <code>null</code> if a matching my library could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public MyLibrary fetchByAutori_First(String autori,
		OrderByComparator orderByComparator) throws SystemException {
		List<MyLibrary> list = findByAutori(autori, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	public MyLibrary findByAutori_Last(String autori,
		OrderByComparator orderByComparator)
		throws NoSuchMyLibraryException, SystemException {
		MyLibrary myLibrary = fetchByAutori_Last(autori, orderByComparator);

		if (myLibrary != null) {
			return myLibrary;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("autori=");
		msg.append(autori);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMyLibraryException(msg.toString());
	}

	/**
	 * Returns the last my library in the ordered set where autori = &#63;.
	 *
	 * @param autori the autori
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching my library, or <code>null</code> if a matching my library could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public MyLibrary fetchByAutori_Last(String autori,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByAutori(autori);

		List<MyLibrary> list = findByAutori(autori, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	public MyLibrary[] findByAutori_PrevAndNext(long id_book, String autori,
		OrderByComparator orderByComparator)
		throws NoSuchMyLibraryException, SystemException {
		MyLibrary myLibrary = findByPrimaryKey(id_book);

		Session session = null;

		try {
			session = openSession();

			MyLibrary[] array = new MyLibraryImpl[3];

			array[0] = getByAutori_PrevAndNext(session, myLibrary, autori,
					orderByComparator, true);

			array[1] = myLibrary;

			array[2] = getByAutori_PrevAndNext(session, myLibrary, autori,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected MyLibrary getByAutori_PrevAndNext(Session session,
		MyLibrary myLibrary, String autori,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_MYLIBRARY_WHERE);

		if (autori == null) {
			query.append(_FINDER_COLUMN_AUTORI_AUTORI_1);
		}
		else {
			if (autori.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_AUTORI_AUTORI_3);
			}
			else {
				query.append(_FINDER_COLUMN_AUTORI_AUTORI_2);
			}
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		else {
			query.append(MyLibraryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (autori != null) {
			qPos.add(autori);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(myLibrary);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<MyLibrary> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the my libraries where stato = &#63;.
	 *
	 * @param stato the stato
	 * @return the matching my libraries
	 * @throws SystemException if a system exception occurred
	 */
	public List<MyLibrary> findByStato(String stato) throws SystemException {
		return findByStato(stato, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<MyLibrary> findByStato(String stato, int start, int end)
		throws SystemException {
		return findByStato(stato, start, end, null);
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
	public List<MyLibrary> findByStato(String stato, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATO;
			finderArgs = new Object[] { stato };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_STATO;
			finderArgs = new Object[] { stato, start, end, orderByComparator };
		}

		List<MyLibrary> list = (List<MyLibrary>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (MyLibrary myLibrary : list) {
				if (!Validator.equals(stato, myLibrary.getStato())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_MYLIBRARY_WHERE);

			if (stato == null) {
				query.append(_FINDER_COLUMN_STATO_STATO_1);
			}
			else {
				if (stato.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_STATO_STATO_3);
				}
				else {
					query.append(_FINDER_COLUMN_STATO_STATO_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(MyLibraryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (stato != null) {
					qPos.add(stato);
				}

				list = (List<MyLibrary>)QueryUtil.list(q, getDialect(), start,
						end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(finderPath, finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(finderPath, finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
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
	public MyLibrary findByStato_First(String stato,
		OrderByComparator orderByComparator)
		throws NoSuchMyLibraryException, SystemException {
		MyLibrary myLibrary = fetchByStato_First(stato, orderByComparator);

		if (myLibrary != null) {
			return myLibrary;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("stato=");
		msg.append(stato);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMyLibraryException(msg.toString());
	}

	/**
	 * Returns the first my library in the ordered set where stato = &#63;.
	 *
	 * @param stato the stato
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching my library, or <code>null</code> if a matching my library could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public MyLibrary fetchByStato_First(String stato,
		OrderByComparator orderByComparator) throws SystemException {
		List<MyLibrary> list = findByStato(stato, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	public MyLibrary findByStato_Last(String stato,
		OrderByComparator orderByComparator)
		throws NoSuchMyLibraryException, SystemException {
		MyLibrary myLibrary = fetchByStato_Last(stato, orderByComparator);

		if (myLibrary != null) {
			return myLibrary;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("stato=");
		msg.append(stato);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMyLibraryException(msg.toString());
	}

	/**
	 * Returns the last my library in the ordered set where stato = &#63;.
	 *
	 * @param stato the stato
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching my library, or <code>null</code> if a matching my library could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public MyLibrary fetchByStato_Last(String stato,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByStato(stato);

		List<MyLibrary> list = findByStato(stato, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	public MyLibrary[] findByStato_PrevAndNext(long id_book, String stato,
		OrderByComparator orderByComparator)
		throws NoSuchMyLibraryException, SystemException {
		MyLibrary myLibrary = findByPrimaryKey(id_book);

		Session session = null;

		try {
			session = openSession();

			MyLibrary[] array = new MyLibraryImpl[3];

			array[0] = getByStato_PrevAndNext(session, myLibrary, stato,
					orderByComparator, true);

			array[1] = myLibrary;

			array[2] = getByStato_PrevAndNext(session, myLibrary, stato,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected MyLibrary getByStato_PrevAndNext(Session session,
		MyLibrary myLibrary, String stato, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_MYLIBRARY_WHERE);

		if (stato == null) {
			query.append(_FINDER_COLUMN_STATO_STATO_1);
		}
		else {
			if (stato.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_STATO_STATO_3);
			}
			else {
				query.append(_FINDER_COLUMN_STATO_STATO_2);
			}
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		else {
			query.append(MyLibraryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (stato != null) {
			qPos.add(stato);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(myLibrary);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<MyLibrary> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the my libraries.
	 *
	 * @return the my libraries
	 * @throws SystemException if a system exception occurred
	 */
	public List<MyLibrary> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<MyLibrary> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
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
	public List<MyLibrary> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = new Object[] { start, end, orderByComparator };

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<MyLibrary> list = (List<MyLibrary>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_MYLIBRARY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_MYLIBRARY.concat(MyLibraryModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<MyLibrary>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<MyLibrary>)QueryUtil.list(q, getDialect(),
							start, end);
				}
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(finderPath, finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(finderPath, finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the my libraries where titolo = &#63; from the database.
	 *
	 * @param titolo the titolo
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByTitolo(String titolo) throws SystemException {
		for (MyLibrary myLibrary : findByTitolo(titolo)) {
			remove(myLibrary);
		}
	}

	/**
	 * Removes all the my libraries where autori = &#63; from the database.
	 *
	 * @param autori the autori
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByAutori(String autori) throws SystemException {
		for (MyLibrary myLibrary : findByAutori(autori)) {
			remove(myLibrary);
		}
	}

	/**
	 * Removes all the my libraries where stato = &#63; from the database.
	 *
	 * @param stato the stato
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByStato(String stato) throws SystemException {
		for (MyLibrary myLibrary : findByStato(stato)) {
			remove(myLibrary);
		}
	}

	/**
	 * Removes all the my libraries from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (MyLibrary myLibrary : findAll()) {
			remove(myLibrary);
		}
	}

	/**
	 * Returns the number of my libraries where titolo = &#63;.
	 *
	 * @param titolo the titolo
	 * @return the number of matching my libraries
	 * @throws SystemException if a system exception occurred
	 */
	public int countByTitolo(String titolo) throws SystemException {
		Object[] finderArgs = new Object[] { titolo };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_TITOLO,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_MYLIBRARY_WHERE);

			if (titolo == null) {
				query.append(_FINDER_COLUMN_TITOLO_TITOLO_1);
			}
			else {
				if (titolo.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_TITOLO_TITOLO_3);
				}
				else {
					query.append(_FINDER_COLUMN_TITOLO_TITOLO_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (titolo != null) {
					qPos.add(titolo);
				}

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_TITOLO,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of my libraries where autori = &#63;.
	 *
	 * @param autori the autori
	 * @return the number of matching my libraries
	 * @throws SystemException if a system exception occurred
	 */
	public int countByAutori(String autori) throws SystemException {
		Object[] finderArgs = new Object[] { autori };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_AUTORI,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_MYLIBRARY_WHERE);

			if (autori == null) {
				query.append(_FINDER_COLUMN_AUTORI_AUTORI_1);
			}
			else {
				if (autori.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_AUTORI_AUTORI_3);
				}
				else {
					query.append(_FINDER_COLUMN_AUTORI_AUTORI_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (autori != null) {
					qPos.add(autori);
				}

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_AUTORI,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of my libraries where stato = &#63;.
	 *
	 * @param stato the stato
	 * @return the number of matching my libraries
	 * @throws SystemException if a system exception occurred
	 */
	public int countByStato(String stato) throws SystemException {
		Object[] finderArgs = new Object[] { stato };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_STATO,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_MYLIBRARY_WHERE);

			if (stato == null) {
				query.append(_FINDER_COLUMN_STATO_STATO_1);
			}
			else {
				if (stato.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_STATO_STATO_3);
				}
				else {
					query.append(_FINDER_COLUMN_STATO_STATO_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (stato != null) {
					qPos.add(stato);
				}

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_STATO,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of my libraries.
	 *
	 * @return the number of my libraries
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_MYLIBRARY);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the my library persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.appuntivari.mylibrary.model.MyLibrary")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<MyLibrary>> listenersList = new ArrayList<ModelListener<MyLibrary>>();

				for (String listenerClassName : listenerClassNames) {
					Class<?> clazz = getClass();

					listenersList.add((ModelListener<MyLibrary>)InstanceFactory.newInstance(
							clazz.getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(MyLibraryImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = MyLibraryPersistence.class)
	protected MyLibraryPersistence myLibraryPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_MYLIBRARY = "SELECT myLibrary FROM MyLibrary myLibrary";
	private static final String _SQL_SELECT_MYLIBRARY_WHERE = "SELECT myLibrary FROM MyLibrary myLibrary WHERE ";
	private static final String _SQL_COUNT_MYLIBRARY = "SELECT COUNT(myLibrary) FROM MyLibrary myLibrary";
	private static final String _SQL_COUNT_MYLIBRARY_WHERE = "SELECT COUNT(myLibrary) FROM MyLibrary myLibrary WHERE ";
	private static final String _FINDER_COLUMN_TITOLO_TITOLO_1 = "myLibrary.titolo IS NULL";
	private static final String _FINDER_COLUMN_TITOLO_TITOLO_2 = "myLibrary.titolo = ?";
	private static final String _FINDER_COLUMN_TITOLO_TITOLO_3 = "(myLibrary.titolo IS NULL OR myLibrary.titolo = ?)";
	private static final String _FINDER_COLUMN_AUTORI_AUTORI_1 = "myLibrary.autori IS NULL";
	private static final String _FINDER_COLUMN_AUTORI_AUTORI_2 = "myLibrary.autori = ?";
	private static final String _FINDER_COLUMN_AUTORI_AUTORI_3 = "(myLibrary.autori IS NULL OR myLibrary.autori = ?)";
	private static final String _FINDER_COLUMN_STATO_STATO_1 = "myLibrary.stato IS NULL";
	private static final String _FINDER_COLUMN_STATO_STATO_2 = "myLibrary.stato = ?";
	private static final String _FINDER_COLUMN_STATO_STATO_3 = "(myLibrary.stato IS NULL OR myLibrary.stato = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "myLibrary.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No MyLibrary exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No MyLibrary exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(MyLibraryPersistenceImpl.class);
	private static MyLibrary _nullMyLibrary = new MyLibraryImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<MyLibrary> toCacheModel() {
				return _nullMyLibraryCacheModel;
			}
		};

	private static CacheModel<MyLibrary> _nullMyLibraryCacheModel = new CacheModel<MyLibrary>() {
			public MyLibrary toEntityModel() {
				return _nullMyLibrary;
			}
		};
}