//Write a program to output the largest and smallest numbers from a list entered by the user. The end of the list of numbers will be indicated by the value 9999.

import java.util.Scanner;

public class LargestAndSmallest
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        int largest = 1000;
        int smallest = -1000;
        int number;

        System.out.println("Enter numbers (end the input with 9999): ");

        while(true)
        {
            number = scanner.nextInt();
            
            if(number == 9999)
            {
                break;
            }

            if (number > largest)
            {
                largest = number;
            }

            if (number < smallest)
            {
                smallest = number;
            }
        }

        if (largest == 1000 && smallest == -1000) 
        {
            System.out.println("No numbers were entered or Numbers are not exceeding the ranges defined.");
        } 
        else
        {
            System.out.println("Largest number: " + largest);
            System.out.println("Smallest number: " + smallest);
        }
        scanner.close();
    }
}