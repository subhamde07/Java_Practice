package Polymorphism;

public class ownOverride {
    int num;

    @Override
    public String toString() {
        return "ObjectPrint{" + "num=" + num + "}";
    }

    public ownOverride(int num) {
        this.num = num;
    }

    public static void main(String[] args) {
        ownOverride obj = new ownOverride(54);

        System.out.println(obj);
    }
}
