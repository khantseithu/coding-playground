public class BankAccount {
    int accNum;
    float accBal;
    String accName;
    String email;

    int phoneNum;

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setAccBal(float accBal) {
        this.accBal = accBal;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAccNum(int accNum){
        this.accNum = accNum;
    }
    public int getPhoneNum(){
        return phoneNum;
    }
    public int getAccNum() {
        return accNum;
    }

    public float getAccBal() {
        return accBal;
    }

    public String getAccName() {
        return accName;
    }

    public String getEmail() {
        return email;
    }

    public void withdraw(float withdrawAmt){
        if(accBal - withdrawAmt < 0){
            System.out.println("You can't withdraw sir.");
        } else {
            accBal -= withdrawAmt;
        }
    }

    public void deposit(float depositAmt){
        accBal += depositAmt;
    }
}
