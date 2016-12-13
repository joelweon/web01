/* 주제: HttpServlet
 * => GenericServlet을 상속 받아서
 *    Service() 메서드의 파라미터를 형변환하고,
 *    GET/POST/HEAD/... 등 메서드에 따라
 *    doGet(), doPost(), doHead()... 등 메서드를 호출한다.
 * => 서블릿을 만들 떄 GenericServlet 클래스를 상속 받는 것 보다
 *    이 클래스를 상속 받는
 * => servlet/servlet26.html 로 테스트 한다.
 */
package bitcamp.servlet4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/servlet26")
public class Servlet26 extends HttpServlet {
  private static final long serialVersionUID = 1L;
    
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
//    이렇게 AbstractHttpServlet 클래스에 추가된 sevice() 메서드를 재정의하면 
//    오리지널 service()를 구현하는 것보다 편한다.
//    어떤 점에서?  파라미터를 HttpServletRequest와 HttpServletResponse로
//    형변환 할 필요가 없다.
    response.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println("요청처리");
        
  }
}

