package AppointmentApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppointmentService {
    Scanner input = new Scanner(System.in);
    //11.Adim randevu islemleri

    List<Appointment> appointments = new ArrayList<>();

    //12.Adim randevu olustur
    public void getAppointment(DoctorService doctorservice) {
        //13.adim doktor listesi goster.Kullanici secim yapsin
        doctorservice.printDoctors();
        System.out.println("Randevu almak istediginiz doktorun nosunu giriniz");
        int selectDoktor = input.nextInt();
        if (doctorservice.getDoctorById(selectDoktor) != null) {
            Doktor doktor = doctorservice.getDoctorById(selectDoktor);
            //14.adim tarih secme/tarih listesinde randevu alinmayan yer var mi
            if (!doktor.getDates().isEmpty()) {
                System.out.println("Lutfen Ismini Giriniz");
                String name = input.nextLine();
                System.out.println("Sayin" + name + "Randevu alabileceginiz tarihler");
                for (int i = 0; i < doktor.getDates().size(); i++) {
                    System.out.println((i + 1) + " - " + doktor.getDates().get(i));
                }
                System.out.println("Randevu almak istediginiz tarihin nosunu giriniz");
                int select = input.nextInt();
                //Tarih dogru secildimi
                if (select > 0 && select <= doktor.getDates().size()) {
                    Appointment appointment = new Appointment(name, doktor, doktor.getDates().get(select - 1));
                    this.appointments.add(appointment);
                    System.out.println("Sayin " + name + " Randevu tarihiniz = " + doktor.getDates().get(select - 1));
                    
                } else {
                    System.out.println("Hatali Giris");
                }

            } else {
                System.out.println(doktor.getName() + "in bu hafta tum randevulri dolmustur");
            }
        } else {
            System.out.println("Hatali Giris");
        }


    }

}
