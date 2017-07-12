import com.alibaba.fastjson.JSON;
import com.levon.entity.UserEntity;
import com.levon.serviceImpl.UserService;
import junit.framework.TestCase;

import org.springframework.test.context.ContextConfiguration;

import javax.annotation.Resource;
import java.util.logging.Logger;

/**
 * Created by forrest on 17-7-6.
 */
//@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-mybatis.xml"})
public class TestMybatis extends TestCase {
    public static Logger logger= Logger.getLogger(TestMybatis.class.toString());
    @Resource
    private UserService userService;

    public void test1(){
        UserEntity user=userService
                .getUserById(2);
        logger.info(JSON.toJSONString(user));
    }

}
