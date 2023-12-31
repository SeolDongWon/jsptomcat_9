/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.83
 * Generated at: 2023-12-07 07:06:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.boardone;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import boardone.BoardDAO;
import boardone.BoardVO;
import boardone.*;
import java.util.List;
import java.text.SimpleDateFormat;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

//수정<1>
int pageSize = 10;
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/boardone/view/color.jsp", Long.valueOf(1701932792956L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("boardone");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("boardone.BoardVO");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("boardone.BoardDAO");
    _jspx_imports_classes.add("java.text.SimpleDateFormat");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');

String bodyback_c = "#e0ffff";
String back_c = "#8fbc8f";
String title_c = "#5f9ea0";
String value_c = "#b0e0e6";
String bar = "#778899";

      out.write("\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');

//<수정2>
String pageNum = request.getParameter("pageNum");
if(pageNum==null){
	pageNum="1";
}
int currentPage = Integer.parseInt(pageNum);
int startRow = (currentPage-1)*pageSize+1;
int endRow=currentPage*pageSize;
int count = 0;
int number = 0;
List<BoardVO> articleList = null;
BoardDAO dbPro = BoardDAO.getInstance();
count = dbPro.getArticleCount();//전체글 수
if (count > 0) {
	articleList = dbPro.getArticlelist(startRow, endRow);//수정<3>
}
number = count-(currentPage-1)*pageSize;//수정<4> 

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>게시판</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"style1.css\" type=\"text/css\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body bgcolor=\"");
      out.print(bodyback_c);
      out.write("\">\r\n");
      out.write("	<b>글목록(전체글:");
      out.print(count);
      out.write(")\r\n");
      out.write("	</b>\r\n");
      out.write("	<!-- <table width=\"700\"> -->\r\n");
      out.write("	<table border=\"1\" width=\"700\" cellpadding=\"0\" cellspacing=\"0\" align=\"center\">\r\n");
      out.write("		<tr>\r\n");
      out.write("			<td align=\"right\" bgcolor=\"");
      out.print(value_c);
      out.write("\"><a href=\"writeForm.jsp\">글쓰기</a>\r\n");
      out.write("			</td>\r\n");
      out.write("		</tr>\r\n");
      out.write("	</table>\r\n");
      out.write("	");

	if (count == 0) {
	
      out.write("\r\n");
      out.write("	<table width=\"700\" border=\"1\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("		<tr>\r\n");
      out.write("			<td align=\"center\">게시판에 저장된 글이없습니다.</td>\r\n");
      out.write("		</tr>\r\n");
      out.write("	</table>\r\n");
      out.write("	");

	} else {
	
      out.write("\r\n");
      out.write("	<table border=\"1\" width=\"700\" cellpadding=\"0\" cellspacing=\"0\" align=\"center\">\r\n");
      out.write("		<tr height=\"30\" bgcolor=\"");
      out.print(value_c);
      out.write("\">\r\n");
      out.write("			<td align=\"center\" width=\"50\">번 호</td>\r\n");
      out.write("			<td align=\"center\" width=\"250\">제 목</td>\r\n");
      out.write("			<td align=\"center\" width=\"100\">작성자</td>\r\n");
      out.write("			<td align=\"center\" width=\"150\">작성일</td>\r\n");
      out.write("			<td align=\"center\" width=\"50\">조 회</td>\r\n");
      out.write("			<td align=\"center\" width=\"100\">IP</td>\r\n");
      out.write("		</tr>\r\n");
      out.write("		");

		for (int i = 0; i < articleList.size(); i++) {
			BoardVO article = (BoardVO) articleList.get(i);
		
      out.write("\r\n");
      out.write("		<tr height=\"30\">\r\n");
      out.write("			<td align=\"center\" width=\"50\">");
      out.print(number--);
      out.write("</td>\r\n");
      out.write("			<td width=\"250\">\r\n");
      out.write("<!-- 수정<5> --> \r\n");

int wid=0;
if(article.getDepth()>0){
	wid=5*(article.getDepth());


      out.write("\r\n");
      out.write("		<img src=\"images/level.gif\" width=\"");
      out.print(wid );
      out.write("\" height=\"16\">\r\n");
      out.write("		<img src=\"images/re.gif\">\r\n");
      out.write("		");
}else{ 
      out.write("\r\n");
      out.write("		<img src=\"images/level.gif\" width=\"");
      out.print(wid );
      out.write("\" height=\"16\">\r\n");
      out.write("		");
} 
      out.write("\r\n");
      out.write("			<a href=\"content.jsp?num=");
      out.print(article.getNum());
      out.write("&pageNum=");
      out.print(currentPage);
      out.write("\"> \r\n");
      out.write("			<!-- 수정<6> -->\r\n");
      out.write("					");
      out.print(article.getSubject());
      out.write("\r\n");
      out.write("			</a> \r\n");
      out.write("				");
 if (article.getReadcount() >= 20) {
 			
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" <img src=\"images/hot.gif\" border=\"0\" height=\"16\"> \r\n");
      out.write(" \r\n");
      out.write(" ");

 }
 
      out.write("\r\n");
      out.write("\r\n");
      out.write("			</td>\r\n");
      out.write("			<td align=\"center\" width=\"100\"><a\r\n");
      out.write("				href=\"mailto:");
      out.print(article.getEmail());
      out.write('"');
      out.write('>');
      out.print(article.getWriter());
      out.write("</a></td>\r\n");
      out.write("			<td align=\"center\" width=\"150\">");
      out.print(sdf.format(article.getRegdate()));
      out.write("</td>\r\n");
      out.write("			<td align=\"center\" width=\"50\">");
      out.print(article.getReadcount());
      out.write("</td>\r\n");
      out.write("			<td align=\"center\" width=\"100\">");
      out.print(article.getIp());
      out.write("</td>\r\n");
      out.write("		</tr>\r\n");
      out.write("		");
}	
      out.write("\r\n");
      out.write("	</table>\r\n");
      out.write("<div style=\"display:flex ;justify-content: center;\">\r\n");
      out.write("	");
}	
      out.write("\r\n");
      out.write("<!-- 수정<7> -->\r\n");

if(count>0){
	int pageBlock = 5;
	int imsi = count% pageSize == 0?0:1;
	int pageCount = count/pageSize+imsi;
	int startPage = (int)((currentPage-1)/pageBlock)*pageBlock+1;
	int endPage = startPage + pageBlock-1;
	if(endPage>pageCount){
		endPage=pageCount;
	}
	if(startPage>pageBlock){
		
      out.write("\r\n");
      out.write("		<a href=\"list.jsp?pageNum=");
      out.print(startPage-pageBlock );
      out.write("\">이전</a>\r\n");
      out.write("		\r\n");
      out.write("		");

	}
	for (int i=startPage;i<=endPage;i++)	{		
		
      out.write("\r\n");
      out.write("		<a href=\"list.jsp?pageNum=");
      out.print(i );
      out.write('"');
      out.write('>');
      out.write('[');
      out.print(i );
      out.write("]</a>\r\n");
      out.write("		");

		}
	if(startPage<pageBlock){
		
      out.write("\r\n");
      out.write("		<a href=\"list.jsp?pageNum=");
      out.print(startPage+pageBlock );
      out.write("\">다음</a>\r\n");
      out.write("		");

	}
}

      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
