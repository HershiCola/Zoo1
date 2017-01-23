package ds_dz.homeworks.java_1.les5;


public class MyDog extends HomeAnimal {

    public MyDog (String name, int sp){
        super(name, sp);
    }

    @Override
    protected void animalSwim () {
        System.out.println(name + " хорошо плавает и может приносить из воды палку");
    }

    @Override
    protected void animalJump(float h) {
        jumpHeight = h;
        if (jumpHeight > 0 && jumpHeight <= 1.5) {
            System.out.println(name + " перепрыгнул препятствие высотой " + jumpHeight + " м.");
        }
        if (jumpHeight < 0 || jumpHeight > 1.5) {
            System.out.println(name + " не может прыгать на высоту " + jumpHeight + " м.");
        }
    }
}
