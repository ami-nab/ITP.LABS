import java.util.ArrayList;

public class AbstractClassDemonstration {
    public static void main(String[] args) {
        Animal human = new Human("Lily",false);
        Animal dog = new Dog("Lulu",false);
        Creature alien=new Alien("Lala",false);
        ArrayList<Creature> creaturess=new ArrayList<>();
        creaturess.add(human);
        creaturess.add(dog);
        creaturess.add(alien);
        for(Creature i: creaturess){
            i.bear();
            i.die();
        }
    }
}
