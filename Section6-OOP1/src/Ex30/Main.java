package Ex30;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();

        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println("fullName=" + person.getFullName());
        System.out.println("teen=" + person.isTeen());
        person.setFirstName("Tony");
        person.setAge(30);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen=" + person.isTeen());
        person.setLastName("Lee");
        System.out.println("fullName= " + person.getFullName());

    }
}
