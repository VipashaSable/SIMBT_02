import java.util.HashMap;
import java.util.Map;

public class ATMOperationImplementation implements ATMOperationInterface {
    ATM atm = new ATM();
    Map<Double, String> ministat = new HashMap<>();

    @Override
    public void ViewBalance() {
        System.out.println("Available Balance is : " + atm.GetBalance());
    }

    @Override
    public void WithdrawAmt(double WithdrawAmt) {
        if (WithdrawAmt % 500 == 0) {
            if (WithdrawAmt <= atm.GetBalance()) {
                ministat.put(WithdrawAmt, " Amount Withdrawn");
                System.out.println("Collect the cash " + WithdrawAmt);
                atm.setBalance(atm.GetBalance() - WithdrawAmt);
                ViewBalance();
            } else {
                System.out.println("Insufficient Balance!!!");
            }
        } else {
            System.out.println("Please enter the amount in multiple of 500");
        }
    }

    @Override
    public void DepositAmt(double DepositAmt) {
        ministat.put(DepositAmt, " Amount Deposited");
        System.out.println(DepositAmt + " Deposited Successfully!!");
        atm.setBalance(atm.GetBalance() + DepositAmt);
        ViewBalance();
    }

    @Override
    public void ViewMiniStatement() {
        for (Map.Entry<Double, String> m : ministat.entrySet()) {
            System.out.println(m.getKey() + "" + m.getValue());
        }
    }
}
