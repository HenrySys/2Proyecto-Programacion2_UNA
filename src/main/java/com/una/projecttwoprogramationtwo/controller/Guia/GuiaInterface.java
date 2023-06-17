package com.una.projecttwoprogramationtwo.controller.Guia;

public interface GuiaInterface {

    public String add(String[] data);

    public String[] find(String code);

    public String update(String[] data);

    public String delete(String code);

    public String[][] getAll();
}
