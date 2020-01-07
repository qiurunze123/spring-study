import com.enjoy.study2.config.MainConfig2;
import com.enjoy.study3.config.MainConfig3;
import com.enjoy.study4.config.MainConfig4;
import com.enjoy.study5.config.MainConfig5;
import com.enjoy.study6.config.MainConfig6;
import com.enjoy.study7.config.MainConfigBeanLifeCycle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 邱润泽 bullock
 *
 * spring bean的生命周期
 */
public class SpringBeanLifeTest {

    @Test
    public void Test01(){

        AnnotationConfigApplicationContext app =
                new AnnotationConfigApplicationContext(MainConfigBeanLifeCycle.class);

        System.out.println("开始初始化容器 ------------ >>>>> "+app.getBeanDefinitionNames());

        app.close();

    }

}
