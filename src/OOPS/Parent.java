package OOPS;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Parent {

    int id;
    public void getDepartment(){
        System.out.println("Parent");
    }
}
