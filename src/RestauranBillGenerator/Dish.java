package RestauranBillGenerator;

public class Dish {
//Bu kismi sadece yonetici girdigi, bu degerleri olusturdugu ve baskalarinin degistirememesi icin private yaptik
//Diger kullanicilar da gorebilsin diye getter method olusturduk. Degisiklik yapilmasin diye setter yapmadik
    private  int code;
    private String name;
    private double price;

public Dish(int code,String name,double price){
    this.code=code;
    this.name=name;
    this.price=price;
}

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "code=" + code +
                ", name='" + name + '\'' +
                ", price=" + price;
    }
}
