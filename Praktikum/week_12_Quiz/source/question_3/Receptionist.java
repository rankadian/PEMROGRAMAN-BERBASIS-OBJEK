package week_12_Quiz.source.question_3;

public class Receptionist extends OfficeWorker {
    @Override
    public void performDuty() {
        System.out.println("Receptionist is answering calls.");
    }

    public void scheduleAppointments() {
        System.out.println("Receptionist is scheduling appointments.");
    }
}