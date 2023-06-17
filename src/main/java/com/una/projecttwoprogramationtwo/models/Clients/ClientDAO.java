package com.una.projecttwoprogramationtwo.models.Clients;


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

            doc.getDocumentElement().normalize();
            ced = doc.createElement("Cedula");
            name = doc.createElement("Nombre");
            lastName = doc.createElement("Apellido");
            email = doc.createElement("Correo electronico");
            telephone = doc.createElement("Numero de telefono");
            nacimiento = doc.createElement("Fecha de nacimiento");
            direccion = doc.createElement("Direccion");

            //Establecer los valores que trae la entidad
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

            NodeList list = doc.getDocumentElement().getElementsByTagName("product");
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

            NodeList list = doc.getDocumentElement().getElementsByTagName("product");
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
}
