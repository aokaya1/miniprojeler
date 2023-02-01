package AppointmentApp;

import java.util.Scanner;

public class Start {

    //1.Adim Ana Menu Olusturuldu
    //Doktor ve Randevu icin appointment classlarini olusturacagiz.
    public static void start() {
        Scanner input=new Scanner(System.in);
        System.out.println("Merhaba Randevu Sistemine Hosgeldiniz");
        int select;
        do {
            System.out.println("1-Randevu Al");
            System.out.println("2-Randevu   Goruntule");
            System.out.println("0-Cikis");
            System.out.println("Seciminiz");
            select=input.nextInt();
            switch (select){
                case 1:
                    //randevu
                    break;
                case 2:
                    //randevu goruntule
                    break;
                case  0:
                    //iyi gunler
                default:
                    System.out.println("Hatali Giris Tekrar Deneyiniz");
                    break;
            }

        }while (select!=0);




    }
}
