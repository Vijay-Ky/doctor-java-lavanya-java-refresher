//Write a program to output the average of a list of numbers. The end of the list of numbers will be indicated by the value 9999.

import java.util.Scanner;

public class AverageCalculator
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        int count = 0;
        double sum = 0;
        int number;
        
        System.out.println("Enter numbers to calculate the average (end the input with 9999):");
        
        while (true)
        {
            number = scanner.nextInt();
            
            if (number == 9999)
            {
                break;
            }
            
            sum += number;//sum = sum + number
            count++;// count = count + 1;
        }
        
        if (count == 0) 
        {
            System.out.println("No numbers were entered.");
        } 
        else 
        {
            double average = sum / count;
            System.out.println("Average: " + average);
        }
        
        scanner.close();
    }
}
