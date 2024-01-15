package Personal;


public class Employee {

    int departmentId;
    String name;
    int edad;
    int salario;



    static Employee employee;
    private Employee(){}

    public static Employee getEmployee() {
        if(employee == null)
        {
            employee = new Employee();
        }
        return employee;
    }

    public Employee(int departmentId, String name, int edad, int salario) {
        this.departmentId = departmentId;
        this.name = name;
        this.edad = edad;
        this.salario = salario;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
