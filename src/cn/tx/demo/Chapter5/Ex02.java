package src.cn.tx.demo.Chapter5;

class Vehicle{
    int speed=0;
    int size=0;

        public void move(){
            this.speed =100;
        }

        public void speedUp(){
            speed +=10;
        }

        public void speedDown(){
            speed -=10;
        }
}

public class Ex02 {

    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        System.out.println(car.speed);
        car.move();
        System.out.println(car.speed);
        car.speedUp();
        System.out.println(car.speed);
        car.speedDown();
        car.speedDown();
        System.out.println(car.speed);
    }
}
