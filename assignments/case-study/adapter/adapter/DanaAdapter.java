// package com.kuliah.pattern.adapter;

// Adapter yang menghubungkan Pembayaran (Target) dengan VendorDanaService (Adaptee)
public class DanaAdapter implements Pembayaran {
    private VendorDanaService danaService;

    public DanaAdapter(VendorDanaService danaService) {
        this.danaService = danaService;
    }

    @Override
    public void prosesBayar(double nominalRupiah) {
        // 1. Konversi tipe data jika diperlukan (double ke long)
        long nominalLong = (long) nominalRupiah;

        // 2. Buat ID transaksi otomatis
        String idTransaksi = "TRX-KANTIN-" + System.currentTimeMillis();


        // 3. Teruskan panggilan ke method asli vendor Dana
        danaService.kirimSaldo(nominalLong, idTransaksi);
    }
}
