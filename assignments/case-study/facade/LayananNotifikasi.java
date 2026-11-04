// package com.kuliah.pattern.facade.bioskop;

public class LayananNotifikasi {
    public void kirimTiketWhatsApp(String noHp, String kodeBooking) {
        System.out.println("[WhatsApp Gateway] Mengirim pesan ke " + noHp + ": "
                + "\"Tiket Anda terbit! Tunjukkan Kode Booking: " + kodeBooking + " di mesin cetak bioskop.\"");
    }

    public void kirimNotifikasiBatalWhatsApp(String noHp, String kodeBooking) {
        System.out.println("[WhatsApp Gateway] Mengirim pesan ke " + noHp + ": "
                + "\"Tiket Anda dibatalkan! Kode Booking: " + kodeBooking + " tidak berlaku lagi.\"");
    }
}