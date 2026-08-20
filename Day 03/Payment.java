// Interface defines a common contract for all payment types
interface Payment {

    // Every payment type must implement the pay() method
    void pay(double amount);
}