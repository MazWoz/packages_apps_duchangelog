package us.zamzow.mazwoz.dirtyunicornschangelog;

/**
 * Created by bret on 6/6/13.
 */
public class Category{
    private String name;

    public void setName(String Name)
    {
        name = Name;
    }
    public String getName(){
        return name;
    }
    public Category(String name){
        setName(name);
    }
}