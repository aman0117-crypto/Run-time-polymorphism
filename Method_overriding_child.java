package Polymorphism.Run_time;

public class Method_overriding_child extends Method_overriding_parent{

    ////Here child class overrides m1() of parent class
    public void m1(){
        System.out.println("This is non-static method of child class..");
    }

    public static void main(String[] args) {
        Method_overriding_parent mp=new Method_overriding_parent();
        mp.m1();

        Method_overriding_child mc=new Method_overriding_child();
        mc.m1();
    }
    
}
