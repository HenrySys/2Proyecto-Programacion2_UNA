package com.una.projecttwoprogramationtwo.controllers.User;

import com.una.projecttwoprogramationtwo.models.User.User;
import com.una.projecttwoprogramationtwo.models.User.UserContainer;
import java.util.ArrayList;

public class UserController implements UserInterface {

    private UserContainer container;

    public UserController() throws Exception {
        container = new UserContainer();
    }

    @Override
    public String save(String[] data) {
        String response = "Usuario ya registrado";
        if (!container.exist(data[0])) {
            try {
                User us = new User(data);
                if (container.add(us)) {
                    response = "Guardado exitosamente";
                } else {
                    response = "Error al guarda los datos";
                }
            } catch (Exception e) {
                response = e.getMessage();
            }
        }
        return response;
    }

    @Override
    public String[] getById(String id) {
        if (container.exist(id)) {
            User us = container.find(id);
            String[] data = {us.getId_unique(), us.getContrasena(), us.getName(), us.getEmail(), us.getTelephone(),
                us.getAge(), us.getLastName()};
            return data;
        }
        return null;
    }

    @Override
    public String delete(String id) {
        if (container.exist(id)) {
            try {
                if (container.delete(id)) {
                    return "Usuario eliminado correctamente";
                }
            } catch (Exception e) {
                return e.getMessage();
            }
        }
        return "Error al eliminar el usuario";
    }

    @Override
    public String update(String[] dataUp) {
        if (container.exist(dataUp[0])) {
            try {
                User us= new User(dataUp);
                if (container.update(us)) {
                    return "Usuario actualizado correctamente";
                }
            } catch (Exception e) {
                return e.getMessage();
            }
        }
        return "Error al actualizar el usuario";
    }
    
    @Override
    public String[][] getAllUser(){
        try {
            ArrayList<User> listUs=(ArrayList<User>) container.all();
        String[][] data= new String[listUs.size()][7];
        for(int i=0;i<listUs.size();i++){
            User aux=listUs.get(i);
            data[i][0]=aux.getId_unique();
            data[i][1]=aux.getContrasena();
            data[i][2]=aux.getName();
            data[i][3]=aux.getEmail();
            data[i][4]=aux.getTelephone();
            data[i][5]=aux.getAge();
            data[i][6]=aux.getLastName();
        }
        return data;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        
    }
}
