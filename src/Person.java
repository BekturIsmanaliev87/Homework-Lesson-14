public class Person {
    private String name;
    private String d;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getD() {
        return d;
    }
    public void setD(String d) {
        this.d = d;
    }
    public Person(String name,String d) {
        this.name = name;
        this.d=d;
    }
    public void eat(){
        System.out.println(getName()+" is eating!");
    }
    public void walk(){
        System.out.println(getName()+" is walking!");
    }
    public void learn(){
        System.out.println( getName()+" is learning!");
    }
}
