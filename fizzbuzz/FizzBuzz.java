public class FizzBuzz{
    public static void fizzBuzz(int i){
        for(int x = 1; x <= i; x++){
            if(x % 15 == 0)
                System.out.println("FizzBuzz");
            else if(x % 5 == 0)
                System.out.println("Buzz");
            else if(x % 3 == 0)
                System.out.println("Fizz");
            else
                System.out.println(x);
        }
    }
}