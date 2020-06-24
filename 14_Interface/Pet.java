public class Pet {
    private String name;
    private String masterName;

    public Pet (String name, String masterName){
        this.name = name;
        this.masterName = masterName;
    }

    public String getName(){
        return name;
    }
    public String getMasterName(){
        return masterName;
    }

    public void introduce(){
        System.out.println("개이름 : " + name);
        System.out.println("주인이름 : " + masterName);
    }
}