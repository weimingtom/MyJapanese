package pri.weiqiang.daojapanese;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

import pri.weiqiang.daojapanese.words;
import pri.weiqiang.daojapanese.lesson_title;
import pri.weiqiang.daojapanese.lessons;
import pri.weiqiang.daojapanese.Customer;
import pri.weiqiang.daojapanese.Order;

import pri.weiqiang.daojapanese.wordsDao;
import pri.weiqiang.daojapanese.lesson_titleDao;
import pri.weiqiang.daojapanese.lessonsDao;
import pri.weiqiang.daojapanese.CustomerDao;
import pri.weiqiang.daojapanese.OrderDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig wordsDaoConfig;
    private final DaoConfig lesson_titleDaoConfig;
    private final DaoConfig lessonsDaoConfig;
    private final DaoConfig customerDaoConfig;
    private final DaoConfig orderDaoConfig;

    private final wordsDao wordsDao;
    private final lesson_titleDao lesson_titleDao;
    private final lessonsDao lessonsDao;
    private final CustomerDao customerDao;
    private final OrderDao orderDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        wordsDaoConfig = daoConfigMap.get(wordsDao.class).clone();
        wordsDaoConfig.initIdentityScope(type);

        lesson_titleDaoConfig = daoConfigMap.get(lesson_titleDao.class).clone();
        lesson_titleDaoConfig.initIdentityScope(type);

        lessonsDaoConfig = daoConfigMap.get(lessonsDao.class).clone();
        lessonsDaoConfig.initIdentityScope(type);

        customerDaoConfig = daoConfigMap.get(CustomerDao.class).clone();
        customerDaoConfig.initIdentityScope(type);

        orderDaoConfig = daoConfigMap.get(OrderDao.class).clone();
        orderDaoConfig.initIdentityScope(type);

        wordsDao = new wordsDao(wordsDaoConfig, this);
        lesson_titleDao = new lesson_titleDao(lesson_titleDaoConfig, this);
        lessonsDao = new lessonsDao(lessonsDaoConfig, this);
        customerDao = new CustomerDao(customerDaoConfig, this);
        orderDao = new OrderDao(orderDaoConfig, this);

        registerDao(words.class, wordsDao);
        registerDao(lesson_title.class, lesson_titleDao);
        registerDao(lessons.class, lessonsDao);
        registerDao(Customer.class, customerDao);
        registerDao(Order.class, orderDao);
    }
    
    public void clear() {
        wordsDaoConfig.getIdentityScope().clear();
        lesson_titleDaoConfig.getIdentityScope().clear();
        lessonsDaoConfig.getIdentityScope().clear();
        customerDaoConfig.getIdentityScope().clear();
        orderDaoConfig.getIdentityScope().clear();
    }

    public wordsDao getWordsDao() {
        return wordsDao;
    }

    public lesson_titleDao getLesson_titleDao() {
        return lesson_titleDao;
    }

    public lessonsDao getLessonsDao() {
        return lessonsDao;
    }

    public CustomerDao getCustomerDao() {
        return customerDao;
    }

    public OrderDao getOrderDao() {
        return orderDao;
    }

}
