package action;

import dao.implement.ActivityDaoIm;
import dao.implement.CommunityDaoIm;
import entity.Activity;
import entity.Community;

import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Lenovo on 2017/8/2.
 * @param 社团的id
 * @return 活动类的列表
 */
public class CurrentAction {
    public static List<Activity> CurrentAction(int communityID) {
        ActivityDaoIm cv = new ActivityDaoIm();
        List<Activity> a = cv.queryAll(communityID);//得到当前社团的所有活动
        Iterator<Activity> bb = a.iterator();
        Timestamp dq = new Timestamp(System.currentTimeMillis());

        while (bb.hasNext()) {//删除不符合日期的活动
            Activity ac = bb.next();
            Timestamp cr = (Timestamp) ac.getCreatetime();
            Timestamp en = (Timestamp) ac.getEndtime();
            if (dq.getTime() >= cr.getTime() && dq.getTime() <= en.getTime()) {
                continue;
            }
            bb.remove();

        }
        return a;

    }
}
