package src;

import java.util.List;

public class Function {
    private String name;
    private List<FormalParameter> parameters;

    public Function(String name, List<FormalParameter> parameters) {
        this.name = name;
        this.parameters = parameters;
    }

    public String getName() {
        return name;
    }

    public List<FormalParameter> getParameters() {
        return parameters;
    }
}
