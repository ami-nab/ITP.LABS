final class Human extends Animal {
    public Human(String name,boolean isAlive){
            this.name=name;
            this.isAlive=isAlive;
    }
    @Override
    public void bear(){
        System.out.println("The Human "+name+" was born");
    }
    @Override
    public void die(){
        System.out.println("The Human "+name+" has died");
    }

}

