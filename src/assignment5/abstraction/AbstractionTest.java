package assignment5.abstraction;

public class AbstractionTest {
    public static void main(String[] args) {
        UBSBank bank = new UBSBank();
        System.out.println(bank.getInterestRate());
        bank.annualReport();
        System.out.println(bank.getLoanAmount(50000));

        SBN ubsBank = new UBSBank();  // we can create object in 2 ways;1)by using class name;2) by suing prent class name but variable name different.
        ubsBank.annualReport();       // it's not support all methods but if it is interface then support all.

        CreditSwiss creditSwiss = new CreditSwiss();
        System.out.println(creditSwiss.getInterestRate());
        creditSwiss.annualReport();
        System.out.println(creditSwiss.getLoanAmount(70000));

        MigrosBank migrosBank = new MigrosBank();
        migrosBank.getTotalAmount(80000);
        migrosBank.getMonthlyReport();
    }
}