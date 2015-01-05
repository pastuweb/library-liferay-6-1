package com.appuntivari.mylibrary.portlet;

import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

import javax.portlet.ActionRequest;
import javax.portlet.RenderRequest;

import com.appuntivari.mylibrary.model.MyLibrary;
import com.appuntivari.mylibrary.model.impl.MyLibraryImpl;
import com.appuntivari.mylibrary.service.MyLibraryLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;


public class ActionUtil {

	public static List<MyLibrary> getBooks(RenderRequest request) {
	     
        List<MyLibrary> tempResults;

        try {
            tempResults = MyLibraryLocalServiceUtil.getMyLibraries(0, MyLibraryLocalServiceUtil.getMyLibrariesCount());
        }catch (SystemException ex) {
            tempResults  = Collections.EMPTY_LIST;
        }

        return tempResults;

    }
	
	
	public static MyLibrary bookFromRequest(ActionRequest request) {
	    
		MyLibrary book = new MyLibraryImpl();

		book.setTitolo(ParamUtil.getString(request, "titolo"));
		book.setDescrizione(ParamUtil.getString(request, "descrizione"));
		book.setAutori(ParamUtil.getString(request, "autori"));
		book.setStato(ParamUtil.getString(request, "stato"));
		book.setLink_more_info(ParamUtil.getString(request, "link_more_info"));
		book.setNote(ParamUtil.getString(request, "note"));

       return book;
    }
	
	
	public static String createHtmlURL(String par_url){
		
		String url = "<a target=\"_blank\" href=\""+par_url+"\" > More Info </a>";
		
		return url;
	}
	
}
