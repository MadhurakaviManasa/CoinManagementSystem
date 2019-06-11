import java.util.ArrayList;

public class Coin {
    private String coinName;
    private int coinVal;


    public Coin (String coinName, int coinVal){
        this.coinName = coinName;
        this.coinVal = coinVal;
    }
    public static void getChange(int bal, ArrayList list){
        int rem;
        for(int i = 0; i < list.size(); i++){
            Coin obj1 = (Coin) list.get(i);
            rem = (bal/obj1.coinVal);
            bal = bal%obj1.coinVal;
            System.out.print(obj1.coinName + ": " + rem + " | ");
        }
    }
}
