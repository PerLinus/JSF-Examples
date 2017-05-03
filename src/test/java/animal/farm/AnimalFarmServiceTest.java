package animal.farm;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by bjorne on 2017-05-03.
 */
public class AnimalFarmServiceTest {
    private AnimalFarmService service;

    @Before
    public void init() {
        service = new AnimalFarmService();
    }
    @Test
    public void getAllAnimals() throws Exception {
        assertTrue(service.getAllAnimals().isEmpty());
        String fido = "Fido";
        String bettan = "Bettan";
        Dog dog = new Dog(fido, bettan);
        service.add(dog);
        Collection<AnimalInterface> allAnimals = service.getAllAnimals();
        assertEquals(1, allAnimals.size());
        AnimalInterface first = allAnimals.stream().findFirst().get();
        assertEquals(fido, first.getName());
        assertEquals(bettan, first.getOwnersName());
        assertNotNull(first.getId());
        Cat cat = new Cat(bettan, fido);
        service.add(cat);
        allAnimals = service.getAllAnimals();
        assertEquals(2, allAnimals.size());
        Set<AnimalInterface> foundAnimals = new HashSet<>();
        Set<Integer> ids = new HashSet<>();
        for (AnimalInterface animal: allAnimals) {
            foundAnimals.add(animal);
            ids.add(animal.getId());
        }
        assertEquals(2, foundAnimals.size());
        assertEquals(foundAnimals.size(), ids.size());
    }

    @Test
    public void getAllAnimalsMatchingName() throws Exception {
        createTestAnimalsAndAddThemToService();
        Collection<AnimalInterface> matching = service.getAllAnimalsMatchingName("und");
        assertEquals(5, matching.size());
    }

    @Test
    public void getAllAnimalsWithOwner() throws Exception {
        createTestAnimalsAndAddThemToService();
        Collection<AnimalInterface> matching = service.getAllAnimalsWithOwner("Kattägaren3");
        assertEquals(1, matching.size());
    }

    @Test
    public void deleteAnimalWithId() throws Exception {
        createTestAnimalsAndAddThemToService();
        assertEquals(10, service.getAllAnimals().size());
        service.deleteAnimalWithId(1);
        assertEquals(9, service.getAllAnimals().size());
    }

    private void createTestAnimalsAndAddThemToService() {
        Collection<AnimalInterface> animals = createSomeAnimals();
        for (AnimalInterface animal: animals) {
            service.add(animal);
        }
    }

    private Collection<AnimalInterface> createSomeAnimals() {
        Collection<AnimalInterface> animals = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            if(i % 2 == 0) {
                animals.add(new Dog("Hunden" + i, "Hundägaren" + i));
            } else {
                animals.add(new Cat("Katten" + i, "Kattägaren" + i));
            }
        }
        return animals;
    }

}