package asciiPanel;

import javax.swing.JFrame;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Config {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("DIconfig.xml");

        // AsciiFont font = context.getBean(AsciiFont.class);

        AsciiPanel asciiPanel = (AsciiPanel) context.getBean("asciiPanel");

        asciiPanel.write("Welcome to Software Architecture!");
        JFrame jFrame = new JFrame();
        jFrame.add(asciiPanel);
        jFrame.pack();
        jFrame.setVisible(true);
    }

}