import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayisalLoto {

    /*
Proje: Sayısal Loto Uygulaması
   bilet için rastgele n tane sayı üretilsin.
   loto sonucu rastgele n tane sayı ile üretilsin.
   sayısal lotoda tekrarlı sayılar olmamalı.

   n(hane sayısı), sayılar için min ve max değerler
   kullanıcıdan alınsın.

   sonuç ve bilet karşılaştırılsın, kaç eşleşme olduğu
   kullanıcıya bildirilsin.

*/
    public static void main(String[] args) {
        startLoto();


    }//main

    public static int compareArr(int[] arr,int[]brr){
           int counter=0;
        for (int i =0; i <arr.length ; i++) {
            for (int j =0; j<brr.length; j++) {
                if (arr[i]==brr[j]){
                    counter++;
                }
            }

        }
        return counter;
    }

    public static void startLoto() {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayisal Loto Icin Hane Sayisini Giriniz");
        int slots = input.nextInt();
        System.out.println("Sayilar Icin Min Deger Giriniz");
        int min = input.nextInt();
        System.out.println("Sayilar Icin Max Deger Giriniz");
        int max = input.nextInt();
        //loto ve bilet icin dizi hazirladik
        int[] lotoarr=new int[slots];
        int[] ticketarr=new int[slots];
        int randomnumber1=0;
        int randomnumber2=0;
        Random random=new Random();
        boolean isRepeated;
        for (int i = 0; i <slots; i++) {
        do {
            isRepeated=false;
            randomnumber1 =random.nextInt(max+1-min)+min;
            //min ile max arasi olsun istedim.Parantez icine -min yazmasam
            //alt sinir 0 dan min olacagi gibi ust sinirda min artardi.Artani cikarmis oldum.
            //Mesela max 10 diyelim min eklemezsek 0-10 olur min(5) ekledim,5-15 oldu.Her degere 5 eklemis gibi oluyorum.
            // Parantez ici min cikardim 5-10 olur.5 dahil 10 dahil degil.Bunlarin arasindan birini random alir.
            for (int j = 0; j <slots; j++) {
                if (lotoarr[j]==randomnumber1){
                    isRepeated=true;
                    break;
                }
            }
        }while (isRepeated);
        lotoarr[i]=randomnumber1;

            do {
                isRepeated=false;
                randomnumber2 =random.nextInt(max+1-min)+min;
                //min ile max arasi olsun istedim.Parantez icine -min yazmasam
                //alt sinir 0 dan min olacagi gibi ust sinirda min artardi.Artani cikarmis oldum.
                //Mesela max 10 diyelim min eklemezsek 0-10 olur min(5) ekledim,5-15 oldu.Her degere 5 eklemis gibi oluyorum.
                // Parantez ici min cikardim 5-10 olur.5 dahil 10 dahil degil.Bunlarin arasindan birini random alir.
                for (int j = 0; j <slots; j++) {
                    if (ticketarr[j]==randomnumber2){
                        isRepeated=true;
                        break;
                    }
                }
            }while (isRepeated);
            ticketarr[i]=randomnumber2;
        }
        System.out.println("Benim biletim: ");
        for(int i=0;i<slots;i++){
            System.out.print(ticketarr[i]+" ");
        }
        System.out.println();
        System.out.println("Loto sonucu: ");
        for(int i=0;i<slots;i++){
            System.out.print(lotoarr[i]+" ");
        }
        System.out.println();
        int result=compareArr(ticketarr,lotoarr);
        if (result>0) {
            System.out.println("Tebrikler! " + result + " eşleşme var.");
        }else {
            System.out.println("Malesef hiç eşleşme yok, bir dahaki sefere.");
        }

    }
}
