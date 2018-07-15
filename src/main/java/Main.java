import kvadratUr.KvadratUr;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");

    ctx.getBean(KvadratUr.class).ur();

    }

}
