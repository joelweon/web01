/* 주제: ServletContextAttributeListener
 *   
 * */
package bitcamp.servlet7;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;

//  ServletContext에 데이터를 저장하거나 꺼낼 때 발생하는 이벤트 처리
@WebListener
public class Listener2 implements ServletContextAttributeListener {

  @Override
  public void attributeAdded(ServletContextAttributeEvent event) {
    System.out.println("ServletContextAttributeListener.attributeAdded()");
    System.out.printf("%s=%s\n", event.getName(), event.getValue());
  }

  @Override
  public void attributeRemoved(ServletContextAttributeEvent event) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void attributeReplaced(ServletContextAttributeEvent event) {
    // TODO Auto-generated method stub
    
  }
  
}


































