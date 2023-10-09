package Builder.Builder2;

public class Client {

    public static void main(String []args) {
        Student s1 = Student.getbuilder().setName("vihan").setAge(4).build();

        System.out.println(s1);
       // here we do not need to call builder class.
        // prob: any one can call student constructor for making student object.
        // to solve this we make student constrructor private.
        // in that case we can only access constructor of student from inside class of student.
        // to make object then constructor od student need to e called from student calls.
        // its possible only if we make builder class as inner class of student.check builder 3 for further solution

        // in present case we have to make all setter methods of builder class , return builder object.
        //as we call setName()-- if this method do not return builder object , we can not call next
        //setter method of builder, to initialize next attribute.As method is here called by builder object.
        System.out.println();


    }

}
