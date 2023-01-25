package MiniBookStore;
//products olusrduk.
//tum productlarin ortak ozelliklerini ve methodlarini bu classta tutacagim.
public class Product {
    private int id;
    private String isim;
    private String price;
    private int stok;

    public Product(int id, String isim, String price, int stok) {
        this.id = id;
        this.isim = isim;
        this.price = price;
        this.stok = stok;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
}
