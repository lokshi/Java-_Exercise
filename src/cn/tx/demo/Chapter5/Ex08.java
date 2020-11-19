package src.cn.tx.demo.Chapter5;

class Rect{
    private double width;
    private double height;

    public Rect(double width,double height){
        this.width=width;
        this.height=height;
    }

    public Rect(){
        this.width=10;
        this.height=10;
    }

    public void permeter(){
        System.out.printf("Permeter is %s \n",2*(width+height));
    }

    public void area(){
        System.out.printf("Area is %s \n",width*height);
    }

}

public class Ex08 {
    public static void main(String[] args) {
        Rect r1=new Rect();
        r1.area();
        r1.permeter();
        System.out.println("-----------------");
        Rect r2 =new Rect(20,20);
        r2.area();
        r2.permeter();
    }
}
