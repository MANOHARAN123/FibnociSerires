import java.util.Scanner;
public class fibn
{
    static int fibonacciCalc(int num){
        if (num<=1){
            return num;
        }
        return (fibonacciCalc(num-1)+fibonacciCalc(num-2));
    }
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        System.out.println(fibonacciCalc(num));
    }
}
