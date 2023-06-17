package com.una.projecttwoprogramationtwo.controllers.User;

import com.una.projecttwoprogramationtwo.models.User.User;
import com.una.projecttwoprogramationtwo.models.User.UserContainer;

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
    public String update(User userUp) {
        if (container.exist(userUp.getId_unique())) {
            try {
                if (container.update(userUp)) {
                    return "Usuario actualizado correctamente";
                }
            } catch (Exception e) {
                return e.getMessage();
            }
        }
        return "Error al actualizar el usuario";
    }
}
