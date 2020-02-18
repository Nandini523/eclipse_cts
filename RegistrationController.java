package jbr.springmvc;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import jbr.springmvc.Dao.UserService;
import jbr.springmvc.pojos.User;
@Controller
public class RegistrationController {
	@Autowired
	  public UserService userService;
	 @RequestMapping(value = "/register", method = RequestMethod.GET)
	  public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response) {
	    ModelAndView mav = new ModelAndView("register");
	    mav.addObject("user", new User());
	    return mav;
	  }
	 @RequestMapping(value = "/registerProcess", method = RequestMethod.POST)
	  public ModelAndView showregisterProcess(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("user") User user) {
	  //  ModelAndView mav = new ModelAndView("register");
		  userService.register(user);
		 System.out.println(user);
		  return new ModelAndView("welcome", "firstname", user.getFirstname());
		  }
	 @RequestMapping(value = "/getAlluser", method = RequestMethod.GET)
	  public ModelAndView getAlluser(HttpServletRequest request, HttpServletResponse response) {
	    ModelAndView mav = new ModelAndView("usersList");
	    List<User> getAlluser=userService.getAlluser();
	    mav.addObject("usersList", getAlluser);
	    return mav;
	  }
}
