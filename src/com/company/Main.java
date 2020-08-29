package com.company;

public class Main {

    public static void main(String[] args) {

//        1.
        System.out.println(true && false);
        System.out.println(true || false);
        System.out.println(false && false);
        System.out.println(true && (false || true));
        System.out.println(false || (true && false));
        System.out.println(false || 1 < 5);
        System.out.println(5 >= 4 && 1 > 3);
        System.out.println(10 < 4 || 1 > 4);
        System.out.println(12 >= 2 && 1 < 24);
        System.out.println("Hello".charAt(0) == 'h');

//        2.	In Eclipse, create the following Boolean variables and choose what values they hold:
//        a.	isHotOutside
//        b.	isWeekday
//        c.	hasMoneyInPocket

        boolean isHotOutside = true;
        boolean isWeekday =  false;
        boolean hasMoneyInPocket = true;

//        3.	Create the following variables (not boolean type, choose the best data type for the variable):
//        a.	costOfMilk
//        b.	moneyInWallet
//        c.	thirstLevel (how thirsty you are on a scale of 1-10)

        double costOfMilk = 3.50;
        System.out.println(costOfMilk);

        int moneyInWallet = 20;
        System.out.println(moneyInWallet);

        int thirstLevel = 6;
        System.out.println(thirstLevel);

//        4.	Using the variables you created above and Boolean operators, create variables for the following scenarios:
//        a.	shouldBuyIceCream – this should be true if it is hot outside and there is money in your pocket
//        b.	willGoSwimming – this should be true if it is hot outside and it is not a weekday
//        c.	isAGoodDay – this should be true if it is hot outside, there is money in your pocket, and it is not a weekday
//        d.	willBuyMilk – this should be true if it is hot outside, and thirstLevel is greater than or equal to 3, and moneyInWallet is greater than or equal to 2 times the cost of milk.

        boolean shouldBuyIceCream = hasMoneyInPocket && isHotOutside;
        System.out.println(shouldBuyIceCream);

        boolean willGoSwimming = isHotOutside && !isWeekday;
        System.out.println(willGoSwimming);

        boolean isAGoodDay = isHotOutside && hasMoneyInPocket && !isWeekday;
        System.out.println(isAGoodDay);

        boolean WillBuyMilk = isHotOutside && (thirstLevel >=3) && (moneyInWallet >= (costOfMilk*2));
        System.out.println(WillBuyMilk);






    }
    }

