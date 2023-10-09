package Builder.Builder2;

public class Student {
    private String name;
    private int age;
    private int gradyear;

    Student (Builder b){
        if (b.getGradyear()>2022) throw new IllegalArgumentException("plz check the grad yaer");
        this.name=b.getName();
        this.age=b.getAge();
        this.gradyear=b.getGradyear();
    }

    public static Builder getbuilder(){
        return new Builder();
    }
}
