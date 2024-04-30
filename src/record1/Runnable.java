package record1;

public class Runnable {
    public static void main(String[] args) {

        //========= INSTANCE FROM POJO CLASS ==========
        // we have to set values immediately when we create an instance, bcs of parameterized constructor
        Employee emp1 = new Employee("John", "Doe", "john@gmail.com");
        System.out.println("emp1.getEmail() = " + emp1.getEmail());

        //if we want initial value
        emp1.setFirstName("Tom");

        System.out.println("emp1 = " + emp1);


        //========= INSTANCE FROM ImmutableEmployee CLASS ==========
        ImmutableEmployee emp2 =
                new ImmutableEmployee("Tamara", "Kalesh", "kalesh@gmail.com");
        ImmutableEmployee emp3
                = new ImmutableEmployee("Tamara", "Kalesh", "kalesh@gmail.com");
        System.out.println("emp2 = " + emp2);

        System.out.println(" == " + (emp2 == emp3)); // false
        System.out.println(" .equals() " + (emp2.equals(emp3))); // false

//        String str1 = new String();
//        str1 = "hello";
//        String str2 = new String();
//        str2 = "hello";
//
//        System.out.println("str1.equals(str2) = " + str1.equals(str2));
//        System.out.println("(str1 == str2) = " + (str1 == str2));
        // .equals() => checks only values
        // == => checks values and data types


        //========= INSTANCE FROM RecordEmployee CLASS ==========
        RecordEmployee recordEmployee1 =
                new RecordEmployee("RJohn", "RDoes", "rjohn@gmail.com");
        RecordEmployee recordEmployee2 =
                new RecordEmployee("RJohn", "RDoes", "rjohn@gmail.com");

        System.out.println("recordEmployee1 = " + recordEmployee1);

    }
}
