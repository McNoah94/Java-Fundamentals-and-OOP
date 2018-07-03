import javax.lang.model.util.ElementScanner6;

public class Calculator{
    private double op1;
    private double op2;
    private String operator;
    private double results;

    public Calculator(){}

    public void setOperandOne(double x){
        op1 = x;
    }

    public void setOperandTwo(double x){
        op2 = x;
    }

    public void setOperation(String s){
        operator = s;
    }

    public void performOperation(){
        if(operator == "+")
            results = op1 + op2;
        else if(operator == "-")
            results = op1 - op2;
        else
            System.out.println("ERROR - invalid oparator");
    }

    public double getResults(){
        return results;
    }
}