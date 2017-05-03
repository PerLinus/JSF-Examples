package hello;

import javax.ejb.Singleton;

//Gör ett exempel med Djur med DjurInterface, Hund och Katt
//Lägg in ta bort, sök, id, TDD...
@Singleton
public class ServiceTest {
    private String memory = "";

    public String getMessage() {
        return memory;
    }

    public void setMessage(String message) {
        this.memory += message;

    }
}
