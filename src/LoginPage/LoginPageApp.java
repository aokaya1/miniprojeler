package LoginPage;

import java.util.Scanner;

public class LoginPageApp {
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        Scanner input = new Scanner(System.in);
        int select;
        do {
            showMenu();
            select = input.nextInt();
            UserService service = new UserService();
            switch (select) {
                case 1:

                    service.register();
                    System.out.println(service.username);
                    System.out.println(service.e_mail);
                    System.out.println(service.password);
                    break;
                case 2:
                    service.register();
                    break;
                case 0:
                    System.out.println("Iyi Gunler Dileriz");
                    break;
                default:
                    System.out.println("Hatali Giris Yaptiniz.Tekrar Deneyiniz");
            }
        } while (select != 0);


    }

    public static void showMenu() {
        System.out.println("----TECHPROEDUCATION----");
        System.out.println("1-Uye Ol");
        System.out.println("2-Giris Yap");
        System.out.println("3-Cikis");
        System.out.println("Seciminiz");
    }

}
