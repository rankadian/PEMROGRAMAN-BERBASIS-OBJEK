package week_12_Quiz.source.question_3;

public class Developer extends OfficeWorker {
    @Override
    public void performDuty() {
        System.out.println("Developer is writing code.");
    }

    public void debugCode() {
        System.out.println("Developer is debugging code.");
    }
}