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
        
    }

    @Override
    public void GetSoftDrinks(int amount) {
        
    }
    
}
