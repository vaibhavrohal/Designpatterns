package Builder.Builder3;

public class Student {

    private String name;
    private int age;
    private int gradyear;

    private Student (Builder b){
        this.name=b.getName();
        this.age=b.getAge();
        this.gradyear=b.getGradyear();

    }

    public static Builder getbuilder (){
        return new Builder();
    }
//why this has to be made static .above method.
    public static class Builder {
        private String name;
        private int age;
        private int gradyear;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return  this;
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
}
