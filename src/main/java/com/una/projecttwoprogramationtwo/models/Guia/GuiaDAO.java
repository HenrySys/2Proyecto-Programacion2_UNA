package com.una.projecttwoprogramationtwo.models.Guia;

import java.util.ArrayList;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class GuiaDAO extends GuiaAdapter {

    private Element Guia;
    private Element ced;
    private Element name;
    private Element lastName;
    private Element email;
    private Element telephone;
    private Element nacimiento;
    private Element direccion;
    private Element numCarnet;

    public GuiaDAO() throws Exception {
        super("Guia");
    }

    public boolean add(Guia guia) {
        try {
            Document doc = normalizeDocument(url);

            ced = doc.createElement("Cedula");
            name = doc.createElement("Nombre");
            lastName = doc.createElement("Apellido");
            email = doc.createElement("Correo electronico");
            telephone = doc.createElement("Numero de telefono");
            nacimiento = doc.createElement("Fecha de nacimiento");
            direccion = doc.createElement("Direccion");
            numCarnet = doc.createElement("Numero de Carnet");

            // Establecer los valores que trae la entidad
            ced.appendChild(doc.createTextNode(guia.getCed()));
            name.appendChild(doc.createTextNode(guia.getName()));
            lastName.appendChild(doc.createTextNode(guia.getLastName()));
            email.appendChild(doc.createTextNode(guia.getEmail()));
            telephone.appendChild(doc.createTextNode(guia.getTelephone()));
            nacimiento.appendChild(doc.createTextNode(guia.getNacimiento()));
            direccion.appendChild(doc.createTextNode(guia.getDireccion()));

            Guia = doc.createElement("Guia");
            Guia.appendChild(ced);
            Guia.appendChild(name);
            Guia.appendChild(lastName);
            Guia.appendChild(email);
            Guia.appendChild(telephone);
            Guia.appendChild(nacimiento);
            Guia.appendChild(direccion);
            Guia.appendChild(numCarnet);

            NodeList root = doc.getElementsByTagName("Guias");
            root.item(0).appendChild(Guia);
            this.transformXML(doc);
            return true;
        } catch (Exception ex) {
            return false;

        }
    }

    public Guia find(String code) {
        try {
            Document doc = normalizeDocument(url);

            NodeList list = doc.getDocumentElement().getElementsByTagName("guia");
            for (int i = 0; i < list.getLength(); i++) {
                if (list.item(i).getChildNodes().item(0).getTextContent().equals(code)) {
                    Guia g = new Guia();

                    g.setCed(list.item(i).getChildNodes().item(1).getTextContent());
                    g.setName(list.item(i).getChildNodes().item(1).getTextContent());
                    g.setLastName(list.item(i).getChildNodes().item(1).getTextContent());
                    g.setEmail(list.item(i).getChildNodes().item(1).getTextContent());
                    g.setTelephone(list.item(i).getChildNodes().item(1).getTextContent());
                    g.setNacimiento(list.item(i).getChildNodes().item(1).getTextContent());
                    g.setDireccion(list.item(i).getChildNodes().item(1).getTextContent());

                    return g;
                }
            }
            return null;
        } catch (Exception ext) {
            return null;
        }
    }

    public boolean exist(String code) {
        try {
            Document doc = normalizeDocument(url);

            NodeList list = doc.getDocumentElement().getElementsByTagName("Guia");
            for (int i = 0; i < list.getLength(); i++) {
                if (list.item(i).getChildNodes().item(0).getTextContent().equals(code)) {
                    return true;
                }
            }
            return false;
        } catch (Exception ext) {
            return false;
        }
    }

    public boolean update(Guia guia) {
        try {
            Document doc = normalizeDocument(url);
            NodeList list = doc.getDocumentElement().getElementsByTagName("guia");

            for (int i = 0; i < list.getLength(); i++) {
                Element guiaElement = (Element) list.item(i);
                Element cedElement = (Element) guiaElement.getElementsByTagName("Cedula").item(0);

                if (cedElement.getTextContent().equals(guia.getCed())) {
                    Element nameElement = (Element) guiaElement.getElementsByTagName("Nombre").item(0);
                    Element lastNameElement = (Element) guiaElement.getElementsByTagName("Apellido").item(0);
                    Element emailElement = (Element) guiaElement.getElementsByTagName("Correo electronico").item(0);
                    Element telephoneElement = (Element) guiaElement.getElementsByTagName("Numero de telefono").item(0);
                    Element nacimientoElement = (Element) guiaElement.getElementsByTagName("Fecha de nacimiento").item(0);
                    Element direccionElement = (Element) guiaElement.getElementsByTagName("Direccion").item(0);
                    Element numCarnetElement = (Element) guiaElement.getElementsByTagName("Numero de Carnet").item(0);

                    nameElement.setTextContent(guia.getName());
                    lastNameElement.setTextContent(guia.getLastName());
                    emailElement.setTextContent(guia.getEmail());
                    telephoneElement.setTextContent(guia.getTelephone());
                    nacimientoElement.setTextContent(guia.getNacimiento());
                    direccionElement.setTextContent(guia.getDireccion());
                    numCarnetElement.setTextContent(guia.getNumCarnet());

                    transformXML(doc);
                    return true;
                }
            }

            return false;
        } catch (Exception ex) {
            return false;
        }
    }

    public boolean delete(String ced) {
        try {
            Document doc = normalizeDocument(url);
            NodeList list = doc.getDocumentElement().getElementsByTagName("guia");

            for (int i = 0; i < list.getLength(); i++) {
                Element guiaElement = (Element) list.item(i);
                Element cedElement = (Element) guiaElement.getElementsByTagName("Cedula").item(0);

                if (cedElement.getTextContent().equals(ced)) {
                    guiaElement.getParentNode().removeChild(guiaElement);
                    transformXML(doc);
                    return true;
                }
            }

            return false;
        } catch (Exception ex) {
            return false;
        }
    }

    public ArrayList<Guia> getAll() {
        ArrayList<Guia> guiaList = new ArrayList<>();
        try {
            Document doc = normalizeDocument(url);

            NodeList list = doc.getDocumentElement().getElementsByTagName("Guia");
            for (int i = 0; i < list.getLength(); i++) {
                Element guiaElement = (Element) list.item(i);

                String ced = guiaElement.getElementsByTagName("Cedula").item(0).getTextContent();
                String name = guiaElement.getElementsByTagName("Nombre").item(0).getTextContent();
                String lastName = guiaElement.getElementsByTagName("Apellido").item(0).getTextContent();
                String email = guiaElement.getElementsByTagName("Correo electronico").item(0).getTextContent();
                String telephone = guiaElement.getElementsByTagName("Numero de telefono").item(0).getTextContent();
                String nacimiento = guiaElement.getElementsByTagName("Fecha de nacimiento").item(0).getTextContent();
                String direccion = guiaElement.getElementsByTagName("Direccion").item(0).getTextContent();

                Guia guia = new Guia();
                guia.setCed(ced);
                guia.setName(name);
                guia.setLastName(lastName);
                guia.setEmail(email);
                guia.setTelephone(telephone);
                guia.setNacimiento(nacimiento);
                guia.setDireccion(direccion);

                guiaList.add(guia);
            }
        } catch (Exception ex) {
           
            ex.printStackTrace();
        }
        return guiaList;
    }
}
