<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<title>成绩管理系统</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<!-- Bootstrap -->
<link href="/StuScoManage/css/bootstrap.min.css" rel="stylesheet"
	media="screen">
<link href="/StuScoManage/css/bootstrap-theme.min.css" rel="stylesheet"
	media="screen">

<!-- Bootstrap Admin Theme -->
<link href="/StuScoManage/css/bootstrap-admin-theme.css"
	rel="stylesheet" media="screen">

<!-- Vendors -->
<link
	href="/StuScoManage/vendors/easypiechart/jquery.easy-pie-chart.css"
	rel="stylesheet" media="screen">
<link
	href="/StuScoManage/vendors/easypiechart/jquery.easy-pie-chart_custom.css"
	rel="stylesheet" media="screen">
<link href="/StuScoManage/css/StuScoManager.css" rel="stylesheet"
	media="screen">
<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
           <script type="text/javascript" src="js/html5shiv.js"></script>
           <script type="text/javascript" src="js/respond.min.js"></script>
        <![endif]-->
</head>

<body class="bootstrap-admin-with-small-navbar">
	<nav class="navbar navbar-default navbar-inverse navbar-fixed-top "
		role="navigation">
	<div class="container">
		<div class="row">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#bs-example-navbar-collapse-1">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">学生成绩管理系统</a>
			</div>
			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav navbar-right">
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown">管理员 _ <s:property value="#session.username"/><b class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href="#">账户中心</a></li>
							<li class="divider"></li>
							<li><a href="#">退出登录</a></li>
						</ul></li>
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
					<div class="panel-group" id="accordion" role="tablist"
						aria-multiselectable="true">
						<div class="panel panel-default">
							<div class="panel-heading" role="tab" id="headingOne">
								<h4 class="panel-title">
									<a role="button" data-toggle="collapse"
										data-parent="#accordion" href="#collapseOne"
										aria-expanded="true" aria-controls="collapseOne"> 增加信息 </a>
								</h4>
							</div>
							<!--这里的in class 代表着是否显示该栏-->
							<div id="collapseOne" class="panel-collapse collapse in"
								role="tabpanel" aria-labelledby="headingOne">
								<div class="panel-body">
									<li >
                                        <a href="page_addstudent"><i class="glyphicon glyphicon-chevron-right"></i> 添加学生信息</a>
                                     </li>
                                     <hr/>
                                     <li class="active">
                                        <a href="#"><i class="glyphicon glyphicon-chevron-right"></i> 添加教师信息</a>
                                     </li>
                                     <hr/>
                                    <li >
                                        <a href="page_addcourse"><i class="glyphicon glyphicon-chevron-right"></i> 添加课程信息</a>
                                     </li>
                                     <hr/>
                                    <li >
                                        <a href="page_addadmin"><i class="glyphicon glyphicon-chevron-right"></i> 添加管理员</a>
                                     </li>
                                     <hr/>
                                     <li >
                                        <a href="page_addteacourse"><i class="glyphicon glyphicon-chevron-right"></i> 添加教课信息</a>
                                     </li>
								</div>
							</div>
						</div>
						<div class="panel panel-default">
							<div class="panel-heading" role="tab" id="headingTwo">
								<h4 class="panel-title">
									<a class="collapsed" role="button" data-toggle="collapse"
										data-parent="#accordion" href="#collapseTwo"
										aria-expanded="false" aria-controls="collapseTwo"> 编辑信息 </a>
								</h4>
							</div>
							<div id="collapseTwo" class="panel-collapse collapse"
								role="tabpanel" aria-labelledby="headingTwo">
								<div class="panel-body">
									<li >
                                        <a href="page_editstudent"><i class="glyphicon glyphicon-chevron-right"></i> 编辑学生信息</a>
                                     </li>
                                     <hr/>
                                     <li >
                                        <a href="page_editteacher"><i class="glyphicon glyphicon-chevron-right"></i> 编辑教师信息</a>
                                     </li>
                                     <hr/>
                                    <li >
                                        <a href="page_editcourse"><i class="glyphicon glyphicon-chevron-right"></i> 编辑课程信息</a>
                                     </li>
                                     <hr/>
                                    <li class="active">
                                        <a href="page_editadmin"><i class="glyphicon glyphicon-chevron-right"></i> 编辑管理员</a>
                                     </li>
                                     <hr/>
                                     <li >
                                        <a href="page_editteacourse"><i class="glyphicon glyphicon-chevron-right"></i> 编辑教课信息</a>
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
							<div class="text-muted bootstrap-admin-box-title">添加教课信息</div>
						</div>
						<div class="addteacourse_context">
							<h2>请添加新的教课信息</h2>
							<hr />
								<div class="twoblock">
									<div class="row">
										<div class="col-md-2">
											<span>输入教师工姓名：</span>
										</div>
										<div class="col-md-4">
											<input type="text" class="form-control input_teacher_name"
												name="inputteachername" placeholder="请输入教师的姓名">
											<div class="teacher_name_list">
												<button class="teacher_name_list_base" readonly></button>
											</div>
										</div>
										<div class="col-md-2">
											<span>教师工号：</span>
										</div>
										<div class="col-md-4">
											<input type="text" class="form-control input_teacher_id" name="input_teacher_id"
												readonly>
										</div>
									</div>
								</div>
								<hr />
								<div class="twoblock">
									<div class="row">
										<div class="col-md-2">
											<span>输入课程的名称：</span>
										</div>
										<div class="col-md-4">
											<input type="text" class="form-control input_course_name"
												placeholder="请输入课程的名称">
											<div class="course_name_list"></div>
										</div>
										<div class="col-md-2">
											<span>课程编号：</span>
										</div>
										<div class="col-md-4">
											<input type="text" class="form-control input_course_id" name="input_course_id"
												readonly>
										</div>
									</div>
								</div>
							<hr />
							<div class="button_submit_reset">
								<button class="btn btn-success submit_addteacourse" type="button">提交</button>
							</div>
						</div>
						<div class="ajaxresult" style="visibility: hidden"></div>
						<div class="ajaxresult2" style="color:red; font-size:20px;"></div>
					</div>
				</div>
			</div>
		</div>

		<div class="row">
			<hr>
			<footer role="contentinfo">
			<p>
				&copy; 2016 <a href="#" target="_blank">GC</a>
			</p>
			</footer>
		</div>
	</div>

	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script type="text/javascript" src="js/jquery.min.js"></script>

	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script type="text/javascript" src="/StuScoManage/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="/StuScoManage/js/StuScoManager.js"></script>
	<script type="text/javascript" src="/StuScoManage/js/addteacourse.js"></script>
	<script type="text/javascript"
		src="/StuScoManage/js/twitter-bootstrap-hover-dropdown.min.js"></script>
	<script type="text/javascript"
		src="/StuScoManage/vendors/easypiechart/jquery.easy-pie-chart.js"></script>

	<script type="text/javascript">
		$(function() {
			// Easy pie charts
			$('.easyPieChart').easyPieChart({
				animate : 1000
			});
		});
	</script>
</body>

</html>