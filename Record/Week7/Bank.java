package records;

import java.util.Scanner;

class RBI {
    void getInterestRate() {
        System.out.println("RBI rate of interest is: 4%");
    }
}

class SBI extends RBI {
    void getInterestRate() {
        System.out.println("SBI rate of interest is: 7%");
    }
}

class ICICI extends RBI {
    void getInterestRate() {
        System.out.println("ICICI rate of interest is: 6%");
    }
}

class PNB extends RBI {
    void getInterestRate() {
        System.out.println("PNB rate of interest is: 5%");
    }
}

public class Bank {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Bank name: ");
        String bankName = sc.nextLine();

        if (bankName.equals("SBI")) {
            SBI s = new SBI();
            s.getInterestRate();
        }
        else if (bankName.equals("ICICI")) {
            ICICI i = new ICICI();
            i.getInterestRate();
        }
        else if (bankName.equals("PNB")) {
            PNB p = new PNB();
            p.getInterestRate();
        }
        else {
            RBI r = new RBI();
            r.getInterestRate();
        }

        sc.close();
    }
}