/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.una.projecttwoprogramationtwo.models.Clients;

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

/**
 *
 * @author ingenieria.una
 */
public class ClientAdapter {
        protected String url;
    public ClientAdapter(String entityName) throws Exception{
        this.url=entityName+".xml";
        if(!(new File(url).exists())){
            this.createXML(entityName);
        }
    }
    private void createXML(String root) throws Exception{
        DocumentBuilderFactory factory=
                DocumentBuilderFactory.newInstance();
        DocumentBuilder builder=factory.newDocumentBuilder();
        DOMImplementation dom=builder.getDOMImplementation();
        
        Document doc=dom.createDocument(null,"xml",null);
        doc.setXmlVersion("1.0");
        doc.getDocumentElement().appendChild(doc.createElement(root));
        this.transformXML(doc);
    }
    public void transformXML(Document doc) throws Exception{
        Result result=new StreamResult(new File(this.url));
        Source source=new DOMSource(doc);
        Transformer transformer=
                TransformerFactory.
                        newInstance().
                        newTransformer();
        transformer.transform(source, result);
    }
    
}
