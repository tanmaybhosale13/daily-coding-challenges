package arrayprogramming.com.string.programming;

import java.util.*;
class Employee{

    private int id;
    private String name;
    private double salary;

    public Employee(int id,String name,double salary){

        this.id=id;
        this.name=name;
        this.salary=salary;

    }

    public double getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }

}



public class SecondHighestSalary {
    
    public static void main(String[] args) {

        List<Employee> employees=Arrays.asList(

        new Employee(1, "John", 50000),
        new Employee(2, "David", 45000),
        new Employee(3, "Alice", 60000),
        new Employee(4, "Bob", 90000),
        new Employee(5, "Tom", 75000)


        );


        Optional<Double> secondHighest=employees.stream().map(Employee::getSalary).distinct().sorted(Comparator.naturalOrder()).skip(1).findFirst();
         
        
         secondHighest.ifPresent(salary -> {

             employees.stream()
             .filter(emp -> emp.getSalary()==salary)
             .findFirst()
             .ifPresent(emp -> System.out.println(emp.getName() +"  "+ emp.getSalary()));


         });





    




}


}

