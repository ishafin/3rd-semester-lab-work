

public class Person {
    String name;
    int phone;

    public Person(String name, int phone) {
        this.name = name;
        this.phone = phone;
    }

    public class Address{
        String houseNo;
        String street;
        String city;
        String state;

        public Address(String houseNo, String street, String city, String state) {
            this.houseNo = houseNo;
            this.city = city;
            this.street = street;
            this.state = state;
        }

        void displayAdd(){
            System.out.println("Address is: "+houseNo+","+street+","+city+","+state);
        }
    }

    public class DateOfBirth{
        String day;
        String month;
        String year;

        public DateOfBirth(String day, String month, String year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }

        void displayDob(){
            System.out.println("Date of birth is: "+day+"/"+month+"/"+year);
        }
    }

    void display(Address address,DateOfBirth dateofbirth){
        System.out.println("Name: "+name);
        address.displayAdd();
        dateofbirth.displayDob();

    }
}
