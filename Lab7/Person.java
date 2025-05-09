public class Person {
    private String name;
    private String surname;
    private int age;
    private String city;
    private String email;

    public Person(String name, String surname, int age, String city, String email) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.city = city;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Imię: " + name +
                "\nNazwisko: " + surname +
                "\nWiek: " + age +
                "\nMiasto: " + city +
                "\nEmail: " + email;
    }

    public static void main(String[] args) {
        Person osoba = new Person("Maciej", "Kowalski", 25, "Gdynia", "maciej@example.com");


        System.out.println(osoba);
    }
}
