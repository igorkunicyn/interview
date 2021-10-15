package lesson_2_1;


public class Main {
    public static void main(String[] args) {

        MyArrayList<Student> students = new MyArrayList<>(3);
        System.out.println("Object add? "+ students.add(new Student("Ivan",21)));
        students.add(new Student("Igor",20));
        students.add(new Student("Andrey",19));
        students.add(new Student("Irina",20));
        Student student = new Student("Anton", 21);
        students.add(1, student);
        System.out.println(students);
        System.out.println("Object "+ student+ " remove? Answer: "+ students.remove(student));
        System.out.println("Remove object "+ students.remove(2));
        students.set(2, student);
        System.out.println(students);
        System.out.println(students.size());
        students.trimToSize();
        System.out.println(students.size());
        System.out.println(students.get(0));
        students.sort();
        System.out.println(students);

    }
}
