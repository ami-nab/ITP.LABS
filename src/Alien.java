public  class Alien extends Creature {
    public Alien(String name,boolean isAlive){
        this.name=name;
        this.isAlive=isAlive;
    }
    @Override
    public void bear(){
        System.out.println("The Alien "+name+" was born");
    }
    @Override
    public void die(){
        System.out.println("The Alien "+name+" has died");
    }
}
