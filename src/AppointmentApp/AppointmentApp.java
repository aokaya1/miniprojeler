package AppointmentApp;

public class AppointmentApp {
    /*
Proje: Randevu oluşturma uygulaması geliştiriniz.

       1-Ana menüde kullanıcıya randevu alma veya görüntülemek için iki seçenek sunulur.
       2-Randevu alma/oluşturma
            -Kullanıcıya mevcut doktorlar ve uygun oldukları tarihler gösterilir.
            -Kullanıcıdan no ile doktor seçmesi istenir.
            -Seçilen doktorun takvimi gösterilir.
            -Randevu alınmak istenen tarihin seçilmesi istenir.
            -en yakın 7 günlük takvim dolmuşsa daha sonra denenmesi istenir.
            -Geçerli bir tarih seçilmişse randevu oluşturulur ve bu tarih doktorun takviminden silinir.
       3-Randevu görüntüleme:
            -Kullanıcıya randevu no sorulur,
             randevu listesinde girilen no ile eşleşen randevu bilgileri yazdırılır.
       4-Doktor:
            -id, isim, branş, takvim
            -takvim: sistemin kullanıldığı günden 1 gün sonra başlamak üzere
                     7 günlük uygun randevu tarihleri

       5-Randevu:
            -id : otomatik üretilsin
            -hasta adı,Doktor,randevu tarihi
       6-Sistemde doktorlar kayıtlı olsun.

 */
    public static void main(String[] args) {
        Start.start();

    }




}
