import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) { //input '6'8 ----> 1 2 3 4 5 the divisible num 1+2+3=6 is perfect num

        int n, sum = 0;
        System.out.println("Enter a Number ");

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;

            }
        }
        if (n == sum)
            System.out.println(n+" is perfect number");
        else
            System.out.println(n+" is not a perfect number");

    }
}
