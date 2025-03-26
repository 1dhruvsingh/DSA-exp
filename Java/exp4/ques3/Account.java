
class Account{
    String accountNumber ;
    double balance; 

     Account(String  AccountNumber, double balance) {
        if (accountNumber == null || accountNumber.isEmpty()){
           System.out.println("Acount invalid");
        }
        if (balance<0){
            System.out.println("no balance");
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    
}