import java.util.ArrayList;

public class Dollar {
    private String dollarName;
    private int dollarVal;

    public Dollar(String dollarName, int dollarVal) {
        this.dollarName = dollarName;
        this.dollarVal = dollarVal;
    }

public static void getDollars(int dollars, ArrayList list){
        int rem;
        for(int i = 0; i < list.size(); i++){
            Dollar obj = (Dollar) list.get(i);
            rem = dollars/obj.dollarVal;
            dollars = dollars%obj.dollarVal;
            System.out.print(obj.dollarName + ": " + rem + " | ");
        }
}
}
