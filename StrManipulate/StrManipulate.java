import javax.lang.model.util.ElementScanner6;

public class StrManipulate{
    public static String trimAndConcat(String str1, String str2){
        return str1.trim() + str2.trim();
    }

    public static Integer getCharIndex(String str, Character c){
        if(str.indexOf(c) != -1)
            return str.indexOf(c);
        else
            return null;
    }

    public static Integer getStrIndex(String str, String sub){
        if(str.indexOf(sub) != -1)
            return str.indexOf(sub);
        else
            return null;
    }

    public static String concatSubstring(String str1, int x, int y, String str2){
        return str2 + str1.substring(x,y);
    }
}