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

package com.appuntivari.mylibrary;

import com.liferay.portal.NoSuchModelException;

/**
 * @author Pasturenzi Francesco
 */
public class NoSuchMyLibraryException extends NoSuchModelException {

	public NoSuchMyLibraryException() {
		super();
	}

	public NoSuchMyLibraryException(String msg) {
		super(msg);
	}

	public NoSuchMyLibraryException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public NoSuchMyLibraryException(Throwable cause) {
		super(cause);
	}

}