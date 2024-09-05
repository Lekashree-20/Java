package IO.Four;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class Serialize {

    public static void main(String[] args) {
        // Create an Employee object
        Employee employee = new Employee("John Doe", new Date(1985, 5, 15), "Engineering", "Software Engineer", 75000);

        // Serialize the Employee object to a file
        try (FileOutputStream fileOut = new FileOutputStream("data");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {

            out.writeObject(employee);
            System.out.println("Serialized data is saved in data file.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

