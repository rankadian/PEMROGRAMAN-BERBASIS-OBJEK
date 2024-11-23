package week_12_Quiz.source.question_3;

import java.util.ArrayList;

public class OfficeManager {
    public static void assignWork(ArrayList<OfficeWorker> workers) {
        for (OfficeWorker worker : workers) {
            worker.performDuty();
        }
    }

    public static void performSpecialAction(OfficeWorker worker) {
        if (worker instanceof Manager) {
            Manager manager = (Manager) worker;
            manager.approveBudget();
        } else if (worker instanceof Developer) {
            Developer developer = (Developer) worker;
            developer.debugCode();
        } else if (worker instanceof Receptionist) {
            Receptionist receptionist = (Receptionist) worker;
            receptionist.scheduleAppointments();
        }
    }
}