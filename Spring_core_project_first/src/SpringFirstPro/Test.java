package SpringFirstPro;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		    Resource resource=new ClassPathResource("FirstProject.xml");  
		    System.out.println(resource);
		    BeanFactory factory=new XmlBeanFactory(resource);
		    System.out.println(factory);
		    
		    Ram ram=(Ram) factory.getBean("ram");
		    ram.add();
		    ram.remove();
		    System.out.println(ram);
		    
		    Ram ram2=(Ram) factory.getBean("ram");
		    ram2.add();
		    ram2.remove(); 
		    System.out.println(ram2);
		    
		    Shyam shyam=(Shyam) factory.getBean("shyam");
		    shyam.add();
		    shyam.remove();
		    System.out.println(shyam);
		    
		    Ram ramSecond=(Ram) factory.getBean("ram2");
		    ramSecond.add();
		    ramSecond.remove();
		    System.out.println(ramSecond);
	}

}
