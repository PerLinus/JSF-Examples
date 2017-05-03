package animal.farm;

/**
 * Created by bjorne on 2017-05-03.
 */
public abstract class Animal implements AnimalInterface {
    Integer id;
    String name;
    String ownersName;

    public Animal(String name, String ownersName) {
        setName(name);
        setOwnersName(ownersName);
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getOwnersName() {
        return ownersName;
    }

    @Override
    public void setOwnersName(String ownersName) {
        this.ownersName = ownersName;
    }
    
}
