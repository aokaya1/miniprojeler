package AppointmentApp;

import java.util.Scanner;

public class Start {

    //1.Adim Ana Menu Olusturuldu
    //Doktor ve Randevu icin appointment classlarini olusturacagiz.
    public static void start() {
        Scanner input = new Scanner(System.in);
        AppointmentService appointmentService1 = new AppointmentService();
        DoctorService doctorService1 = new DoctorService();
        System.out.println("Merhaba Randevu Sistemine Hosgeldiniz");
        int select;
        do {
            System.out.println("1-Randevu Al");
            System.out.println("2-Randevu Goruntule");
            System.out.println("0-Cikis");
            System.out.println("Seciminiz");
            select = input.nextInt();
            switch (select) {
                case 1:
                    appointmentService1.getAppointment(doctorService1);
                    break;
                case 2:
                    appointmentService1.printApp();
                    break;
                case 0:
                    System.out.println("Iyi Gunler");
                default:
                    System.out.println("Hatali Giris Tekrar Deneyiniz");
                    break;
            }

        } while (select != 0);


    }
}
