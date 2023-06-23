package com.una.projecttwoprogramationtwo.models.Clients;

import java.util.ArrayList;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class ClientDAO extends ClientAdapter {

    private Element Client;
    private Element ced;
    private Element name;
    private Element lastName;
    private Element email;
    private Element telephone;
    private Element nacimiento;
    private Element direccion;

    public ClientDAO() throws Exception {
        super("Client");
    }

    public boolean add(Client client) {
        try {
            Document doc = normalizeDocument(url);

            ced = doc.createElement("Cedula");
            name = doc.createElement("Nombre");
            lastName = doc.createElement("Apellido");
            email = doc.createElement("Correo electronico");
            telephone = doc.createElement("Numero de telefono");
            nacimiento = doc.createElement("Fecha de nacimiento");
            direccion = doc.createElement("Direccion");

            // Establecer los valores que trae la entidad
            ced.appendChild(doc.createTextNode(client.getCed()));
            name.appendChild(doc.createTextNode(client.getName()));
            lastName.appendChild(doc.createTextNode(client.getLastName()));
            email.appendChild(doc.createTextNode(client.getEmail()));
            telephone.appendChild(doc.createTextNode(client.getTelephone()));
            nacimiento.appendChild(doc.createTextNode(client.getNacimiento()));
            direccion.appendChild(doc.createTextNode(client.getDireccion()));

            Client.appendChild(ced);
            Client.appendChild(name);
            Client.appendChild(lastName);
            Client.appendChild(email);
            Client.appendChild(telephone);
            Client.appendChild(nacimiento);
            Client.appendChild(direccion);

            NodeList root = doc.getElementsByTagName("Cliente");
            root.item(0).appendChild(Client);
            this.transformXML(doc);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    public Client find(String code) {
        try {
            Document doc = normalizeDocument(url);

            NodeList list = doc.getDocumentElement().getElementsByTagName("Client");
            for (int i = 0; i < list.getLength(); i++) {
                if (list.item(i).getChildNodes().item(0).getTextContent().equals(code)) {
                    Client c = new Client();

                    c.setCed(list.item(i).getChildNodes().item(1).getTextContent());
                    c.setName(list.item(i).getChildNodes().item(1).getTextContent());
                    c.setLastName(list.item(i).getChildNodes().item(1).getTextContent());
                    c.setEmail(list.item(i).getChildNodes().item(1).getTextContent());
                    c.setTelephone(list.item(i).getChildNodes().item(1).getTextContent());
                    c.setNacimiento(list.item(i).getChildNodes().item(1).getTextContent());
                    c.setDireccion(list.item(i).getChildNodes().item(1).getTextContent());

                    return c;
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

            NodeList list = doc.getDocumentElement().getElementsByTagName("Client");
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

    public boolean delete(String ced) {
        try {
            Document doc = normalizeDocument(url);
            NodeList list = doc.getDocumentElement().getElementsByTagName("Cliente");

            for (int i = 0; i < list.getLength(); i++) {
                Element clientElement = (Element) list.item(i);
                Element cedElement = (Element) clientElement.getElementsByTagName("Cedula").item(0);

                if (cedElement.getTextContent().equals(ced)) {
                    clientElement.getParentNode().removeChild(clientElement);
                    transformXML(doc);
                    return true;
                }
            }

            return false;
        } catch (Exception ex) {
            return false;
        }
    }

    public boolean update(Client client) {
        try {
            Document doc = normalizeDocument(url);
            NodeList list = doc.getDocumentElement().getElementsByTagName("Cliente");

            for (int i = 0; i < list.getLength(); i++) {
                Element clientElement = (Element) list.item(i);
                Element cedElement = (Element) clientElement.getElementsByTagName("Cedula").item(0);

                if (cedElement.getTextContent().equals(client.getCed())) {
                    Element nameElement = (Element) clientElement.getElementsByTagName("Nombre").item(0);
                    Element lastNameElement = (Element) clientElement.getElementsByTagName("Apellido").item(0);
                    Element emailElement = (Element) clientElement.getElementsByTagName("Correo electronico").item(0);
                    Element telephoneElement = (Element) clientElement.getElementsByTagName("Numero de telefono").item(0);
                    Element nacimientoElement = (Element) clientElement.getElementsByTagName("Fecha de nacimiento").item(0);
                    Element direccionElement = (Element) clientElement.getElementsByTagName("Direccion").item(0);

                    nameElement.setTextContent(client.getName());
                    lastNameElement.setTextContent(client.getLastName());
                    emailElement.setTextContent(client.getEmail());
                    telephoneElement.setTextContent(client.getTelephone());
                    nacimientoElement.setTextContent(client.getNacimiento());
                    direccionElement.setTextContent(client.getDireccion());

                    transformXML(doc);
                    return true;
                }
            }

            return false;
        } catch (Exception ex) {
            return false;
        }
    }

    public ArrayList<Client> getAll() {
        ArrayList<Client> clientList = new ArrayList<>();
        try {
            Document doc = normalizeDocument(url);

            NodeList list = doc.getDocumentElement().getElementsByTagName("Cliente");
            for (int i = 0; i < list.getLength(); i++) {
                Element clientElement = (Element) list.item(i);

                String ced = clientElement.getElementsByTagName("Cedula").item(0).getTextContent();
                String name = clientElement.getElementsByTagName("Nombre").item(0).getTextContent();
                String lastName = clientElement.getElementsByTagName("Apellido").item(0).getTextContent();
                String email = clientElement.getElementsByTagName("Correo electronico").item(0).getTextContent();
                String telephone = clientElement.getElementsByTagName("Numero de telefono").item(0).getTextContent();
                String nacimiento = clientElement.getElementsByTagName("Fecha de nacimiento").item(0).getTextContent();
                String direccion = clientElement.getElementsByTagName("Direccion").item(0).getTextContent();

                Client client = new Client();
                client.setCed(ced);
                client.setName(name);
                client.setLastName(lastName);
                client.setEmail(email);
                client.setTelephone(telephone);
                client.setNacimiento(nacimiento);
                client.setDireccion(direccion);

                clientList.add(client);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return clientList;
    }
}
