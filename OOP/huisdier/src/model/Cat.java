package model;

public class Cat extends Huisdier{

    public Cat(String naam) {
        super(naam);
    }

    @Override
    public void maakGeluid() {
        System.out.println("Miauw!!");
    }

    public void spinnen(){
        System.out.println("Prrr");
    }

    @Override
    public String toString() {
        return "Cat{}"+ ", parent:" + super.toString();
    }
}
