package com.test;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
public class Log4jApp {
   public static void main(String[] args) {
      // DOMConfigurator.configure("E:/study/log4j/log4j.xml");//����.xml�ļ�
       PropertyConfigurator.configure("D:/Legend_1/Jianhua/WebServlet/src/log4j.properties");//����.properties�ļ�
       Logger log=Logger.getLogger("org.zblog.test");
       log.info("����");
   }
}
