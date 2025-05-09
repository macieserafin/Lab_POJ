public class A {
    public void present(String phrase) {
        System.out.println(phrase);
    }

    public static void main(String[] args) {
        E obj = new E();
        obj.present("To jest przekazane przez wszystkie klasy aż do A.");
    }
}
