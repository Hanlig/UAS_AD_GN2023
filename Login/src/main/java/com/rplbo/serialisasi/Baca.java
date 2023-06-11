package com.rplbo.serialisasi;

import java.io.*;

/**
 * Hello world!
 *
 */
public class Baca
{
    public static void main( String[] args )
    {
        try (
            ObjectInputStream objIStrm = new ObjectInputStream(new FileInputStream("user.db"))) {
            //baca user1 dan user 2


            //user1 login harusnya gagal

            //user2 logi harusnya gagal

            //user1 ubah password jadi "rahasia"

            //user1 login harusnya berhasil

            //user2 ubah password jadi "password"

            //user2 login harusnya berhasil

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
