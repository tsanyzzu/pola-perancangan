// package com.kuliah.pattern.facade.bioskop;

public class LayananDompetDigital {
    public boolean potongSaldo(String idUser, double nominal) {
        System.out.println("[Dompet Digital] Memvalidasi saldo akun: " + idUser);
        System.out.println("[Dompet Digital] Memotong saldo sebesar Rp" + String.format("%,.0f", nominal));
        System.out.println("[Dompet Digital] Pembayaran tiket bioskop BERHASIL!");
        return true;
    }

    public boolean refundSaldo(String idUser, double nominal) {
        System.out.println("[Dompet Digital] Memvalidasi akun: " + idUser);
        System.out.println("[Dompet Digital] Mengembalikan saldo sebesar Rp" + String.format("%,.0f", nominal));
        System.out.println("[Dompet Digital] Refund pembayaran tiket bioskop BERHASIL!");
        return true;
    }
}