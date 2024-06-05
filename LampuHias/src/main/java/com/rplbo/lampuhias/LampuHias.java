package com.rplbo.lampuhias;

import java.util.Scanner;

public class LampuHias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt(); // Masa hidup lampu 1
        int q = scanner.nextInt(); // Masa hidup lampu 2
        int r = scanner.nextInt(); // Masa hidup lampu 3
        int n = scanner.nextInt(); // Banyak pertanyaan

        // Mencari KPK (Kelipatan Persekutuan Terkecil) dari P, Q, R
        int kpk = kpk(kpk(p, q), r);

        for (int i = 0; i < n; i++) {
            int t = scanner.nextInt(); // Waktu dalam detik
            if (t % kpk == 0) {
                System.out.println("YA"); // Menyala bersamaan pada waktu t
            } else {
                System.out.println("TIDAK"); // Tidak menyala bersamaan pada waktu t
            }
        }

        scanner.close();
    }

    // Fungsi untuk mencari KPK dari dua bilangan
    public static int kpk(int a, int b) {
        return a * (b / gcd(a, b));
    }

    // Fungsi untuk mencari GCD (Greatest Common Divisor) menggunakan algoritma Euclid
    public static int gcd(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b; // sisa pembagian a dengan b
            a = temp;
        }
        return a;
    }
}