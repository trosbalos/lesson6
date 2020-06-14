public class Homework {
    public static void main(String[] args) {
        Dog vasya = new Dog("vasya");
        Dog ares = new Dog("ares");
        Cat marik = new Cat("Marik");
        Cat barsik = new Cat("Barsik");

        vasya.run(600.4f);
        ares.run(600.4f);
        vasya.swim(5);
        ares.swim(5);
        vasya.jump(0.20f);
        ares.jump(0.200f);
        System.out.println();

        marik.run(10);
        barsik.run(100);
        marik.swim(5);
        barsik.swim(5);
        marik.jump(4);
        barsik.jump(4);
    }
}
