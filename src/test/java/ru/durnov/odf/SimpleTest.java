package ru.durnov.odf;

import java.util.List;

import org.junit.Test;
import org.odftoolkit.odfdom.doc.OdfDocument;
import org.odftoolkit.odfdom.doc.OdfTextDocument;
import org.odftoolkit.odfdom.doc.table.OdfTable;

public class SimpleTest {
	@Test
	public void testAddingsRowToTable() throws Exception {
		OdfTextDocument odt = (OdfTextDocument) OdfDocument.loadDocument("/home/alexej/Документы/Работа/XML/Отчет проба odfdom.odt");
		OdfTable table = odt.getTableByName("Изоляция");
		table.appendRows(4000);
		odt.save("/home/alexej/Документы/Работа/XML/Отчет проба odfdom.odt");
	}
	
	@Test
	public void testRemoveRowFromTable() throws Exception {
		OdfTextDocument odt = (OdfTextDocument) OdfDocument.loadDocument("/home/alexej/Документы/Работа/XML/Отчет проба odfdom.odt");
		OdfTable table = odt.getTableByName("Изоляция");
		int rowCount = table.getRowCount();
		System.out.println(rowCount);
		for (int i = rowCount -1; i > 5; i--) {
			table.removeRowsByIndex(4, 1);
		}
		rowCount = table.getRowCount();
		System.out.println(rowCount);
		odt.save("/home/alexej/Документы/Работа/XML/Отчет проба odfdom.odt");
	}

}
