public class BankAccountTester{
  public static void main(String[]args){
    BankAccount myAccount = new BankAccount(1000001, "pswd");
      System.out.println(myAccount.getBalance());
      System.out.println(myAccount.getAccountID());
      System.out.println(myAccount.toString());
  }
}
