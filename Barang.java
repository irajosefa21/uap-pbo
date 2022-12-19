import java.util.ArrayList;

public class Barang extends Produk{
    private String barcode;
    private String expired;
    private ArrayList<Kategori> produk;

    public Barang(String nama_produk, double harga, int jumlah, double diskon, String barcode, String expired, ArrayList<Kategori> produk) {
        super(nama_produk, harga, jumlah, diskon);
        this.barcode = barcode;
        this.expired = expired;
        this.produk = produk;
    }

    public void addKategori(Kategori kategori){
        produk.add(kategori);
    }
    public void isExpired(){
        System.out.println("Expired Baran = "+ this.expired);
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getExpired() {
        return expired;
    }

    public void setExpired(String expired) {
        this.expired = expired;
    }

    public ArrayList<Kategori> getProduk() {
        return produk;
    }

    public void setProduk(ArrayList<Kategori> produk) {
        this.produk = produk;
    }
}
