public class Programmer extends Person {
    private  String CompanyName;
    public String getCompanyName() {
        return CompanyName;
    }
    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }
    public Programmer(String name, String designtion, String companyName) {
        super(name, designtion);
        CompanyName = companyName;
    }
    public void coding(){
        System.out.println(getName()+" is coding!");
    }
    @Override
    public void eat() {
        System.out.println(getName()+"  is eating!");
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
