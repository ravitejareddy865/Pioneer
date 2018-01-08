package Ravi.com.pioneer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentTest {
	
	@RequestMapping(value="/details",method=RequestMethod.GET )
	public ModelAndView view()
	{
		
		ModelAndView model=new ModelAndView();
		
		return model;
	}
	
	@RequestMapping("/details1")
	public ModelAndView view1(@ModelAttribute("student") Student student)
	{
		
		ModelAndView model1=new ModelAndView("show1");
		
		
		return model1;
	}
			

}
