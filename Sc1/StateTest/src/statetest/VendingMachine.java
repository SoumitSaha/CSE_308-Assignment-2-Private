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
    int perProductPrice = 2;
    
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
        productQuantity = productQuantity + canAmount;
        System.out.println("Machine has now " + productQuantity + " can(s) of soft drinks.");
    }
    
    public void insertCoin(int amount){
        machineCurrentState.InsertCoin(amount);
    }
    
    public void getDrinks(int amount){
        machineCurrentState.GetSoftDrinks(amount);
    }
    
    public void getAllInsertedCoinBack(){
        machineCurrentState.GetallCoinBack();
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

