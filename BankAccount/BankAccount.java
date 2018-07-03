public class BankAccount{
    private String number;
    private double checkingBalance;
    private double savingsBalance;
    private static int accounts;
    private static double allMoney;

    public BankAccount(){
        this.number = this.accountNumber();
        accounts += 1;
        this.checkingBalance = 100.00;
        this.savingsBalance = 25.00;
        allMoney();
    }

    public String getAccount(){
        return number;
    }

    public double getChecking(){
        return checkingBalance;
    }

    public double getSavings(){
        return savingsBalance;
    }

    public void depositChecking(double d){
        checkingBalance += d;
    }

    public void depositSavings(double d){
        savingsBalance += d;
    }

    public void withdrawChecking(double d){
        if(d < checkingBalance){
            checkingBalance -= d;
            allMoney -= d;
        }
        else{
            System.out.println("INSUFFICIENT FUNDS");
        }
    }

    public void withdrawSaving(double d){
        if(d < savingsBalance){
            savingsBalance -= d;
            allMoney -= d;
        }
        else{
            System.out.println("INSUFFICIENT FUNDS");
        }
    }

    public Double allMoney(){
        allMoney = checkingBalance + savingsBalance;
        return allMoney;
    }

    private String accountNumber(){
        Long d = Math.round(Math.random() * 10000000000.00);
        return d.toString();
    }
}