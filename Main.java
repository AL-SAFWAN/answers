package com.company;

import java.util.Scanner;

public class Main {

    public int x ;
    public int y ;
    public static int z ;



    public static void main(String[] args) {
        // options
        System.out.println("what arithmetic operation do you want to use (use symbols - * or +) ");
        Scanner symbol = new Scanner(System.in);
        String using = symbol.nextLine();



        //scan for number
        Scanner scanOne = new Scanner(System.in);
        System.out.println("Type in the 1st number : ");
        int y = scanOne.nextInt();

        Scanner scanTwo = new Scanner(System.in);
        System.out.println("Type in the 2nd number : ");
        int x = scanTwo.nextInt();


        //if a third number is required
        System.out.println("Do you require a third number (use answers - y or n)");
        Scanner thirdNumber = new Scanner(System.in);
        String require = thirdNumber.nextLine();


        if (require.equals("y") && using.equals("+")){

            Scanner scanThree = new Scanner(System.in);
            System.out.println("Type in the 3rd num+ber : ");
            int z = scanThree.nextInt();
            sumOfTwoNumbers.theSum( x, y, z);


        }else if (require.equals("n") && using.equals("+")){
            int z=0;
            sumOfTwoNumbers.theSum( x, y, z);
        }


        if (require.equals("y") && using.equals("*")){

            Scanner scanThree = new Scanner(System.in);
            System.out.println("Type in the 3rd num+ber : ");
            int z = scanThree.nextInt();
            SumOfMuiltiples.theSum( x, y, z);


        }else if (require.equals("n") && using.equals("*")){

            SumOfMuiltiples.Sum( x, y);
        }



    }

}
