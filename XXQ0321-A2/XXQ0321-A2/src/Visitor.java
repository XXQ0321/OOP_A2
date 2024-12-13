public class Visitor extends Person{

    /**
     * 联系方式
     */
    private String contactinfo;

    /**
     * 备注
     */
    private String remark;

    public String getContactinfo() {
        return contactinfo;
    }

    public void setContactinfo(String contactinfo) {
        this.contactinfo = contactinfo;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Visitor(String name, Integer age, String sex, String contactinfo, String remark) {
        super(name, age, sex);
        this.contactinfo = contactinfo;
        this.remark = remark;
    }



    public Visitor(String contactinfo, String remark) {
        this.contactinfo = contactinfo;
        this.remark = remark;
    }

    public Visitor() {
    }

    @Override
    public String toString() {
        return "Visitor{" +
                "contactinfo='" + contactinfo + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }


}
