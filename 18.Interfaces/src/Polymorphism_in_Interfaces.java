interface Bank {

    void interestRate();
}

class SBI implements Bank{

    public void interestRate(){
        System.out.println("7%");
    }

    public void loan(){
        System.out.println("Home Loan");
    }
}

class HDFC implements Bank {

    public void interestRate() {
        System.out.println("HDFC : 6.5%");
    }
}

public class Polymorphism_in_Interfaces {

    public static void main(String[] args) {

        Bank bank;

        bank = new SBI();
        bank.interestRate();

        // bank.loan(); // error -> Only Interface Methods Can Be Called

        bank = new HDFC();
        bank.interestRate();
    }
}
