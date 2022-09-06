import java.util.Scanner;

public class AbudantNumber {
    public static void main(String[] args) {  //12 Proper divisors are 1,2,3,4,6
        int number, sum=0, x;                   //sum of divisors is 16 so abudant num is 16-12=4
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        number = Scanner.nextInt();

        for (int i=1; i<number; i++){
            if (number % i == 0) {
                sum = sum + i;
            }
        }
        if (sum > number) {
            System.out.println("Given number is Abundant number");
            x = sum - number;
            System.out.println("Abudant number is " + x);
        }else
            System.out.println("Given number is Not Abundant number");
        }
}
