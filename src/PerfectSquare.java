import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer");
        int num = scanner.nextInt();

        int flag=0;
        for (int i=1; i<=num; i++){
            if (num==i*i){
                flag=1;
                break;
            }
        }

        if (flag==1) {
            System.out.print(num + " is a Perfect Square");
        } else {
            System.out.print(num + " is not a Perfect Square");
        }
    }
}
