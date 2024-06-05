package com.rplbo.uaspoli;

public class BuburGudeg implements Makanan {
    private static final int harga = 4000;
    private static final String nama = "bubur gudeg";

    @Override
    public int getHarga() {
        return harga;
    }

    @Override
    public String getNama() {
        return nama;
    }
}