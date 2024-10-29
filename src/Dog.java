final  class Dog extends Animal{
    public Dog(String name,boolean isAlive){
        this.name=name;
        this.isAlive=isAlive;
    }
    @Override
    public void bear(){
        System.out.println("The Dog "+name+" was born");
    }
    @Override
    public void die(){
        System.out.println("The Dog "+name+" has died");
    }
    private void bark(){
        System.out.println("The Dog "+name+" barks");
    }
}
