package hello;

import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value="helloWorld3")
@RequestScoped
public class HelloWorldViaMessageCDIController {

    @Inject
    private MessageCDI messageBean;

    //Vi måste ha en setters för dom managed properties som vi använder
    public void setMessageBean(MessageCDI messageBean) {
        this.messageBean = messageBean;
    }

    public MessageCDI getMessageBean() {
        return messageBean;
    }

    public HelloWorldViaMessageCDIController() {
    }

    public String getMessage() {
        String message = "Ej satt";
        if(messageBean != null){
            message = messageBean.getMessage();
        }
        return message;
    }

    public String goToPage() {
        //Nu säger vi för enkelhets skull att vi ska till startsidsan
        return "index";
    }
}
