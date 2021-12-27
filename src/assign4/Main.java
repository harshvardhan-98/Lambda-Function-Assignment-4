package assign4;

import java.util.Scanner;

interface AllNumbersProduct{
    int Result(long x,long y);
}

public class Main {
    public static void main(String...args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x= sc.nextInt();
        System.out.print("Enter second number: ");
        int y= sc.nextInt();
        AllNumbersProduct obj = (a,b) -> {
            int res = 1;
            while (a < b)
                res *= b--;
            return res;
        };
        System.out.println(obj.Result(x,y));
    }
}