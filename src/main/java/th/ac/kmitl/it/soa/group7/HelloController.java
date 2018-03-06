package th.ac.kmitl.it.soa.group7;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	//TO DO in the future
	@RequestMapping("/")
	@ResponseBody
    public String core() {
        return "e-Tax Invoice Project";
    }
}
