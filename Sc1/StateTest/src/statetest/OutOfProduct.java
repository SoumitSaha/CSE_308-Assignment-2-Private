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
        
    }

    @Override
    public void GetSoftDrinks(int amount) {
        
    }
    
}
