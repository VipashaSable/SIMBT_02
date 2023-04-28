public class ATM {
    private double Balance;
    private double DepositAmt;
    private double WithdrawAmt;

    //default constructor
    public ATM() {
    }

    //getter setter
    public double GetBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public double getDepositAmt() {
        return DepositAmt;
    }

    public void setDepositAmt(double depositAmt) {
        DepositAmt = depositAmt;
    }

    public double getWithdrawAmt() {
        return WithdrawAmt;
    }

    public void setWithdrawAmt(double withdrawAmt) {
        WithdrawAmt = withdrawAmt;
    }
}
