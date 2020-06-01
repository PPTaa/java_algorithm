public class ExIdTester {
    public static void main(String[] args) {
        ExId a = new ExId();
        ExId b = new ExId();
        ExId c = new ExId();

        ExId.setStep(4);

        ExId d = new ExId();
        ExId e = new ExId();
        ExId f = new ExId();
        
        
        System.out.println("a : "+ a.getId());
        System.out.println("b : "+ b.getId());
        System.out.println("c : "+ c.getId());
        System.out.println("d : "+ d.getId());
        System.out.println("e : "+ e.getId());
        System.out.println("f : "+ f.getId());

        System.out.println(ExId.getMaxId());
        System.out.println(ExId.getStep()+ExId.getMaxId());

    }
}