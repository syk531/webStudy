public class Main {
    public static void main(String[] args){
        User user = User.builder()
                        .name("test ")
                        .phone("01011112222")
                        .age(24)
                        .build();

        System.out.println(user.toString());
    }
}
