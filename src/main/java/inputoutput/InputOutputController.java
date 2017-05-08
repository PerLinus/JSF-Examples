package inputoutput;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class InputOutputController {
    private Data data;
    @PostConstruct
    public void init() {
        data = new Data();
    }

    public Data getData() {
        return data;
    }

    public void setField1(String value) {
        getData().setField1(value);
    }

    public void setField2(String value) {
        getData().setField2(value);
    }

    public String getField1() {
        return getData().getField1();
    }

    public String getField2() {
        return getData().getField2();
    }

    public String spara() {
        return "confirmationInputoutput";
    }
}
