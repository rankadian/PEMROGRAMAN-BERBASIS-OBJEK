package source_code.assigment;

public class mechanic {
    private String id;
    private String name;

    public mechanic(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return name + " (ID: " + id + ")";
    }
}
