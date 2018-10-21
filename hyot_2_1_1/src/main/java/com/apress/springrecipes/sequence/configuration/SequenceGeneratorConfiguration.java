package com.apress.springrecipes.sequence.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.apress.springrecipes.sequence.cls.SequenceGenerator;

@Configuration
public class SequenceGeneratorConfiguration {
	
	@Bean(name="hyot") // name �����ϸ� Bean���� �Լ���� ����
	public SequenceGenerator sequenceGenerator() {
		SequenceGenerator seqgen = new SequenceGenerator();
		seqgen.setPrefix("30");
		seqgen.setSuffix("A");
		seqgen.setInitial(100000);
		
		return seqgen;
	}
}
