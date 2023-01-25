package MiniBookStore;

import java.util.Scanner;

public class MiniBookStore {
    /*
Proje: Mini Book Store
       Online bir kitap market için ürün yönetim uygulaması yapınız.
       Kitap markette kitap ve defter satışı olacak, ancak ileride yeni ürün çeşidi eklenebilir olmalı.

       Kitap özellikleri: id, isim, birim fiyat, stok, yazar adı, yayınevi
       Defter özellikleri: id, isim, birim fiyat, stok, marka, yaprak sayısı

       Kullanıcı ilgili kategorideki ürünleri listeleyebilmeli
       Kullanıcı kategoriye göre ürün ekleyebilmeli
       Kullanıcı ürünleri benzersiz numaralarına göre silebilmeli.
       Kullanıcı ürünleri marka(kitap) veya yayınevine göre filtreleyip listeleyebilmeli.
*/
    public static void main(String[] args) {
        enter();
    }

    private static void enter() {
        Scanner input=new Scanner(System.in);
        System.out.println("...Mini Book Store...");
        int select=-1;
        while (select!=0){
            System.out.println("Urun Yonetim Paneli");
            System.out.println("1-Kitaplar");
            System.out.println("2-Defteler");
            System.out.println("0-Cikis");
            System.out.println("Urun Yonetim Paneli");
            System.out.println("Seciminiz");
            select=input.nextInt();
            ProductService service=select==1?new BookService():new NoteBooService();
            if (select==1 || select==2){
                service.processMenu();

            } else if (select==0) {
                System.out.println("Iyi Gunler");

            }else {
                System.out.println("Hatali Giris");
            }
        }
    }
}
