package Encapsulation;

public class Main {
    public static void main(String[] args) {
        Student st = new Student();
        System.out.println(st.getName());
        st.setCollege("BIT");
//        System.out.println(st.college);
        st.getCollege();

        st.setRoll(-5);
        st.getRoll();
    }
}
