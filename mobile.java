package lab3;

public class mobile {
    public String model;
    public String brand;
    public int price;

    mobile(){
        model="Unknow";
        brand="Unknow";
        price=0;
    }
    mobile(String brand,String model, int price){
        this.model=model;
        this.brand=brand;
        this.price=price;
    }

    void display(){
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
        System.out.println("Price: "+price);
    }

    static void main(String[] args) {
        mobile m1=new mobile();
        m1.display();
        System.out.println("New arrivals:");
        mobile m2=new mobile("Samsung","s25",250000);
        mobile m3=new mobile("Apple","iphone17",200000);
        m2.display();
        m3.display();
    }
}
