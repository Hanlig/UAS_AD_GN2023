package com.rplbo.serialisasi;

import java.io.Serializable;

public class User implements Serializable {
    private String username;
    private transient String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void ubahPassword(String newPassword) {
        if (!"123456".equals(newPassword)) {
            this.password = newPassword;
        }
    }

    public boolean doLogin(String inputPassword) {
        if (this.password.equals(inputPassword)) {
            System.out.println("Berhasil Login");
            return true;
        } else {
            System.out.println("Gagal Login");
            return false;
        }
    }

    // Getters and setters if needed
}