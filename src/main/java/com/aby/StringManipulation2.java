package com.aby;

import java.util.Scanner;

public class StringManipulation2
{

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your text: ");
        String name = input.nextLine();

        int index_tracker = 0;

        for (int i = 0; i<=name.length(); i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print(name.charAt(index_tracker));
                index_tracker++;

                if (index_tracker >= name.length())
                {
                    System.out.print("");
                    return;
                }
              /*  while (index_tracker <= name.length())
                {

                    System.out.print(name.charAt(index_tracker));
                    index_tracker ++;

                }
               */
            }

            System.out.println();
        }
    }

}