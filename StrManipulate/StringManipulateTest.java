public class StringManipulateTest{
    public static void main(String[] args){
        StrManipulate smt = new StrManipulate();
        System.out.println(smt.trimAndConcat("    hello     ", "       world      "));
        System.out.println(smt.getCharIndex("Test String", 't'));
        System.out.println(smt.getStrIndex("Test String", "Str"));
        System.out.println(smt.concatSubstring("Oh my god please no", 6, 9, "My first love is "));
    }
}