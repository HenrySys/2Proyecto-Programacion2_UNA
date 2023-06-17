package com.una.projecttwoprogramationtwo.controllers.Clients;

import com.una.projecttwoprogramationtwo.models.Clients.Client;
import com.una.projecttwoprogramationtwo.models.Clients.ClientDAO;

public class ClientController implements ClientInterface {

    ClientDAO dao;

    public ClientController() throws Exception {
        dao = new ClientDAO();
    }

    @Override
    public String add(String[] data) {
        String response = "Cliente registrado previamente!";
        if (!dao.exist(data[0])) {
            Client p = new Client();
            p.setCed(data[0]);
            p.setName(data[1]);
            p.setLastName(data[2]);
            p.setEmail(data[3]);
            p.setTelephone(data[4]);
            p.setNacimiento(data[5]);
            p.setDireccion(data[6]);

            if (dao.add(p)) {
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

}
