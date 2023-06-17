
package com.una.projecttwoprogramationtwo.models.Guia;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;

public class GuiaAdapter {

    protected String url;

    public GuiaAdapter(String entityName) throws Exception {
        this.url = entityName + ".xml";
        if (!(new File(url).exists())) {
            this.createXML(entityName);
        }
    }

    private void createXML(String root) throws Exception {
        DocumentBuilderFactory factory
                = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        DOMImplementation dom = builder.getDOMImplementation();

        Document doc = dom.createDocument(null, "xml", null);
        doc.setXmlVersion("1.0");
        doc.getDocumentElement().appendChild(doc.createElement(root));
        this.transformXML(doc);
    }

    public void transformXML(Document doc) throws Exception {
        Result result = new StreamResult(new File(this.url));
        Source source = new DOMSource(doc);
        Transformer transformer
                = TransformerFactory.
                        newInstance().
                        newTransformer();
        transformer.transform(source, result);
    }

    public Document normalizeDocument(String url) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(url);
        doc.getDocumentElement().normalize();
        return doc;
    }
}
