public class ButirMenu extends KomponenMenu {
    private final String nama;
    private final double harga;

    public ButirMenu(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    @Override
    public void cetak() {
        System.out.println(nama + " - Rp" + harga);
    }
}

