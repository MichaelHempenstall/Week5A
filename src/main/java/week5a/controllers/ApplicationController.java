package week5a.controllers;

// Import framework dependencies - required to handle the HTTP request and send a response
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

// The @ annotation identifies this as a Controller class
@Controller
public class ApplicationController {

    // This method, index(), serves as the site index - the default page
    // Requests for the root '/' will be handled by this method
    @RequestMapping(value = "/", method = RequestMethod.GET)
    //@ResponseBody // Send a direct response without a view template
    public String index() {
        // Return some text (this will be the response back to the browser)
        //return "Hello World! This is the Home page";
        return "index";
    }

    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String about() {
        return "about";
    }

}