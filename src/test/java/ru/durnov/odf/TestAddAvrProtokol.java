package ru.durnov.odf;

import org.junit.Test;
import org.odftoolkit.odfdom.doc.OdfDocument;
import org.odftoolkit.odfdom.doc.OdfTextDocument;
import org.odftoolkit.odfdom.dom.OdfContentDom;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;

public class TestAddAvrProtokol {
	
	@Test
	public void test1() throws Exception {
		OdfTextDocument odt = (OdfTextDocument) OdfDocument.loadDocument("/home/alexej/Документы/Работа/XML/Отчет проба odfdom.odt");
		OdfContentDom content = odt.getContentDom();
		Text createTextNode = content.createTextNode("text");
		NodeList sectionList = content.getElementsByTagName("text:section");
		for(int i = 0; i < sectionList.getLength(); i++) {
			Node section = sectionList.item(i);
			NamedNodeMap attributes = section.getAttributes();
			Node textName = attributes.getNamedItem("text:name");
			System.out.println(textName.getNodeValue());
		}

		
	}

}
