

public class Cat extends Animal {
    String catName;
    public Cat(String catName) {
        this.catName = catName;}

        //@Override
    public void run (float distance) {
        if (catName.equals("Marik")&&distance<= 200.0f && distance>0.0f) {
            System.out.println(catName + " run: "+ true);
        }
        else if (catName.equals("Barsik")&&distance<= 130.0f && distance>0.0f) {
            System.out.println(catName + " run: "+ true);
        }
        else {
            System.out.println(catName + " run: "+ false);
        }

    }

   // @Override
    public void swim (float distance) {
        System.out.println("cat's may not swim");
    }
    //@Override
    public void jump (float height){
        if (catName.equals("Marik") && height<= 1.0f && height>0.0f){
            System.out.println(catName + " jump : "+ true);
        }
        else if (catName.equals("Barsik") && height<= 3.0f && height>0.0f){
            System.out.println(catName + " jump : "+ true);
        }
        else {System.out.println(catName + " jump : "+ false);}

    }
}
