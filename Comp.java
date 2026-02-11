package lab3;

public class Comp {
    private String id;
    public String processor;
    public int ram;
    public String OS;

    public void set(String sysid){
        this.id=sysid;
    }
    public String get(){
        return id;
    }
    Comp(String processor,int ram,String OS){
        this.processor=processor;
        this.ram=ram;
        this.OS=OS;
    }
    void display(){
        System.out.println("PROCESSOR: "+processor);
        System.out.println("RAM: "+ram);
        System.out.println("Operating system: "+OS);
    }

    static void main(String[] args) {
        Comp c1=new Comp("I5",8,"Window");
        c1.set("CS1023");
        System.out.println("ID: "+c1.get());
        c1.display();
        Comp c2=new Comp("I7",16,"Apple");
        c1.set("AP0429");
        System.out.println("ID: "+c1.get());
        c2.display();
    }
}
