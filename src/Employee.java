public class Employee {
    private long id;
    private String name;
    private String patronymic;
    private String surname;
    private int department;
    private double salary;
    private static int counter;

    public Employee(String name, String patronymic, String surname, int department, double salary) {
        this.name = name;
        this.patronymic = patronymic;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
        id = ++counter;
    }

    @Override
    public String toString() {
        return "Информация о сотруднике: " +
                "ID=" + id +
                ", Имя - '" + name + '\'' +
                ", Отчество - '" + patronymic + '\'' +
                ", Фамилия - '" + surname + '\'' +
                ", отдел № " + department +
                ", заработная плата составляет " + salary + " рублей";
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}

