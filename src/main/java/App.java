import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        Cat beanCat = (Cat) applicationContext.getBean("cat");
        System.out.println(beanCat.getMessageCat());
        Cat beanCat2 = (Cat) applicationContext.getBean("cat");
        System.out.println(beanCat2.getMessageCat());

        boolean beanCompare= (bean==bean2);
        boolean beanCompareCat= (beanCat==beanCat2);
        System.out.println(beanCompare);
        System.out.println(beanCompareCat);
    }
}