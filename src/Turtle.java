public class Turtle extends Animal {
    private String name;

    public String getName() {
        return name;
    }

    public Turtle(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void swim (){
        System.out.println(getName()+"is swimming");
    }
    @Override
    public void eat() {
        System.out.println(getName()+"is eating!");
    }

    @Override
    public String toString() {
        return "Turtle{" +
                "name='" + name + '\'' +
                '}';
    }
}
