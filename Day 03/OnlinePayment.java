// Abstract class provides common functionality for online payments
abstract class OnlinePayment implements Payment {

    // Encapsulation:
    // transactionId is private, so it cannot be accessed directly
    // from outside this class
    private String transactionId;

    // Constructor to initialize transactionId
    public OnlinePayment(String transactionId) {
        this.transactionId = transactionId;
    }

    // Getter provides controlled access to transactionId
    public String getTransactionId() {
        return transactionId;
    }

    // Abstract method
    // Child classes must provide their own implementation
    abstract void validatePayment();
}