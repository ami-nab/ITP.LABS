public abstract class Creature {
    String name=null;
    boolean isAlive=false;
    abstract void bear();
    abstract void die();
    public void shoutName(){
        if(name==null){
            System.out.println("Error");
        }
        else{
            System.out.println(name);
        }
    };
}
