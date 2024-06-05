package com.rplbo.parkirjdbc;

public class App {
    public static void main(String[] args) {
        ParkirApp pa = new ParkirApp();

        // Menambahkan data parkir
        pa.tambahData("AB1234ZZ", 3600); // Menambah data parkir dengan no plat "AB1234ZZ" dan lama parkir 3600 detik
        pa.tambahData("AB1234XX", 3650); // Menambah data parkir dengan no plat "AB1234XX" dan lama parkir 3650 detik
        pa.tambahData("AB1234YY", 7210); // Menambah data parkir dengan no plat "AB1234YY" dan lama parkir 7210 detik

        // Menampilkan data parkir
        pa.tampilData();

        // Menampilkan total pemasukan dari data parkir
        pa.totalPemasukan();
    }
}