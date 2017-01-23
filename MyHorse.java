package ds_dz.homeworks.java_1.testrep;


public class MyHorse extends HomeAnimal{

        public MyHorse (String name, int sp){
        super (name, sp);
    }

    @Override
    protected void animalRun (){
        System.out.println(name + " скачет по земле со скоростью " + speed + " км/ч");
    }
    @Override
    protected void animalSwim () {
        System.out.println(name + " плавает и переходит реку вброд");
    }
    @Override
    protected void animalJump(float h) {
        jumpHeight = h;
        if (jumpHeight > 0 && jumpHeight <= 2.85) {
            System.out.println(name + " перепрыгнул препятствие высотой " + jumpHeight + " м.");
        }
        if (jumpHeight < 0 || jumpHeight > 2.85) {
            System.out.println(name + " не может прыгать на высоту " + jumpHeight + " м.");
        }
    }
}