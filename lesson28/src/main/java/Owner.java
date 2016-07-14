import java.io.Serializable;

public class Owner implements Serializable {

    private static final long serialVersionUID = 1L;

    String name;
    String lastName;
    int age;

    public Owner(String name, int age, String lastName) {
        this.name = name;
        this.age = age;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
