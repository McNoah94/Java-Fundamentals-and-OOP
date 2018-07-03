public class SingleList{
    public Node head;
    public SingleList(){
        //TODO
    }

    public void add(int value){
        Node n = new Node(value);
        if(head == null)
            head = n;
        else{
            Node runner = head;
            while(runner.next != null)
                runner = runner.next;
            runner.next = n;
        }
    }

    public void remove(){
        Node runner = head;
        if(runner.next == null)
            head = null;

        while(runner.next.next != null)
            runner = runner.next;
        
        runner.next = null;
    }

    public void printValues(){
        System.out.println(this.toString());
    }

    @Override
    public String toString(){
        String s = "Head value = " + head.value + "\n";
        Node runner = head;
        for(int count = 0; runner.next != null; count++){
            s += "Node " + count + ": " + runner.value + "\n";
            runner = runner.next;
            if(runner.next == null)
                s+= "Node " + (count + 1) + ": " + runner.value;
        }

        return getClass().getSimpleName() + "\n" + s;
    }
}