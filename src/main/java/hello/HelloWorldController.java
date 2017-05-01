package hello;

import javax.inject.Named;

@Named(value="helloWorld")
public class HelloWorldController {
    public HelloWorldController() {
    }

    public String getMessage() {
        return "Hello World!";
    }
}
