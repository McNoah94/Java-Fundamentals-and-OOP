public class BankAccountTest{
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        System.out.println(ba.getAccount());
        ba.depositChecking(100);
        ba.depositSavings(27);
        ba.withdrawChecking(56);
        System.out.println(ba.getChecking());
        System.out.println(ba.getSavings());
        System.out.println("" + ba.allMoney());
    }
}