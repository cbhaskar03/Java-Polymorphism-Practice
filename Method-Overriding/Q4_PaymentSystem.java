class Payment {

    void pay() {
        System.out.println("Making payment");
    }
}

class UPIpayment extends Payment {

    void pay() {
        System.out.println("Payment made using UPI");
    }
}

class CardPayment extends Payment {

    void pay() {
        System.out.println("Payment made using Card");
    }
}

class CashPayment extends Payment {

    void pay() {
        System.out.println("Payment made using Cash");
    }
}

class Main {

    public static void main(String[] args) {

        Payment p;

        p = new UPIpayment();
        p.pay();

        p = new CardPayment();
        p.pay();

        p = new CashPayment();
        p.pay();
    }
}
