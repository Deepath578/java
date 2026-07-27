abstract class Payment {
    protected double amount;

    Payment(double amount) {
        this.amount = amount;
    }

    // abstract method
    abstract void pay();

    // Normal method
    void receipt() {
        System.out.println("Receipt generated");
        System.out.println("Amount paid: " + amount);
    }

    // Normal method
    void showPaymentStatus() {
        System.out.println("Payment successful");
    }
}

class UpiPayment extends Payment {
    private String upiId;

    UpiPayment(double amount, String upiId) {
        super(amount);
        this.upiId = upiId;
    }

    @Override
    void pay() {
        System.out.println("Processing UPI payment...");
        System.out.println("UPI ID: " + upiId);
    }
}

class CreditCardPayment extends Payment {
    private String cardNumber;

    CreditCardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    void pay() {
        System.out.println("Processing credit card payment...");
        System.out.println("Card Number: " + cardNumber.substring(Math.max(0, cardNumber.length() - 4)));
    }
}

class CardPayment extends Payment {
    private String cardNumber;

    CardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    void pay() {
        System.out.println("Processing card payment...");
        System.out.println("Card Number: " + cardNumber.substring(Math.max(0, cardNumber.length() - 4)));
    }
}

public class main{
    public static void main(String[] args) {
        Payment p1 = new UpiPayment(550.50, "deepath@okbi");
        Payment p2 = new CardPayment(1250.50, "1234567812345678");

        p1.pay();
        p1.receipt();
        p1.showPaymentStatus();

        System.out.println();

        p2.pay();
        p2.receipt();
        p2.showPaymentStatus();
    } }
                
