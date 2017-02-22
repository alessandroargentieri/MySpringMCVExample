package alex.mawashi.myspringmvcexample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/* Questa classe Java usa le librerie di Spring. La Dispatched Servlet (unica servlet e punto di accesso per Spring MVC a seconda dell'url che riceve, automaticamente invia la richiesta al giusto controller*/
@Controller
public class SpringFirstController {
    
    @RequestMapping(value = "/gimmeResponseBody", method=RequestMethod.GET)
    @ResponseBody
    public String sayHello() {
	return "<p> Ciao! Questa risposta è direttamente ottenuta con il @ResponseBody! </p>";
    }
    
    @RequestMapping(value = "/")
    @ResponseBody
    public String kimoNO() {
	return "jspPage";
    }
        
}
