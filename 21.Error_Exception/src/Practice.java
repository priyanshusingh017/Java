class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(String message ){
        super(message);
    }
}

class BankAccount{

    private double balance;
    public BankAccount(double balance){
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException{
        if(amount<=0){
            throw new IllegalArgumentException("Withdrawal amount must be greater than 0");
        }
        if(amount>balance){
            throw new InsufficientBalanceException("Insufficient Balance: " + balance);
        }
        balance -= amount;

        System.out.println("Withdraw Successful: " + amount);
        System.out.println("Remaining Balance: " + balance);
    }
}

public class Practice {

    static void numberformat(String number){

        try {
            int num = Integer.parseInt(number);
        }
        catch (NumberFormatException e){
            System.out.println("Number Format Error");
            System.out.println(e.getMessage());
        }
    }

    static void checkName(){

        String name = null;
        try{
            System.out.println(name.length());
        }
        catch (NullPointerException e){
            System.out.println("Null Pointer Exception");
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args){
        BankAccount bankAccount = new BankAccount(5000);

        try{
            bankAccount.withdraw(-500);
        }
        catch(InsufficientBalanceException e){
            System.out.println("Message");
            System.out.println(e.getMessage());

            System.out.println("To String");
            System.out.println(e.toString());

            System.out.println("Cause");
            System.out.println(e.getCause());

            System.out.println("print stack ");
            e.printStackTrace();
        }
        catch(IllegalArgumentException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("Some other exception");
        }
        finally{
            System.out.println("Transaction process completed");
        }

        numberformat("abc");
        
        checkName();
    }
}
