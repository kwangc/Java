package OOPMaster;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "White", "Sausage", 3.56);
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.12);
        System.out.println("Total burger price is " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Chicken", 4.23);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHealthAddition1("Ketchup", 0.3);
        System.out.println("Total healthyburger price is " + healthyBurger.itemizeHamburger());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        System.out.println("Total deluxeburger price is " + deluxeBurger.itemizeHamburger());
        deluxeBurger.addHamburgerAddition1("newDB",5.6);

    }
}
