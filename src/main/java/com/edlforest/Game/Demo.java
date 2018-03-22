package main.java;

import main.java.Agents.Player;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Demo {

    public static void main (String arg[]){
        ApplicationContext context = new ClassPathXmlApplicationContext("main/java/XMLs/AgentBean.xml");
        Player player = (Player) context.getBean("agt");
        System.out.println(player);
    }
}
