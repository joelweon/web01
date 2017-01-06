package bitcamp.servlet11;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
  @Override
  protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//    web.xml에서 설정된 초기화 파라미터 값 가져오기
    System.out.println("MyServlet");
    System.out.printf("name=%s\n", this.getInitParameter("name"));
    System.out.printf("age=%s\n", this.getInitParameter("age"));
    
    
//    HttpServlet을 상속받지 않은 경우 ServletConfig 객체를 만들어 사용한다.
    ServletConfig config =this.getServletConfig();
    System.out.printf("name=%s\n", config.getInitParameter("name"));
    System.out.printf("age=%s\n", config.getInitParameter("age"));
    
    ServletContext context = this.getServletContext();
    System.out.println("MyServletContextListener");
    System.out.printf("name=%s\n", context.getInitParameter("name"));
    System.out.printf("age=%s\n", context.getInitParameter("age"));
    
  }
}
