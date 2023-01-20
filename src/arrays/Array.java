package arrays;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // metodArray( new int[]{1,2,3}) true
        // metodArray({1,2,3}) false ( type info missing )
         // scrollToRight(new int[]{1,2,3,4},2);
       // addToArray(new int[]{1,3,5,7,9},new int[]{2,4,6,8});
        //unicArray(new int[]{3,3,3,56,43,0,3,56,43,1,2,3,4});
        eratosthenes(1000000);
        //primeDivision(103);
        //eratosthenes2(1000000);



    }
    public static void scrollToRight(int[] array, int scroll){
        int a,i;
        scroll%=array.length;
        for (i =0; i<scroll; i++){
            a=array[array.length-scroll+i];
            for (int j=array.length-scroll+i; j>i;j--){
                array[j]=array[j-1];
            }
            array[i]=a;
        }
        System.out.println(Arrays.toString(array));
    }
    public static void addToArray(int[] array, int[] array2){
        int[] copyArray = Arrays.copyOf(array,array.length+array2.length);
        int j=0;
        for(int i: array2){
            copyArray[array.length+j]=i;
            j++;
        }
        Arrays.sort(copyArray);
        System.out.println(Arrays.toString(copyArray));
    }
    public static void unicArray(int[] array){
        int[] unicArray={array[0]};
        boolean isNotThere;
        for(int i=1; i<array.length;i++){
            isNotThere=true;
            for(int j:unicArray){
                if(array[i]==j){
                    isNotThere=false;
                    break;
                }
            }
            if(isNotThere){
                unicArray=Arrays.copyOf(unicArray,unicArray.length+1);
                unicArray[unicArray.length-1]=array[i];
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(unicArray));
    }
    public static int[] eratosthenes(int n){
        long start = System.currentTimeMillis();
        int[] primeNumbers = {2};
        boolean isPrime;
        for(int i=3;i<=n;i++){
            isPrime=true;
            for(int j=0;j<primeNumbers.length;j++){
                if(i%primeNumbers[j]==0 | i%2==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime) {
                primeNumbers = Arrays.copyOf(primeNumbers, primeNumbers.length + 1);
                primeNumbers[primeNumbers.length - 1] = i;
            }
        }
        System.out.println(Arrays.toString(primeNumbers));
        long end=System.currentTimeMillis();
        System.out.println(end-start);
        return primeNumbers;
    }
    public static void primeDivision(int n){
        int[] primeNumbers = eratosthenes(n);
        if(n==primeNumbers[primeNumbers.length-1]){
            System.out.println("this is prime number");
            return;
        }
        int i=0;
        int j=0;
        String result="";
        while(n>1){
            while(n%primeNumbers[i]==0) {
                n /= primeNumbers[i];
                j++;
            }
             if(j!=0){
                result+=primeNumbers[i]+"^"+j+"*";
            }
            j=0;
             i++;
        }
        System.out.println(result);
    }
    public static void eratosthenes2(int n) {
        long start = System.currentTimeMillis();
        boolean[] primeList = new boolean[n + 1];
        Arrays.fill(primeList, true);
        for (double i = 2; i <= n; i++) {
            if (!primeList[(int)i])
                continue;
            if (i * i < n) {
                for (double j = i * i; j <= n; j += i) {
                        primeList[(int)j] = false;
                }
            }
            System.out.print(i + " ");
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }

}
