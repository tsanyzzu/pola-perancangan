// package com.kuliah.pattern.adapter;

// Adapter yang menghubungkan Pembayaran (Target) dengan VendorGoPayService (Adaptee)
public class GoPayAdapter implements Pembayaran {
    private VendorGoPayService goPayService;

    public GoPayAdapter(VendorGoPayService goPayService) {
        this.goPayService = goPayService;
    }

    @Override
    public void prosesBayar(double nominalRupiah) {
        // 1. Konversi tipe data jika diperlukan (double ke long)
        long nominalLong = (long) nominalRupiah;

        // 2. Buat ID transaksi otomatis
        String idTransaksi = "TRX-KANTIN-" + System.currentTimeMillis();

        // 3. Teruskan panggilan ke method asli vendor GoPay
        goPayService.kirimSaldo(nominalLong, idTransaksi);
    }
}
