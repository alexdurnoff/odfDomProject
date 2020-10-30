package ru.durnov.odf;

import org.odftoolkit.odfdom.doc.OdfDocument;
import org.odftoolkit.odfdom.doc.OdfTextDocument;
import org.odftoolkit.odfdom.doc.table.OdfTable;

public class RowRemover {
	public static void main(String[] args) throws Exception {
		if (args.length < 2) throw new IllegalArgumentException("Не задан один из параметров для удаления строк из таблицы");
		String filePath = args[0];
		String tableName = args[1];
		OdfTextDocument odt = (OdfTextDocument) OdfDocument.loadDocument(filePath);
		OdfTable table = odt.getTableByName(tableName);
		int rowCount = table.getRowCount();
		table.removeRowsByIndex(4, rowCount - 6);
		odt.save(filePath);
		System.out.println("Строки удалены");
		System.exit(0);
	}

}
