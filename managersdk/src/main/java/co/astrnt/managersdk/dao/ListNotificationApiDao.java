package co.astrnt.managersdk.dao;

import java.util.List;

/**
 * Created by deni rohimat on 01/08/18
 */
public class ListNotificationApiDao extends BaseApiDao {

    private List<NotificationApiDao> notification;

    public List<NotificationApiDao> getNotification() {
        return notification;
    }

    public void setNotification(List<NotificationApiDao> notification) {
        this.notification = notification;
    }
}
