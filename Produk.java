public class Produk {
    private String nama_produk;
    private double harga;
    private int jumlah;
    private double diskon;

    public Produk(String nama_produk, double harga, int jumlah, double diskon) {
        this.nama_produk = nama_produk;
        this.harga = harga;
        this.jumlah = jumlah;
        this.diskon = diskon;
    }
    public double hargaDiskon(){
        return harga - (harga * diskon);
    }
}
