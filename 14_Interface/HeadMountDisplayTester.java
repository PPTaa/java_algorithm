public class HeadMountDisplayTester {
    public static void main(String[] args) {
        HeadMountDisplay hmd = new HeadMountDisplay();
        hmd.putOn();
        hmd.putOff();
        hmd.putSkin();
        System.out.println("+++++++++++++++++");
        hmd.changeSkin(Skinnable.GREEN);
        hmd.putSkin();
        System.out.println("+++++++++++++++++");
        Wearable w = hmd;
        w.putOn();
        w.putOff();
        System.out.println("+++++++++++++++++");
        Skinnable s = hmd;
        s.changeSkin(Skinnable.RED);
        System.out.println("+++++++++++++++++");
        hmd.putSkin();
    }
}