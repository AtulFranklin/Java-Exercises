public class Account{
    String owner;
    double balance;

    public Account(String accowner, double startingBalance){
        owner = accowner;
        balance = startingBalance;
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposited " + amount + ". New balance: " + balance);
    }

    public void withdraw(double amount){
        if(balance < amount){
            System.out.println("Insufficient funds. Balance: " + balance);
        } else {
            balance -= amount;
            System.out.println("Withdrew " + amount + ". New balance: " + balance);
        }    
    }

    public void printSummary(){
        System.out.println("Owner: "+ owner + " | Balance: "+ balance);
    }
    
    public static void main(String[] args) {
        Account acc1 = new Account("Alice", 100.0);
        Account acc2 = new Account("Bob", 0.0);
        acc1.deposit(50);
        acc1.withdraw(30);
        acc1.withdraw(500);
        acc1.printSummary();
        acc2.withdraw(10);
        acc2.deposit(25.5);
        acc2.printSummary();
    }
}