package OOPS;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OOPSConcept {

    public static void main(String args[]){

        List<Employee> list = new ArrayList<>();

        list.add(new Employee(1,"ZZ",2000));
        list.add(new Employee(2,"PP",1000));
        list.add(new Employee(3,"AA",3000));
        list.add(new Employee(4,"NN",4000));

        List<Employee> list2 =  list.stream().sorted(Comparator.comparing(Employee::getName).reversed()).collect(Collectors.toList());

        //System.out.println(list2.toString());




    }
}
