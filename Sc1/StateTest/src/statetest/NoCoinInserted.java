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
        
    }

    @Override
    public void GetSoftDrinks(int amount) {
        
    }
}
