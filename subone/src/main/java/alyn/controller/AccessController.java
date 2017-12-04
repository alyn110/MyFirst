package alyn.controller;

import alyn.bean.UserSessionBean;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.util.Map;

@Controller
@RequestMapping(value="/login")
public class AccessController {
    private static Log logger = LogFactory.getLog(AccessController.class);

    @RequestMapping(value="/doLogin", method= RequestMethod.POST)
    public void doLogin(HttpServletRequest request, HttpServletResponse response, @RequestBody Map<String, Object> params){

        String userName = String.valueOf(params.get("userName"));
        String password = String.valueOf(params.get("password"));

        UserSessionBean user = new UserSessionBean();
        user.setName(userName);
        user.setPassword(password);
        HttpSession session = request.getSession();
        session.setAttribute("user", user);


    }

    public static void main(String[] args){
        UserSessionBean user = new UserSessionBean();
        user.setName("alyn");
        user.setPassword("123456");
        logger.info(user);
//        File f = new File("D:" + File.separator + "test.txt") ; // 定义保存路径
//        ObjectOutputStream oos = null ; // 声明对象输出流
//        OutputStream out = null;    // 文件输出流
//        try {
//            out = new FileOutputStream(f);
//            oos = new ObjectOutputStream(out) ;
//            oos.writeObject(user) ;  // 保存对象
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            try {
//                oos.close() ;   // 关闭
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//        }
//
//        UserSessionBean user1 = new UserSessionBean();
//        try {
//            FileInputStream is = new FileInputStream(f);
//            ObjectInputStream ois = new ObjectInputStream(is);
//            user1 = (UserSessionBean)ois.readObject();
//            logger.info(user1);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
    }

}
