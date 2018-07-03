public class CalcTest{
    public static void main(String[] args) {
        Calculator c = new Calculator();

        c.setOperandOne(15.7);
        c.setOperation("-");
        c.setOperandTwo(53.14);
        c.performOperation();
        System.out.println(c.getResults());
    }
}