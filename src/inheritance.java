public class inheritance {
    public static void main(String[]args){
//        Fish shark= new Fish();
//        shark.eats();
        Dog dog = new Dog();
        dog.eats();
       int res= dog.legs=4;
        System.out.println(res);
    }
}
class animal{
    String color;
    void eats(){
        System.out.println("Eats");
    }

    void breathe(){
        System.out.println("Breathe");
    }
}

class Fish extends animal{
    int finss;
    void swim(){
        System.out.println("Swim");
    }
}
//This is single level inheritance one base and one derived class
//--------------------------------------------------------------------
class Mammals extends animal{
    int legs;
}

class Dog extends Mammals{
    String breead;
}
