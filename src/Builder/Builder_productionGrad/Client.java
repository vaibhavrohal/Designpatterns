package Builder.Builder3;

public class Client {
    public static void main (String []args){
        Student s1=Student.getbuilder().setName("Ayansh").setAge(4).setGradyear(2030).build();

        System.out.println(s1);
    }




}
