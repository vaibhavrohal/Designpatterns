package Builder.Builder1;

public class Student {
    private String name;
    private String roll;
    private String mobile;
    private String email;
    private double psp;
    private int gradyear;

    public Student (Builder b){
        // validating grad year
        if (b.getGradyear()>2022){
            throw new IllegalArgumentException ("grad year can not be higher then 2022");
        }
            this.name=b.getName();
            this.roll=b.getRoll();
            this.mobile=b.getMobile();
            this.email=b.getEmail();
            this.psp=b.getPsp();
            this.gradyear=b.getGradyear();
    }
    public static Builder getbuilder(){
        return new Builder ();
    }
}
