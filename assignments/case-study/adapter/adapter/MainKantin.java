// package com.kuliah.pattern.adapter;

public class MainKantin {
    public static void main(String[] args) {
        System.out.println("=== SIMULASI KASIR KANTIN KAMPUS ===\n");

        // Scenario 1: Mahasiswa bayar Pakai Tunai
        Pembayaran kasirTunai = new PembayaranTunai();
        kasirTunai.prosesBayar(15000);

        System.out.println("\n------------------------------------\n");

        // Scenario 2: Mahasiswa bayar Pakai GoPay (via Adapter)
        VendorGoPayService sdkGoPay = new VendorGoPayService("MCH-KAMPUS-UNIV");

        // Scenario 3: Mahasiswa bayar Pakai Ovo (via Adapter)
        VendorOvoService sdkOvo = new VendorOvoService("MCH-KAMPUS-UNIV");

        // Scenario 4: Mahasiswa bayar Pakai Dana (via Adapter)
        VendorDanaService sdkDana = new VendorDanaService("MCH-KAMPUS-UNIV");

        // Bungkus SDK GoPay dengan Adapter
        Pembayaran kasirGoPay = new GoPayAdapter(sdkGoPay);
        Pembayaran kasirOvo = new OvoAdapter(sdkOvo);
        Pembayaran kasirDana = new DanaAdapter(sdkDana);

        // Kasir cukup memanggil method standar prosesBayar() tanpa tahu kerumitan SDK vendor!
        kasirGoPay.prosesBayar(25000);
        kasirOvo.prosesBayar(25000);
        kasirDana.prosesBayar(25000);
    }
}