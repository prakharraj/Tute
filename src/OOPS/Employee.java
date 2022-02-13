package OOPS;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee extends Parent{
    int id;
    String name;
    int salary;

    public void getDepartment(){
        System.out.println("Emp");
    }
}
