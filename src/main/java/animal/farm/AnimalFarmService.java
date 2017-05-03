package animal.farm;

import javax.ejb.Singleton;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import static java.util.stream.Collectors.toList;

/**
 * Created by bjorne on 2017-05-03.
 */
@Singleton
public class AnimalFarmService {
    Map<Integer, AnimalInterface> animals = new HashMap<>();
    Integer currentId = 0;

    public Collection<AnimalInterface> getAllAnimals() {
        return animals.values();
    }

    public void add(AnimalInterface animal) {
        animal.setId(currentId++);
        animals.put(currentId, animal);
    }

    public Collection<AnimalInterface> getAllAnimalsMatchingName(String name) {
        return animals
                .values()
                .stream()
                .filter(a -> a.getName() != null && a.getName().contains(name))
                .collect(toList());
    }

    public Collection<AnimalInterface> getAllAnimalsWithOwner(String ownerName) {
        return animals
                .values()
                .stream()
                .filter(a -> ownerName.equals(a.getOwnersName()))
                .collect(toList());
    }

    public void deleteAnimalWithId(Integer id) {
        animals.remove(id);
    }
}
