package hello;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="helloWorld2")
@RequestScoped
public class HelloWorldViaMessageBeanController {

    @ManagedProperty(value="#{message}")
    private Message messageBean;

    //Vi måste ha en setters för dom managed properties som vi använder
    public void setMessageBean(Message messageBean) {
        this.messageBean = messageBean;
    }

    public HelloWorldViaMessageBeanController() {
    }

    public String getMessage() {
        String message = "Ej satt";
        if(messageBean != null){
            message = messageBean.getMessage();
        }
        return message;
    }

    //När vi vill navigera kan vi göra detta via kontrollern
    public String goToPage() {
        //Nu säger vi för enkhelts skull att vi ska till startsidsan
        return "index";
    }
}
