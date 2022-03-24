package org.springframework.boot;

import org.junit.Test;
import org.springframework.boot.wl.service.AService;
import org.springframework.boot.wl.service.BService;
import org.springframework.boot.wl.service.PrototypeService;
import org.springframework.boot.wl.service.ScanConfig;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.util.ClassUtils;

/**
 * @author: lang1.wang
 * @date: 2020/11/26 11:39
 */
public class SpringApplicationWLTests {

	@Test
	public void testServicePackage() throws Exception {
		String arg = "--spring.main.sources="+ClassUtils.getPackageName(getClass())+ ".wl.service";
		SpringApplication.main(new String[]{arg,"--spring.main.web-application-type=none"});
	}

	@Test
	public void testConfigBeanScan() throws Exception {
		String arg = "--spring.main.sources="+ ScanConfig.class.getName();
		SpringApplication.main(new String[]{arg,"--spring.main.web-application-type=none"});
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(ScanConfig.class, "--spring.main.web-application-type=none");

		try {
			System.out.println("debug ......");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		for (String definitionName : applicationContext.getBeanDefinitionNames()) {

			Object bean = applicationContext.getBean(definitionName);
			if(definitionName.equals("AService")){
				AService aService = (AService) bean;
				aService.say();
			}

			if(definitionName.equals("BService")){
				BService bService = (BService) bean;
				bService.say();
			}

			if(definitionName.equals("prototypeService")){
				PrototypeService prototypeService = (PrototypeService) bean;
				prototypeService.say();
			}
			System.out.println("bean:" + bean);
		}
	}
}
