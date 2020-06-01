public class ExId {
    static int counter = 0;
    private static int step = 1;
    private int id;


    public void setId(int id) {
        this.id = id;
    }

    public ExId(){
        id = counter += step;
    }

    public int getId(){
        return this.id;
    }
    // 증가치 게터
    public static int getStep(){
        return step;
    }
    // 증가치 세터
    public static int setStep(int s){
        step = (s>=1) ? s : 1;
        return step;
    }
    // 마지막에 부여한 번호
    public static int getMaxId(){
        return counter;
    }



}