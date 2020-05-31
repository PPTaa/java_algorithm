public class Period {
    private Day_01 from;
    private Day_01 to;

    public Day_01 getFrom() {
        return this.from;
    }
    public Day_01 getTo() {
        return this.to;
    }
    public Period (Day_01 from, Day_01 to){
        this.from = from;
        this.to = to;
    }
    public String toString(){
        return "{"+from+" ~ "+to+"}";
    }



}