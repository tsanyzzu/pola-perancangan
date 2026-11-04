// package com.kuliah.pattern.adapter;

// Kelas dari vendor luar (SDK Ovo) yang method-nya tidak kompatibel
public class VendorOvoService {
    private String merchantId;

    public VendorOvoService(String merchantId) {
        this.merchantId = merchantId;
    }

    // Method asli milik vendor (beda nama method & beda parameter)
    public void kirimSaldo(long jumlahInRupiah, String idTransaksi) {
        System.out.println("[Vendor Ovo] Memproses pembayaran e-Wallet...");
        System.out.println("  - Merchant ID : " + merchantId);
        System.out.println("  - ID Transaksi: " + idTransaksi);
        System.out.println("  - Total Bayar : Rp" + String.format("%,d", jumlahInRupiah));
        System.out.println("[Vendor Ovo] Status: PEMBAYARAN BERHASIL!");
    }
}