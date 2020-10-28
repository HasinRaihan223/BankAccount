public class BankAccountTester{
  public static void main(String[]args){
    BankAccount myAccount = new BankAccount(1000001, "pswd");
      System.out.println(myAccount.getBalance());
      System.out.println(myAccount.getAccountID());
      myAccount.setPassword("new pswd");
      System.out.println(myAccount.password);
      System.out.println(myAccount.deposit(1000));
      System.out.println(myAccount.deposit(-1000));
      System.out.println(myAccount.getBalance());
      System.out.println(myAccount.withdraw(-999));
      System.out.println(myAccount.withdraw(1001));
      System.out.println(myAccount.withdraw(999));
      System.out.println(myAccount.getBalance());
      System.out.println(myAccount.toString());
  }
}
