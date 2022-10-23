public class Shark extends Animal  {
    private String name;

    public String getName() {
        return name;
    }

    public Shark(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void attack(){
        System.out.println(getName()+"is attack");
    }
    @Override
    public void eat() {
        System.out.println(getName()+"is eating!");
    }

    @Override
    public String toString() {
        return "Shark{" +
                "name='" + name + '\'' +
                '}';
    }
}
/*
  private String groupName;
    public String getGroupName() {
        return groupName;
    }
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    public Dancer(String name, String designtion, String groupName) {
        super(name, designtion);
        this.groupName = groupName;
    }
    public void dancing(){
        System.out.println(getName()+" is dancing!");
    }
    @Override
    public void eat() {
        System.out.println(getName()+" is eating!");
    }
    @Override
    public void walk() {
        System.out.println(getName()+" is walking!");
    }
    @Override
    public void learn() {
        System.out.println(getName()+" is learning!");
    }
 */