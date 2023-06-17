
package com.una.projecttwoprogramationtwo.controllers.User;

import com.una.projecttwoprogramationtwo.models.User.User;


public interface UserInterface {
    String save(String[] data);
    String[] getById(String id);
    String delete (String id);
    String update(User userUp);
}
