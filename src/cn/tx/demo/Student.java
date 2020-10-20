package cn.tx.demo;

public class Student {
    private int sNo;
    private String name;
    private int age;

    public Student(int sNo, String name, int age) {
        this.sNo = sNo;
        this.name = name;
        this.age = age;
    }

    public int getsNo() {
        return sNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sNo=" + sNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student() {
        super();
    }
}
