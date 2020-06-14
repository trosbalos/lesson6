

public class Dog extends Animal {
    public final String dogName;
    public Dog(String dogName) {
        this.dogName = dogName;}

    //@Override
    public void run (float distance) {
        if (dogName.equals("vasya")&&distance<= 500.0f && distance>0.0f) {
            System.out.println(dogName + " run: "+ true);
        }
        else if (dogName.equals("ares")&&distance<= 1000.0f && distance>0.0f) {
            System.out.println(dogName + " run: "+ true);
        }
        else {
            System.out.println(dogName + " run: "+ false);
        }

    }

    //@Override
    public void swim (float distance) {
        System.out.println("cat's may not swim");
    }
    //@Override
    public void jump (float height){
        if (height<= 0.5f || height>0.0f){
            System.out.println(dogName + " jump: "+ true);
        }
        else{
            System.out.println(dogName + " jump: "+ false);
        }

    }
}
