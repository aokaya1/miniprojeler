package AppointmentApp;

import java.util.ArrayList;
import java.util.List;
//7.Adim doktor islemleri
public class DoctorService {
    //8.adimDoctorlar sistemde kayitli olmali

    List<Doktor>doktorList=new ArrayList<>();

    public DoctorService() {
        Doktor doktor1=new Doktor(11,"Dr.Leonardo","KBB");
        Doktor doktor2=new Doktor(22,"Dr.Donatello","Goz");
        Doktor doktor3=new Doktor(33,"Dr.Rafael","Genel Cerrah");
        this.doktorList.add(doktor1);
        this.doktorList.add(doktor2);
        this.doktorList.add(doktor3);
    }
    //9 adim Doktor menusu gosterelim.no/ad/brans/tarih olsun
    public void printDoctors(){
        System.out.println("---------------------------------Doktorlar---------------------------------");
        for (Doktor dr:doktorList){
            //System.out.println(dr.toString());
            System.out.println(" No : "+dr.getId()+" Adi : "+dr.getName()+" Brans : "+dr.getDepartment());
            System.out.println("Takvim : ");
            for (String date: dr.getDates()){
                System.out.println(date);
            }
        }
        System.out.println("---------------------------------------------------------------------------");
    }

    //10.Adim id ile doktoru bulalim
    public Doktor getDoctorById(int id){
        for (Doktor dr:this.doktorList) {
            if (dr.getId()==id){
                return dr;
            }
        }
        return null;
    }
}
