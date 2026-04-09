class Employee {

    private int id;
    private String name;
    private double salary;

    // Getter & Setter
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

class TestEmployee {
    public static void main(String[] args) {

        Employee e = new Employee();


        e.setId(1);
        e.setName("Raj");
        e.setSalary(50000);

        System.out.println(e.getId());
        System.out.println(e.getName());
        System.out.println(e.getSalary());
    }
}