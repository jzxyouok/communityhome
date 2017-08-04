package entity;
/**
 * Created by Lenovo on 2017/7/18.
 * 用户信息类
 */
import java.util.List;
import java.util.ListIterator;

public class UserInformation {
private List<String> joincommunity;
private String school;
private String recentcommunity;
private List<String> followcommunity;
private List<String> followactivity;
private String picture;/*图片指的是头像*/
private List<String> applycommunity;
private List<String> applyactivity;
private List<String> managecommunity;
private List<String> manageactivity;
/*获取迭代器的方法*/
    public ListIterator<String> getJoinCommunityIterator(){
        ListIterator<String> i=joincommunity.listIterator();
        return i;
    }
    public ListIterator<String> getFollowCommunityIterator(){
        ListIterator<String> i=followcommunity.listIterator();
        return i;
    }
    public ListIterator<String> getFollowActivityIterator(){
        ListIterator<String> i=followactivity.listIterator();
        return i;
    }
    public ListIterator<String> getApplyCommunityIterator(){
        ListIterator<String> i=applycommunity.listIterator();
        return i;
    }
    public ListIterator<String> getApplyActivityIterator(){
        ListIterator<String> i=applyactivity.listIterator();
        return i;
    }
    public ListIterator<String> getManageCommunityIterator(){
        ListIterator<String> i=managecommunity.listIterator();
        return i;
    }
    public ListIterator<String> getManageActivityIterator(){
        ListIterator<String> i=manageactivity.listIterator();
        return i;
    }
    public List<String> getJoincommunity() {
        return joincommunity;
    }

    public void setJoincommunity(List<String> joincommunity) {
        this.joincommunity = joincommunity;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getRecentcommunity() {
        return recentcommunity;
    }

    public void setRecentcommunity(String recentcommunity) {
        this.recentcommunity = recentcommunity;
    }

    public List<String> getFollowcommunity() {
        return followcommunity;
    }

    public void setFollowcommunity(List<String> followcommunity) {
        this.followcommunity = followcommunity;
    }

    public List<String> getFollowactivity() {
        return followactivity;
    }

    public void setFollowactivity(List<String> followactivity) {
        this.followactivity = followactivity;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public List<String> getApplycommunity() {
        return applycommunity;
    }

    public void setApplycommunity(List<String> applycommunity) {
        this.applycommunity = applycommunity;
    }

    public List<String> getApplyactivity() {
        return applyactivity;
    }

    public void setApplyactivity(List<String> applyactivity) {
        this.applyactivity = applyactivity;
    }

    public List<String> getManagecommunity() {
        return managecommunity;
    }

    public void setManagecommunity(List<String> managecommunity) {
        this.managecommunity = managecommunity;
    }

    public List<String> getManageactivity() {
        return manageactivity;
    }

    public void setManageactivity(List<String> manageactivity) {
        this.manageactivity = manageactivity;
    }
}
