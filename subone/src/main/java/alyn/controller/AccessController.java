package alyn.controller;

import alyn.bean.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Controller
@RequestMapping(value="/login")
public class AccessController {
    private static Log logger = LogFactory.getLog(AccessController.class);

    @RequestMapping(value="/doLogin", method= RequestMethod.POST)
    public void doLogin(HttpServletRequest request, HttpServletResponse response, @RequestBody Map<String, Object> params){


        
    }
}
