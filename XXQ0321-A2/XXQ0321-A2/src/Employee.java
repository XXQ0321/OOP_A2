public class Employee extends Person{

    /**
     *部门
     */
    private String dept;

    /**
     *岗位
     */
    private String ride;



    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getRide() {
        return ride;
    }

    public void setRide(String ride) {
        this.ride = ride;
    }

    public Employee(String name, Integer age, String sex, String dept, String ride) {
        super(name, age, sex);
        this.dept = dept;
        this.ride = ride;
    }

    public Employee(String dept, String ride) {
        this.dept = dept;
        this.ride = ride;
    }
}
