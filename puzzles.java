import java.io.CharConversionException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.util.Random;

public class puzzles{
    public static void main(String[] args){
        int[] arr = {3,5,1,2,7,9,8,13,25,32};
        ArrayList<String> arr2 = new ArrayList<String>();
        arr2.addAll(Arrays.asList("Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"));

        System.out.println(sum(arr));
        System.out.println(names(arr2));

        alphabet();
        randArr();
        randStringArray();
    }

    public static ArrayList<Integer> sum(int[] arr){
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        for(int y : arr){
            System.out.println(y);
            if(y > 10)
                arr2.add(y);
        }

        return arr2;
    }

    public static ArrayList<String> names(ArrayList<String> arr){
        Collections.shuffle(arr);

        ArrayList<String> arr2 = new ArrayList<String>();

        for(String some : arr){
            System.out.println(some);
            if(some.length() > 5)
                arr2.add(some);
        }

        return arr2;
    }

    public static void alphabet(){
        Character[] vowels = {'a', 'e', 'i', 'o', 'u'};
        ArrayList<Character> alphabet = new ArrayList<Character>();
        alphabet.addAll(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'));
        Collections.shuffle(alphabet);
        System.out.println(alphabet.get(alphabet.size() - 1));
        System.out.println(alphabet.get(0));
        for(Character c : vowels)
            if(c == alphabet.get(0))
                System.out.println("Nice vowel you got there.");
    }

    public static void randArr(){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Random r = new Random();

        for(int x = 0; x < 10; x++)
            arr.add(55 + r.nextInt(46));
        
            Collections.sort(arr);
        System.out.println(arr);
        System.out.println(arr.get(0));
        System.out.println(arr.get(arr.size() - 1));
    }

    public static String randString(){
        Random r = new Random();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char c;
        String str = "";

        for(int x = 0; x < 5; x++){
            c = (char)(r.nextInt(26));
            str += alphabet.charAt(c);
        }

        return str;
    }

    public static void randStringArray(){
        String[] arr = new String[10];
        for(int x = 0; x < 10; x++)
            arr[x] = randString();
        
        System.out.println(Arrays.toString(arr));
    }
}