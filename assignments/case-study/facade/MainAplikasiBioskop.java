// package com.kuliah.pattern.facade.bioskop;

public class MainAplikasiBioskop {
    public static void main(String[] args) {
        // Antarmuka pengguna (Client) hanya perlu mengenal objek Facade
        PemesananTiketBioskopFacade bioskopApp = new PemesananTiketBioskopFacade();

        // Pengguna memilih film dan mengklik tombol "Beli Tiket"
        bioskopApp.pesanTiket(
                "USER-TIK-0091",
                "081298765432",
                "Dune: Part Two",
                "Studio IMAX 1",
                "F-12",
                91212.0
        );


    }
}