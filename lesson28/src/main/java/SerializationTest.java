import java.io.*;

public class SerializationTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Dog dog = new Dog("Phluffy", 5);
        //serializeDog(dog);
        Dog dogDeserialized = deserializeDog();
        System.out.println(dogDeserialized);
    }

    private static void serializeDog(Dog dog) {
        try (FileOutputStream fileOutputStream = new FileOutputStream("e:\\inout\\dog.ser");
             ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream)) {

            outputStream.writeObject(dog);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Dog deserializeDog() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("e:\\inout\\dog.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Dog dog = (Dog) objectInputStream.readObject();
        return dog;
    }
}
