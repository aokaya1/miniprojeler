package BiletFiyatHesaplama;

public class Bilet {
    public int distance;
    public int typeNo;
    public double price;
    public int seatNo;

    public  void printBilet(Bus bus) {//Bus clasindan obje gir dedim
        System.out.println("Toplam Tutar: "+price);
        System.out.println("Bilet Detay");
        System.out.println("Otobus Plaka: "+ bus.numberPlate);
        System.out.println("Yolculuk Tipi: "+ (typeNo==1 ?"Tek Yon":"Gidis-Donus"));
        System.out.println("Koltuk No: "+ seatNo);
        System.out.println("Keyifli Yolculuklar Dilerim");

    }

}
