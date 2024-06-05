package com.rplbo.uaspoli;

public class AyamSuwir extends Condiment {
    private static final int harga = 6000;
    private static final String nama = "ayam suwir";

    public AyamSuwir(Makanan makanan) {
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