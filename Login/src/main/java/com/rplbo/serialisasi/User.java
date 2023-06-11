package com.rplbo.serialisasi;

import java.io.Serializable;

public class User implements Serializable {
    private String username;
    private transient String password = "123456";
    public User(String username,String password){
        //konstruktor biasa, simpan username dan password

    }

    public void ubahPassword(String password){
        //Password harus berbeda dari defaultnya

    }

    public void doLogin(){
        //di hard-code saja passwordnya
        //password user1 = "rahasia"
        //password user2 = "password"
        //jika berhasil output "Berhasil Login"
    }
}
