package jobsheet3.duties;

public class demoKoperasi {
    public static void main(String[] args) {
        koperasi member1 = new koperasi("Donny", 5000000, 0);

        System.out.println("Member Name : " + member1.getName());
        System.out.println("Loan Limit: " + member1.getLimitLoan());

        System.out.println("\nBorrow 10.000.000");
        member1.borrrow(10000000);

        System.out.println("\nBorrow 4.000.000");
        member1.borrrow(4000000);

        System.out.println("\nPayying 1.000.000 installments");
        member1.payying(1000000);

        System.out.println("\nPayying 3.000.000 installments");
        member1.payying(3000000);
    }
}
