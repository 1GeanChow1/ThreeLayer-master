package src.main.java.vo;

import java.util.Scanner;

public class UserVO {
    private Integer idUser;
    private String firstName;
    private String lastName;
    private String email;

    public Integer getId() {
        return idUser;
    }

    public String getStrId() {
        return idUser.toString();
    }

    public void setId(Integer id) {
        this.idUser = id;
    }
    public void setStrId(String id) {
        this.idUser = Integer.valueOf(id);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
