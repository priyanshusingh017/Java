// Q1 -->
abstract class pen{
    abstract public void write();

    abstract void refill();
}

class Foundation extends pen{
    @Override
    public void write() {
        System.out.println("Writing....");
    }
    public void refill() {
        System.out.println("Refilling....");
    }
}

// Q3 -->
class Monkey {
    void jump(){
        System.out.println("Monkey Jumping...");
    }
    void sleep(){
        System.out.println("Monkey Sleeping...");
    }
}

interface BasicAnimal{
    void eat();

    void sleep();
}

class Human extends Monkey implements BasicAnimal{
    @Override
    public void eat() {
        System.out.println("Human Eating...");
    }
    public  void sleep(){
        System.out.println("Human Sleeping...");
    }
}


// Q4-->
abstract class TelePhone{

    abstract void ring();

    abstract void lift();

    abstract void disconnect();
}

class SmartPhone extends TelePhone{
    @Override
    public void ring() {
        System.out.println("SmartPhone Ring...");
    }
    public void lift(){
        System.out.println("SmartPhone Lift...");
    }
    public void disconnect(){
        System.out.println("SmartPhone Disconnect...");
    }

    public void camera(){
        System.out.println("SmartPhone Camera...");
    }
}


// Q6 && Q7 -->
interface TVRemote {

    void powerOn();

    void powerOff();
}

interface SmartTVRemote extends TVRemote {

    void voiceControl();

    void internet();
}

class TV implements SmartTVRemote {

    @Override
    public void powerOn() {
        System.out.println("TV ON");
    }

    @Override
    public void powerOff() {
        System.out.println("TV OFF");
    }

    @Override
    public void voiceControl() {
        System.out.println("Voice Control Enabled");
    }

    @Override
    public void internet() {
        System.out.println("Internet Connected");
    }
}


public class Practice {
    public static void main(String[] args) {

        Foundation obj = new Foundation();
        obj.write();
        obj.refill();

        Human obj2 = new Human();
        obj2.eat();
        obj2.sleep();
        obj2.jump();
        obj2.sleep();

        TelePhone t =  new SmartPhone();
        t.ring();
        t.lift();
        t.disconnect();
        //t.camera();


        TV tv = new TV();
        tv.internet();
        tv.powerOn();
        tv.powerOff();

    }
}
