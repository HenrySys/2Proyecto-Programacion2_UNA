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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String update(String[] data) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String delete(String code) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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


