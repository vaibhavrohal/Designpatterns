package Prototype;



public class Student implements Copy {
    String name;
    int age;
    String batch;
     Student (){}
    Student (Student s){
        this.name=s.name;
        this.age=s.age;
        this.batch=s.batch;
    }

    @Override
    public Student clone(){
        return new Student (this);
    }

    public void setName(String s){
         this.name=s;
    }
    public void setAge(int i){
         this.age=i;
    }
    public void setBatch (String s){
         this.batch=s;
    }
}
