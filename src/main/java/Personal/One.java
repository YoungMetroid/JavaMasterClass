package Personal;

import java.util.*;
import java.util.stream.Collectors;

public class One {

    public static void main(String []args){

        //Empieza el programa a correr

        Employee employee = new Employee();

        Optional<Employee> employeeName = Optional.ofNullable(employee);
        String s = "As something";
        Optional<String> ss = Optional.ofNullable(s);


        String sss = ss.orElse("unknown");
        System.out.println(sss);

        String r = employeeName.get().name;
        String result = employeeName.map(Employee::getName)
                .orElse("not specified");

        System.out.println(result);

        List<Employee> employeeList = new ArrayList<>();


        Employee employee1 = new Employee(1,"Brian",25,1000);
        Employee employee2 = new Employee(1,"Ansony",26,6000);
        Employee employee5 = new Employee(1,"Ansony2",26,2000);
        Employee employee3 = new Employee(3,"Aby",28,3000);
        Employee employee4 = new Employee(4,"Felipe",23,5000);

        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);



        Optional<Employee> maxSalaryEmp = employeeList.stream().max(Comparator.comparing(Employee::getSalario));

        Employee emp = maxSalaryEmp.get();
        System.out.println(emp.getSalario());

        Map<Integer,Double> departmentSalaries = employeeList.stream().
                collect(Collectors.
                        groupingBy(Employee::getDepartmentId,
                                Collectors.collectingAndThen(
                                        Collectors.summarizingDouble(Employee::getSalario),
                                                summary -> (summary.getSum() / summary.getCount())
                                    )
                                )
                        );

        int highestPaid = 0;
        String name ="";
        HashMap<Integer,Integer> promedio = new HashMap<>();
        HashMap<Integer,Integer> count = new HashMap<>();
        for (Employee e: employeeList) {


            if(promedio.containsKey(e.getDepartmentId())){
                int value = promedio.get(e.getDepartmentId());
                int newPromedio = (value + e.getSalario());
                promedio.put(e.getDepartmentId(),newPromedio);

                int currentCount = count.get(e.getDepartmentId());
                currentCount++;
                count.put(e.getDepartmentId(),currentCount);
            }
            else {
                promedio.put(e.getDepartmentId(),e.getSalario());
                count.put(e.getDepartmentId(),1);
            }
            if(e.getSalario() > highestPaid){
                highestPaid = e.getSalario();
                name = e.getName();
            }
        }

       for(Map.Entry<Integer,Integer> p: promedio.entrySet()){
           int c = count.get(p.getKey());
           System.out.println(p.getKey() + " : " + p.getValue()/c);
       }
    }
}
