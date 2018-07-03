import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class Thirteen{
    public static void main(String[] args){
        print(6);
        printOdd(7);
        printSum(5);
        int[] arr = {1,2,3,4};
        int[] negArr = {-4, -6, 8, 50, -2, 10};
        printArray(arr);
        max(arr);
        oddArray(7);
        greaterThan(arr, 2);
        squares(arr);
        noNeg(negArr);
        data(arr);
        shift(arr, 1);
    }

    public static void print(int x){
        for(int y = 0; y <= x; y++)
            System.out.println(y);
    }

    public static void printOdd(int x){
        for(int y = 0; y <= x; y++){
            if(y % 2 != 0)
                System.out.println(y);
        }
    }

    public static void printSum(int x){
        int count = 0;
        for(int y = 0; y <= x; y++){
            System.out.print("Current count is " + y + ".");
            count += y;
            System.out.print("Total is " + count + ".\n");
        }
    }

    public static void printArray(int[] arr){
        for(int y : arr)
            System.out.println(y);
    }

    public static void max(int[] arr){
        int max = 0;
        for(int y : arr){
            if(y > max)
                max = y;
        }

        System.out.println(max);
    }

    public static void avg(int[] arr){
        double avg = 0;

        for(int x : arr)
            avg += x;

        System.out.println(avg / arr.length);
    }

    public static void oddArray(int x){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int y = 0; y <= x; y++){
            if(y % 2 != 0)
                arr.add(y);
        } 

        System.out.println(arr);
    }

    public static void greaterThan(int[] arr, int x){
        int count = 0;
        for(int y : arr)
            if(y > x)
                count++;
        
        System.out.println(count);
    }

    public static void squares(int[] arr){
        for(int x = 0; x < arr.length; x++)
            arr[x] = arr[x] * arr[x];
        
            System.out.println(Arrays.toString(arr));
    }

    public static void noNeg(int[] arr){
        for(int x = 0; x < arr.length; x++)
            if(arr[x] < 0)
                arr[x] = 0;
        
        System.out.println(Arrays.toString(arr));
    }

    public static void data(int[] arr){
        ArrayList<Double> data = new ArrayList<Double>();
        double min = 0;
        double max = 0;
        double avg = 0;

        for(int x : arr){
            if(x < min)
                min = x;
            else if(x > max)
                max = x;
            
            avg += x;
        }

        data.add(max);
        data.add(min);
        data.add(avg / arr.length);

        System.out.println(data);
    }

    public static void shift(int[] arr, int x){
        do{
            for(int y = 0; y < arr.length - 1; y++)
                arr[y] = arr[y + 1];
            arr[arr.length - 1] = 0;
            x--;
        }while(x > 0);

        System.out.println(Arrays.toString(arr));
    }
}