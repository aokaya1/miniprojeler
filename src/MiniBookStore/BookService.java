package MiniBookStore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookService implements ProductService{

    //Booklari saklamak icin list olustur
    List<Book> booklist=new ArrayList<>();

    public BookService() {
        Book book1=new Book(1,"Vadideki Zambak","150 Tl",15,"Balzac","Penguen");
        Book book2=new Book(2,"Suc Ve Ceza","150 Tl",25,"Dostoyevski","Penguen");
        Book book3=new Book(3,"Sefiller","125 Tl",10,"Viktor Hugo","Dream");
        this.booklist.add(book1);
        this.booklist.add(book2);
        this.booklist.add(book3);
    }
//Book ile yapabilecegi Islemlerin Menusu
    @Override
    public void processMenu() {
        Scanner input=new Scanner(System.in);
        int choice=-1;
        while (choice!=0){
            System.out.println("======================================");
            System.out.println("1-List Books");
            System.out.println("2-Add Book");
            System.out.println("3-Delete Books");
            System.out.println("4-Filter Books");
            System.out.println("0-Exit");
            System.out.println("Choice");
            choice=input.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Ana Menuye Yonlendiriliyorsunuz");
                    break;
                case 1:
                    listProduct();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    removeProduct();
                    break;
                case 4:
                    System.out.println("Yayinevi");
                    String pub=input.next();
                    filterProduct(pub);
                    break;
                default:
                    System.out.println("Hatali Giris");
                    break;

            }
        }

    }


  //Booklri frmatla yazdir
    @Override
    public void listProduct() {
        System.out.println("======================================================================================================");
        System.out.printf("%-2s | %-15s | %-15s | %-10s |%-5s | %-5s \n","ID","Kitap Adi","YazarAdi","Yayinevi","Birim Fiyati","Stok");
        System.out.println("========================================================================================================");
         for (Book book:this.booklist){
             System.out.printf("%-2s | %-15s | %-15s | %-10s |%-5s | %-5s \n",
                     book.getId(),book.getIsim(),book.getAuthorName(),book.getPublisher(),book.getPrice(),book.getStok());
         }
    }
    //Kullanicidan alinan Bilgilerle book olustur,listeye ekle
    @Override
    public void addProduct() {
        Scanner input=new Scanner(System.in);
        System.out.println("Kitap Adi");
        String bookname=input.nextLine();
        System.out.println("Yazar Adi");
        String autorName=input.nextLine();
        System.out.println("Yayinevi");
        String pub=input.nextLine();
        System.out.println("Birim Fiyati");
        String unitPrice=input.nextLine();
        System.out.println("Stok");
        int stock=input.nextInt();
        Book newbook=new Book(this.booklist.get(booklist.size()-1).getId()+1,bookname,unitPrice,stock,autorName,pub);
        this.booklist.add(newbook);
        listProduct();


    }


//Kullanicidan unic deger al ve sil.Unic deger id olabilir.
    @Override
    public void removeProduct() {
        Scanner input=new Scanner(System.in);
        boolean isExist=true;
        System.out.println("Lutfen Kitabin Id bilgisini giriniz");
        int id=input.nextInt();
        for (Book book:this.booklist){
            if (book.getId()==id){
                isExist=true;
                this.booklist.remove(book);
                System.out.println("Kitap Silindi");
                break;
            }else {
                isExist=false;

            }
        }if (!isExist){
            System.out.println("Kitap Bulunamadi");
        }

    }
//Tum lsitede kitaplarin yayinevine bak filter ile ayniysa yazdir
    @Override
    public void filterProduct(String filter) {
        for (Book book:this.booklist){
            if (book.getPublisher().equalsIgnoreCase(filter)){
                System.out.printf("%-2s | %-15s | %-15s | %-10s |%-5s | %-5s \n",
                        book.getId(),book.getIsim(),book.getAuthorName(),book.getPublisher(),book.getPrice(),book.getStok());
            }
        }

    }



}
