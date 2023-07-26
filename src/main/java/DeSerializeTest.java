import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializeTest {
    public static void main(String[] args) {
        String fileName = "Customer.txt";

        try(FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(fis)) {
            Customer customer = (Customer) in.readObject();
            System.out.println(customer);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
