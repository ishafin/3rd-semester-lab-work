
public class Main {
    public static void main(String[] args){
        Person p = new Person("Shafin",123);
        Person.Address add = p.new Address("A-1","Amir Nishan","Aligarh","UP");
        Person.DateOfBirth dob = p.new DateOfBirth("25th","June","2004");

        p.display(add,dob);

    }
}
