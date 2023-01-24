package Seminar.isp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DepositSumUI sumUI = new ConsoleUI(new Scanner(System.in));
        DepositOperation dOp = new DepositOperation(sumUI);
        dOp.execute();

        TransferUI traUI = new ConsoleUI(new Scanner(System.in));
        TransferOperation tOp = new TransferOperation(traUI);
        tOp.execute();
    }
}
