package IO.Four;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialize {

    public static void main(String[] args) {
        // Deserialize the Employee object from the file
        try (FileInputStream fileIn = new FileInputStream("data");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {

            Employee employee = (Employee) in.readObject();
            System.out.println("Deserialized Employee object:");
            System.out.println(employee);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

