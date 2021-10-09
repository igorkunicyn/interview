package lesson_1_1;

public class Main {

    public static void main(String[] args) {
        Person person = new Person.Builder()
                .addFirstName("Igor")
                .addMiddleName("Aleksandrovich")
                .addLastName("Kunisyn")
                .addCountry("Russian")
                .addAddress("Penza")
                .addGender("Man")
                .addPhone("561212")
                .addAge(45)
                .build();
        System.out.println(person);
    }
}
