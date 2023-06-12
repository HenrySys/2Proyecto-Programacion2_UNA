
package com.una.projecttwoprogramationtwo.models.User;

import java.io.EOFException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.io.ObjectInputStream;
import java.io.FileInputStream;


public class UserAdapter {
    public UserAdapter(){
        
    }
    
    protected void write(ArrayList<User> list)throws Exception{
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(
                    new FileOutputStream("Users.frishech"));
            for(int i=0;i<list.size();i++){
                out.writeObject(list.get(i));
            }
            
        } catch (IOException ex) {
            throw new Exception("Error de Escritura de Archivo");
        }finally{
            out.close();
        }
        
    }
    
    protected ArrayList<User> read() throws Exception{
        ObjectInputStream in;
        ArrayList<User> list = new ArrayList<>();
        try {
            in = new ObjectInputStream(new FileInputStream("Users.frishech"));
            if(in!=null){
                User objUser= (User)in.readObject();
                while (objUser!=null) {                    
                    list.add(objUser);
                    objUser =(User)in.readObject();
                }
                
            }
            in.close();
        } catch (IOException|ClassNotFoundException ex) {
            if (!(ex instanceof EOFException)) {
                throw new Exception(ex.getMessage());
            }
        } 
        return list;
    }
    
    
}
