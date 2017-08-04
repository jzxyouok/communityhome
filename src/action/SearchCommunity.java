package action;

import util.Mysql;
import entity.Community;
import util.GetCommunity;

import java.util.List;
import java.util.Set;

/**
 * Created by 黄宇航 on 2017/8/3.
 */
public class SearchCommunity extends GetCommunity{
    private String searchtext;

    public SearchCommunity(String searchtext){
        this.searchtext = searchtext;
    }

    public List<Community> getCommunities()
    {
        if (con == null){
            con = Mysql.getCon();
        }

        keywords = searchtext.split(" ");

        if (keywords == null){
            Mysql.closeCon();
            return null;
        }

        dealString();
        Set<Integer> idset = makeCommunityIdSet();

        return getCommunities(idset);
    }
}
