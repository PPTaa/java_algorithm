public class AnimalTester1 {
    public static void main(String[] args) {
        Animal[] a = new Animal[2];
        a[0] = new Dog("강아지", "치와와");
        a[1] = new Cat("고양이", 10);



        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i].getName()+":");
            System.out.println(a[i]);
            a[i].introduce();
        }

        for (Animal s : a) {
            System.out.print(s.getName()+":");
            System.out.println(s);
            s.introduce();
        }
    }
}