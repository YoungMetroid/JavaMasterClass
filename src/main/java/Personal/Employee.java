package Personal;

import lombok.*;
public class Employee {
    @Getter
    @Setter
    int departmentId;
    @Getter
    @Setter
    String name;
    @Getter
    @Setter
    int edad;
    @Getter
    @Setter
    int salario;
    static Employee employee;
    public Employee(){}
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
}
