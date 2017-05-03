package animal.farm;

/**
 * Created by bjorne on 2017-05-03.
 */
public interface AnimalInterface {
    Integer getId();
    void setId(Integer id);
    String getName();
    void setName(String name);
    void setOwnersName(String name);
    String getOwnersName();
    String bark();
}
