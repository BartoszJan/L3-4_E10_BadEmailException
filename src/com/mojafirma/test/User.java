package com.mojafirma.test;


public class User {
    private String email;

    public User(String email) {
        this.email = email;
    }


    public void setEmail(String email) throws BadEmailException {
        if (email.contains("@") == false){
            throw new BadEmailException("Błędny e-mail");}
            this.email = email;



    }
}


