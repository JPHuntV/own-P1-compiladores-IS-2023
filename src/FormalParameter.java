package src;


/* Define a class for formal parameters */
public class FormalParameter {
    private String name;
    private String type;

    public FormalParameter(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
