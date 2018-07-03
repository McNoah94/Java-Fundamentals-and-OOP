import java.util.Objects;

public class Node{
    public int value;
    public Node next;

    public Node(int val){
        value = val;
    }

    @Override
    public String toString(){
        return Objects.toString(value);
    }
}