package ds_dz.homeworks.java_1.testrep;


public class ZooOne {

    public static void main(String[] args){

        HomeAnimal horse = new MyHorse("Veter", 25);
        horse.animalRun();
        horse.animalJump(3f);
        horse.animalSwim();

        MyCat cat = new MyCat("Murzik", 7);
        cat.animalRun();
        cat.animalSwim();
        cat.animalJump(1.23f);

        HomeAnimal dog = new MyDog("Trezor", 11);
        dog.animalRun();
        dog.animalSwim();
        dog.animalJump(2f);


    }


}
