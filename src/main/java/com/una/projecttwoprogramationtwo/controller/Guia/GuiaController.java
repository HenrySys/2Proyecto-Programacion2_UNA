package com.una.projecttwoprogramationtwo.controller.Guia;

import com.una.projecttwoprogramationtwo.models.Guia.Guia;
import com.una.projecttwoprogramationtwo.models.Guia.GuiaDAO;
import java.util.ArrayList;

public class GuiaController implements GuiaInterface {

    GuiaDAO dao;

    public GuiaController() throws Exception {
        dao = new GuiaDAO();
    }

    @Override
    public String add(String[] data) {

        String response = "Cliente registrado previamente!";
        if (!dao.exist(data[0])) {
            Guia g = new Guia();
            g.setCed(data[0]);
            g.setName(data[1]);
            g.setLastName(data[2]);
            g.setEmail(data[3]);
            g.setTelephone(data[4]);
            g.setNacimiento(data[5]);
            g.setDireccion(data[6]);

            if (dao.add(g)) {
                response = "Registro agregado exitosamente!";
            } else {
                response = "Error al agregar el registro";
            }

        }
        return response;
    }

    @Override
    public String[] find(String code) {
            Guia guia = dao.find(code);
        if (guia != null) {
            String[] data = new String[8];
            data[0] = guia.getCed();
            data[1] = guia.getDireccion();
            data[2] = guia.getEmail();
            data[3] = guia.getLastName();
            data[4] = guia.getNacimiento();
            data[5] = guia.getName();
            data[6] = guia.getTelephone();
            data[7] = guia.getNumCarnet();
            
            return data;
        } else {
            return null;
        }
    }

    @Override
    public String update(String[] data) {
            String response = "Cliente no encontrado!";
        if (dao.exist(data[0])) {
            Guia g = new Guia();
            g.setCed(data[0]);
            g.setName(data[1]);
            g.setLastName(data[2]);
            g.setEmail(data[3]);
            g.setTelephone(data[4]);
            g.setNacimiento(data[5]);
            g.setDireccion(data[6]);
            g.setNumCarnet(data[7]);
            
            if (dao.update(g)) {
                response = "Registro actualizado exitosamente!";
            } else {
                response = "Error al actualizar el registro";
            }
        }
        return response;
    }

    @Override
    public String delete(String code) {
        String response = "Guia no encontrado!";
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

        ArrayList<Guia> list = dao.getAll();
        String[][] data = new String[list.size()][7];
        for (int i = 0; i < list.size(); i++) {
            Guia g = list.get(i);
            data[i][0] = g.getCed();
            data[i][1] = g.getDireccion();
            data[i][2] = g.getEmail();
            data[i][3] = g.getLastName();
            data[i][4] = g.getNacimiento();
            data[i][5] = g.getName();
            data[i][6] = g.getTelephone();
        }
        return data;
    }
}
