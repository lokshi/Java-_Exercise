package src.cn.tx.demo.Chapter5;

class MyTime {
    private int hour;
    private int minute;
    private int second;


    public void setTime(){
        hour=10;
        minute=20;
        second=30;
    }

    public void display(){
        System.out.printf("This is: %s : %s :%s \n",hour,minute,second);
    }

    public void addHour(int hou){
        hour += hou;
    }

    public void addSecond(int sec){
        second += sec;
    }

    public void addMinute(int min){
        minute += min;
    }

    public void subHour(int hou){
        hour -= hou;
    }

    public void subSecond(int sec){
        second -= sec;
    }

    public void subMinute(int min){
        minute -= min;
    }

}


public class Ex03 {
    public static void main(String[] args) {
        MyTime timeTest = new MyTime();
        timeTest.setTime();
        timeTest.display();
        System.out.println("------------------");
        timeTest.addHour(5);
        timeTest.subMinute(10);
        timeTest.display();

    }
}
