public class Constructor{

    void Check(){
        System.out.println("Static function");
    }

    public static void main(String[] args){
        
        Constructor obj = new Constructor();
        obj.Check();
    }
}