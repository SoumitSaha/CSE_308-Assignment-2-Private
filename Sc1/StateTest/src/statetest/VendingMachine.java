package statetest;

/**
 *
 * @author SOUMIT
 */
public class VendingMachine {
    
    VendingMachineState coinInserted;
    VendingMachineState noCoinInserted;
    VendingMachineState outofProducts;
    
    VendingMachineState machineCurrentState;
    
    int productQuantity;
    int insertedCoinAmount;
    int perProductPrice;
    
    public VendingMachine(){
        coinInserted = new  CoinInserted(this);
        noCoinInserted = new  NoCoinInserted(this);
        outofProducts = new  OutOfProduct(this);
        machineCurrentState = noCoinInserted;
        productQuantity = 50;
        insertedCoinAmount = 0;
    }
    
    void setMachineState(VendingMachineState newState){
        machineCurrentState = newState;
    }
    
    public void fillInventoryby(int canAmount){
        productQuantity = canAmount;
    }
    
    public void insertCoin(int amount){
        machineCurrentState.InsertCoin(amount);
    }
    
    public void getDrinks(int amount){
        machineCurrentState.GetSoftDrinks(amount);
    }
    
    public VendingMachineState getCoinInsertedState(){
        return coinInserted;
    }
    
    public VendingMachineState getNoCoinInsertedState(){
        return noCoinInserted;
    }
    
    public VendingMachineState getOutOfProductState(){
        return outofProducts;
    }
    
}

