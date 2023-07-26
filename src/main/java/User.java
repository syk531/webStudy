import lombok.Builder;
import lombok.ToString;

@ToString
public class User {
    private String name;
    private String gender = "M";
    private String phone;
    private int age;

    @Builder
    public User(String name, String phone, int age) {
        this.name = name;
        this.phone = phone;
        this.age = age;
    }
}