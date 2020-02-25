public class SavingAccount {
 
    static double annuallInterestRate;
    static double savingsBalance;
    static double monthlyInterest;
 
    public SavingAccount(double savingsBalanceAccount) {
        savingsBalance = savingsBalanceAccount;
 
    }
 
    public void calculateMonthlyInterest() {
        monthlyInterest = (savingsBalance * annuallInterestRate) / 12;
        System.out.println("Your monthly interest is : " + monthlyInterest);
    }
 
    public static void modifyInterestRate(double interestRate) {
        annuallInterestRate = interestRate;
    }
 
    private void calculateSavings() {
        savingsBalance = savingsBalance + monthlyInterest;
    }
 
    public void displaySavings() {
        calculateSavings();
        System.out.println("Your total balance is : " + savingsBalance);
    }
 
}

This code goes in one class 2

public class TestClass{
 
     
    public static void main(String[] args) {
      // SavingAccount.annuallInterestRate=0.25;
        
      SavingAccount saver1 = new SavingAccount(2000.00);
      SavingAccount saver2 = new SavingAccount(3000.00);
        
       SavingAccount.modifyInterestRate(.04);
         
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        saver1.displaySavings();
        saver2.displaySavings();
         
        SavingAccount.modifyInterestRate(.05);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        saver1.displaySavings();
        saver2.displaySavings();
           
           
    }
     
}

