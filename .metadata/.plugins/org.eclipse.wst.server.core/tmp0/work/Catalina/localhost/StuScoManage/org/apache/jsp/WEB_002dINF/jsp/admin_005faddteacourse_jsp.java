/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.27
 * Generated at: 2016-01-06 15:54:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_005faddteacourse_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/struts2-core-2.3.24.1.jar", Long.valueOf(1451814139000L));
    _jspx_dependants.put("jar:file:/home/gc/web/StuScoManager/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/StuScoManage/WEB-INF/lib/struts2-core-2.3.24.1.jar!/META-INF/struts-tags.tld", Long.valueOf(1442878992000L));
  }

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
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("<title>成绩管理系统</title>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\n");
      out.write("<!-- Bootstrap -->\n");
      out.write("<link href=\"/StuScoManage/css/bootstrap.min.css\" rel=\"stylesheet\"\n");
      out.write("\tmedia=\"screen\">\n");
      out.write("<link href=\"/StuScoManage/css/bootstrap-theme.min.css\" rel=\"stylesheet\"\n");
      out.write("\tmedia=\"screen\">\n");
      out.write("\n");
      out.write("<!-- Bootstrap Admin Theme -->\n");
      out.write("<link href=\"/StuScoManage/css/bootstrap-admin-theme.css\"\n");
      out.write("\trel=\"stylesheet\" media=\"screen\">\n");
      out.write("\n");
      out.write("<!-- Vendors -->\n");
      out.write("<link\n");
      out.write("\thref=\"/StuScoManage/vendors/easypiechart/jquery.easy-pie-chart.css\"\n");
      out.write("\trel=\"stylesheet\" media=\"screen\">\n");
      out.write("<link\n");
      out.write("\thref=\"/StuScoManage/vendors/easypiechart/jquery.easy-pie-chart_custom.css\"\n");
      out.write("\trel=\"stylesheet\" media=\"screen\">\n");
      out.write("<link href=\"/StuScoManage/css/StuScoManager.css\" rel=\"stylesheet\"\n");
      out.write("\tmedia=\"screen\">\n");
      out.write("<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("<!--[if lt IE 9]>\n");
      out.write("           <script type=\"text/javascript\" src=\"js/html5shiv.js\"></script>\n");
      out.write("           <script type=\"text/javascript\" src=\"js/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body class=\"bootstrap-admin-with-small-navbar\">\n");
      out.write("\t<nav class=\"navbar navbar-default navbar-inverse navbar-fixed-top \"\n");
      out.write("\t\trole=\"navigation\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("\t\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\"\n");
      out.write("\t\t\t\t\tdata-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span> <span\n");
      out.write("\t\t\t\t\t\tclass=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span\n");
      out.write("\t\t\t\t\t\tclass=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t</button>\n");
      out.write("\t\t\t\t<a class=\"navbar-brand\" href=\"#\">学生成绩管理系统</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("\t\t\t<div class=\"collapse navbar-collapse\"\n");
      out.write("\t\t\t\tid=\"bs-example-navbar-collapse-1\">\n");
      out.write("\t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\t\t\t\t\t<li class=\"dropdown\"><a href=\"#\" class=\"dropdown-toggle\"\n");
      out.write("\t\t\t\t\t\tdata-toggle=\"dropdown\">管理员<b class=\"caret\"></b></a>\n");
      out.write("\t\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">设置</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">个人资料</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">账户中心</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"divider\"></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">退出登录</a></li>\n");
      out.write("\t\t\t\t\t\t</ul></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- /.navbar-collapse -->\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t</nav>\n");
      out.write("\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<!-- left, vertical navbar & content -->\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<!-- left, vertical navbar -->\n");
      out.write("\t\t\t<div class=\"col-md-2 bootstrap-admin-col-left\">\n");
      out.write("\t\t\t\t<ul class=\"nav navbar-collapse collapse bootstrap-admin-navbar-side\">\n");
      out.write("\t\t\t\t\t<!--菜单栏start-->\n");
      out.write("\t\t\t\t\t<div class=\"panel-group\" id=\"accordion\" role=\"tablist\"\n");
      out.write("\t\t\t\t\t\taria-multiselectable=\"true\">\n");
      out.write("\t\t\t\t\t\t<div class=\"panel panel-default\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"panel-heading\" role=\"tab\" id=\"headingOne\">\n");
      out.write("\t\t\t\t\t\t\t\t<h4 class=\"panel-title\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a role=\"button\" data-toggle=\"collapse\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-parent=\"#accordion\" href=\"#collapseOne\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\taria-expanded=\"true\" aria-controls=\"collapseOne\"> 增加信息 </a>\n");
      out.write("\t\t\t\t\t\t\t\t</h4>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<!--这里的in class 代表着是否显示该栏-->\n");
      out.write("\t\t\t\t\t\t\t<div id=\"collapseOne\" class=\"panel-collapse collapse in\"\n");
      out.write("\t\t\t\t\t\t\t\trole=\"tabpanel\" aria-labelledby=\"headingOne\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"panel-body\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"page_addstudent\"><i\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-chevron-right\"></i> 添加学生信息</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<hr />\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"page_addteacher\"><i\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-chevron-right\"></i> 添加教师信息</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<hr />\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"page_addcourse\"><i\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-chevron-right\"></i> 添加课程信息</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<hr />\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"page_addadmin\"><i\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-chevron-right\"></i> 添加管理员</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<hr />\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"active\"><a href=\"#\"><i\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-chevron-right\"></i> 添加教课信息</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"panel panel-default\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"panel-heading\" role=\"tab\" id=\"headingTwo\">\n");
      out.write("\t\t\t\t\t\t\t\t<h4 class=\"panel-title\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a class=\"collapsed\" role=\"button\" data-toggle=\"collapse\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-parent=\"#accordion\" href=\"#collapseTwo\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\taria-expanded=\"false\" aria-controls=\"collapseTwo\"> 编辑信息 </a>\n");
      out.write("\t\t\t\t\t\t\t\t</h4>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div id=\"collapseTwo\" class=\"panel-collapse collapse\"\n");
      out.write("\t\t\t\t\t\t\t\trole=\"tabpanel\" aria-labelledby=\"headingTwo\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"panel-body\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"admin_editstudent.html\"><i\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-chevron-right\"></i> 编辑学生信息</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<hr />\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"admin_editteacher.html\"><i\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-chevron-right\"></i> 编辑教师信息</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<hr />\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"admin_editcourse.html\"><i\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-chevron-right\"></i> 编辑课程信息</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<hr />\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"admin_editadmin.html\"><i\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-chevron-right\"></i> 编辑管理员</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<hr />\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"admin_editteacourse.html\"><i\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-chevron-right\"></i> 编辑教课信息</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<!--菜单栏end-->\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<!-- content -->\n");
      out.write("\t\t\t<div class=\"col-md-10\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"panel panel-default bootstrap-admin-no-table-panel\">\n");
      out.write("\t\t\t\t\t\t<div class=\"panel-heading\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"text-muted bootstrap-admin-box-title\">添加教课信息</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"addteacourse_context\">\n");
      out.write("\t\t\t\t\t\t\t<h2>请添加新的教课信息</h2>\n");
      out.write("\t\t\t\t\t\t\t<hr />\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"twoblock\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-2\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span>输入教师工姓名：</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control input_teacher_name\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tname=\"inputteachername\" placeholder=\"请输入教师的姓名\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"teacher_name_list\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<button class=\"teacher_name_list_base\" readonly></button>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-2\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span>教师工号：</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control input_teacher_id\" name=\"input_teacher_id\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\treadonly>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<hr />\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"twoblock\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-2\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span>输入课程的名称：</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control input_course_name\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tplaceholder=\"请输入课程的名称\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"course_name_list\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-2\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span>课程编号：</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control input_course_id\" name=\"input_course_id\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\treadonly>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<hr />\n");
      out.write("\t\t\t\t\t\t\t<div class=\"button_submit_reset\">\n");
      out.write("\t\t\t\t\t\t\t\t<button class=\"btn btn-success submit_addteacourse\" type=\"button\">提交</button>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"ajaxresult\" style=\"visibility: hidden\"></div>\n");
      out.write("\t\t\t\t\t\t<div class=\"ajaxresult2\" style=\"color:red; font-size:20px;\"></div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<hr>\n");
      out.write("\t\t\t<footer role=\"contentinfo\">\n");
      out.write("\t\t\t<p>\n");
      out.write("\t\t\t\t&copy; 2016 <a href=\"#\" target=\"_blank\">GC</a>\n");
      out.write("\t\t\t</p>\n");
      out.write("\t\t\t</footer>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("\t<!-- Include all compiled plugins (below), or include individual files as needed -->\n");
      out.write("\t<script type=\"text/javascript\" src=\"/StuScoManage/js/bootstrap.min.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"/StuScoManage/js/StuScoManager.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"/StuScoManage/js/addteacourse.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\"\n");
      out.write("\t\tsrc=\"/StuScoManage/js/twitter-bootstrap-hover-dropdown.min.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\"\n");
      out.write("\t\tsrc=\"/StuScoManage/vendors/easypiechart/jquery.easy-pie-chart.js\"></script>\n");
      out.write("\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\t$(function() {\n");
      out.write("\t\t\t// Easy pie charts\n");
      out.write("\t\t\t$('.easyPieChart').easyPieChart({\n");
      out.write("\t\t\t\tanimate : 1000\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\t</script>\n");
      out.write("</body>\n");
      out.write("\n");
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
