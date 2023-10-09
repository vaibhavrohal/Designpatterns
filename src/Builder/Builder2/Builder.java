package Builder.Builder2;

public class Builder {
    private String name;
    private int age;
    private int gradyear;

    public String getName() {
        return name;
    }

    public Builder setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Builder setAge(int age) {
        this.age = age;
        return this;
    }

    public int getGradyear() {
        return gradyear;
    }

    public Builder setGradyear(int gradyear) {
        this.gradyear = gradyear;
        return this;
    }
    public Student build(){
        return new Student(this);
    }
}
