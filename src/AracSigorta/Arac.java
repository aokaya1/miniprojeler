package AracSigorta;

import java.util.Scanner;

public class Arac {
    public String type;
    public int prim;

    public int countPrim(int term) {
        if (term == 1) {
            switch (type) {
                case "OTOMOBIL":
                    prim = 2000;
                    break;
                case "KAMYON":
                    prim = 3000;
                    break;
                case "OTOBUS":
                    prim = countBusPrim(term);
                    break;
                case "MOTOSIKLET":
                    prim = 1500;
                    break;
                default:
                    System.out.println("Hatali Giris");
                    prim = 0;
                    break;
            }

        } else if (term == 2) {
            switch (type) {
                case "OTOMOBIL":
                    prim = 2500;
                    break;
                case "KAMYON":
                    prim = 3500;
                    break;
                case "OTOBUS":
                    prim = countBusPrim(term);
                    break;
                case "MOTOSIKLET":
                    prim = 1750;
                    break;
                default:
                    System.out.println("Hatali Giris");
                    prim = 0;
                    break;
            }
        } else {
            System.out.println("Hataki Giris");
            prim = 0;
        }
        return prim;
    }

    public int countBusPrim(int term) {
        Scanner input = new Scanner(System.in);
        System.out.println("Otobus tipini Giriniz");
        System.out.println("1-(18-30 Koltuk),2-(31-ve uzeri koltuk)");
        int bustype = input.nextInt();
        switch (bustype) {
            case 1:
                if (term == 1) {
                    prim = 4000;
                } else {
                    prim = 4500;
                }
                break;
            case 2:
                if (term == 1) {
                    prim = 5000;
                } else {
                    prim = 5500;
                }
                break;
        }
        return prim;
    }

}
