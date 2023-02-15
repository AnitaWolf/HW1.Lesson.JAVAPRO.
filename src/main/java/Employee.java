public class Employee {
    private String surName;
    private String Name;
    private String FatherName;
    private String Position;
    private int salary;
    private String Department;

    public Employee(String surName, String name, String fatherName, String position, int salary, String department) {
        this.surName = surName;
        Name = name;
        FatherName = fatherName;
        Position = position;
        this.salary = salary;
        Department = department;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getFatherName() {
        return FatherName;
    }

    public void setFatherName(String fatherName) {
        FatherName = fatherName;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }
}
