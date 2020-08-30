package springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class HomeController {
	@RequestMapping("/show")
	public String home() {
		return "home";
	}
	@RequestMapping(path = "/search", method=RequestMethod.POST)
	public RedirectView search(@RequestParam("query") String search) {
		String url = "https://www.google.com/search?q="+search;
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(url);
		return redirectView;
	}
}
