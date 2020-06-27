package com.company.Final;

public class Password {

    private static final int key = 784214134;
    private final int encryptPassword;


    public Password(int Password) {
        this.encryptPassword = encryptDecrypt(Password);
    }

    private int encryptDecrypt(int Password) {
        return Password ^ key;
    }

    public void storePassword() {
        System.out.println("Saving password as" + this.encryptPassword);
    }

    public boolean LoginMein(int Password) {
        if (encryptDecrypt(Password) == this.encryptPassword) {
            System.out.println("Welcome");
            return true;

        } else {
            System.out.println("Password Wrong Can't Login");
            return false;
        }
    }

}


