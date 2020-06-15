public abstract class AbstLine extends Shape {
    
    private int length;

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public AbstLine (int length) {
        setLength(length);
    }

    public String toString(){
        return "AbstLine(length:"+length+")";
    }
}