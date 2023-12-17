<%@page import="java.util.Enumeration"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="boardone.*"%>
<%@page import="java.sql.Timestamp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%-- <jsp:useBean id="article" scope="page" class="boardone.BoardVO">
	<jsp:setProperty name="article" property="*" />
</jsp:useBean> --%>
<!-- 원본 -->
<%-- <% 
article.setRegdate(new Timestamp(System.currentTimeMillis()));
article.setIp(request.getRemoteAddr());
BoardDAO dbPro = BoardDAO.getInstance();
dbPro.insertArticle(article);
response.sendRedirect("list.jsp");
%> --%>
<!-- 원본 -->
<%

String uploadPath = request.getSession().getServletContext().getRealPath("/upload");
int size = 10 * 1024 * 1024;
MultipartRequest multi = new MultipartRequest(request, uploadPath, size, "UTF-8", new DefaultFileRenamePolicy());


String filename1 = "";
String origfilename1 = "";
Enumeration files = multi.getFileNames();
String file1 = (String) files.nextElement();
//실제 파일명과 서버에 저장한 파일명을 둘 다 DB에 저장한다
filename1 = multi.getFilesystemName(file1);
origfilename1 = multi.getOriginalFileName(file1);

/* 
System.out.println(filename1);//--------------print
System.out.println(origfilename1);//--------------print
Enumeration e = multi.getParameterNames();
while(e.hasMoreElements()){
	System.out.println((String)e.nextElement());//--------------print
}
while(files.hasMoreElements()){
	System.out.println((String)files.nextElement());//--------------print
}
 */
 
//글내용 
BoardVO article = new BoardVO();
article.setWriter(multi.getParameter("writer"));
article.setEmail(multi.getParameter("email"));
article.setSubject(multi.getParameter("subject"));
article.setContent(multi.getParameter("content"));
article.setPass(multi.getParameter("pass"));
article.setRegdate(new Timestamp(System.currentTimeMillis()));
article.setIp(request.getRemoteAddr());

article.setFilename(filename1);
article.setOrigfilename(origfilename1);

BoardDAO dbPro = BoardDAO.getInstance();
dbPro.insertArticle(article);
response.sendRedirect("list.jsp");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>