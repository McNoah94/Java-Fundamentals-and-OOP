import java.util.Scanner;

public class PythagoreanTest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the length of the first leg?");
        double a = sc.nextDouble();
        System.out.println("What is the length of the second leg?");
        double b = sc.nextDouble();

        double hyp = Pythagorean.hypotenuse(a, b);

        System.out.println("The length of the hypenuse is " + hyp + " units.");
    }
}