<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
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
						data-toggle="dropdown">教师 _ <s:property
								value="#session.username" /><b class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href="#">账户中心</a></li>
							<li class="divider"></li>
							<li><a href="loginout">退出登录</a></li>
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
					<li><a href="page_teacherindex"><i
							class="glyphicon glyphicon-chevron-right"></i> 首页</a></li>
					<li><a href="page_teacherenterscore"><i
							class="glyphicon glyphicon-chevron-right"></i> 录入成绩</a></li>
					<li class="active"><a href="page_teacherselectscore"><i
							class="glyphicon glyphicon-chevron-right"></i> 查询成绩</a></li>
					<!--菜单栏end-->
				</ul>
			</div>

			<!-- content -->
			<div class="col-md-10">

				<div class="row">
					<div class="panel panel-default bootstrap-admin-no-table-panel">
						<div class="panel-heading">
							<div class="text-muted bootstrap-admin-box-title">查询成绩</div>
						</div>
						<div class="teacher_selectscorecontext">
							<div class="twoblock">
								<div class="row">
									<div class="col-md-1">
										<label>课程：</label>
									</div>
									<div class="col-md-11">
										<select class="form-control courseid" name="courseid" >
											<s:iterator value="courselist" status="st">
												<option value="<s:property value='courselist[#st.index][0]'/>"><s:property value="courselist[#st.index][1]" /></option>
											</s:iterator>
										</select>
									</div>
								</div>
								<div class="row">
									<div class="col-md-1">
										<label>学院：</label>
									</div>
									<div class="col-md-3">
										<select class="form-control">
											<option>信息科学与工程</option>
										</select>
									</div>
									<div class="col-md-1">
										<label>专业</label>
									</div>
									<div class="col-md-3">
										<select class="form-control">
											<option>计算机科学与技术</option>
										</select>
									</div>
									<div class="col-md-1">
										<label>班级</label>
									</div>
									<input class="teacherid" style="display:none" value="<s:property value='#session.userid'/>"/>
									<div class="col-md-2">
										<select class="form-control studentclass" name="studentclass">
											<option value="1301">1301</option>
											<option value="1302">1302</option>
											<option value="1303">1303</option>
										</select>
									</div>
									<div class="col-md-1">
										<input class="btn btn-success button_selectstudent" type="button" value="查询" />
									</div>
								</div>
							</div>

							<hr />
							<div class="teacher_selectscoretable">
								<table class="table table-hover">
									<thead>
										<th>#</th>
										<th>学号</th>
										<th>姓名</th>
										<th>成绩</th>
										<th>状态</th>
									</thead>
									<tbody>
										<tr>
											<td class="input_scoreid">1</td>
											<td class="input_studentnum">130405211</td>
											<td class="input_studentname">GC</td>
											<td class="input_score">88</td>
											<td class="input_scorestate" style="color: #FF6600">未录入</td>
										</tr>
									</tbody> 	
								</table>
							</div>
						</div>
					</div>
				</div>

			</div>
		</div>
		<div class="row">
			<hr>
			<footer role="contentinfo">
			<p>
				&copy; 2016 <a href="#" target="_blank">GC & ZTT & GSM</a>
			</p>
			</footer>
		</div>
	</div>

	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script type="text/javascript"
		src="http://code.jquery.com/jquery-2.0.3.min.js"></script>

	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script type="text/javascript" src="/StuScoManage/js/bootstrap.min.js"></script>
	<script type="text/javascript"
		src="/StuScoManage/js/twitter-bootstrap-hover-dropdown.min.js"></script>
	<script type="text/javascript"
		src="/StuScoManage/js/StuScoManager.js"></script>
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