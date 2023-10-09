package Builder.Builder1;

public class Builder {
    private String name;
    private String roll;
    private String mobile;

    private String email;
    private double psp;
    private int gradyear;

    public int getGradyear() {
        return gradyear;
    }

    public void setGradyear(int gradyear) {
        this.gradyear = gradyear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public Student build (){
        return new Student(this);
    }



}
