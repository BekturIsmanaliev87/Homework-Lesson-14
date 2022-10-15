class Main {
    public  static void main(String[] args) {
        Programmer p=new Programmer("Timurlan","TIMI","Microsoft");
        Dancer d=new Dancer("Nurlan","Nuru","NURLANDUB");
        Person r=new Person("Ren Zu","first people");
        Singer s=new Singer("Uta","best singer","New Era");
        System.out.println(d.getName()+"  "+d.getD()+"  "+d.getGroupName());
        System.out.println(r.getName()+"  "+r.getD());
        System.out.println(p.getName()+"  "+p.getD()+"  "+p.getCompanyName());
        System.out.println(s.getName()+"  "+s.getD()+"  "+s.getBandName());
        System.out.println("---------------");
        d.eat();
        d.walk();
        d.learn();
        d.dancing();
        System.out.println("---------------");
        s.eat();
        s.walk();
        s.learn();
        s.singing();
        s.playGitar();
        System.out.println("---------------");
        p.eat();
        p.walk();
        p.learn();
        p.coding();
        System.out.println("---------------");
        r.eat();
        r.walk();
        r.learn();
        System.out.println("---------------");
    }
}
