import java.util.Arrays;
import java.util.ArrayList;

public class Exceptions{
    public static void main(String[] args){
        ArrayList<Object> arr = new ArrayList<Object>(Arrays.asList("Doding", "Cojo", 78, 45.32));

        for(int i = 0; i < arr.size(); i++)
            try{
                Integer val = (Integer) arr.get(i);
            }
            catch (ClassCastException e){
                System.out.println("That one didn't work.");
            }
    }
}