package com.una.projecttwoprogramationtwo.controllers.Clients;

import com.una.projecttwoprogramationtwo.models.Clients.Client;
import com.una.projecttwoprogramationtwo.models.Clients.ClientDAO;
import java.util.ArrayList;

public class ClientController implements ClientInterface {

    ClientDAO dao;

    public ClientController() throws Exception {
        dao = new ClientDAO();
    }

    @Override
    public String add(String[] data) {
        String response = "Cliente registrado previamente!";
        if (!dao.exist(data[0])) {
            Client c = new Client();
            c.setCed(data[0]);
            c.setName(data[1]);
            c.setLastName(data[2]);
            c.setEmail(data[3]);
            c.setTelephone(data[4]);
            c.setNacimiento(data[5]);
            c.setDireccion(data[6]);

            if (dao.add(c)) {
                response = "Registro agregado exitosamente!";
            } else {
                response = "Error al agregar el registro";
            }

        }
        return response;
    }

    @Override
    public String[] find(String code) {
        Client client = dao.find(code);
        if (client != null) {
            String[] data = new String[7];
            data[0] = client.getCed();
            data[1] = client.getDireccion();
            data[2] = client.getEmail();
            data[3] = client.getLastName();
            data[4] = client.getNacimiento();
            data[5] = client.getName();
            data[6] = client.getTelephone();
            return data;
        } else {
            return null;
        }
    }

    @Override
    public String update(String[] data) {
        String response = "Cliente no encontrado!";
        if (dao.exist(data[0])) {
            Client c = new Client();
            c.setCed(data[0]);
            c.setName(data[1]);
            c.setLastName(data[2]);
            c.setEmail(data[3]);
            c.setTelephone(data[4]);
            c.setNacimiento(data[5]);
            c.setDireccion(data[6]);

            if (dao.update(c)) {
                response = "Registro actualizado exitosamente!";
            } else {
                response = "Error al actualizar el registro";
            }
        }
        return response;
    }

    @Override
    public String delete(String code) {
        String response = "Cliente no encontrado!";
        if (dao.exist(code)) {
            if (dao.delete(code)) {
                response = "Registro eliminado exitosamente!";
            } else {
                response = "Error al eliminar el registro";
            }
        }
        return response;

    }

    @Override
    public String[][] getAll() {
        ArrayList<Client> list = dao.getAll();
        String[][] data = new String[list.size()][7];
        for (int i = 0; i < list.size(); i++) {
            Client c = list.get(i);
            data[i][0] = c.getCed();
            data[i][1] = c.getDireccion();
            data[i][2] = c.getEmail();
            data[i][3] = c.getLastName();
            data[i][4] = c.getNacimiento();
            data[i][5] = c.getName();
            data[i][6] = c.getTelephone();
        }
        return data;
    }
}
