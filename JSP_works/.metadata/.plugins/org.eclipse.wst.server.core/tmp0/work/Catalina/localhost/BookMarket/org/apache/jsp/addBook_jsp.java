/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.28
 * Generated at: 2024-10-14 03:37:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class addBook_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/menu.jsp", Long.valueOf(1684891920000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
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

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
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

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
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

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <link rel =\"stylesheet\" href =\"./resources/css/bootstrap.min.css\" />\r\n");
      out.write("<title>도서 등록</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container py-4\">\r\n");
      out.write("   ");
      out.write(" <header class=\"pb-3 mb-4 border-bottom\">\r\n");
      out.write("      <a href=\"./welcome.jsp\" class=\"d-flex align-items-center text-dark text-decoration-none\">\r\n");
      out.write("      <svg  width=\"32\" height=\"32\" fill=\"currentColor\" class=\"bi bi-house-fill\" viewBox=\"0 0 16 16\">\r\n");
      out.write("  			<path d=\"M8.707 1.5a1 1 0 0 0-1.414 0L.646 8.146a.5.5 0 0 0 .708.708L8 2.207l6.646 6.647a.5.5 0 0 0 .708-.708L13 5.793V2.5a.5.5 0 0 0-.5-.5h-1a.5.5 0 0 0-.5.5v1.293L8.707 1.5Z\"/>\r\n");
      out.write("  			<path d=\"m8 3.293 6 6V13.5a1.5 1.5 0 0 1-1.5 1.5h-9A1.5 1.5 0 0 1 2 13.5V9.293l6-6Z\"/>\r\n");
      out.write("		</svg>   \r\n");
      out.write("        <span class=\"fs-4\">Home</span>\r\n");
      out.write("      </a>    \r\n");
      out.write("    </header>    ");
      out.write("	\r\n");
      out.write("\r\n");
      out.write("   <div class=\"p-5 mb-4 bg-body-tertiary rounded-3\">\r\n");
      out.write("      <div class=\"container-fluid py-5\">\r\n");
      out.write("        <h1 class=\"display-5 fw-bold\">도서 등록</h1>\r\n");
      out.write("        <p class=\"col-md-8 fs-4\">Book Addition</p>      \r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  \r\n");
      out.write("	 <div class=\"row align-items-md-stretch\">	 	\r\n");
      out.write("		<form name=\"newBook\" action=\"./processAddBook.jsp\" method=\"post\">\r\n");
      out.write("		\r\n");
      out.write("			\r\n");
      out.write("			<div class=\"mb-3 row\">\r\n");
      out.write("				<label class=\"col-sm-2\">도서코드</label>\r\n");
      out.write("				<div class=\"col-sm-3\">\r\n");
      out.write("					<input type=\"text\" name=\"bookId\" class=\"form-control\" >\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"mb-3 row\">\r\n");
      out.write("				<label class=\"col-sm-2\">도서명</label>\r\n");
      out.write("				<div class=\"col-sm-3\">\r\n");
      out.write("					<input type=\"text\" name=\"name\" class=\"form-control\" >\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("				<div class=\"mb-3 row\">\r\n");
      out.write("				<label class=\"col-sm-2\">가격</label>\r\n");
      out.write("				<div class=\"col-sm-3\">\r\n");
      out.write("					<input type=\"text\" name=\"unitPrice\" class=\"form-control\" >\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"mb-3 row\">\r\n");
      out.write("				<label class=\"col-sm-2\">저자</label>\r\n");
      out.write("				<div class=\"col-sm-3\">\r\n");
      out.write("					<input type=\"text\" name=\"author\" class=\"form-control\">\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"mb-3 row\">\r\n");
      out.write("				<label class=\"col-sm-2\">출판사</label>\r\n");
      out.write("				<div class=\"col-sm-3\">\r\n");
      out.write("					<input type=\"text\" name=\"publisher\" class=\"form-control\">\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"mb-3 row\">\r\n");
      out.write("				<label class=\"col-sm-2\">출판일</label>\r\n");
      out.write("				<div class=\"col-sm-3\">\r\n");
      out.write("					<input type=\"text\" name=\"releaseDate\" class=\"form-control\">\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("	\r\n");
      out.write("			<div class=\"mb-3 row\">\r\n");
      out.write("				<label class=\"col-sm-2\">상세정보</label>\r\n");
      out.write("				<div class=\"col-sm-5\">\r\n");
      out.write("					<textarea name=\"description\" cols=\"50\" rows=\"2\"\r\n");
      out.write("						class=\"form-control\" placeholder=\"100자 이상 적어주세요\"></textarea>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>			\r\n");
      out.write("			<div class=\"mb-3 row\">\r\n");
      out.write("				<label class=\"col-sm-2\">분류</label>\r\n");
      out.write("				<div class=\"col-sm-3\">\r\n");
      out.write("					<input type=\"text\" name=\"category\" class=\"form-control\" >\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("				<div class=\"mb-3 row\">\r\n");
      out.write("				<label class=\"col-sm-2\">재고수</label>\r\n");
      out.write("				<div class=\"col-sm-3\">\r\n");
      out.write("					<input type=\"text\" name=\"unitsInStock\" class=\"form-control\" >\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"mb-3 row\">\r\n");
      out.write("				<label class=\"col-sm-2\">상태</label>\r\n");
      out.write("				<div class=\"col-sm-5\">\r\n");
      out.write("					<input type=\"radio\" name=\"condition\" value=\"New \" > 신규도서 \r\n");
      out.write("					<input type=\"radio\" name=\"condition\" value=\"Old\" > 중고도서 \r\n");
      out.write("					<input type=\"radio\" name=\"condition\" value=\"EBook\" > E-Book\r\n");
      out.write("				</div>				\r\n");
      out.write("			</div>		\r\n");
      out.write("			<div class=\"mb-3 row\">\r\n");
      out.write("				<div class=\"col-sm-offset-2 col-sm-10 \">\r\n");
      out.write("					<input type=\"submit\" class=\"btn btn-primary\" value=\"등록\" >\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</form>\r\n");
      out.write("	</div>\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("</div>	\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
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