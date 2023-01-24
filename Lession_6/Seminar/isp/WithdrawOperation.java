package Seminar.isp;

public class WithdrawOperation {
    private WithdrawSumUI withdrawSumUI;

    public WithdrawOperation(WithdrawSumUI withdrawSumUI) {
        this.withdrawSumUI = withdrawSumUI;
    }

    public void execute () {
        int amount = withdrawSumUI.getWithrawSum();
        System.out.println("Заберите деньги");
    }
}
