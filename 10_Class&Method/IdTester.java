public class IdTester {
    public static void main(String[] args) {
        Id a = new Id();
        Id b = new Id();
        
        System.out.println("a : "+ a.getId());
        System.out.println("b : "+ b.getId());

        System.out.println(Id.counter);
        System.out.println(a.counter);
        System.out.println(b.counter);
    }
}