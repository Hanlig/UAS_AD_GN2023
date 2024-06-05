package com.rplbo.serialisasi;

import java.io.*;

public class Baca {
    public static void main(String[] args) {
        try (ObjectInputStream objIStrm = new ObjectInputStream(new FileInputStream("user.db"))) {
            User user1 = (User) objIStrm.readObject();
            User user2 = (User) objIStrm.readObject();

            user1.doLogin(null); // User 1 login - harusnya gagal
            user2.doLogin(null); // User 2 login - harusnya gagal

            user1.ubahPassword("rahasia"); // User 1 ubah password
            user2.ubahPassword("password"); // User 2 ubah password

            user1.doLogin("rahasia"); // User 1 login - harusnya berhasil
            user2.doLogin("password"); // User 2 login - harusnya berhasil
        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO Exception: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Class tidak ditemukan: " + e.getMessage());
        }
    }
}