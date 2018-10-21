package com.apress.springrecipes.sequence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.apress.springrecipes.sequence.cls.SequenceGenerator;
import com.apress.springrecipes.sequence.component.SequenceDao;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// 1. IoC 컨테이너를 인스턴스화
		// ApplicationContext context = new AnnotationConfigApplicationContext(SequenceGeneratorConfiguration.class);
		ApplicationContext context = new AnnotationConfigApplicationContext("com.apress.springrecipes.sequence");
		
		// 2. IoC 컨테이너에서 POJO 인스턴스/빈 가져오기
		// SequenceGenerator generator = (SequenceGenerator) context.getBean("hyot");
		// SequenceGenerator generator = context.getBean("hyot", SequenceGenerator.class);
		SequenceGenerator generator = context.getBean(SequenceGenerator.class); // 빈이 한개면 생략 가능
		SequenceDao sequenceDao = context.getBean(SequenceDao.class);
		
		// 3. 빈에서 값 출력
		System.out.println(generator.getSequence());
		System.out.println(generator.getSequence());
		System.out.println(sequenceDao.getNextValue("IT"));
		System.out.println(sequenceDao.getNextValue("IT"));
	}
}
