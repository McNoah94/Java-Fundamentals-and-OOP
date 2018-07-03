public class ListTester{
    public static void main(String[] args){
        SingleList list = new SingleList();
        list.add(3);
        list.add(5);
        list.add(7);
        list.remove();
        list.printValues();
    }
}