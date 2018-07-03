import java.util.Scanner;

public class FizzBuzzTest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Which number needs to be Fizzed?");
        FizzBuzz.fizzBuzz(sc.nextInt());
        System.out.println("Done. Thank you for using FizzBuzz.");
    }
}