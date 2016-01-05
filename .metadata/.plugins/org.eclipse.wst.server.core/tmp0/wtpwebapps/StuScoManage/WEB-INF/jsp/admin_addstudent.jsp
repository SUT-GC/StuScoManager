<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <title>成绩管理系统</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!-- Bootstrap -->
    <link href="/StuScoManage/css/bootstrap.min.css" rel="stylesheet" media="screen">
    <link href="/StuScoManage/css/bootstrap-theme.min.css" rel="stylesheet" media="screen">

    <!-- Bootstrap Admin Theme -->
    <link href="/StuScoManage/css/bootstrap-admin-theme.css" rel="stylesheet" media="screen">

    <!-- Vendors -->
    <link href="/StuScoManage/vendors/easypiechart/jquery.easy-pie-chart.css" rel="stylesheet" media="screen">
    <link href="/StuScoManage/vendors/easypiechart/jquery.easy-pie-chart_custom.css" rel="stylesheet" media="screen">
    <link href="/StuScoManage/css/StuScoManager.css" rel="stylesheet" media="screen">
    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
           <script type="text/javascript" src="js/html5shiv.js"></script>
           <script type="text/javascript" src="js/respond.min.js"></script>
        <![endif]-->
</head>

<body class="bootstrap-admin-with-small-navbar">
    <nav class="navbar navbar-default navbar-inverse navbar-fixed-top " role="navigation">
        <div class="container">
            <div class="row">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#">学生成绩管理系统</a>
                </div>
                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav navbar-right">
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">管理员 _ <s:property value="#session.username"/><b class="caret"></b></a>
                            <ul class="dropdown-menu">
                                <li class="divider"></li>
                                <li><a href="loginout">退出登录</a></li>
                            </ul>
                        </li>
                    </ul>
                </div>
                <!-- /.navbar-collapse -->
            </div>
        </div>
    </nav>

    <div class="container">
        <!-- left, vertical navbar & content -->
        <div class="row">
            <!-- left, vertical navbar -->
            <div class="col-md-2 bootstrap-admin-col-left">
                <ul class="nav navbar-collapse collapse bootstrap-admin-navbar-side">
                    <!--菜单栏start-->
                    <div class="panel-group" id="accordion" role="tablist" aria-multiselectable="true">
                        <div class="panel panel-default">
                            <div class="panel-heading" role="tab" id="headingOne">
                                <h4 class="panel-title">
                                    <a role="button" data-toggle="collapse" data-parent="#accordion" href="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
                                        增加信息
                                    </a>
                                  </h4>
                            </div>
                            <!--这里的in class 代表着是否显示该栏-->
                            <div id="collapseOne" class="panel-collapse collapse in" role="tabpanel" aria-labelledby="headingOne">
                                <div class="panel-body">
                                    <li class="active">
                                        <a href="#"><i class="glyphicon glyphicon-chevron-right"></i> 添加学生信息</a>
                                    </li>
                                    <hr/>
                                    <li>
                                        <a href=""><i class="glyphicon glyphicon-chevron-right"></i> 添加教师信息</a>
                                    </li>
                                    <hr/>
                                    <li>
                                        <a href="admin_addcourse.html"><i class="glyphicon glyphicon-chevron-right"></i> 添加课程信息</a>
                                    </li>
                                    <hr/>
                                    <li>
                                        <a href="admin_addadmin.html"><i class="glyphicon glyphicon-chevron-right"></i> 添加管理员</a>
                                    </li>
                                    <hr/>
                                    <li>
                                        <a href="admin_addteacourse.html"><i class="glyphicon glyphicon-chevron-right"></i> 添加教课信息</a>
                                    </li>
                                </div>
                            </div>
                        </div>
                        <div class="panel panel-default">
                            <div class="panel-heading" role="tab" id="headingTwo">
                                <h4 class="panel-title">
                                    <a class="collapsed" role="button" data-toggle="collapse" data-parent="#accordion" href="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
                                        编辑信息
                                    </a>
                                  </h4>
                            </div>
                            <div id="collapseTwo" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingTwo">
                                <div class="panel-body">
                                    <li>
                                        <a href="admin_editstudent.html"><i class="glyphicon glyphicon-chevron-right"></i> 编辑学生信息</a>
                                    </li>
                                    <hr/>
                                    <li>
                                        <a href="admin_editteacher.html"><i class="glyphicon glyphicon-chevron-right"></i> 编辑教师信息</a>
                                    </li>
                                    <hr/>
                                    <li>
                                        <a href="admin_editcourse.html"><i class="glyphicon glyphicon-chevron-right"></i> 编辑课程信息</a>
                                    </li>
                                    <hr/>
                                    <li>
                                        <a href="admin_editadmin.html"><i class="glyphicon glyphicon-chevron-right"></i> 编辑管理员</a>
                                    </li>
                                    <hr/>
                                    <li>
                                        <a href="admin_editteacourse.html"><i class="glyphicon glyphicon-chevron-right"></i> 编辑教课信息</a>
                                    </li>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!--菜单栏end-->
                </ul>
            </div>

            <!-- content -->
            <div class="col-md-10">
                    <div class="row">
                        <div class="panel panel-default bootstrap-admin-no-table-panel">
                            <div class="panel-heading">
                                <div class="text-muted bootstrap-admin-box-title">添加学生信息</div>
                            </div>
                            <form class="addstudentform">
                            <div class="addstudent_context">
                                <h2>请输入新的学生信息</h2>
                                <hr/>
                                <div class="twoblock">
                                    <div class="row">
                                        <div class="col-md-2">
                                            <span>学生学号</span>
                                        </div>
                                        <div class="col-md-10">
                                            <input type="text" class="form-control studentid"  name="studentid" placeholder="请输入新学生的学号">
                                        </div>
                                    </div>
                                </div>
                                <hr/>
                                <div class="ablock">
                                    <div class="row">
                                        <div class="col-md-2">
                                            <span>学生姓名</span>
                                        </div>
                                        <div class="col-md-10">
                                            <input type="text" class="form-control studentname" name="studentname" placeholder="请输入新学生的姓名">
                                        </div>
                                    </div>
                                </div>
                                <hr/>
                                <div class="twoblock">
                                    <div class="row">
                                        <div class="col-md-2">
                                            <span>学生年龄</span>
                                        </div>
                                        <div class="col-md-4">
                                            <input type="text" class="form-control studentage" name="studentage" placeholder="请输入新学生的年龄">
                                        </div>
                                        <div class="col-md-1">
                                        </div>
                                        <div class="col-md-2">
                                            <span>学生性别</span>
                                        </div>
                                        <div class="col-md-3">
                                            <label class="radio-inline">
                                                <input type="radio" name="studentsex" id="inlineRadio1" checked="checked" value="1"> 男
                                            </label>
                                            <label class="radio-inline">
                                                <input type="radio" name="studentsex" id="inlineRadio2" value="0"> 女
                                            </label>
                                        </div>
                                    </div>
                                </div>
                                <hr/>
                                <div class="twoblock">
                                    <div class="row">
                                        <div class="col-md-1">
                                            <span>学院</span>
                                        </div>
                                        <div class="col-md-3">
                                            <select class="form-control" name="studentcollage">
                                                <option value="信息科学与工程学院">信息科学与工程学院</option>
                                            </select>
                                        </div>
                                        <div class="col-md-1">
                                            <span>专业</span>
                                        </div>
                                        <div class="col-md-3">
                                            <select class="form-control" name="studentprofession">
                                                <option value="计算机科学与技术">计算机科学与技术</option>
                                            </select>
                                        </div>
                                        <div class="col-md-1">
                                            <span>班级</span>
                                        </div>
                                        <div class="col-md-3">
                                            <select class="form-control" name="studentclass">
                                                <option value="1301">1301</option>
                                                <option value="1302">1302</option>
                                                <option value="1303">1303</option>
                                            </select>
                                        </div>
                                    </div>
                                </div>
                                <hr/>
                                <div class="ablock">
                                    <div class="row">
                                        <div class="col-md-2">
                                            <span>学生密码</span>
                                        </div>
                                        <div class="col-md-10">
                                            <input type="password" class="form-control" name="studentpassword" value="000000">
                                        </div>
                                    </div>
                                </div>
                                <hr/>
                                <div class="button_submit_reset">
                                    <button class="btn btn-success submit_addstudent"  type="button">提交</button>
                                </div>
                                <div class="ajaxresult">
                                </div>
                            </div>
                            </form>
                        </div>
                    </div>
            </div>
        </div>
		
        <div class="row">
            <hr>
            <footer role="contentinfo">
                <p>&copy; 2016 <a href="#">GC & ZTT GSM</a></p>
            </footer>
        </div>
    </div>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script type="text/javascript" src="http://code.jquery.com/jquery-2.0.3.min.js"></script>

    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script type="text/javascript" src="/StuScoManage/js/bootstrap.min.js"></script>
     <script type="text/javascript" src="/StuScoManage/js/StuScoManager.js"></script>
    <script type="text/javascript" src="/StuScoManage/js/twitter-bootstrap-hover-dropdown.min.js"></script>
    <script type="text/javascript" src="/StuScoManage/vendors/easypiechart/jquery.easy-pie-chart.js"></script>

    <script type="text/javascript">
        $(function() {
                // Easy pie charts
                $('.easyPieChart').easyPieChart({animate: 1000});
            });
    </script>
</body>

</html>