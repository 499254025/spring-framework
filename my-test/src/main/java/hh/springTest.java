package hh;

import hh.config.appConfig;
import hh.service.UserService;
import org.junit.jupiter.api.parallel.Execution;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: 洪康靖
 * @creationTime: 2022/1/21 14:19
 */
public class springTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(appConfig.class);
//		new ClassPathXmlApplicationContext()
		UserService userService = (UserService) applicationContext.getBean("userService");
		System.out.println("1");
//		ClassPathXmlApplicationContext
		Lock lock = new ReentrantLock();
//		AtomicInteger
//		Executors.newCachedThreadPool()
		applicationContext.close();
	}
}
