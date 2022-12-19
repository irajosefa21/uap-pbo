import java.util.ArrayList;

public class Penjualan implements ProductCounter{
    private ArrayList<Produk> listProduk;
    private int jumlahProduk;
    private int stok;

    public Penjualan(ArrayList<Produk> listProduk, int jumlahProduk, int stok) {
        this.listProduk = listProduk;
        this.jumlahProduk = jumlahProduk;
        this.stok = stok;
    }

    @Override
    public double hitungJumlahProduk() {
        return listProduk.size();
    }

    @Override
    public double hitungHargaTotal() {
        double harga_total = .0;
        for (Produk produk : listProduk) {
            harga_total += produk.hargaDiskon();
        }
        return 0;
    }

    public ArrayList<Produk> getListProduk() {
        return listProduk;
    }

    public void setListProduk(ArrayList<Produk> listProduk) {
        this.listProduk = listProduk;
    }

    public int getJumlahProduk() {
        return jumlahProduk;
    }

    public void setJumlahProduk(int jumlahProduk) {
        this.jumlahProduk = jumlahProduk;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
}
