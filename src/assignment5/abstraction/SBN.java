package assignment5.abstraction;

public abstract class SBN {

    abstract double getInterestRate();

    public void annualReport(){
        System.out.println("Please send your annual report by january 15");
    }
    public double getLoanAmount(int amount){
          double interest = (getInterestRate()/365)*amount*90;
          double getLoanAmount =(interest+amount);
          return getLoanAmount ;
          }
    }

