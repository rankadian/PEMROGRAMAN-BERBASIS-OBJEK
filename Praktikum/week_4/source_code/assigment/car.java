package source_code.assigment;

import java.time.LocalDate;
import java.util.ArrayList;

public class car {
    private String numberPlate;
    private String owner;
    private ArrayList<service> serviceHistory;

    public car(String numberPlate, String owner) {
        this.numberPlate = numberPlate;
        this.owner = owner;
        this.serviceHistory = new ArrayList<>();
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getInfo() {
        String info = "";
        info += "Number Plate      : " + this.numberPlate + "\n";
        info += "Owner             : " + this.owner + "\n";
        info += "\n";

        if (!serviceHistory.isEmpty()) {
            info += "Service History   :\n";

            for (service service : serviceHistory) {
                info += service.getInfo();
            }
        } else {
            info += "No service history available.";
        }

        info += "\n";

        return info;
    }

    public void addService(LocalDate date, mechanic mechanic, String description) {
        service service09 = new service();
        service09.setDate(date);
        service09.setMechanic(mechanic);
        service09.setDescription(description);
        serviceHistory.add(service09);
    }
}
