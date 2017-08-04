package action;

import entity.Activity;
import entity.PasttimeJob;
import util.Mapping;
import util.Mysql;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by 黄宇航 on 2017/8/4.
 */
public class SearchPasttimeJob {
    private static Connection con = null;
    private String searchtext;
    private String keywords[];

    public SearchPasttimeJob(String searchtext){
        this.searchtext = searchtext;
    }

    public List<PasttimeJob> getPasttimeJobs(){
        if (con == null){
            con = Mysql.getCon();
        }

        keywords = searchtext.split(" ");

        if (keywords == null || searchtext.length() < 1){
            return null;
        }

        dealString();

        Set<PasttimeJob> jobs = new HashSet<>();

        for (String key:keywords){
            jobs.addAll(Mapping.mappingPasttimeJob("select * from pasttimejob where name like'%" + key + "%'" +
                    " or genre like '%" + key + "%'" + " or summary like '%" + key + "%'"));
        }

        return new ArrayList<>(jobs);
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
}
