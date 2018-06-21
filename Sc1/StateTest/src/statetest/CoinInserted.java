package statetest;

/**
 *
 * @author SOUMIT
 */
public class CoinInserted implements VendingMachineState{
    
    VendingMachine mac;
    
    public CoinInserted(VendingMachine machine){
        mac = machine;
    }
    
    @Override
    public void InsertCoin(int amount) {
        mac.insertedCoinAmount = mac.insertedCoinAmount + amount;
        System.out.println("Total Inserted Coin Amount : " + mac.insertedCoinAmount);
    }

    @Override
    public void GetSoftDrinks(int amount) {
        int cost = amount * mac.perProductPrice;
        if(cost > mac.insertedCoinAmount){
            System.out.println("Not Enough Coin Deposited. ");
            System.out.println("To get " + amount + " can(s) of soft drinks, you need to deposit : " + cost);
            System.out.println("Change amount : " + mac.insertedCoinAmount);
            mac.insertedCoinAmount = 0;
            System.out.println("Coin you deposited has been ejected.");
            mac.setMachineState(mac.getNoCoinInsertedState());
            return;
        }
        
        else if(amount <= mac.productQuantity){
            mac.productQuantity = mac.productQuantity - amount;
            System.out.println("Delivered " + amount + " Can(s) of Soft Drinks.");
            int changeAmount = mac.insertedCoinAmount - cost;
            System.out.println("Change Amount " + changeAmount + " delivered.");
            mac.insertedCoinAmount = 0;
            if(mac.productQuantity == 0){
                mac.setMachineState(mac.getOutOfProductState());
                return;
            }
            mac.setMachineState(mac.getNoCoinInsertedState());
            return;
        }
        
        else{
            int canbedelivered = mac.productQuantity;
            int deliverycost = canbedelivered * mac.perProductPrice;
            System.out.println("Not enough product. You are delivered " + canbedelivered + " can(s) of soft drinks.");
            System.out.println("Cost : " + deliverycost);
            int changeAmount = mac.insertedCoinAmount - deliverycost;
            System.out.println("Change Amount " + changeAmount + " delivered.");
            mac.productQuantity = 0;
            mac.insertedCoinAmount = 0;
            mac.setMachineState(mac.getOutOfProductState());
        }
    }

    @Override
    public void GetallCoinBack() {
        System.out.println("Change amount : " + mac.insertedCoinAmount);
        mac.insertedCoinAmount = 0;
        System.out.println("Coin you deposited has been ejected.");
        mac.setMachineState(mac.getNoCoinInsertedState());
    }
    
}
