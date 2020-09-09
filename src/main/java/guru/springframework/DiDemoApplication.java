package guru.springframework;

import guru.springframework.examplebeans.FakeDataSouce;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

//		MyController controller = (MyController) ctx.getBean("myController");

		FakeDataSouce fakeDataSouce = (FakeDataSouce) ctx.getBean("fakeDataSouce");
		System.out.println(fakeDataSouce.getUser());
		System.out.println(fakeDataSouce.getPassword());

		System.out.println(fakeDataSouce.getUrl());

	}
}
