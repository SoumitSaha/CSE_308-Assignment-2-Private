package statetest;

/**
 *
 * @author SOUMIT
 */
public class NoCoinInserted implements VendingMachineState{
    
    VendingMachine mac;
    
    public NoCoinInserted(VendingMachine machine){
        mac = machine;
    }
    
    @Override
    public void InsertCoin(int amount) {
        mac.insertedCoinAmount = amount;
        System.out.println("Inserted Coin Amount : " + mac.insertedCoinAmount);
        mac.setMachineState(mac.getCoinInsertedState());
    }

    @Override
    public void GetSoftDrinks(int amount) {
        System.out.println("You haven't deposited any coin. Please insert coin first.");
    }

    @Override
    public void GetallCoinBack() {
        System.out.println("You haven't deposited any coin. Nothing to Change.");
    }
}
