package LoginPage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserService {

    List<String> username = new ArrayList<>();

    List<String> e_mail = new ArrayList<>();

    List<String> password = new ArrayList<>();

    public void register() {
        Scanner input = new Scanner(System.in);
        System.out.println(" Ad-Soyad Giriniz");
        String name = input.nextLine();

        String userName;
        boolean existsUserName;
        do {
            System.out.println(" Kullanici Adi Giriniz Giriniz");
             userName = input.nextLine();
            existsUserName = this.username.contains(userName);
            if (existsUserName) {
                System.out.println("Bu username Kullanilmis.Tekrar deneyiniz.");
            }
        } while (existsUserName);

         String e_mail;
         boolean existsemail;
         boolean isValid;
         do {
             System.out.println("e_mail Giriniz");
             e_mail = input.nextLine().trim();
             isValid=validateEmail(e_mail);
             existsemail=this.username.contains(e_mail);
             if (existsemail){
                 System.out.println("Bu e_mail Kullanilamaz.Tekrar Deneyiniz.");
                 isValid=false;
             }
         }while (!isValid);

          String password;
          boolean isValidPassw;
          do {
              System.out.println("Sifrenizi Girini");
              password=input.nextLine().trim();
              isValidPassw=validatePassword(password);

          }while (!isValidPassw);
          User user=new User(name,userName,e_mail,password);
          this.username.add(user.username);
          this.e_mail.add(user.e_mail);
          this.password.add(user.password);
        System.out.println("Isleminiz Gerceklesmistir.");
        System.out.println("Kullanici adi veya email ile sisteme girebilirsiniz");
    }

    public boolean validateEmail(String e_mail){
        boolean isValid;
        boolean space=e_mail.contains(" ");
        boolean at=e_mail.contains("@");
        if (space){
            System.out.println("Email Bosluk Iceremez");
            isValid=false;
        } else if (!at) {
            System.out.println("Email @ Icermelidir.");
            isValid=false;
        }else {
            String firstPart=e_mail.split("@")[0];
            String secondPart=e_mail.split("@")[1];

            int notvalid=firstPart.replaceAll("[a-zA-z0-9-._]","").length();
            boolean checkStart=notvalid==0;
            boolean checkAnd=secondPart.equals("gmail.com")||secondPart.equals("yahoo.com")||secondPart.equals("hotmail.com");
         if(!checkStart){
             System.out.println("Email Kullanici Adi Buyuk Kucuk Harf Rakam,-,.,_ disinda karakter iceremez ");
         } else if (!checkAnd) {
             System.out.println("Email gmail.com,hotmail.com veya yahoo.com ile bitmelidir.");

         }
            isValid=checkStart&&checkAnd;
         if (!isValid){
             System.out.println("Gecersiz Email Tekrar Giriniz");
         }
        }

        return isValid;
    }
    public boolean validatePassword(String password){
        boolean isValid;
        String upperLetter=password.replaceAll("[^A-Z]","");
        String lowerLetter=password.replaceAll("[^a-z]","");
        String digit=password.replaceAll("[\\D]","");
        String symbol=password.replaceAll("[\\P{Punct}]","");
        boolean space=password.contains(" ");
        boolean length6=password.length()>5;
        boolean existsUpper=upperLetter.length()>0;
        boolean existsLower=lowerLetter.length()>0;
        boolean existsDigit=digit.length()>0;
        boolean existssymbol=symbol.length()>0;
      if (space){
          System.out.println("Password bosluk Iceremez");
      }else if(!length6){
          System.out.println("Sifre En Az 6 Karakter Icermelidir");

      } else if (!existsUpper) {
          System.out.println("Sifre En Az 1 Buyuk Harf Icermelidir");

      } else if (!existsLower) {
          System.out.println("Sifre En Az 1 Kucuk Harf Icermelidir");

      } else if (!existssymbol) {
          System.out.println("Sifre En Az 1 sembol Icermelidir");
      } else if (!existsDigit){
          System.out.println("Sifre En Az 1 RakamIcermelidir");
      }


        isValid=!space && length6 && existssymbol && existsDigit && existsLower && existsUpper;
        if (!isValid){
            System.out.println("Gecersiz Password Tekrar Deneyiniz");
        }
        return isValid;
    }

   public  void  login(){
        Scanner input=new Scanner(System.in);
       System.out.println("Kullanici Adi veya Email Giriniz");
       String userNameOrEmail=input.nextLine();
       boolean isUserName=this.username.contains(userNameOrEmail);
       boolean isEmail=this.e_mail.contains(userNameOrEmail);
       if (isUserName || isEmail){
       boolean isWrong=true;
       while (isWrong){
           System.out.println("Sifre Giriniz");
           String password=input.next();
           //Username ile index eslesmeli.Herhangi bir sifre ile degil
           int index;
           if (isUserName){
               index=this.username.indexOf(userNameOrEmail);

           }else {
               index=this.e_mail.indexOf(userNameOrEmail);
           }
           if (this.password.get(index).equals(password)){
               System.out.println("Hosgeldiniz.Sisteme Giris Yapildi");
               isWrong=false;
           }else {
               System.out.println("Sifreniz yanlis ya da Hatali. Tekrar Deneyiniz");
           }
       }
       }else {
           System.out.println("Sisteme Kayitli Kullanici Bulunamadi");
           System.out.println("Uyeyseniz Bilgilerinizi Kontrol Ediniz.Degilseniz Uye OLunuz");
       }
}

}
