class Flower{
    void sunlight(){
    System.out.println("flower want sunlight to grow");
    }
}
class Rose extends Flower{
    void rose(){
        System.out.println("rose is red");
    }
}
class Lavender extends Flower{
    void lavender(){
        System.out.println("lavender is purple");
    }
}
class Daffodil extends Flower{
    void daffodil(){
        System.out.println("daffodil is yellow");
    }
}
public class Main{
    public static void main(String[] args){
        Rose r=new Rose();
        r.sunlight();
        r.rose();
        Lavender l=new Lavender();
        l.lavender();
        Daffodil d=new Daffodil();
        d.daffodil();
        }
}