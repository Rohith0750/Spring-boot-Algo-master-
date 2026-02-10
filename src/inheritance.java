public class inheritance {
    public static void main(String[]args){
        Fish shark= new Fish();
        shark.eats();
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


