// UPIPayment also inherits from OnlinePayment
class UPIPayment extends OnlinePayment {

    // Encapsulation:
    // UPI ID is kept private
    private String upiId;

    // Constructor
    public UPIPayment(String transactionId, String upiId) {

        // Initialize the parent class
        super(transactionId);

        this.upiId = upiId;
    }

    // Method overriding
    @Override
    void validatePayment() {
        System.out.println("Validating UPI ID...");
    }

    // Method overriding
    @Override
    public void pay(double amount) {

        // Validate UPI before processing payment
        validatePayment();

        System.out.println(
                "Paid ₹" + amount + " using UPI"
        );
    }
}