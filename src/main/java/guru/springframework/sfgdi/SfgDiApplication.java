package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		var ctx=SpringApplication.run(SfgDiApplication.class, args);
		MyController myController=(MyController) ctx.getBean("myController");
		String greeting=myController.sayHello();
		System.out.println(greeting);
	}

}
