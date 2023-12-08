/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.83
 * Generated at: 2023-12-08 00:22:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.boardone;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import boardone.*;
import java.text.SimpleDateFormat;

public final class updateForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

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
      out.write('\r');
      out.write('\n');

String bodyback_c = "#e0ffff";
String back_c = "#8fbc8f";
String title_c = "#5f9ea0";
String value_c = "#b0e0e6";
String bar = "#778899";

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>게시판</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"style.css\" type=\"text/css\" />\r\n");
      out.write("<script lang=\"javascript\" src=\"script.js\"></script>\r\n");
      out.write("</head>\r\n");

int num = Integer.parseInt(request.getParameter("num"));
String pageNum = request.getParameter("pageNum");
try {
	BoardDAO dbPro = BoardDAO.getInstance();
	BoardVO article = dbPro.getArticle(num);
	String filename1 = article.getFilename();
	String origfilename1 = article.getOrigfilename();

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body bgcolor=\"");
      out.print(bodyback_c);
      out.write("\">\r\n");
      out.write("	<b>글수정</b>\r\n");
      out.write("	<br>\r\n");
      out.write("	<form method=\"post\" name=\"writeform\"\r\n");
      out.write("		action=\"updateProc.jsp?pageNum=");
      out.print(pageNum);
      out.write("\"\r\n");
      out.write("		onsubmit=\"return writeSave()\" enctype=\"multipart/form-data\">\r\n");
      out.write("\r\n");
      out.write("		<table width=\"400\" border=\"1\" cellpadding=\"0\" cellspacing=\"0\"\r\n");
      out.write("			align=\"center\" bgcolor=\"");
      out.print(bodyback_c);
      out.write("\">\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td width=\"70\" bgcolor=\"");
      out.print(value_c);
      out.write("\" align=\"center\">이름</td>\r\n");
      out.write("				<td width=\"330\"><input type=\"text\" size=\"10\" maxlength=\"10\"\r\n");
      out.write("					name=\"writer\" value=\"");
      out.print(article.getWriter());
      out.write("\" /><input\r\n");
      out.write("					type=\"hidden\" name=\"num\" value=\"");
      out.print(num);
      out.write("\"></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td width=\"70\" bgcolor=\"");
      out.print(value_c);
      out.write("\" align=\"center\">제목</td>\r\n");
      out.write("				<td align=\"left\" width=\"330\"><input type=\"text\" size=\"40\"\r\n");
      out.write("					maxlength=\"50\" name=\"subject\" value=\"");
      out.print(article.getSubject());
      out.write("\" />\r\n");
      out.write("				</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td width=\"70\" bgcolor=\"");
      out.print(value_c);
      out.write("\" align=\"center\">Email</td>\r\n");
      out.write("				<td align=\"left\" width=\"330\"><input type=\"text\" size=\"40\"\r\n");
      out.write("					maxlength=\"30\" name=\"email\" value=\"");
      out.print(article.getEmail());
      out.write("\" /></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td width=\"70\" bgcolor=\"");
      out.print(value_c);
      out.write("\" align=\"center\">내용</td>\r\n");
      out.write("				<td align=\"left\" width=\"330\">\r\n");
      out.write("					<textarea name=\"content\" rows=\"13\"cols=\"40\">\r\n");
      out.write("						");
      out.print(article.getContent());
      out.write("\r\n");
      out.write("					</textarea>\r\n");
      out.write("			</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td>파일명1</td>\r\n");
      out.write("				<td>\r\n");
      out.write("					<a id=oldfile href=\"/jsptomcat9/upload/");
      out.print(filename1);
      out.write('"');
      out.write('>');
      out.write(' ');
      out.print(origfilename1);
      out.write("</a>\r\n");
      out.write("					<input id=newfile type=\"file\" name=\"fileName1\">\r\n");
      out.write("					<input	type=\"button\" value=\"파일삭제\" onclick=\"deleteFile()\" />\r\n");
      out.write("				</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td width=\"70\" bgcolor=\"");
      out.print(value_c);
      out.write("\" align=\"center\">비밀번호</td>\r\n");
      out.write("				<td align=\"left\" width=\"330\"><input type=\"password\" size=\"8\"\r\n");
      out.write("					maxlength=\"12\" name=\"pass\" /></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td colspan=\"2\" bgcolor=\"");
      out.print(value_c);
      out.write("\" align=\"center\"><input\r\n");
      out.write("					type=\"submit\" value=\"글수정\" /> <input type=\"reset\" value=\"다시작성\" />\r\n");
      out.write("					<input type=\"button\" value=\"목록보기\"\r\n");
      out.write("					onclick=\"document.location.href='list.jsp?pageNum=");
      out.print(pageNum);
      out.write("'\"></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("		</table>\r\n");
      out.write("		");

		} catch (Exception e) {
		}
		
      out.write("\r\n");
      out.write("	</form>\r\n");
      out.write("</body>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function deleteFile(){\r\n");
      out.write("	document.getElementById(\"oldfile\").style=\"display:none\";\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
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
