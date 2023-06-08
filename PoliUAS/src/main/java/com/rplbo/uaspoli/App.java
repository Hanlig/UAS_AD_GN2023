package com.rplbo.uaspoli;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Makanan ays = new AyamSuwir(new Telor1(new NasiGudeg()));
        System.out.println("Makanan: "+ays.getNama());
        System.out.println("Total: "+ays.getHarga());

        Makanan ba = new AyamSuwir(new BuburGudeg());
        System.out.println("Makanan: "+ba.getNama());
        System.out.println("Total: "+ba.getHarga());

        Makanan bak = new Telor1(new Krecek(new BuburGudeg()));
        System.out.println("Makanan: "+bak.getNama());
        System.out.println("Total: "+bak.getHarga());
    }
}
