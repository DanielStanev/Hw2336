/************************************

 Author:         Daniel Stanev
 Course:         CS 2336.0w3
 Date:           8 Jul 2021
 Assignment:     Homework #04 Exercise #03
 Version:        Java SE 11 (LTS)

 Description: Account Class for
 exercises 3 and 6.

 *************************************/

public class Account {
    // data fields
    private int id = 0;
    private double balance = 0;
    private static double annualInterestRate = 0;
    private java.util.Date dateCreated = new java.util.Date();

    // constructors
    Account() {}
    Account(int id, double balance, double annualInterestRate) {
        setId(id);
        setBalance(balance);
        setAnnualInterestRate(annualInterestRate / 100);
    }
    // accessor methods
    public int getId()                      { return id;                    }
    public double getBalance()              { return balance;               }
    public double getAnnualInterestRate()   { return annualInterestRate;    }
    public java.util.Date getDateCreated()  { return dateCreated;           }

    // mutator methods
    public void setId(int id)                                    { this.id = id;                                 }
    public void setBalance(double balance)                       { this.balance = balance;                       }
    public void setAnnualInterestRate(double annualInterestRate) { Account.annualInterestRate = annualInterestRate; }

    // utility methods
    public double getMonthlyInterestRate()  { return annualInterestRate / 12;               }
    public double getMonthlyInterest()      { return balance * (annualInterestRate / 12);   }
    public void withdraw(double amount)     { balance -= amount; }
    public void deposit(double amount)      { balance += amount; }
}
