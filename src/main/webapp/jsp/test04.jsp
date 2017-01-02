<%@ page import="java.util.Map"%>
<%@ page language="java"
    contentType="text/html;
    charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"
    import="java.util.ArrayList,java.net.Socket,java.sql.Date"%>
<%@ page import="java.util.HashSet,java.util.HashMap"%>
<%-- JSP의 구성 요소--%>
<%--
6) 지시어(Directive element)
  - 각 속성은 특정 자바 코드로 바뀐다.
--%>

<%-- include 지시어
=> forward/include 의 그 include 아니다!
=> 그냥 현재 JSP 페이지에 파일을 삽입한 후 자바 코드를 생성한다.
=> 주요 속성
file  : 삽입할 파일의 경로 지정
--%>

<%@ include file="header.txt" %>
<h1>test04</h1>
<%@ include file="footer.txt" %>

























