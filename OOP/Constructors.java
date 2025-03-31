public class Constructors{
    String name;
    int age;
    // default constructor
    Constructors(){
        System.out.println(" Default Constructor called");
    }
    // parameterised constructor
    Constructors(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("Parameterised constructor called");
    }

    // copy constructor
    Constructors(Constructors obj){
        this.name = obj.name;
        this.age = obj.age;
        System.out.println("Copy Constructor called");
    }

    public static void main(String[] args){
        Constructors C1 = new Constructors();
        Constructors  C2 = new Constructors("Jeeya",20);
        Constructors C3 = new Constructors(C2);
    }
}