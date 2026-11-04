// package com.kuliah.pattern.facade.bioskop;

public class LayananKursi {
    public boolean kunciKursi(String namaFilm, String studio, String nomorKursi) {
        System.out.println("[Studio " + studio + "] Memeriksa ketersediaan kursi: " + nomorKursi);
        System.out.println("[Studio " + studio + "] Kursi " + nomorKursi + " untuk film \"" + namaFilm + "\" berhasil dikunci selama 10 menit.");
        return true;
    }

    public void lepasKursi(String studio, String nomorKursi) {
        System.out.println("[Studio " + studio + "] Kursi " + nomorKursi + " dilepas kembali ke publik.");
    }
}