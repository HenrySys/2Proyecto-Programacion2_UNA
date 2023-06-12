
package com.una.projecttwoprogramationtwo.models.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.File;


public class UserContainer extends UserAdapter {
    private static Map<String, User> container=new HashMap<>();
    private static final String nombreArchivo = "Users.frishech";
    public UserContainer()throws Exception{
        super();
        if(fileExist()){
            loadFile();
        }else{
            createPredefinedUser();
        }
    }
    
    private void loadFile() throws Exception{
        ArrayList<User> data= this.read();
        for(User s:data){
            container.put(s.getId_unique(), s);
        }
    }
    
    private void createPredefinedUser() throws Exception {
        String[] userData = {"admin", "admin", "admin", "admin", "admin", "admin", "admin"};
        User predefinedUser = new User(userData);
        container.put(predefinedUser.getId_unique(), predefinedUser);
        this.write(new ArrayList<>(container.values()));
    }
    
    private boolean fileExist(){
        File file= new File(nombreArchivo);
        return file.exists();
    }
    
    public boolean exist(String id){
        return container.containsKey(id);
    }
    
    public User find(String id){
        if(container.containsKey(id)){
            return container.get(id);
        }
        return null;
    }
    
    public boolean add(User user) throws Exception{
        if(!exist(user.getId_unique())){
            container.put(user.getId_unique(), user);
            this.write(new ArrayList(container.values()));
            return true;
        }
        return false;
    }
    public List all(){
        return null;
    }
    public boolean update(User userUp){
        return false;
    }
    public boolean delete(String id){
        return false;
    }
}
