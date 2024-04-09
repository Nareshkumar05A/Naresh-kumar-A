import java.util.*;

class Dose {
    public static void main(String[] args) {
        Naresh f = new Naresh();
        f.kumar();
    }
}

class Main {

    int balance = 10000;
    void car() {
        System.out.println("Balance: " + balance);
    }
}

class Naresh {
    public void kumar() {
        System.out.println("Balance");
        System.out.println("Deposit");
        System.out.println("Withdraw");
        Scanner m = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        char n = m.next().charAt(0);
        if (n == 'D' || n == 'd') {
            Don g = new Don();
            g.load();
        }
        if (n == 'W' || n == 'w') {
            Don j = new Don();
            j.draw();
        }
        if (n == 'B' || n == 'b') {
            Main l = new Main();
            l.car();
        }
    }
}

class Don extends Main {
    public void load() {
        Scanner m = new Scanner(System.in);
        System.out.println("Enter your deposit amount: ");
        long dep_amt = m.nextLong();
        long bal = balance + dep_amt;
        System.out.println("Total amount: " + bal);
        Scanner x = new Scanner(System.in);
        System.out.print("Do you want to use the ATM again? (yes/no): ");
        char o = x.next().charAt(0);
        if (o == 'Y' || o == 'y') {
            Naresh z = new Naresh();
            z.kumar();
        }
    }


    public void draw() {
        Scanner m = new Scanner(System.in);
        System.out.println("Enter your withdraw amount: ");
        long with = m.nextLong();
        if (balance < with) {
            System.out.println("Your withdraw amount is too big. Showing your balance: " + balance);
        } else {
            long baln = balance - with;
            System.out.println("Total balance amount: " + baln);
            balance = (int) baln; // Update balance
        }
        Scanner x = new Scanner(System.in);
        System.out.print("Do you want to use the ATM again? (yes/no): ");
        char o = x.next().charAt(0);
        if (o == 'Y' || o == 'y') {
            Naresh z = new Naresh();
            z.kumar();
        }
    }
}
