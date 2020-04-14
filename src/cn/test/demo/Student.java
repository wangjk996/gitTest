package cn.test.demo;

public class Student {
    private String usermame;
    private String sex;

    public String getUsermame() {
        return usermame;

    }

    public void setUsermame(String usermame) {
        this.usermame = usermame;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "usermame='" + usermame + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
