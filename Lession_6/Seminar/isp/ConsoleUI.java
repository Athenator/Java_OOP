package Seminar.isp;

import java.util.Scanner;

public class ConsoleUI implements DepositSumUI,TransferUI,WithdrawSumUI{
    private Scanner scanner;

    public ConsoleUI(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public int getWithrawSum() {
        System.out.println("Сколько снять? ");
        return scanner.nextInt();
    }

    @Override
    public int getTransferSum() {
        System.out.println("Сколько положить? ");
        return scanner.nextInt();
    }

    @Override
    public String getTransferTarget() {
        System.out.println("Кому перевести? Введите ФИО:  ");
        return scanner.nextLine();
    }

    @Override
    public int getDepositSum() {
        System.out.println("Сколько Перевести? ");
        return scanner.nextInt();
    }

    
}
