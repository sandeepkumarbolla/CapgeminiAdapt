import java.util.HashMap;

class Employee {
    private String name;
    private int id;
    public Employee(String name,int id) 
    { 
        this.id = id; 
        this.name = name; 
    } 
    public String getname() 
    { 
        return this.name; 
    } 
    public int getID() 
    { 
        return this.id; 
    } 
    public void setname(String name) 
    { 
        this.name = name; 
    } 
    public void setID(int id) 
    { 
        this.id = id; 
    } 
    @Override
    public int hashCode() 
    { 
        return 0; 
    } 
    @Override
    public boolean equals(Object o) 
    { 
        return true; 
    }
}
public class Assignment3Q5 {
    public static void main(String[] args) {
    	HashMap<Employee, String> map = new HashMap<>();
        Employee one = new Employee( "Employee1",1);  
        Employee two = new Employee("Employee2",2 );
        map.put(one, one.getname()); 
        map.put(two, two.getname()); 
        one.setname("Not Employee1"); 
        two.setname("Not Employee2"); 
        System.out.println(map.get(one));
        System.out.println(map.get(two)); 
        Employee three = new Employee( "Employee3",1); 
        System.out.println(map.get(three));
    }
}
