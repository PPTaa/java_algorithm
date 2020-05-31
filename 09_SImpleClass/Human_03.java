public class Human_03 {

    private String name;
    private int height;
    private int weight;
    private Day_01 birthDay;

    public Human_03 (String n, int h, int w, Day_01 d) {
        this.name = n;
        this.height = h;
        this.weight = w;
        this.birthDay = new Day_01(d);

    }

    public String getName() {
        return name;
    }
    public int getHeight() {
        return height;
    }
    public int getWeight() {
        return weight;
    }
    public Day_01 getBirthDay() {
        return new Day_01(birthDay);
    }

    void gainWeight (int w) {
        weight += w;
    }
    void reduceWeight (int w) {
        weight -= w;
    }

    public void putData(){
        System.out.println("이름 : "+name);
        System.out.println("신장 : "+height+"cm");
        System.out.println("체중 : "+weight+"kg");
    }

    public String toString(){
        return "{"+name+": "+height+"cm ,"+weight+"kg ,"+birthDay+"출생}";
    }
}
