package hh;

import hh.config.appConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: 洪康靖
 * @creationTime: 2022/1/21 14:19
 */
public class springTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(appConfig.class);
		System.out.println("1");
	}
}
