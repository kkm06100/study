package com.gdsc.springjwt.controller;

import java.util.Scanner;

public class MoneyLeft {
    public static int getMoney(int money){
        return (money/500) + ((money%500)/100) + ((money%100)/50) + ((money%50)/10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int money = scanner.nextInt();
        System.out.println(getMoney(money));
    }
}
