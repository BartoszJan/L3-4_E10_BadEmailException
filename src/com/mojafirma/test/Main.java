package com.mojafirma.test;

/**
 * Created by Bartek on 2017-07-13.
 */
public class Main {
    public static void main(String[] args) {
        User user1 = new User("");
        User user2 = new User("");
        try {
            user1.setEmail("emailadress");
        } catch ( BadEmailException e) {
            System.out.println(e.getMessage());
        }
        try {
        user2.setEmail("email@adress,com");  } catch ( BadEmailException e) {
            System.out.println(e.getMessage());
        }
    }
}
