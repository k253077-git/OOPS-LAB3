package lab3;

public class Programmer {
    public int id;
    public String name;
    public String lang;
    public int ques;

    public void set(int id){
        this.id=id;
    }
    public int get(){
        return id;
    }

    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Preferred lang: "+lang);
        System.out.println("Questions solved: "+ques);
    }

    static void main(String[] args) {
        Programmer p1=new Programmer();
        p1.set(3077);
        p1.name="Umar";
        p1.lang="C++";
        p1.ques=20;
        System.out.println("Id: "+p1.get());
        p1.display();
        Programmer p2=new Programmer();
        p2.set(3057);
        p2.name="Aslam";
        p2.lang="Python";
        p2.ques=18;
        System.out.println("\nId: "+p2.get());
        p2.display();

    }
}
