package week_12_Quiz.source.question_3;

public class Manager extends OfficeWorker {
    @Override
    public void performDuty() {
        System.out.println("Manager is conducting a meeting.");
    }

    public void approveBudget() {
        System.out.println("Manager is approving the budget.");
    }
}