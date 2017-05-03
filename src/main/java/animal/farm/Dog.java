package animal.farm;

/**
 * Created by bjorne on 2017-05-03.
 */
public class Dog extends Animal {
    public Dog(String name, String ownersName) {
        super(name, ownersName);
    }

    @Override
    public String bark() {
        return "Voff!";
    }
}
