class ekclass{
    int a;
    ekclass(int a){
        this.a=a;
    }
    public int getA(){
        return a;
    }
    public int returnone(){
        return 1;
    }
}

class doclass extends ekclass{
    doclass(int a){
        super(a);
        System.out.println("doclass constructor");
    }
}

public class this_and_super_keyword {
    public static void main(String[] args){
        ekclass e = new ekclass(5);
        doclass d = new doclass(65);
        System.out.println(e.getA());
    }
}
