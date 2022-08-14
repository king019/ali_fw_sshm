import com.k.redis.SshmFeatureRedisRun;
import com.k.redis.dao.IUserDao;
import com.k.redis.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SshmFeatureRedisRun.class)
public class RedisTest {

    @Autowired
    private IUserDao userDao;

    @Ignore
    @Test
    public void testAddUser() {
        User user = new User();
        user.setId("user1");
        user.setName("java2000_wl");
        boolean result = userDao.add(user);
    }

    @Ignore
    @Test
    public void testAddUsers1() {
        List<User> list = new ArrayList<>();
        for (int i = 10; i < 50000; i++) {
            User user = new User();
            user.setId("user" + i);
            user.setName("java2000_wl" + i);
            list.add(user);
        }
        long begin = System.currentTimeMillis();
        for (User user : list) {
            userDao.add(user);
        }
    }

    @Ignore
    @Test
    public void testAddUsers2() {
        List<User> list = new ArrayList<>();
        for (int i = 10; i < 1500000; i++) {
            User user = new User();
            user.setId("user" + i);
            user.setName("java2000_wl" + i);
            list.add(user);
        }
        long begin = System.currentTimeMillis();
        boolean result = userDao.add(list);
    }

    @Ignore
    @Test
    public void testUpdate() {
        User user = new User();
        user.setId("user1");
        user.setName("new_password");
        boolean result = userDao.update(user);
    }

    @Ignore
    @Test
    public void testDelete() {
        String key = "user1";
        userDao.delete(key);
    }

    @Ignore
    @Test
    public void testDeletes() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add("user" + i);
        }
        userDao.delete(list);
    }

    @Ignore
    @Test
    public void testGetUser() {
        try {
            String id = "user1";
            User user = userDao.get(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
