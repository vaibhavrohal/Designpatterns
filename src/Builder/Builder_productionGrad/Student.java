package Builder.Builder3;

import Builder.Builder3.Exception.InvalidGradyearException;
import Builder.Builder3.Exception.InvalidNameException;

public class Student {

    private String name;
    private int age;
    private int gradyear;

    private Student (Builder b){
        this.name=b.getName();
        this.age=b.getAge();
        this.gradyear=b.getGradyear();

    }

    @Override
    public String toString(){
        return "name is "+this.name+", age is "+this.age+", Gradyear is "+this.gradyear;
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

        private void validate(){
            if (name==null){
                throw new InvalidNameException("name can not be null ");
            }
            if (gradyear>2022){
                throw  new InvalidGradyearException("Grad year can not be more then 2022");
            }
        }
        public Student build(){
            this.validate();
            return new Student(this);
        }
    }
}
