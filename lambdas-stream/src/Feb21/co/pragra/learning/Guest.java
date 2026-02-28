package Feb21.co.pragra.learning;

import java.util.List;

public class Guest {
    private String name;
    private int age;
    private String contact;
    public String email;
    private boolean isVegetarian;
    private List<String> interests;


    public Guest(String name, int age, String contact, String email, boolean isVegetarian) {
        this.name = name;
        this.age = age;
        this.contact = contact;
        this.email = email;
        this.isVegetarian = isVegetarian;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getContact() {
        return contact;
    }

    public String getEmail() {
        return email;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", contact='" + contact + '\'' +
                ", email='" + email + '\'' +
                ", isVegetarian=" + isVegetarian +
                '}';
    }

}
