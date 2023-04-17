package src;

import java.util.ArrayList;
import java.util.List;

/* Define a class for the formal parameter list */
public class FormalParameterList {
    private List<FormalParameter> params;

    public FormalParameterList() {
        params = new ArrayList<>();
        //params.add(param);
    }

    public void addParameter(FormalParameter param) {
        params.add(param);
    }

    public List<FormalParameter> getParams() {
        return params;
    }
}