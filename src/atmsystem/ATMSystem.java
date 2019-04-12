package atmsystem;

import java.util.Scanner;

/**
 *
 * @author shaim
 */
public class ATMSystem {

   
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ATM atm = ATM.getInstance();
         //Display available options 
         System.out.println("Please choose the option number:");
         for (int i=0; i<ATM.ATM_OPTIONS.length; i++)
             System.out.println(i +" - " + ATM.ATM_OPTIONS[i]);
         
         Scanner sc = new Scanner (System.in);
         int option = sc.nextInt();
         if (option == 0)
         {
             System.out.println("Please enter user name:");
             String userName = sc.nextLine();
             atm.setAccountUserName(userName);
             
             System.out.println("Please enter password:");
             String password = sc.nextLine();
             atm.setAccountPassword(password);
         }
         else
         {
             if (option == 1)
             {
                 System.out.println("Please enter amount to deposit");
                 double newAmount = sc.nextDouble();
                 atm.setAccountBalance(atm.getAccountBalance() + newAmount);
                 System.out.println("New balance is:" + atm.getAccountBalance());
             }
             else
             {
                 if (option == 2)
                 {
                     System.out.println("Please enter amount to withdraw:");
                    double amount = sc.nextDouble();
                 
                    // make sure there's enough balance before withdrawal
                    double currentBalance = atm.getAccountBalance();
                    double balanceAfterWithdraw = currentBalance - amount;
                    if ( balanceAfterWithdraw > 0 )
                      atm.setAccountBalance(balanceAfterWithdraw);
                    else
                        System.out.println("Balance is not sufficient");
                 }
             }
         }
    }
    
}
