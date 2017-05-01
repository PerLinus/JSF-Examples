package hello;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="helloWorld", eager = true)
public class HelloWorldController {
    public HelloWorldController() {
    }

    public String getMessage() {
        return "Hello World!";
    }

    //När vi vill navigera kan vi göra detta via kontrollern
    public String goToPage() {
        //Nu säger vi för enkhelts skull att vi ska till startsidsan
        return "index";
    }
}
