package day7;
// is -a relation
// Elephant --> child class, sub class, derived class
// Animal --> parent class, super class
public class Elephant extends Animal {


    public static void main(String[] args) {
        Elephant an = new Elephant();
        an.legs();
        an.tail();
        an.tusk();
        an.woods();
        an.waterBody();
    }

    public void tusk(){
        System.out.println("Tusk");
    }

}
