
package com.una.projecttwoprogramationtwo.controllers.User;

import com.una.projecttwoprogramationtwo.models.User.User;
import com.una.projecttwoprogramationtwo.models.User.UserContainer;

public class UserController implements UserInterface{
    private UserContainer container;
    public UserController()throws Exception{
        container=new UserContainer();
    }
    
    @Override
    public String save(String[] data) {
        String response="Usuario ya registrado";
        if(!container.exist(data[0])){
            try{
               User us=new User(data);
               if(container.add(us)){
                   response="Guardado exitosamente";
               }else{
                   response="Error al guarda los datos";
               }
            }catch(Exception e){
                response=e.getMessage();
            }            
        }
        return response;
    }

    @Override
    public String[] getById(String id) {
        if(container.exist(id)){
            User us=container.find(id);
            String[] data={us.getId_unique(),us.getContrasena(),us.getName(),us.getEmail(),us.getTelephone(),
               us.getAge(),us.getLastName()};
            return data;
        }
        return null;
    }
}
