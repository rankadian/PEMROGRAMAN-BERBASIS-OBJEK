package jobsheet3.duties;

public class koperasi {
    // private String idCardNumber;
    private String name;
    private int borrowingLimit;
    private int loanAmount;

    public koperasi() {
    }

    public koperasi(String name, int borrowingLimit, int loanAmount) {
        this.name = name;
        this.borrowingLimit = borrowingLimit;
        this.loanAmount = 0;
    }

    public String getName() {
        return name;
    }

    public int getLimitLoan() {
        return borrowingLimit;
    }

    public int getLoanAmount() {
        return loanAmount;
    }

    public void borrrow(int amount) {
        if (loanAmount + amount > borrowingLimit) {
            System.out.println("Sorry, the loan amount exceeds the limit.");
        } else {
            loanAmount += amount;
            System.out.println("Amount of current loan: " + loanAmount);
        }
    }

    public void payying(int amount) {
        if (amount >= loanAmount) {
            loanAmount = 0;
            System.out.println("Amount of current loan: " + loanAmount);
        } else {
            loanAmount -= amount;
            System.out.println("Amount of current loan: " + loanAmount);
        }
    }
}
