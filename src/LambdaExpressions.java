/**
 * This example demonstrates a class defined inside another class (nested class)
 * to restrict access and improve encapsulation.
 *
 * The inner class (B) cannot be accessed directly without referring to the outer class (A).
 *
 * Accessing the outer class:
 * <pre>
 * A obj1 = new A();
 * obj1.show();
 * </pre>
 *
 * Accessing the inner class when it is declared as static:
 * <pre>
 * A.B obj1 = new A.B();
 * obj1.shows();
 * </pre>
 *
 * This works only if class B is declared as static.
 *
 * Accessing the inner class when it is NOT static:
 * <pre>
 * A obj = new A();
 * A.B obj1 = obj.new B();
 * obj1.shows();
 * </pre>
 *
 * In this case, the inner class object must be created using the outer class object.
 *
 * Benefits:
 * - Improves encapsulation
 * - Restricts access to the inner class
 * - Provides logical grouping of related classes
 */
public class LambdaExpressions {
    public static void main(String[] args) {
        A obj =  (a, b)->a+b;

        System.out.println(obj.add(1,2));
    }
}

@FunctionalInterface
 interface A{
    int add(int a,int b);
}

/*
class A {
    static void show(){
        System.out.println("In a Show");
    }
    static class B {
        static void shows(){
            System.out.println("I want to access this from the parent class");
        }
    }
}
 */


/*
    class A {
    public void show(){
        System.out.println("In A show ");
    }
    class B extends A{
        public void show(){
            System.out.println("In B show ");
        }
    }
} -> This thing is used to overide the class A this we can do in another type
  If you want to change the behaviour of an particular methoed there is no need to create a seprate class insted we can do like this
  public class LambdaExpressions {
    public static void main(String[] args) {
        A obj = new A(){
            public void show(){
                System.out.println("New type");
            }
        };
        obj.show();

    }
}

class A {
    public void show(){
        System.out.println("In A show ");
    }
}--> This way also we can do it

This thing can we applied to the interface and abstract class as well

Now the same thing we can do it shortlyby using the lambda expression

public class LambdaExpressions {
    public static void main(String[] args) {
//        A obj = new A(){
//            public void show(){
//                System.out.println("New type");
//            }
//        };
//        obj.show();
        A obj1 = ()-> System.out.println("This is lambda expression"); --> this is lambda expression
        obj1.show();

    }
}

interface A{
    void show();
}


it will work only for  functional interface mean the class consist of only one abstract class

@FunctionalInterface
interface A{
    void show();
    String toString();
}
 but here toString also works beacuse it is a inbuild methooed , if we create it wil not work
 */

/*
 Now for the parametrs interface we will convert it to the lambda
 public class LambdaExpressions {
    public static void main(String[] args) {
        A obj = new A(){
          public int add(int a, int b){
              return a+b;
          }
        };
        System.out.println(obj.add(1,2));
    }
}
@FunctionalInterface
 interface A{
    int add(int a,int b);
}
convert to lmbda expression -->
A obj =  (int a, int b)->{return a+b;};
till sorter
A obj =  (a, b)->{return a+b;};
A obj =  (a, b)->a+b;

public class LambdaExpressions {
    public static void main(String[] args) {
        A obj =  (a, b)->a+b;

        System.out.println(obj.add(1,2));
    }
}
@FunctionalInterface
 interface A{
    int add(int a,int b);
}
 */

/*
A lambda expression is a short block of code that takes in parameters and returns a value.
Lambdas look similar to methods, but they do not need a name, and they can be written right inside a method body.

syntax -->
parameter -> expression

(parameter1, parameter2) -> expression

 */