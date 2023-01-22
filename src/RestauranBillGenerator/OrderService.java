package RestauranBillGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderService {
    List<Order> orderList = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    public void createOrder(DishService dishService) {

        int dishCode = -1;
        while (dishCode != 0) {
            System.out.println("Lutfen Urun Kodunu Giriniz:(CIKIS:0)");
            dishCode = input.nextInt();//code ile hangi urun kastediliyor
            Dish dish = dishService.findDishCode(dishCode);
            if (dish.getCode() > 0) {
                System.out.println("Adet Giriniz");
                int num = input.nextInt();
                Order order = new Order(dish, num);
                order.setPrice();
                order.setOrderCode(1000 + this.orderList.size());//1000 1001 1002
                this.orderList.add(order);
            }
            for (Order order : this.orderList) {
                System.out.printf("Sipariş kodu:%-5s  lezzet kodu:%-4s adı:%-20s adet:%-3s\n",
                        order.orderCode, order.dish.getCode(), order.dish.getName(), order.numOfDish);
            }
        }
    }

    public void deleteOrder() {
       boolean isValid=true;
        if (this.orderList.isEmpty()) {
            System.out.println("Siparisiniz Bulunmamaktadir.");
        }else {
            System.out.println("Iptal Etmek Istediginiz Siparisin Kodunu Giriniz");
           int code= input.nextInt();
           for (Order order:this.orderList){
               if (order.orderCode==code){
                   this.orderList.remove(order);
                   System.out.println("Siparisiniz Iptal Edildi: "+order.dish.toString());
                   isValid=true;
               }else {
                   isValid=false;
               }
           }
           if (!isValid){
               System.out.println("Siparis Kodu Gecersiz");
           }
        }
    }
    public void printBill(){
        double totalPrice=0.0;
        System.out.println("                    Lezzet Fisiniz            ");
        for (Order order:this.orderList){
            System.out.printf("Lezzet Kodu:%-5s   Adi:%-20s  Adet:%-5s  Siparis Tutari:%-5s \n",
                    order.dish.getCode(),order.dish.getName(),order.numOfDish,order.orderPrice);
            totalPrice+=order.orderPrice;
        }
        System.out.println("Taplam Tutar = "+totalPrice);
        System.out.println("Afiyet Olsun");
        this.orderList=new ArrayList<>();
    }
}
