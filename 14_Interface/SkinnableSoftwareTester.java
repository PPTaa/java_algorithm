public class SkinnableSoftwareTester {
    public static void main(String[] args) {
        
        SkinnableSoftware x = new SkinnableSoftware();
        SkinnableSoftware y = new SkinnableSoftware(Skinnable.BLUE);
        
        x.changeSkin(Skinnable.RED);

        System.out.println(x.getSkinString());
        System.out.println(y.getSkinString());
    }
}