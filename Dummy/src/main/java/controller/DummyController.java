package controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class DummyController {

    private String environmentValue;

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping(value = "/getEnvironment", method = RequestMethod.GET)
    private String getEnvironmentValue(HttpServletRequest request, HttpServletResponse httpServletResponse, Model model){
        model.addAttribute("environment", environmentValue);
        return "environmentPage";
    }

}
