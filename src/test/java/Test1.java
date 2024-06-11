import org.dom4j.DocumentException;
import org.example.common.BeansException;
import org.example.xmlBean.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) throws DocumentException, ClassNotFoundException, InstantiationException, IllegalAccessException, BeansException {
        ClassPathXmlApplicationContext ctx = new
                ClassPathXmlApplicationContext("beans.xml");
        AService aService = (AService)ctx.getBean("aservice");
        aService.sayHello();
    }
}