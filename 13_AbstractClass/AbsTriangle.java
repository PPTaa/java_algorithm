public abstract class AbsTriangle extends Shape {
    private int length;

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public AbsTriangle (int length){
        setLength(length);
    }

    public String toString(){
        return "AbsTriangle(length :"+length+")";
    }
}