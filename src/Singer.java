public class Singer extends Person {
    private String bandName;
    public String getBandName() {
        return bandName;
    }
    public void setBandName(String bandName) {
        this.bandName = bandName;
    }
    public Singer(String name, String designtion, String bandName) {
        super(name, designtion);
        this.bandName = bandName;
    }
    public void singing(){
        System.out.println( getName()+" is singing!");
    }
    public void playGitar(){
        System.out.println(getName()+" is playing on Gitar!");
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
}
