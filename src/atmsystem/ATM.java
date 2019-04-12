package atmsystem;

/**
 *
 * @author shaim
 */
public class ATM {
    final static String[] ACCOUNT_TYPES = {"Debit", "Credit", "Saving"};
   private long accountNumber;
   private String accountUserName;
   private String accountPassword;
   private double accountBalance;
   private String accountType;
   
    final static String[] ATM_OPTIONS = {"login","deposit","withdraw"};

    private static ATM onlyObject = null;
    private ATM()
    {}
    public static ATM getInstance()
    {
        if (onlyObject == null)
            onlyObject = new ATM();
        return onlyObject;
    }
    /**
     * @return the accountNumber
     */
    public long getAccountNumber() {
        return accountNumber;
    }

    /**
     * @param accountNumber the accountNumber to set
     */
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * @return the accountUserName
     */
    public String getAccountUserName() {
        return accountUserName;
    }

    /**
     * @param accountUserName the accountUserName to set
     */
    public void setAccountUserName(String accountUserName) {
        this.accountUserName = accountUserName;
    }

    /**
     * @return the accountPassword
     */
    public String getAccountPassword() {
        return accountPassword;
    }

    /**
     * @param accountPassword the accountPassword to set
     */
    public void setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
    }

    /**
     * @return the accountBalance
     */
    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     * @param accountBalance the accountBalance to set
     */
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    /**
     * @return the accountType
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * @param accountType the accountType to set
     */
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
}
