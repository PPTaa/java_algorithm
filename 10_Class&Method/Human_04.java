/**
 * 10_1_Human
 */
public class Human_04 {

    private static int counter = 0;
    private String name;
    private int height;
    private int weight;
    private int id;
    
    public Human_04 (String name, int height, int weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
        id = ++counter;
    }
    // 게터
    public String getName() {
        return this.name;
    }
    public int getHeight() {
        return this.height;
    }
    public int getWeight() {
        return this.weight;
    }
    public int getId(){
        return this.id;
    }
    // 체중변화
    public void gainWeight(int w){
        weight += w; 
    }
    public void reduceWeight(int w){
        weight -= w; 
    }
    // 데이터 표시
    public void putData(){
        System.out.println("이름 : "+ name);
        System.out.println("신장 : "+ height+"cm");
        System.out.println("체중 : "+ weight+"kg");
    }




}