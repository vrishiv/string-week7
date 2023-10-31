package hw_wk_8;

import java.util.Scanner;

public class Commission {

    public static void main(String[] args) {
//        Scanner text = new Scanner (System.in);
//        System.out.println("Seller's name");
//        int a = text.nextInt();
//        System.out.println("Seller ID");
//        double CommissionRate = 0;
        double TotalSales, Commission = 5;
        Scanner Read = new Scanner (System.in);
        System.out.println("Please enter total sales ");
        TotalSales=Read.nextDouble();

        double CommissionRate = TotalSales*Commission/100;
        if (TotalSales>=50000)

        {
            CommissionRate=35;
            CommissionRate = TotalSales * 0.35;
            System.out.println("CommissionRate"+"rate" + "/");
            System.out.println("The Commision is: "+ Commission);
        }
        else {
            if (TotalSales>=30000 && TotalSales <20000)
            {
                CommissionRate=20;
                Commission = TotalSales * 0.20;
                System.out.println("CommissionRate"+"rate" + "/");
                System.out.println("The Commision is: "+ Commission);
            }
            else {
                if (TotalSales>=20000 && TotalSales <10000)
                {
                    CommissionRate=10;
                    Commission = TotalSales * 0.10;
                }
                else if (TotalSales< 10000)
                {
                    CommissionRate=5;
                    Commission = TotalSales * 0.5;
                }
                System.out.println("CommissionRate"+"rate" + "/");
                System.out.println("The Commision is: "+ Commission);
            }
        }
    }
}
