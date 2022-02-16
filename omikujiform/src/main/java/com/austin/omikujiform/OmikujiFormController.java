package com.austin.omikujiform;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OmikujiFormController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping(value="/omikuji", method=RequestMethod.POST)
	public String omikuji(
			HttpSession session,
			@RequestParam(value="number") Integer number,
			@RequestParam(value="city") String city,
			@RequestParam(value="name") String name,
			@RequestParam(value="hobby") String hobby,
			@RequestParam(value="living") String living,
			@RequestParam(value="message") String message) {
		session.setAttribute("number", number);
		session.setAttribute("city", city);
		session.setAttribute("name", name);
		session.setAttribute("hobby", hobby);
		session.setAttribute("living", living);
		session.setAttribute("message", message);
		return "redirect:/show";
	}
	
	@RequestMapping("/show")
	public String message() {

		return "message.jsp";
	}
}
