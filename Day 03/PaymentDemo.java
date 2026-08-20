public class PaymentDemo {

    public static void main(String[] args) {

        // Polymorphism:
        // Parent/interface reference pointing to child object
        Payment payment;

        // Payment reference points to CreditCardPayment object
        payment = new CreditCardPayment(
                "TXN101",
                "123456789"
        );

        // Java calls CreditCardPayment's pay() method
        payment.pay(5000);

        System.out.println();

        // Same Payment reference now points to UPIPayment object
        payment = new UPIPayment(
                "TXN102",
                "kannan@upi"
        );

        // Java calls UPIPayment's pay() method
        payment.pay(2500);
    }
}