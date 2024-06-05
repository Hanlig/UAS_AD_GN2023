package com.rplbo.uaspoli;

public class Krecek extends Condiment {
    private static final int harga = 3500;
    private static final String nama = "krecek";

    public Krecek(Makanan makanan) {
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