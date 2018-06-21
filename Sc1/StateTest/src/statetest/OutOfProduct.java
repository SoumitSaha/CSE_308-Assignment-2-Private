package statetest;

/**
 *
 * @author SOUMIT
 */
public class OutOfProduct implements VendingMachineState{
    
    VendingMachine mac;
    
    public OutOfProduct(VendingMachine machine){
        mac = machine;
    }
    
    @Override
    public void InsertCoin(int amount) {
        System.out.println("Sorry. Machine is out of product. Coin can't be inserted.");
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
