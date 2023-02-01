package AppointmentApp;

public class Appointment {
    //6.ADdim randevu bilgileri

  private static int count=0;
    private int id;
    private String name;
    private Doktor doctor;
    private String date;


    public Appointment(String name, Doktor doctor, String date) {
        count++;
        this.id=count;
        this.name = name;
        this.doctor = doctor;
        this.date = date;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Appointment.count = count;
    }

    public int getId() {//setid almadim.Degistimek istemedim.
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Doktor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doktor doctor) {
        this.doctor = doctor;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
