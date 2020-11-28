package src.cn.tx.demo.Chapter5;

class WuMingFen{
    String theMa;
    int quantity;
    boolean likeSup;

    public WuMingFen() {

    }

    @Override
    public String toString() {
        return "WuMingFen{" +
                "theMa='" + theMa + '\'' +
                ", quantity=" + quantity +
                ", likeSup=" + likeSup +
                '}';
    }

    public WuMingFen(String theMa, int quantity, boolean likeSup) {
        this.theMa = theMa;
        this.quantity = quantity;
        this.likeSup = likeSup;
    }

    public WuMingFen(String theMa, int quantity) {
        this.theMa = theMa;
        this.quantity = quantity;
    }

    public String getTheMa() {
        return theMa;
    }

    public void setTheMa(String theMa) {
        this.theMa = theMa;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isLikeSup() {
        return likeSup;
    }

    public void setLikeSup(boolean likeSup) {
        this.likeSup = likeSup;
    }
}

public class Ex10 {
    public static void main(String[] args) {
        WuMingFen d = new WuMingFen("2",2,true);
        System.out.println(d);
    }
}
