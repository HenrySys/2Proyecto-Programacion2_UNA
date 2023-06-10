package com.una.projecttwoprogramationtwo.models.User;

import java.io.Serializable;

public class User implements Serializable {

    private String id_unique;
    private String contrasena;
    private String name;
    private String email;
    private String telephone;
    private String age;
    private String lastName;

    public User(String data[]) throws Exception {
        if (data.length == 7) {
            this.id_unique = data[0];
            this.contrasena = data[1];
            this.name = data[2];
            this.email = data[3];
            this.telephone = data[4];
            this.age = data[5];
            this.lastName = data[6];

        } else {
            throw new Exception("El tamano del arreglo no cumple con la cantidad de atributos");
        }
    }

    //Setters
    public void setId_unique(String id_unique) {
        this.id_unique = id_unique;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //getters
    public String getId_unique() {
        return id_unique;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getAge() {
        return age;
    }

    public String getLastName() {
        return lastName;
    }
}
