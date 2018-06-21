package statetest;

/**
 *
 * @author SOUMIT
 */
public interface VendingMachineState {
    void InsertCoin(int amount);
    void GetSoftDrinks(int amount);
    void GetallCoinBack();
}
