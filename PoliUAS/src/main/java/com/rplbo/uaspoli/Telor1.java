package com.rplbo.uaspoli;

public class Telor1 extends Condiment {
    private static final int harga = 4000;
    private static final String nama = "telor 1";

    public Telor1(Makanan makanan) {
        super(makanan);
    }

    @Override
    public int getHarga() {
        return makanan.getHarga() + harga;
    }

    @Override
    public String getNama() {
        return makanan.getNama() + " " + nama;
    }
}