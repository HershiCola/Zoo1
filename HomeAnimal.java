package ds_dz.homeworks.java_1.les5;


public class HomeAnimal {

    protected String name;
    protected int speed;
    protected float jumpHeight;

    protected HomeAnimal (String name, int speed){
        this.name = name;
        this.speed = speed;
    }

    protected void animalRun (){
        System.out.println(name + " умеет бегать по земле со скоростью " + speed + " км/ч");
    }

    protected void animalJump (float h) {
        jumpHeight = h;
        System.out.println(name + " прыгает на высоту " + jumpHeight + " м.");
            }
    protected void animalSwim (){
        System.out.println(name + " может плавать");
    }
}


