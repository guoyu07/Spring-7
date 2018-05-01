package ch4.lession4_5_1;

import ch4.lession4_3_1.performances.Performance;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/configs/ch4/lession4_5_1/criticism.xml");
        Performance performance = context.getBean(Performance.class);
        performance.perform();
        context.close();
    }
}
