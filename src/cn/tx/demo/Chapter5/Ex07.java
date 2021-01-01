package src.cn.tx.demo.Chapter5;

class Person{
    private String name;
    private int age;

    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void display(){
        System.out.printf("Your name is %s ,age is %s. \n",name,age);

    }

}



public class Ex07 {
    public static void main(String[] args) {
        Person man=new Person("Lok",49);
        man.display();
    }
}
