package hello;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="helloWorld", eager = true)
public class HelloWorldController {
    public HelloWorldController() {
    }

    public String getMessage() {
        return "Hello World!";
    }
}
