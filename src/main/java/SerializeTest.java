import java.io.*;

class Customer implements Serializable {
    private static final long serialVersionUID = 1L;
    int id;
    String password;
    String name;
    int age;

    public Customer(int id, String password, String name, int age) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class SerializeTest {
   public static void main(String args[]) {
       Customer customer = new Customer(123, "1q2w3e4r", "홍길동", 23);

       String fileName = "Customer.txt";
       try(FileOutputStream fos = new FileOutputStream(fileName);
           ObjectOutputStream out = new ObjectOutputStream(fos)) {
           out.writeObject(customer);
       }catch (IOException e) {
            e.printStackTrace();
       }
   }
}
