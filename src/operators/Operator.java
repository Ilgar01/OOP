package operators;

import java.util.Random;
import java.util.Scanner;

public class Operator {

    public static void main(String[] args) {

       //triangle(2);
       //fibonachiRecursion(10);
        //reverseNumber(-705600);
        //calculatePi(1000000);
       // stackOverFlow();
       // switchCase();

    }
    public static void triangle (int row){
        for (int i=0,c=1;i<row;i++,c+=2){
            for (int j=row-i;j>0;j--){
                System.out.print(" ");
            }
            for (int k=0;k<c;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static  int fibonachi=0;
   static int a=1;
    public static void fibonachiRecursion(int n){
        System.out.println(fibonachi);
        fibonachi = fibonachi + a;
        a=fibonachi-a;
        if(n==1)
            return;
        fibonachiRecursion(n-1);
    }
    public static void reverseNumber(int number){
        String convertToString="";
        int remainder;
        boolean isMinus=false;
        if (number==0){
            System.out.println(0);
            return;
        } else if (number<0) {
            number=-number;
             isMinus = true;
        }
        while((remainder=number%10)>=0&number!=0){
            number/=10;
            convertToString=convertToString+remainder;

        }
        int result = Integer.parseInt(convertToString);
        System.out.println(isMinus?-result:result);

    }
    public static void calculatePi(int n){
        double x, y;
        int counter=0;
        Random random = new Random();
        for (int i=0;i<n;i++){
            x= random.nextDouble();
            y= random.nextDouble();
            if(x*x+y*y<=1){
                counter++;
            }
        }
        System.out.println(4.0*counter/n);
        System.out.println(Math.PI);
    } static long startTime = System.nanoTime();
    public static void stackOverFlow(){
        System.out.println(System.nanoTime()-startTime);
        stackOverFlow();
    }
    public static void switchCase(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Gunu reqem olaraq daxil edin");
        int dayNumber = scan.nextInt();
        switch (dayNumber){
            case 1:
                System.out.println("Bazar ertesi"); break;
            case 2:
                System.out.println("Cersenbe axsami"); break;
            case 3:
                System.out.println("Cersenbe"); break;
            case 4:
                System.out.println("Cume axsami"); break;
            case 5:
                System.out.println("Cume"); break;
            case 6:
                System.out.println("Senbe"); break;
            case 7:
                System.out.println("Bazar"); break;
            default:
                System.out.println("bele bir gun yoxdur");
        }

    }
}
