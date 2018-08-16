package jsfExam;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class SearcBox {

    private List<String> data = null;
    private List<String> result = null;
    private String display = "";

    @PostConstruct
    public void init() {
        data = new ArrayList<String>();
        result = new ArrayList<String>();

        data.add("England");
        data.add("Austria");
        data.add("France");
        data.add("Germany");
        data.add("Netherlands");
        data.add("Turkey");
        data.add("Portugal");
    }

    public void search() {

        result.clear();
        for (String country : data) {
            if (country.toLowerCase().startsWith(display.toLowerCase())) {
                result.add(country);
            }
        }
        if (result.isEmpty()) {
            result.add("Not found");
        }
    }

    public List<String> getResult() {
        return result;
    }

    public void setResult(List<String> result) {
        this.result = result;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }
}
