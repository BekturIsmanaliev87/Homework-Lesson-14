import java.util.Arrays;
class Main { public  static void main(String[] args) {
        Animal [] animal={ new Shark("Blast"),new Turtle("Momonoske"),new Eagle("Dragonman")};

        System.out.println("--------------------------");

        Shark[]sharks=new Shark[animal.length/3];
        Turtle[]turtles=new Turtle[(animal.length-animal.length/3)/2];
        Eagle []eagles=new Eagle[(animal.length-animal.length/3)/2];

        int s=0;int e=0;int t=0;

        for(Animal animals:animal){
            if(animals instanceof Shark){
                ((Shark) animals).attack();
                animals.eat();
                sharks[s]=(Shark)animals;s++;
                System.out.println("--------------------------");}

            else if (animals instanceof Turtle){
                ((Turtle)animals).swim();
                animals.eat();
                turtles[t]=(Turtle) animals;t++;
                System.out.println("--------------------------");}

            else {
                ((Eagle)animals).fly();
                animals.eat();
                eagles[e]=(Eagle) animals;e++;}}
        System.out.println("==========================");
        System.out.println(Arrays.toString(sharks));
        System.out.println(Arrays.toString(eagles));
        System.out.println(Arrays.toString(turtles));
        System.out.println("--------------------------");}}



