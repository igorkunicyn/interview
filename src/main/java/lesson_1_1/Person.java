package lesson_1_1;

public class Person {
    private final String firstName;
    private final String lastName;
    private final String middleName;
    private final String country;
    private final String address;
    private final String phone;
    private final String gender;
    private final int age;

    public Person(Builder builder) {
        this.firstName= builder.firstName;
        this.middleName= builder.middleName;
        this.lastName= builder.lastName;
        this.country= builder.country;
        this.address= builder.address;
        this.gender= builder.gender;
        this.phone= builder.phone;
        this.age= builder.age;
    }

    public static class Builder{
            private String firstName;
            private String lastName;
            private String middleName;
            private String country;
            private String address;
            private String phone;
            private String gender;
            private int age;

            public Builder addFirstName(String firstName) {
                this.firstName=firstName;
                return this;
            }

            public Builder addLastName(String lastName) {
                this.lastName=lastName;
                return this;
            }

            public Builder addMiddleName(String middleName) {
                this.middleName=middleName;
                return this;
            }

            public Builder addCountry(String country) {
                this.country=country;
                return this;
            }

            public Builder addAddress(String address) {
                this.address=address;
                return this;
            }

            public Builder addPhone(String phone) {
                this.phone=phone;
                return this;
            }

            public Builder addGender(String gender) {
                this.gender=gender;
                return this;
            }

            public Builder addAge(int age) {
                this.age=age;
                return this;
            }

            public Person build() {
                return new Person(this);
            }

        }


    @Override
    public String toString() {
        return "Person {" + '\n' +
                "firstName =  " + firstName + '\n' +
                "lastName =  " + lastName + '\n' +
                "middleName =  " + middleName + '\n' +
                "country =  " + country + '\n' +
                "address =  " + address + '\n' +
                "phone =  " + phone + '\n' +
                "gender =  " + gender + '\n' +
                "age =  " + age +
                "  }";
    }
}
