package entity;


import java.util.Date;

/**
 * Created by Lenovo on 2017/7/18.
 * 用户类
 */
public class User {
    private int ID;
    private String picture;
    private String name;
    private int studentid;
    private String username;

    private String mailbox;
    private String password;
    private String profession;/*专业*/
    private String telnumber;
    private String  birth;
    private String gender;/*性别*/
    private String school;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }



    public String getMailbox() {
        return mailbox;
    }

    public void setMailbox(String mailbox) {
        this.mailbox = mailbox;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getTelnumber() {
        return telnumber;
    }

    public void setTelnumber(String telnumber) {
        this.telnumber = telnumber;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (ID != user.ID) return false;
        if (studentid != user.studentid) return false;

        if (picture != null ? !picture.equals(user.picture) : user.picture != null) return false;
        if (name != null ? !name.equals(user.name) : user.name != null) return false;
        if (username != null ? !username.equals(user.username) : user.username != null) return false;
        if (mailbox != null ? !mailbox.equals(user.mailbox) : user.mailbox != null) return false;
        if (password != null ? !password.equals(user.password) : user.password != null) return false;
        if (profession != null ? !profession.equals(user.profession) : user.profession != null) return false;
        if (telnumber != null ? !telnumber.equals(user.telnumber) : user.telnumber != null) return false;
        if (birth != null ? !birth.equals(user.birth) : user.birth != null) return false;
        if (gender != null ? !gender.equals(user.gender) : user.gender != null) return false;
        return school != null ? school.equals(user.school) : user.school == null;
    }

    @Override
    public String toString() {
        return "User{" +
                "ID=" + ID +
                ", picture='" + picture + '\'' +
                ", name='" + name + '\'' +
                ", studentid=" + studentid +
                ", username='" + username + '\'' +

                ", mailbox='" + mailbox + '\'' +
                ", password='" + password + '\'' +
                ", profession='" + profession + '\'' +
                ", telnumber='" + telnumber + '\'' +
                ", birth=" + birth +
                ", gender='" + gender + '\'' +
                ", school='" + school + '\'' +
                '}';
    }
}
