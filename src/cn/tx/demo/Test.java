package cn.tx.demo;

class Dog{
    String name;
    int gender;
    double weight;

    public void sleep() {
        System.out.println(name +"睡觉了。");
    }
}

public class Test {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.name="笨笨";
        dog.gender=1;
        dog.weight=10.0;

        dog.sleep();

//        dog=null;
//        System.out.println(dog.name);


    }




}

