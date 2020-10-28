public class BankAccount{
  double balance;
  int accountID;
  String password;

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

}
