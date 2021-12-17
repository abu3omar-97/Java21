package Bank;

public class BankAccount {
    // WHAT IT HAS? (What variables make up a bank account?)
    private double balance;
//    String accountHolderName;
//    String accountHolderPhoneNumber;
//    String accountHolderAddress;
    private AccountHolder accountHolder;
    private String password;
    private static int numberOfAccounts;

    // What methods can you call on a bank account instance?
    public BankAccount() {
        this(0,"0000");
        System.out.println("FIRST CONST");
        numberOfAccounts++;
        this.accountHolder = new AccountHolder();
        this.accountHolder.setAccountHolderName("Holder"+numberOfAccounts);
    }

    public BankAccount(double balance, String password) {
        this(balance, null, password);
        System.out.println("SECOND CONST");
        this.balance = balance;
        this.password = password;
    }

    public BankAccount(double balance, AccountHolder accountHolder, String password) {
        System.out.println("THIRD CONST");
        this.balance = balance;
        this.accountHolder = accountHolder;
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AccountHolder getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(AccountHolder accountHolder) {
        this.accountHolder = accountHolder;
    }

/**
 * Method: Withdraw
 * -------------------------
 * Tries to take money out of the account. Makes sure that there is
 * sufficient funds. Returns whether or not the withdrawal was successful
 */
public boolean withdraw(double amount){
    if(amount<0) amount *= -1;
    if(amount >= this.getBalance()) return false;
    this.setBalance(this.balance-amount);
    return true;
}

/**
 * Method: Deposit
 * -------------------------
 * Puts money into the bank account!
 */
public boolean deposit(double amount){
    if(amount<0) amount *= -1;
    this.setBalance(this.balance+amount);
    return true;
}


/**
 * Method: Check Balance
 * -------------------------
 * returns the amount of money in this account.
 */



/**
 *
 * Method: Transfer
 * -------------------------
 * transfers money from one account to another.
 */
public boolean transfer(double amount, BankAccount otherAccount){
    boolean withdrawResult = this.withdraw(amount);
    boolean depositResult = otherAccount.deposit(amount);
    return  withdrawResult && depositResult;
}


/**
 * Method: To String
 * -------------------------
 * Returns a string that contains the bankAccounts info (except password)
 */
/**
 * Method: Check Password
 * -------------------------
 * Returns true if the given password matches the actual password.
 */



}
