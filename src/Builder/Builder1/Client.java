package Builder.Builder1;
// used when no. of attributes are high..and we can not create lot of constructors for creating
//obj with few attributes & attributes  keep changing
// New prob: How to validate the entry of them.

public class Client {
    public static void main (String []args){
        //1 way of making student object.
        // it validates data before creating. but
        // user shall have to use builder class.
        //he do not know builder class only student class.

         Builder b=new Builder();
         b.setName("Ayansh");
        Student s1=new Student(b);

        System.out.println(s1);

        //2ed way.

        Student s2=Student.getbuilder().build();

        System.out.println(s2);

        // another way at builder 2
    }
}
