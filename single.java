class Flower{
    void sunlight(){
    System.out.println("flower want sunlight to grow");
    }
}
class Rose extends Flower{
    void rose(){
        System.out.println("rose is red");
    }
    void lavender(){
        System.out.println("lavender is purple");
    }
    void daffodil(){
        System.out.println("daffodil is yellow");
    }
}
public class Main{
    public static void main(String[] args){
        Rose r=new Rose();
        r.sunlight();
        r.rose();
        r.lavender();
        r.daffodil();
        }
}