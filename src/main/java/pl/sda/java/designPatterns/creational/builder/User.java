package pl.sda.java.designPatterns.creational.builder;

public class User {

    private String firstName;
    private String lastName;
    private String phone;
    private String address;
    private int age;

    private User(UserBuilder userBuilder) {
        this.firstName = userBuilder.firstName;
        this.lastName = userBuilder.lastName;
        this.phone = userBuilder.phone;
        this.address = userBuilder.address;
        this.age = userBuilder.age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public static class UserBuilder {
        private String firstName;
        private String lastName;
        private String phone;
        private String address;
        private int age;

        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public User build() {
            User user = new User(this);
            return user;
        }
    }
}