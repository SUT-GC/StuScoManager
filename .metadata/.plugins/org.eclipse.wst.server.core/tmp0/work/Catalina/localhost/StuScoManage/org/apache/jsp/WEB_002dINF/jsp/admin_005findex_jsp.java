/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.27
 * Generated at: 2016-01-04 05:04:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_005findex_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
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

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>成绩管理系统</title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\n");
      out.write("        <!-- Bootstrap -->\n");
      out.write("        <link href=\"/StuScoManage/css/bootstrap.min.css\" rel=\"stylesheet\" media=\"screen\">\n");
      out.write("        <link href=\"/StuScoManage/css/bootstrap-theme.min.css\" rel=\"stylesheet\" media=\"screen\">\n");
      out.write("\n");
      out.write("        <!-- Bootstrap Admin Theme -->\n");
      out.write("        <link href=\"/StuScoManage/css/bootstrap-admin-theme.css\" rel=\"stylesheet\" media=\"screen\">\n");
      out.write("\n");
      out.write("        <!-- Vendors -->\n");
      out.write("        <link href=\"/StuScoManage/vendors/easypiechart/jquery.easy-pie-chart.css\" rel=\"stylesheet\" media=\"screen\">\n");
      out.write("        <link href=\"/StuScoManage/vendors/easypiechart/jquery.easy-pie-chart_custom.css\" rel=\"stylesheet\" media=\"screen\">\n");
      out.write("        <link href=\"/StuScoManage/css/StuScoManager.css\" rel = \"stylesheet\" media=\"screen\">\n");
      out.write("        <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("           <script type=\"text/javascript\" src=\"js/html5shiv.js\"></script>\n");
      out.write("           <script type=\"text/javascript\" src=\"js/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("    </head>\n");
      out.write("    <body class=\"bootstrap-admin-with-small-navbar\">\n");
      out.write("     <nav class=\"navbar navbar-default navbar-inverse navbar-fixed-top \" role=\"navigation\">\n");
      out.write("\t <div class=\"container\">\n");
      out.write("       <div class=\"row\">\n");
      out.write("\t\t  <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("\t\t  <div class=\"navbar-header\">\n");
      out.write("\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("\t\t\t  <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("\t\t\t  <span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t  <span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t  <span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t</button>\n");
      out.write("\t\t\t<a class=\"navbar-brand\" href=\"#\">学生成绩管理系统</a>\n");
      out.write("\t\t  </div>\n");
      out.write("\t\t  <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("\t\t  <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\t\t\t  <li class=\"dropdown\">\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">管理员<b class=\"caret\"></b></a>\n");
      out.write("\t\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t  <li><a href=\"#\">账户中心</a></li>\n");
      out.write("\t\t\t\t  <li class=\"divider\"></li>\n");
      out.write("\t\t\t\t  <li><a href=\"#\">退出登录</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t  </li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t  </div><!-- /.navbar-collapse -->\n");
      out.write("\t\t  </div>\n");
      out.write("\t\t  </div>\n");
      out.write("\t\t</nav>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <!-- left, vertical navbar & content -->\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <!-- left, vertical navbar -->\n");
      out.write("                <div class=\"col-md-2 bootstrap-admin-col-left\">\n");
      out.write("                     <ul class=\"nav navbar-collapse collapse bootstrap-admin-navbar-side\">\n");
      out.write("                       <!--菜单栏start-->\n");
      out.write("                            <div class=\"panel-group\" id=\"accordion\" role=\"tablist\" aria-multiselectable=\"true\">\n");
      out.write("                              <div class=\"panel panel-default\">\n");
      out.write("                                <div class=\"panel-heading\" role=\"tab\" id=\"headingOne\">\n");
      out.write("                                  <h4 class=\"panel-title\">\n");
      out.write("                                    <a role=\"button\" data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapseOne\" aria-expanded=\"true\" aria-controls=\"collapseOne\">\n");
      out.write("                                        增加信息\n");
      out.write("                                    </a>\n");
      out.write("                                  </h4>\n");
      out.write("                                </div>\n");
      out.write("                                <!--这里的in class 代表着是否显示该栏-->\n");
      out.write("                                <div id=\"collapseOne\" class=\"panel-collapse collapse\" role=\"tabpanel\" aria-labelledby=\"headingOne\">\n");
      out.write("                                  <div class=\"panel-body\">\n");
      out.write("                                     <li >\n");
      out.write("                                        <a href=\"admin_addstudent.html\"><i class=\"glyphicon glyphicon-chevron-right\"></i> 添加学生信息</a>\n");
      out.write("                                     </li>\n");
      out.write("                                     <hr/>\n");
      out.write("                                     <li >\n");
      out.write("                                        <a href=\"admin_addteacher.html\"><i class=\"glyphicon glyphicon-chevron-right\"></i> 添加教师信息</a>\n");
      out.write("                                     </li>\n");
      out.write("                                     <hr/>\n");
      out.write("                                    <li >\n");
      out.write("                                        <a href=\"admin_addcourse.html\"><i class=\"glyphicon glyphicon-chevron-right\"></i> 添加课程信息</a>\n");
      out.write("                                     </li>\n");
      out.write("                                     <hr/>\n");
      out.write("                                    <li >\n");
      out.write("                                        <a href=\"admin_addadmin.html\"><i class=\"glyphicon glyphicon-chevron-right\"></i> 添加管理员</a>\n");
      out.write("                                     </li>\n");
      out.write("                                     <hr/>\n");
      out.write("                                      <li >\n");
      out.write("                                        <a href=\"admin_addteacourse.html\"><i class=\"glyphicon glyphicon-chevron-right\"></i> 添加教课信息</a>\n");
      out.write("                                     </li>\n");
      out.write("                                  </div>\n");
      out.write("                                </div>\n");
      out.write("                              </div>\n");
      out.write("                              <div class=\"panel panel-default\">\n");
      out.write("                                <div class=\"panel-heading\" role=\"tab\" id=\"headingTwo\">\n");
      out.write("                                  <h4 class=\"panel-title\">\n");
      out.write("                                    <a class=\"collapsed\" role=\"button\" data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapseTwo\" aria-expanded=\"false\" aria-controls=\"collapseTwo\">\n");
      out.write("                                        编辑信息\n");
      out.write("                                    </a>\n");
      out.write("                                  </h4>\n");
      out.write("                                </div>\n");
      out.write("                                <div id=\"collapseTwo\" class=\"panel-collapse collapse\" role=\"tabpanel\" aria-labelledby=\"headingTwo\">\n");
      out.write("                                  <div class=\"panel-body\">\n");
      out.write("                                     <li >\n");
      out.write("                                        <a href=\"admin_editstudent.html\"><i class=\"glyphicon glyphicon-chevron-right\"></i> 编辑学生信息</a>\n");
      out.write("                                     </li>\n");
      out.write("                                     <hr/>\n");
      out.write("                                     <li >\n");
      out.write("                                        <a href=\"admin_editteacher.html\"><i class=\"glyphicon glyphicon-chevron-right\"></i> 编辑教师信息</a>\n");
      out.write("                                     </li>\n");
      out.write("                                     <hr/>\n");
      out.write("                                    <li >\n");
      out.write("                                        <a href=\"admin_editcourse.html\"><i class=\"glyphicon glyphicon-chevron-right\"></i> 编辑课程信息</a>\n");
      out.write("                                     </li>\n");
      out.write("                                     <hr/>\n");
      out.write("                                    <li >\n");
      out.write("                                        <a href=\"admin_editadmin\"><i class=\"glyphicon glyphicon-chevron-right\"></i> 编辑管理员</a>\n");
      out.write("                                     </li>\n");
      out.write("                                     <hr/>\n");
      out.write("                                     <li >\n");
      out.write("                                        <a href=\"admin_editteacourse.html\"><i class=\"glyphicon glyphicon-chevron-right\"></i> 编辑教课信息</a>\n");
      out.write("                                     </li>\n");
      out.write("                                  </div>\n");
      out.write("                                </div>\n");
      out.write("                              </div>\n");
      out.write("                            </div>\n");
      out.write("                       <!--菜单栏end-->\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- content -->\n");
      out.write("                <div class=\"col-md-10\">\n");
      out.write("\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"panel panel-default bootstrap-admin-no-table-panel\">\n");
      out.write("                            <div class=\"alert alert-success admin_loginsuccess\" role=\"alert\"><span>恭喜您登陆成功（登陆时间    2015-11-14  22：22）<span></div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <hr>\n");
      out.write("                <footer role=\"contentinfo\">\n");
      out.write("                    <p>&copy; 2016 <a href=\"#\" target=\"_blank\">GC</a></p>\n");
      out.write("                </footer>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("        <script type=\"text/javascript\" src=\"http://code.jquery.com/jquery-2.0.3.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Include all compiled plugins (below), or include individual files as needed -->\n");
      out.write("        <script type=\"text/javascript\" src=\"/StuScoManage/js/bootstrap.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"/StuScoManage/js/twitter-bootstrap-hover-dropdown.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"/StuScoManage/vendors/easypiechart/jquery.easy-pie-chart.js\"></script>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(function() {\n");
      out.write("                // Easy pie charts\n");
      out.write("                $('.easyPieChart').easyPieChart({animate: 1000});\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
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
