import java.sql.SQLOutput;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
//task 1
        System.out.println("Increasing");
        for (int r = 0; r < 31; r++) {
            System.out.println("" + r);
        }
//task 2
        System.out.println("Decreasing");
        for (int r = 30; r > -1; r--) {
            System.out.println("" + r);
        }
        //Task 3
        System.out.println("Plus 3");
        for (int r = 0; r < 19; r += 3) {
            System.out.println("" + r);
        }
        //Task 4
        System.out.println("Decreasing by 2");
        for (int r = 10; r > -1; r -= 2) {
            System.out.println("" + r);
        }
        //Task 5
        System.out.println("Increasing *");
        for (int r = 1; r <= 5; r++)
        {
            for (int j = 1; j <= r; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        //Task6
        System.out.println("Decreasing *");
        for (int r1 = 5; r1 >= 1; r1--)
        {
            for (int j1 = r1; j1 >= 1; j1--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        //Task7
        System.out.println("Five *");
        for (int r = 1; r <= 5; r++)
        {
            for (int i = 1; i <= 5; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //Task 8 C - F Conerverter
        Scanner in = new Scanner(System.in);
        System.out.println("C-F Converter");
        double temp = 0;
        String validTemp = "n";
        Scanner insa = new Scanner(System.in);

        do
        {
            temp = 0;
            System.out.println("Enter temperature in Celsius: ");
            if (in.hasNextDouble())
            {
                validTemp = "y";
                temp = in.nextDouble();
            }
            else
            {
                System.out.println("Please enter temperature in Celsius [XX.XX]");
                validTemp = "n";
                in.nextLine();
            }
        }
        while ((validTemp.equals("n")));

        temp = (temp * 1.8) + 32;
        if (temp >= 100)
        {
            System.out.println("Temperature is boiling at " + temp + " Fahrenheit");
        } else if (temp <= 0)
        {
            System.out.println("Temperature is freezing at " + temp + " Fahrenheit");
        }
        else
        {
            System.out.println("Temperature in Fahrenheit is " + temp);
        }
    }
}