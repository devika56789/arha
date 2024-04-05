package apple;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Text9 {

	public static void main(String[] args) 
	{
		Resource rs=new ClassPathResource("ApplicationContext2.xml");
		BeanFactory bn=new XmlBeanFactory(rs);
		Employeee e=(Employeee)bn.getBean("emp");
		e.disp();

	

	}

}
