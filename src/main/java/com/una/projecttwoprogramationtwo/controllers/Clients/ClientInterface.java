
package com.una.projecttwoprogramationtwo.controllers.Clients;


public interface ClientInterface {
    public String add(String[]data);
    public String[] find(String code);
    public String update(String[] data);
    public String delete(String code);
    public String[][]getAll();
}
