package ex10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserelizationEx {
    public static void main(String[] args) {
        Student student;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("student.bin"))){
            student = (Student) objectInputStream.readObject();
            System.out.println(student);
            System.out.println("Done!");

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
