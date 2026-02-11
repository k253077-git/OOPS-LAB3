package lab3;

public class Course {

        public String code;
        public String name;
        public int crdhrs;

        Course(String code,String name, int crdhrs){
            this.code=code;
            this.name=name;
            this.crdhrs=crdhrs;
        }

        void display(){
            System.out.println("Ccode: "+code);
            System.out.println("Name: "+name);
            System.out.println("Credit hrs: "+crdhrs);
        }

        static void main(String[] args) {
            System.out.println("-----Course details-----:");
            Course m2=new Course("CS1002","PF",3);
            Course m3=new Course("CSL1002","PF_LAB",1);
            Course m4=new Course("MT1008","Calculus",3);
            Course m5=new Course("AP2054","DlD",2);
            m2.display();
            m3.display();
            m4.display();
            m5.display();
        }
    }
