package Jan13;

public class A {

    int x = 100;
    A(){
        System.out.println("In class A");
    }

    A(int a){
        System.out.println(a + " From super class");
    }
}

class B extends A{
    int x = 10;
    B(){
        System.out.println("In class B");
    }

    B(int a){
        super(a);
        System.out.println(a);
    }

    void show(){
        System.out.println(x);
        System.out.println(super.x);
    }
}

class Main{
    public static void main(String[] args) {
        B b = new B();
        b.show();

    }
}