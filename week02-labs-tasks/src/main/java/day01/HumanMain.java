package day01;

public class HumanMain {

    public static void main(String[] args) {

        Human human1 = new Human("Bill", 12);
        Human human2 = new Human("Jill", 32);

        human2.prefixName("Dr.");

        human1.introduceSelf();
        human2.introduceSelf();
    }
}
