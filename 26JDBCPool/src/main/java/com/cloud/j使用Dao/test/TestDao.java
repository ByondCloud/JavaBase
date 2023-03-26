package com.cloud.j使用Dao.test;


import com.cloud.j使用Dao.dao.ActorDao;
import com.cloud.j使用Dao.domain.Actor;
import org.junit.Test;
import java.util.List;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/11/27
 * @Time 2:03
 */
public class TestDao {
    @Test
    public void testActorDao() {
        ActorDao actorDao = new ActorDao();
        // 查询多条记录
        System.out.println("=================查询多条记录=====================");
        List<Actor> actors = actorDao.queryMulti("select * from actor where id >= ?", Actor.class, 1);
        for (Actor actor : actors) {
            System.out.println(actor);
        }
        System.out.println("=================查询单条记录=====================");
        // 查询单条记录
        Actor actor = actorDao.querySingle("select * from actor where id = ?", Actor.class, 1);
        System.out.println(actor);

        System.out.println("=================查询单行单列=====================");
        // 查询单行单列
        Object o = actorDao.queryScalar("select name from actor where id = ?", 1);
        System.out.println(o);

        System.out.println("=================插入=====================");
        int update = actorDao.update("insert into actor values (?, ?, ?, ?, ?)", null, "王维", "男", "2011-11-11 08:22:22", "15859022222");
        System.out.println(update > 0 ? "执行成功":"执行失败");
    }
}
