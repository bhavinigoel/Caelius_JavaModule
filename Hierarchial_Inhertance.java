public class Main {
class Account {
    void openAccount() {
        System.out.println("Account opened");
    }
}

class SavingsAccount extends Account {
    void addInterest() {
        System.out.println("Interest added to savings account");
    }
}

class CurrentAccount extends Account {
    void overdraftFacility() {
        System.out.println("Overdraft facility available");
    }
}


    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        sa.openAccount();
        sa.addInterest();

        CurrentAccount ca = new CurrentAccount();
        ca.openAccount();
        ca.overdraftFacility();
    }
}
