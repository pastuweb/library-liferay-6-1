package com.appuntivari.mylibrary.portlet;

import java.util.List;


import com.appuntivari.mylibrary.model.MyLibrary;
import com.liferay.portal.kernel.util.Validator;

public class MyLibraryValidator {

	
	public static boolean validateBook(MyLibrary book, List errors) {
		boolean valid = true;
		
		if (Validator.isNull(book.getTitolo())) {
			errors.add("book-titolo-richiesto");
			valid = false;
		}
		if (Validator.isNull(book.getDescrizione())) {
			errors.add("book-descrizione-richiesto");
			valid = false;
		}
		if (Validator.isNull(book.getStato())) {
			errors.add("book-stato-richiesto");
			valid = false;
		}
		
		//test lunghezza input
		if ( !Validator.isNull(book.getTitolo()) && book.getTitolo().length() > 75 ) {
			errors.add("book-titolo-magg-75");
			valid = false;
		}
		if ( !Validator.isNull(book.getDescrizione()) && book.getDescrizione().length() > 75 ) {
			errors.add("book-descrizione-magg-75");
			valid = false;
		}
		if ( !Validator.isNull(book.getAutori()) && book.getAutori().length() > 75 ) {
			errors.add("book-autori-magg-75");
			valid = false;
		}
		if ( !Validator.isNull(book.getLink_more_info()) && book.getLink_more_info().length() > 75 ) {
			errors.add("book-link-magg-75");
			valid = false;
		}
		if ( !Validator.isNull(book.getNote()) && book.getNote().length() > 75 ) {
			errors.add("book-note-magg-75");
			valid = false;
		}
		
		

		return valid;
	}
	
	
}
