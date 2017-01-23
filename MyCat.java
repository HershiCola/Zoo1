package ds_dz.homeworks.java_1.les5;


public class MyCat extends HomeAnimal {

    public MyCat (String name, int sp){
        super (name, sp);
    }

    @Override
    protected void animalRun (){
        System.out.println(name + " ходит по земле со скоростью " + speed + " км/ч");
    }
    @Override
    protected void animalSwim () {
        System.out.println(name + " не умеет плавать, как и большинство кошек");
    }

    @Override
    protected void animalJump(float h) {
        jumpHeight = h;
        if (jumpHeight > 0 && jumpHeight <= 2.1) {
            System.out.println(name + " перепрыгнул препятствие высотой " + jumpHeight + " м.");
        }
        if (jumpHeight < 0 || jumpHeight > 2.1) {
            System.out.println(name + " не может прыгать на высоту " + jumpHeight + " м.");
        }
    }
}
