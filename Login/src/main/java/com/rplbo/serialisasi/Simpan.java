package com.rplbo.serialisasi;

import java.io.*;

public class Simpan {
    public static void main(String[] args) {
        try (
            ObjectOutputStream objOStrm = new ObjectOutputStream(new FileOutputStream("user.db"))) {
            //buat 2 user

            //user1 login => harusnya berhasil

            //user2 ubah password jadi "passwordbaru"

            //user2 login harusnya gagal

            //simpan user1 dan user2 ke file serialisasi


        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
