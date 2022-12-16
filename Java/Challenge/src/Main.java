public class Main {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.setAccBal(200f);
        System.out.println("my balance: "+ myAcc.accBal);
        myAcc.deposit(300f);
        System.out.println("After deposit: "+myAcc.accBal);
        myAcc.withdraw(1000);
        System.out.println("After withdraw: "+ myAcc.accBal);
    }
}