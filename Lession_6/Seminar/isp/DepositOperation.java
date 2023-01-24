package Seminar.isp;

public class DepositOperation {
    private DepositSumUI depositSumUI;

    public DepositOperation(DepositSumUI depositSumUI) {
        this.depositSumUI = depositSumUI;
    }

    public void execute () {
        int amount = depositSumUI.getDepositSum();
        System.out.println("Деньги зачислены на счет");
    }

}
