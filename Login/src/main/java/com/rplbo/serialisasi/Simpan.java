package com.rplbo.serialisasi;

import java.io.*;

public class Simpan {
    public static void main(String[] args) {
        User user1 = new User("user1", "rahasia");
        User user2 = new User("user2", "password");

        user1.doLogin("rahasia");  // User 1 login - harusnya berhasil

        user2.ubahPassword("passwordbaru"); // User 2 ubah password
        user2.doLogin("passwordbaru"); // User 2 login - harusnya gagal karena password seharusnya tidak ikut disimpan

        try (ObjectOutputStream objOStrm = new ObjectOutputStream(new FileOutputStream("user.db"))) {
            objOStrm.writeObject(user1);
            objOStrm.writeObject(user2);
        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO Exception: " + e.getMessage());
        }
    }
}