package com.rplbo.uaspoli;

public class NasiGudeg implements Makanan {
    private static final int harga = 5000;
    private static final String nama = "nasi gudeg";

    @Override
    public int getHarga() {
        return harga;
    }

    @Override
    public String getNama() {
        return nama;
    }
}