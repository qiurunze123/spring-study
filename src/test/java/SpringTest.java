import com.enjoy.study2.config.MainConfig2;
import com.enjoy.study3.config.MainConfig3;
import com.enjoy.study4.config.MainConfig4;
import com.enjoy.study5.config.MainConfig5;
import com.enjoy.study6.config.MainConfig6;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 邱润泽 bullock
 */
public class SpringTest {

    @Test
    public void Test01(){


        AnnotationConfigApplicationContext app =
                new AnnotationConfigApplicationContext(MainConfig2.class);

        String[] names = app.getBeanDefinitionNames();

        for (String name:names) {
            System.out.println(name);
        }
    }


    /**
     * 证明bean 是单实例的
     */
    @Test
    public void Test02(){
        AnnotationConfigApplicationContext app =
                new AnnotationConfigApplicationContext(MainConfig3.class);

        String[] names = app.getBeanDefinitionNames();

        for (String name:names) {
            System.out.println(name);
        }


        //从容器中分别取俩次person  看是否为同一个bean
        Object person = app.getBean("person");
        Object person1 = app.getBean("person");

        System.out.println(person == person1);

        //结论 person person1 俩个是一样的  同一个对象

        /**
         * 如果用了 prototype  多实例 得到结果为 false 两个不是同一个对象
         */
    }



    /**
     * 证明bean 是单实例的
     */
    @Test
    public void Test03(){
        AnnotationConfigApplicationContext app =
                new AnnotationConfigApplicationContext(MainConfig4.class);

        System.out.println("IOC容器创建完成......");
        Object person = app.getBean("person");

    }


    @Test
    public void Test05(){
        AnnotationConfigApplicationContext app =
                new AnnotationConfigApplicationContext(MainConfig5.class);
        System.out.println("开始初始化容器 ------------ >>>>> "+app.getBeanDefinitionNames());

    }


    @Test
    public void Test06(){
        AnnotationConfigApplicationContext app =
                new AnnotationConfigApplicationContext(MainConfig6.class);
        String[] beanDefinitionNames = app.getBeanDefinitionNames();
        //取 monkey 实例
        Object M1 = app.getBean("geekQFactoryBean");
        Object M2 = app.getBean("geekQFactoryBean");

        System.out.println(M1 == M2);

        System.out.println("bean的类型 ========= "+M1.getClass());
        for (String bean:
             beanDefinitionNames) {
            System.out.println("---------------->> print : "+ bean);
        }
        System.out.println("开始初始化容器 ------------ >>>>> ");

    }


}
