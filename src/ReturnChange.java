import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ReturnChange {
    public static void main(String[] args) {
        int cents, dollars;

        ArrayList<Coin> coinValues = new ArrayList();
        ArrayList<Dollar> dollarValues = new ArrayList<>();

        Coin quarters = new Coin("Quarters",25);
        Coin dimes = new Coin("Dimes",10);
        Coin nickles = new Coin("Nickles",5);
        Coin pennies = new Coin("Pennies",1);

        coinValues.add(quarters);
        coinValues.add(dimes);
        coinValues.add(nickles);
        coinValues.add(pennies);

        Dollar hundred = new Dollar("Hundred Dollars",100);
        Dollar fifty = new Dollar("Fifty Dollars",50);
        Dollar twenty = new Dollar("Twenty Dollars",20);
        Dollar ten = new Dollar("Ten Dollars",10);
        Dollar five = new Dollar("Five Dollars", 5);
        Dollar two = new Dollar("Two Dollars", 2);
        Dollar one = new Dollar("One Dollars", 1);

        dollarValues.add(hundred);
        dollarValues.add(fifty);
        dollarValues.add(twenty);
        dollarValues.add(ten);
        dollarValues.add(five);
        dollarValues.add(two);
        dollarValues.add(one);

        System.out.print("Enter the amount to be paid: ");
        try {
            Scanner amt = new Scanner(System.in);
            BigDecimal amtToPay = amt.nextBigDecimal();
            BigDecimal totalAmt = new BigDecimal(String.valueOf(amtToPay));
            Scanner input = new Scanner(System.in);
            System.out.println("Total amount to be paid: $" + totalAmt);

            System.out.print("Enter the amount you want to pay: $");
            BigDecimal amountPaid = input.nextBigDecimal();

            BigDecimal remainingBal = amountPaid.subtract(totalAmt);
            String remainingBalString = remainingBal.toString();
            String [] remainingBalArr = remainingBalString.split("\\.");

            dollars = Integer.parseInt(remainingBalArr[0]);
            if(remainingBalArr.length == 2) {
                cents = Integer.parseInt(remainingBalArr[1]);
            }
            else
                cents = 0;

            System.out.println("Remaining Change: ");
            System.out.println(remainingBal);
            //   System.out.print("| Dollars: " + dollars + " | ");
            Dollar.getDollars(dollars, dollarValues);
            System.out.println("");
            Coin.getChange(cents, coinValues);

        }
        catch (InputMismatchException e){
            System.out.println("Sorry, wrong input. Please try again!");
        }
    }

}
