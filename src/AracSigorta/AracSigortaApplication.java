package AracSigorta;

import java.util.Scanner;

public class AracSigortaApplication {
   /*
Proje: Araç Sigorta Prim Hesaplama
       Araç tipleri:otomobil, kamyon, otobüs, motosiklet
                    -otobüs: 18-30 koltuk veya 31 ve üstü koltuk
       Tarife dönemi:Aralık 2022,Haziran 2022
       1.dönemi:Haziran 2022                  2.dönem:Aralık 2022
          otomobil: 2000                       otomobil: 2500
          kamyon:   3000                       kamyon:   3500
          otobüs: tip1: 4000 tip2: 5000        otobüs: tip1: 4500 tip2: 5500
          motosiklet: 1500                     motosiklet: 1750
        Hatalı girişte hesaplama başarısız uyarsı verip tekrar menü gösterilsin.
        Yeni islem yapilablmesi icin secenek sunulsun.
 */


    public static void main(String[] args) {
        start();
    }

    public static void start() {

        boolean isFail;
        do {
            isFail = false;
            Scanner input = new Scanner(System.in);
            //menu ve tarife donemi sectir
            System.out.println("Arac Sigorta Birimi Hesaplama");
            System.out.println("Tarife Donemini Seciniz");
            System.out.println("1.Haziran 20022");
            System.out.println("2.Aralik 20022");
            int term = input.nextInt();
            if (term == 1 || term == 2) {
                Arac arac = new Arac();
                System.out.println("Arac Tipini Giriniz");
                System.out.print("Otomobil,Kamyon,Otobus,Motosiklet");
                System.out.println();
                arac.type = input.next().toUpperCase();
                arac.prim = arac.countPrim(term);
                int select;
                String ternName = term == 1 ? "Haziran 2022" : "Aralik 2022";
                if (arac.prim > 0) {
                    System.out.println("Hesaplama Basari Ile Tamamlandi");
                    System.out.println("Arac Tipi :" + arac.type);
                    System.out.println("Tarife Donemi :" + ternName);
                    System.out.println("Aracinizn Ilgili Donem igorta Primi :" + arac.prim);
                    System.out.println("Yeni Islem Icin 1 Cikis Icin 0 Giriniz");
                   select=input.nextInt();
                    if (select == 1) {
                        isFail = true;
                    } else {
                        isFail = false;
                    }

                } else {
                    System.out.println("Hesaplama Basarisiz.Tekrar Deneyiniz");
                    System.out.println("Yeni Islem Icin 1 Cikis Icin 0 Giriniz");
                  select=input.nextInt();
                    if (select == 1) {
                        isFail = true;
                    } else {
                        isFail = false;
                    }
                }
            } else {
                System.out.println("Hatali Giris Yaptiniz");
                isFail = true;
                break;
            }


        } while (isFail);


    }


}
