package kr.co.chunjae;

import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j
public class HomeController {
	@RequestMapping({"", "/"})
	public String home() {
		log.info("Welcome Home!");
		return "index";
	}

}