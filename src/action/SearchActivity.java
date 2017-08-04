package action;

import util.Mysql;
import entity.Activity;
import util.Mapping;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by 黄宇航 on 2017/8/4.
 */
public class SearchActivity {
    private static Connection con = null;
    private String searchtext;
    private String keywords[];

    public SearchActivity(String searchtext){
        this.searchtext = searchtext;
    }

    public List<Activity> getActivities(){
        if (con == null){
            con = Mysql.getCon();
        }

        keywords = searchtext.split(" ");

        if (keywords == null || searchtext.length() < 1){
            return null;
        }

        dealString();

        Set<Activity> activities = new HashSet<>();

        for (String key:keywords){
            activities.addAll(Mapping.mappingActivities("select * from activity where content like'%" + key + "%'" +
                    " or theme like '%" + key + "%'" + " or introduction like '%" + key + "%'"));
        }

        return new ArrayList<>(activities);
    }

    protected void dealString(){
        for (int i = 0;i < keywords.length;i++){
            if (keywords[i].length() > 1 && keywords[i].lastIndexOf("社") == (keywords[i].length() - 1)){
                keywords[i] = keywords[i].substring(0,keywords[i].length() - 1);
            }else if (keywords[i].length() > 2 && keywords[i].lastIndexOf("社团")  == (keywords[i].length() - 2) ||
                    keywords[i].lastIndexOf("协会") == (keywords[i].length() - 2)){
                keywords[i] = keywords[i].substring(0,keywords[i].length() - 2);
            } else if (keywords[i].length() > 3 &&keywords[i].lastIndexOf("俱乐部") == (keywords[i].length() - 3)){
                keywords[i] = keywords[i].substring(0,keywords[i].length() - 3);
            }
        }
    }

    public static void main(String args[]){
        SearchActivity sa = new SearchActivity("吉他 志愿");
        List<Activity> temp = sa.getActivities();

        for (Activity a:temp){
            System.out.println(a.getIntroduction());
        }
    }
}
