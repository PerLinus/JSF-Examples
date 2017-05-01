package hello;

import javax.inject.Named;

@Named
public class HelloWorldController {
    public HelloWorldController() {
    }

    public String getMessage() {
        return "Hello World!";
    }
}
