class GenericClass<T> {
    public T info;
}
public class Generic {
    public static void main(String args[]) {
        GenericClass<String> genericClass = new GenericClass<String>();
        GenericClass<Integer> genericClass2 = new GenericClass<Integer>();

        genericClass.info = "test";
        genericClass2.info = 123;
        System.out.println(genericClass.info.getClass());
        System.out.println(genericClass2.info.getClass());
    }
}
