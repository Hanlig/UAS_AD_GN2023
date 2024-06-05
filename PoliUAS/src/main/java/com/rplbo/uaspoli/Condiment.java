package com.rplbo.uaspoli;

public abstract class Condiment implements Makanan {
    protected Makanan makanan;

    public Condiment(Makanan makanan) {
        this.makanan = makanan;
    }
}