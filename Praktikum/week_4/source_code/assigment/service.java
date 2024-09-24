package source_code.assigment;

import java.time.LocalDate;

public class service {
    private LocalDate date;
    private mechanic mechanic;
    private String description;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public mechanic getMechanic() {
        return mechanic;
    }

    public void setMechanic(mechanic mechanic) {
        this.mechanic = mechanic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInfo() {
        String info = "";
        info += "\tDate: " + date;
        info += ", Mechanic: " + mechanic.getInfo();
        info += ", Service: " + description + "\n";

        return info;
    }
}
