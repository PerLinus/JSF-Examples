package animal.farm;

import javax.inject.Inject;
import java.util.Collection;

/**
 * Created by bjorne on 2017-05-03.
 */
public class AnimalControllerFaked {
    //Bara för att illustrera hur servicen kan injectas
    @Inject
    AnimalFarmService service;

    public Collection<AnimalInterface> geAllAnimals() {
        return service.getAllAnimals();
    }

    public void addDog(String name, String ownersName) {
        service.add(new Dog(name, ownersName));
    }

    public void addCat(String name, String ownersName) {
        service.add(new Cat(name, ownersName));
    }

    //TODO fler metoder...
}
