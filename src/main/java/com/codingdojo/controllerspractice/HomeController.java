package com.codingdojo.controllerspractice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
//@RestController
//public class HomeController {
//	 	@RequestMapping("/greeting")
//	    public String index(){
//	      return "Hello user!";
//	    }
//	    // you can be explicit about the request as well
//	    @RequestMapping(value="/greeting/hello", method=RequestMethod.GET)
//	    public String hello(){
//	      return "Hello world! What route did you use to access me?";
//	    }
//	    @RequestMapping("/greeting/goodbye")
//	    public String world(){
//	      return "Goodbye world!";
//	    }
//}
@RestController
@RequestMapping("/greeting")
public class HomeController {
    @RequestMapping("")
    public String index(){
      return "This is accessed view http://your_server/simple/root";
    }
    @RequestMapping("/hello")
    public String hello(){
      return "Hello world! What route did you use to access me?";
    }
    @RequestMapping("/goodbye")
    public String world(){
      return "Goodbye world!";
    }
}