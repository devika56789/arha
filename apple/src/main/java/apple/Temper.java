package apple;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Temper 
{

	public static void main(String[] args)
	{
		Resource rs=new ClassPathResource("ApplyContext.xml");
		BeanFactory bn=new XmlBeanFactory(rs);
		Manager m=(Manager)bn.getBean("mng");
		m.disp();


	}

}
