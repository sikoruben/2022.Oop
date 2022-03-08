package oop.labor02;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //bank feladatok
        BankAccount account1 = new BankAccount("OTP00001");
        System.out.println(account1.getAccountNumber()+": "+account1.getBalance());
        account1.deposit(1000);
        System.out.println(account1.getAccountNumber()+": "+account1.getBalance());
        boolean result = account1.withdraw(500);
        if( !result ){
            System.out.println("you do not have ");
        }
        System.out.println(account1.getAccountNumber()+": "+account1.getBalance());
        //rectangle feladatok
        double totalArea=0;
        Rectangle[] rectangles = new Rectangle[ 10 ];
        Random rand = new Random();
        for(int i=0;i<10;i++){
            double length = 1 + rand.nextInt(10);
            double width = 1 + rand.nextInt(10);
            rectangles [ i ] = new Rectangle(length,width);
            totalArea += rectangles [ i ].area(length,width);
        }
        System.out.println(totalArea);
        //DateUtil
        System.out.println(DateUtil.isValidDate(2000,2,29));
        System.out.println(DateUtil.isValidDate(2000,2, 30));
        System.out.println(DateUtil.isValidDate(1900,2, 29));
        System.out.println(DateUtil.isValidDate(1900,2, 28));
        System.out.println(DateUtil.isValidDate(-1900,2, 28));
        System.out.println(DateUtil.isValidDate(0,2, 28));
        System.out.println(DateUtil.isValidDate(2021,2, 29));
        System.out.println(DateUtil.isValidDate(2020,2, 29));
        System.out.println(DateUtil.isValidDate(2020,1, 32));
        System.out.println(DateUtil.isValidDate(2020,1, 0));
        System.out.println(DateUtil.isValidDate(2020,0, 0));
        System.out.println(DateUtil.isValidDate(2020,4, 31));
        System.out.println(DateUtil.isValidDate(2020,1, 31));

    }
}
