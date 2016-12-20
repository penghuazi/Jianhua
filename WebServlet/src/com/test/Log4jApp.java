package com.test;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
public class Log4jApp {
   public static void main(String[] args) {
      // DOMConfigurator.configure("E:/study/log4j/log4j.xml");//加载.xml文件
       PropertyConfigurator.configure("D:/Legend_1/Jianhua/WebServlet/src/log4j.properties");//加载.properties文件
       Logger log=Logger.getLogger("org.zblog.test");
       log.info("测试");
   }
}
