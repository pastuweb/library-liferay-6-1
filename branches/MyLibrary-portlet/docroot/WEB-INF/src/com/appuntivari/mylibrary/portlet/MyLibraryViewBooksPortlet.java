package com.appuntivari.mylibrary.portlet;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.StringReader;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import com.appuntivari.mylibrary.model.MyLibrary;
import com.appuntivari.mylibrary.service.MyLibraryLocalServiceUtil;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.tool.xml.XMLWorkerHelper;
import com.itextpdf.text.pdf.FontSelector;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.HttpHeaders;
import com.liferay.portal.security.auth.PrincipalThreadLocal;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portlet.asset.model.AssetEntry;
import com.liferay.portlet.asset.service.AssetEntryLocalServiceUtil;
import com.liferay.portlet.calendar.model.CalEvent;
import com.liferay.portlet.calendar.service.CalEventLocalServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;


public class MyLibraryViewBooksPortlet extends MVCPortlet {
	
	 protected String viewBooksJSP = "/mylibrary-view/viewBooks.jsp";


	public void serveResource(ResourceRequest request, ResourceResponse response)
			throws PortletException, IOException {
		
		 Font fontSize18 = new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD, BaseColor.RED);
		 Font fontSize9 = new Font(Font.FontFamily.TIMES_ROMAN, 9);
		 Font fontSize10 = new Font(Font.FontFamily.TIMES_ROMAN, 10);
		 Font fontSizeHeaderTable = new Font(Font.FontFamily.TIMES_ROMAN,  12, Font.BOLD,BaseColor.RED);	
			
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		OutputStream portletOutputStream=null;
		Document document=null;

		try {
			
			document = new Document();
			PdfWriter.getInstance(document, baos);
			
			
			document.open();
			Paragraph p1 = new Paragraph("Books in My Library", fontSize18);
			p1.setAlignment(Element.ALIGN_CENTER);
			document.add(p1);
			Paragraph p2 =  new Paragraph("Created by: Pasturenzi Francesco", fontSize10);
			p2.setAlignment(Element.ALIGN_RIGHT);
			document.add(p2);
			document.add( Chunk.NEWLINE );
			
			PdfPTable table = new PdfPTable(6); 
			PdfPCell cell_titolo = new PdfPCell();
				cell_titolo.addElement(new Paragraph("Titolo", fontSizeHeaderTable));
				cell_titolo.setBackgroundColor(BaseColor.LIGHT_GRAY);
			table.addCell(cell_titolo);
			PdfPCell cell_descr = new PdfPCell();
				cell_descr.addElement(new Paragraph("Descrizione", fontSizeHeaderTable));
				cell_descr.setBackgroundColor(BaseColor.LIGHT_GRAY);
			table.addCell(cell_descr);
			PdfPCell cell_autori = new PdfPCell();
				cell_autori.addElement(new Paragraph("Autori", fontSizeHeaderTable));
				cell_autori.setBackgroundColor(BaseColor.LIGHT_GRAY);
				table.addCell(cell_autori);
			PdfPCell cell_stato = new PdfPCell();
				cell_stato.addElement(new Paragraph("Stato", fontSizeHeaderTable));
				cell_stato.setBackgroundColor(BaseColor.LIGHT_GRAY);
			table.addCell(cell_stato);
			PdfPCell cell_link = new PdfPCell();
				cell_link.addElement(new Paragraph("Link", fontSizeHeaderTable));
				cell_link.setBackgroundColor(BaseColor.LIGHT_GRAY);
			table.addCell(cell_stato);
			PdfPCell cell_note = new PdfPCell();
				cell_note.addElement(new Paragraph("Note", fontSizeHeaderTable));
				cell_note.setBackgroundColor(BaseColor.LIGHT_GRAY);
			table.addCell(cell_note);
						
			//recupero dati dal db
			try {
				List<MyLibrary> lista_books = MyLibraryLocalServiceUtil.getMyLibraries(0, MyLibraryLocalServiceUtil.getMyLibrariesCount());
				for(MyLibrary item: lista_books){
					table.addCell(new Paragraph(item.getTitolo(), fontSize9));
					table.addCell(new Paragraph(item.getDescrizione(), fontSize9));
					table.addCell(new Paragraph(item.getAutori(), fontSize9));
					table.addCell(new Paragraph(item.getStato(), fontSize9));
					table.addCell(new Paragraph(item.getLink_more_info(), fontSize9));
					table.addCell(new Paragraph(item.getNote(), fontSize9));
				}
			} catch (SystemException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
			document.add(table);
			document.close();
			
			
			response.setContentType("application/pdf");
			response.setProperty(HttpHeaders.CONTENT_DISPOSITION,"attachement;filename=Pasturenzi_Francesco_library");
			response.addProperty(HttpHeaders.CACHE_CONTROL,"max-age=3600, must-revalidate");
			response.setContentLength(baos.size());
			
			System.out.println("baos.size(): "+baos.size());
			
			portletOutputStream = (OutputStream) response.getPortletOutputStream();
			baos.writeTo(portletOutputStream);
			
			portletOutputStream.flush();
			baos.close();
			portletOutputStream.close();
			
			
		} catch (Exception e) {
			 System.out.println( e.getMessage());
		}

	}
	
}
