package ru.durnov.odf;

import org.w3c.dom.NodeList;

public interface ProtokolFactory {
	public void copyProtokol(String protokolName, NodeList rootNodeElements);
}
