// package com.kuliah.pattern.adapter;

// Adapter yang menghubungkan Pembayaran (Target) dengan VendorOvoService (Adaptee)
public class OvoAdapter implements Pembayaran {
    private VendorOvoService ovoService;

    public OvoAdapter(VendorOvoService ovoService) {
        this.ovoService = ovoService;
    }

    @Override
    public void prosesBayar(double nominalRupiah) {
        // 1. Konversi tipe data jika diperlukan (double ke long)
        long nominalLong = (long) nominalRupiah;

        // 2. Buat ID transaksi otomatis
        String idTransaksi = "TRX-KANTIN-" + System.currentTimeMillis();


        // 3. Teruskan panggilan ke method asli vendor Ovo
        ovoService.kirimSaldo(nominalLong, idTransaksi);
    }
}
