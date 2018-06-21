package statetest;

import java.util.Scanner;

/**
 *
 * @author SOUMIT
 */
public class StateTest {
    
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.println("1.Insert Coin               2.Get Soft Drinks Can(s)");
            System.out.println("3.Get Inserted Coin Back    4.Fill Inventory");
            int ch;
            ch = in.nextInt();
            if(ch == 1){
                System.out.print("Amount : ");
                int amount = in.nextInt();
                machine.insertCoin(amount);
            }
            else if(ch == 2){
                System.out.print("How many can(s) of soft drinks : ");
                int amount = in.nextInt();
                machine.getDrinks(amount);
            }
            else if(ch == 3){
                machine.getAllInsertedCoinBack();
            }
            else if(ch == 4){
                System.out.print("Fill inventory -> can(s) of soft drinks amount : ");
                int amount = in.nextInt();
                machine.fillInventoryby(amount);
            }
            else{
                break;
            }
        }
    }
    
}
