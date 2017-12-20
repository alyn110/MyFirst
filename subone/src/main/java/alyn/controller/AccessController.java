package alyn.controller;

import alyn.bean.ResponseBean;
import alyn.bean.UserBean;
import alyn.bean.UserSessionBean;
import alyn.dao.TransferDao;
import alyn.model.Transfer;
import com.google.gson.Gson;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value="/login")
public class AccessController {
    private static Log logger = LogFactory.getLog(AccessController.class);
    private static List<UserBean> userBeanList = new ArrayList<UserBean>();
    static {
        List<UserBean> userList = new ArrayList<UserBean>();
        userList.add(new UserBean("alyn", "123456"));
        userList.add(new UserBean("jessie", "abcdefg"));
        userBeanList = userList;
    }

    @RequestMapping(value="/doLogin", method= RequestMethod.POST)
    public void doLogin(HttpServletRequest request, HttpServletResponse response, @RequestBody UserBean userBean){
        if(userBeanList.contains(userBean)){
            logger.info("用户存在");
        }else{
            logger.info("用户不存在");
        }

        UserSessionBean user = new UserSessionBean();
        user.setName(userBean.getUserName());
        user.setPassword(userBean.getPassword());
        HttpSession session = request.getSession();
        session.setAttribute("user", user);
        if(session.isNew()){
            logger.info("session是新建的，" + session.getId());
        }else{
            logger.info("session已存在，" + session.getId());
        }
        ResponseBean responseBean = new ResponseBean();
        responseBean.setForward("/html/index.html");
        try {
            PrintWriter writer = response.getWriter();
            writer.write(new Gson().toJson(responseBean));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/spring-context.xml");
        TransferDao transferDao = (TransferDao)ac.getBean("transferDao");
        List<Transfer> transfers = transferDao.getAll();
        logger.info(transferDao);
    }

}
