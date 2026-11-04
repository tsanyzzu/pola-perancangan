// package com.kuliah.pattern.facade.bioskop;

public class LayananTiket {
    public String terbitkanETiket(String namaFilm, String nomorKursi) {
        String kodeBooking = "TIX-" + System.currentTimeMillis();
        System.out.println("[Sistem Tiket] Menerbitkan e-tiket film \"" + namaFilm + "\" [Kursi: " + nomorKursi + "]");
        System.out.println("[Sistem Tiket] Kode Booking cetak mandiri: " + kodeBooking);
        return kodeBooking;
    }

    public String batalkanTiket(String namaFilm, String nomorKursi) {
        String kodeBooking = "TIX-" + System.currentTimeMillis();
        System.out.println("[Sistem Tiket] Membatalkan e-tiket film \"" + namaFilm + "\" [Kursi: " + nomorKursi + "]");
        System.out.println("[Sistem Tiket] Kode Booking cetak mandiri: " + kodeBooking);
        return kodeBooking;
    }
}