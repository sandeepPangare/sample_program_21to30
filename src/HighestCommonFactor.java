public class HighestCommonFactor {
    public static void main(String[] args) {


        int num1 = 30, num2 = 60, HCF=0;  //

        for (int i = 1; i <= num1 || i <= num2; i++)
        {
            if (num1 % i == 0 && num2 % i == 0)
                HCF = i;
        }

        System.out.println("The HCF: "+ HCF);
    }
}
