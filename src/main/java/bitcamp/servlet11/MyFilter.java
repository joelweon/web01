package bitcamp.servlet11;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter {
  FilterConfig config;

  @Override //필터 객체가 생성되면 처음에 init호출, 준비할게 있으면 준비한다. 
  public void init(FilterConfig filterConfig) throws ServletException {
    this.config = filterConfig;   //파라미터는 톰캣이 주는 것
  }

  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
      throws IOException, ServletException {
//    web.xml에 설정된 초기
    System.out.println("MyFilter");
    System.out.printf("name=%s\n", config.getInitParameter("name"));
    System.out.printf("age=%s\n", config.getInitParameter("age"));
    
    ServletContext context = request.getServletContext();
    System.out.println("MyServletContextListener");
    System.out.printf("name=%s\n", context.getInitParameter("name"));
    System.out.printf("age=%s\n", context.getInitParameter("age"));
    
    //다음필터로 이동 또는 서블릿 실행
    chain.doFilter(request, response);
  }

  @Override
  public void destroy() {
    
  }
  
}
