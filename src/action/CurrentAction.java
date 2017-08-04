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
 * @param ���ŵ�id
 * @return �����б�
 */
public class CurrentAction {
    public static List<Activity> CurrentAction(int communityID) {
        ActivityDaoIm cv = new ActivityDaoIm();
        List<Activity> a = cv.queryAll(communityID);//�õ���ǰ���ŵ����л
        Iterator<Activity> bb = a.iterator();
        Timestamp dq = new Timestamp(System.currentTimeMillis());

        while (bb.hasNext()) {//ɾ�����������ڵĻ
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
