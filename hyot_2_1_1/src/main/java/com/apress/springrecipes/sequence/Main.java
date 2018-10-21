package com.apress.springrecipes.sequence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.apress.springrecipes.sequence.cls.SequenceGenerator;
import com.apress.springrecipes.sequence.component.SequenceDao;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// 1. IoC �����̳ʸ� �ν��Ͻ�ȭ
		// ApplicationContext context = new AnnotationConfigApplicationContext(SequenceGeneratorConfiguration.class);
		ApplicationContext context = new AnnotationConfigApplicationContext("com.apress.springrecipes.sequence");
		
		// 2. IoC �����̳ʿ��� POJO �ν��Ͻ�/�� ��������
		// SequenceGenerator generator = (SequenceGenerator) context.getBean("hyot");
		// SequenceGenerator generator = context.getBean("hyot", SequenceGenerator.class);
		SequenceGenerator generator = context.getBean(SequenceGenerator.class); // ���� �Ѱ��� ���� ����
		SequenceDao sequenceDao = context.getBean(SequenceDao.class);
		
		// 3. �󿡼� �� ���
		System.out.println(generator.getSequence());
		System.out.println(generator.getSequence());
		System.out.println(sequenceDao.getNextValue("IT"));
		System.out.println(sequenceDao.getNextValue("IT"));
	}
}
