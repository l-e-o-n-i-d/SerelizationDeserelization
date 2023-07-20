package ex10;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx {
    public static void main(String[] args) {
        Student student = new Student("Sergey", 23, 1);
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("student.bin"))) {
            objectOutputStream.writeObject(student);
            System.out.println("Done!");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
