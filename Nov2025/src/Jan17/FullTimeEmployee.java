package Jan17;

public class FullTimeEmployee extends Employee{


    @Override
    double calSalary() {
        return 0;
    }

    public FullTimeEmployee(int id, String name) {
        super(id, name);
    }
}
