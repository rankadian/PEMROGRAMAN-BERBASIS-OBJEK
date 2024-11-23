package week_12_Quiz.source.question_3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<OfficeWorker> workers = new ArrayList<>();

        workers.add(new Manager());
        workers.add(new Developer());
        workers.add(new Receptionist());

        OfficeManager.assignWork(workers);

        for (OfficeWorker worker : workers) {
            OfficeManager.performSpecialAction(worker);
        }
    }
}