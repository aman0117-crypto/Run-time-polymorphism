package Polymorphism.Run_time;

public class Method_overriding_parent {

    //m1() is a Non-static method of parent class
    public void m1(){
        System.out.println("This is non-static method of parent class..");
    }

    public static void main(String[] args) {
        Method_overriding_parent mp=new Method_overriding_parent();
        mp.m1();
    }
}
