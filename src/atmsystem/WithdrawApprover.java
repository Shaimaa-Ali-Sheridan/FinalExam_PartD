/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmsystem;

/**
 *
 * @author shaim
 */
public class WithdrawApprover {
    
    public static boolean isOverDraftAllowed(double amount)
    {
        if (amount <= 200)
            return true;
        else
            return false;
    } 
    
}
