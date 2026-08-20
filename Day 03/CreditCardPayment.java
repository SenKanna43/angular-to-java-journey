// CreditCardPayment inherits common functionality
// from the OnlinePayment abstract class
class CreditCardPayment extends OnlinePayment {

    // Encapsulation:
    // cardNumber is private
    private String cardNumber;

    // Constructor
    public CreditCardPayment(String transactionId, String cardNumber) {

        // Call the parent class constructor
        super(transactionId);

        this.cardNumber = cardNumber;
    }

    // Method overriding:
    // CreditCardPayment provides its own implementation
    // of the abstract validatePayment() method
    @Override
    void validatePayment() {
        System.out.println("Validating credit card...");
    }

    // Method overriding:
    // Implementation of the pay() method from Payment interface
    @Override
    public void pay(double amount) {

        // Validate the credit card before making payment
        validatePayment();

        System.out.println(
                "Paid ₹" + amount + " using Credit Card"
        );
    }
}