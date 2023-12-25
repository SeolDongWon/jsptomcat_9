<%@page import="java.util.Enumeration"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="boardone.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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

System.out.println(filename1);
System.out.println(origfilename1);
Enumeration e = multi.getParameterNames();
while (e.hasMoreElements()) {
	System.out.println((String) e.nextElement());
}
while (files.hasMoreElements()) {
	System.out.println((String) files.nextElement());
}

//글내용 
BoardVO article = new BoardVO();
article.setWriter(multi.getParameter("writer"));
article.setEmail(multi.getParameter("email"));
article.setSubject(multi.getParameter("subject"));
article.setContent(multi.getParameter("content"));
article.setPass(multi.getParameter("pass"));
article.setFilename(filename1);
article.setOrigfilename(origfilename1);
String pageNum = request.getParameter("pageNum");
article.setNum(Integer.parseInt(pageNum));

BoardDAO dbPro = BoardDAO.getInstance();
int check = dbPro.updateArticle(article);
if (check == 1) {
%>
<meta http-equiv="Refresh" content="0;url=list.jsp?pageNum=<%=pageNum%>">
<%
} else {
%>
<%-- <%

String pageNum = request.getParameter("pageNum");
BoardDAO dbPro = BoardDAO.getInstance();
int check = dbPro.updateArticle(article);
if (check == 1) {
%>
<meta http-equiv="Refresh" content="0;url=list.jsp?pageNum=<%=pageNum%>">
<%
} else {
%> --%>
<script lang="javascript">
<!--
	alert("비밀번호가 맞지 않습니다")
	history.go(-1);
	-->
</script>
<%
}
%>