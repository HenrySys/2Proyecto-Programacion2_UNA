
package com.una.projecttwoprogramationtwo.models.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class UserContainer extends UserAdapter {
    private static Map<String, User> container=new HashMap<>();
    public UserContainer()throws Exception{
        super();
        loadFile();
        
    }
    
    private void loadFile() throws Exception{
        ArrayList<User> data= this.read();
        for(User s:data){
            container.put(s.getId_unique(), s);
        }
    }
    
    private boolean exist(String id){
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
