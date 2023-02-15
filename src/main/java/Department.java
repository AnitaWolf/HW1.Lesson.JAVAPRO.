public class Department {

    private String name;
    private int NumberEmployees;
    private String DepartmentName;

    public Department(String name, int numberEmployees, String departmentName) {
        this.name = name;
        NumberEmployees = numberEmployees;
        DepartmentName = departmentName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberEmployees() {
        return NumberEmployees;
    }

    public void setNumberEmployees(int numberEmployees) {
        NumberEmployees = numberEmployees;
    }

    public String getDepartmentName() {
        return DepartmentName;
    }

    public void setDepartmentName(String departmentName) {
        DepartmentName = departmentName;
    }
}
