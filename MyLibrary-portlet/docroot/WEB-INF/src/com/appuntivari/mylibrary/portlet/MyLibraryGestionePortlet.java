package com.appuntivari.mylibrary.portlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import com.appuntivari.mylibrary.model.MyLibrary;
import com.appuntivari.mylibrary.service.MyLibraryLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.util.bridges.mvc.MVCPortlet;


public class MyLibraryGestionePortlet extends MVCPortlet {
	
	
	 protected String editBookJSP = "/mylibrary-gestione/edit_book.jsp";
	 protected String addBookJSP = "/mylibrary-gestione/add_book.jsp";
	 protected String elencoBooksJSP = "/mylibrary-gestione/mylibrary.jsp";
	 
	 public void newBook(ActionRequest request, ActionResponse response)
		        throws Exception {

		        response.setRenderParameter("jspPage", addBookJSP);
		        
		 }
	 
	 
	 
	 public void addBook(ActionRequest request, ActionResponse response)
		        throws Exception {

			
		 MyLibrary book = ActionUtil.bookFromRequest(request);

		        ArrayList<String> errors = new ArrayList<String>();
		        
		        if (MyLibraryValidator.validateBook(book, errors) ) {
		        	MyLibraryLocalServiceUtil.addBook(book);
		            request.setAttribute("book", book);
		            SessionMessages.add(request, "book-salvato");
		            response.setRenderParameter("jspPage", elencoBooksJSP);
		        }else{
		        	request.setAttribute("book", book);
		        	SessionErrors.add(request, "campi-richiesti");
		        	for (String error : errors) {
	                    SessionErrors.add(request, error);
	                }
		        	 response.setRenderParameter("jspPage", addBookJSP);
		        }
		        
		        
		 }
		
		
	 
		public void editBook(ActionRequest request, ActionResponse response)
		        throws Exception {

		        long bookKey = ParamUtil.getLong(request, "resourcePrimKey");

		        if (Validator.isNotNull(bookKey)) {
		        	MyLibrary book =
		        			MyLibraryLocalServiceUtil.getMyLibrary(bookKey);
		            request.setAttribute("book", book);
		            response.setRenderParameter("jspPage", editBookJSP);
		        }
		 }
		
		
		public void updateBook(ActionRequest request, ActionResponse response)
		        throws Exception {

		        long bookKey = ParamUtil.getLong(request, "resourcePrimKey");
		        ArrayList<String> errors = new ArrayList();
		        
		        if (Validator.isNotNull(bookKey)) {
		        	MyLibrary book = MyLibraryLocalServiceUtil.getMyLibrary(bookKey);
		        	MyLibrary requestBook = ActionUtil.bookFromRequest(request);

		            if (MyLibraryValidator.validateBook(requestBook, errors)) {
		            	
		            	book.setTitolo(requestBook.getTitolo());
		            	book.setDescrizione(requestBook.getDescrizione());
		            	book.setAutori(requestBook.getAutori());
		            	book.setStato(requestBook.getStato());
		            	book.setLink_more_info(requestBook.getLink_more_info());
		            	book.setNote(requestBook.getNote());
		                
		            	MyLibraryLocalServiceUtil.updateMyLibrary(book);
		                SessionMessages.add(request, "book-aggiornato");
		                response.setRenderParameter("jspPage", elencoBooksJSP);

		            }
		            else {
		                for (String error : errors) {
		                    SessionErrors.add(request, error);
		                }
		                request.setAttribute("book", book);
		                response.setRenderParameter("jspPage", editBookJSP);
		            }

		        }else {
		            SessionErrors.add(request, "errore-aggiornamento");
		            response.setRenderParameter("jspPage", elencoBooksJSP);
		        }
		        
		    }
		
		public void deleteBook(ActionRequest request, ActionResponse response)
		        throws Exception {

		        long bookKey = ParamUtil.getLong(request, "resourcePrimKey");

		        if (Validator.isNotNull(bookKey)) {
		        	MyLibraryLocalServiceUtil.deleteBook(bookKey);
		            SessionMessages.add(request, "book-eliminato");
		        }
		        else {
		            SessionErrors.add(request, "errore-eliminazione");
		        }
		        
		        response.setRenderParameter("jspPage", elencoBooksJSP);
		 }
		
}
