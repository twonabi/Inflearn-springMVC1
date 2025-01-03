package hello.servlet.web.frontcontroller;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ModelView {
    private String viewName;
    private Map<String, Objects> model = new HashMap<>();

    public ModelView(String viewName) {
        this.viewName = viewName;
    }

    public String getViewName() {
        return viewName;
    }

    public void setViewName(String viewName) {
        this.viewName = viewName;
    }

    public Map<String, Objects> getModel() {
        return model;
    }

    public void setModel(Map<String, Objects> model) {
        this.model = model;
    }
}
