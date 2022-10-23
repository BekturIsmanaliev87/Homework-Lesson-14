public class Eagle extends Animal {
    private String name;

    public String getName() {
        return name;
    }

    public Eagle(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void fly(){
        System.out.println(getName()+"is flying");
    }
    @Override
    public void eat() {
        System.out.println(getName()+"is eating!");
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "name='" + name + '\'' +
                '}';
    }
}
