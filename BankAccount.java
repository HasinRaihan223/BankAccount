public class BankAccount{
  private double balance;
  private int accountID;
  private String password;

  public BankAccount(int accountID, String password){
    balance = 0;
    this.accountID = accountID;
    this.password = password;
  }

  public String toString(){
    return "#" + accountID + " \t" + "$" + balance;
  }

  public double getBalance(){
    return balance;
  }

  public int getAccountID(){
    return accountID;
  }

  public void setPassword(String newPass){
    password = newPass;
  }

  public boolean deposit(double amount){
    if (amount >= 0){
      balance += amount;
      return true;
    }
    else return false;
  }

   public boolean withdraw(double amount){
     if (amount >= 0 && amount < balance){
       balance -= amount;
       return true;
     }
     else if (balance < amount){
       return false;
     }
     else return false;
   }

}
