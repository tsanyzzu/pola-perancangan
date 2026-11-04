// package com.kuliah.pattern.facade.bioskop;

public class PemesananTiketBioskopFacade {
    private final LayananKursi kursiService;
    private final LayananDompetDigital dompetService;
    private final LayananTiket tiketService;
    private final LayananNotifikasi notifService;

    public PemesananTiketBioskopFacade() {
        this.kursiService = new LayananKursi();
        this.dompetService = new LayananDompetDigital();
        this.tiketService = new LayananTiket();
        this.notifService = new LayananNotifikasi();
    }

    public void pesanTiket(String idUser, String noHp, String namaFilm, String studio, String nomorKursi, double hargaTiket) {
        System.out.println("==================================================");
        System.out.println("      MEMULAI PEMESANAN TIKET BIOSKOP (1-CLICK)   ");
        System.out.println("==================================================");

        // Langkah 1: Kunci kursi
        if (!kursiService.kunciKursi(namaFilm, studio, nomorKursi)) {
            System.out.println("[TRANSAKSI GAGAL] Kursi " + nomorKursi + " sudah terisi!");
            return;
        }

        // Langkah 2: Proses pembayaran
        if (!dompetService.potongSaldo(idUser, hargaTiket)) {
            System.out.println("[TRANSAKSI GAGAL] Saldo tidak mencukupi untuk pembayaran!");
            kursiService.lepasKursi(studio, nomorKursi);
            return;
        }

        // Langkah 3: Generate tiket
        String kodeBooking = tiketService.terbitkanETiket(namaFilm, nomorKursi);

        // Langkah 4: Kirim notifikasi
        notifService.kirimTiketWhatsApp(noHp, kodeBooking);

        System.out.println("\n>>> STATUS: PEMESANAN TIKET SUKSES, SELAMAT MENONTON! <<<\n");

        // Langkah 5: Batal
        kursiService.lepasKursi(studio, nomorKursi);
        dompetService.refundSaldo(idUser, hargaTiket);
        tiketService.batalkanTiket(namaFilm, nomorKursi);
        notifService.kirimNotifikasiBatalWhatsApp(noHp, kodeBooking);
    }
}