import java.util.Scanner;

public class PrimeFactorsOfANumber {
    public static void main(String[] args) {

        int number; //factor of 540 is 2 then value become 270 so on
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter a number ::");
        number = Scanner.nextInt();

        System.out.println("Prime Factor of " +number+ " is");


        for (int i = 2; i < number; i++) {
            while (number % i == 0) {  //540%2 condition true
                System.out.print(i + ", ");  //Print factor is i 2,2,3,3,3,5
                number = number / i; // then next value is 270 , 135, 45, 15 , 5
            }
        }

        if (number > 2) {
            System.out.print(number);
        }
    }
}
