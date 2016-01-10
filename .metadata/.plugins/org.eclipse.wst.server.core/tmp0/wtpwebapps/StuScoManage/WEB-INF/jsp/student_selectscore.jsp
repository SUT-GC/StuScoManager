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
						data-toggle="dropdown">学生 _ <s:property
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
					<li><a href="page_studentindex"><i
							class="glyphicon glyphicon-chevron-right"></i> 首页</a></li>
					<li class="active"><a href="page_studentselectscore"><i
							class="glyphicon glyphicon-chevron-right"></i> 查询成绩</a></li>
					<li><a href="page_studentselectcourse"><i
							class="glyphicon glyphicon-chevron-right"></i> 选课</a></li>
					<!--菜单栏end-->
				</ul>
			</div>

			<!-- content -->
			<div class="col-md-10">
				<div class="selectscore">
					<div class="row">
						<div class="panel panel-default bootstrap-admin-no-table-panel">
							<div class="panel-heading" style="color: green">所有及格的成绩</div>
							<div class="scoretable">
								<table class="table table-hover">
									<thead>
										<th>#</th>
										<th>课程号</th>
										<th>课程名称</th>
										<th>课程属性</th>
										<th>教师</th>
										<th>成绩</th>
									</thead>
									<tbody>
										<s:iterator value="listisok" status="st">
											<tr>
												<td><s:property value="#st.index" /></td>
												<td class="course_num"><s:property
														value="listisok[#st.index][0]" /></td>
												<td><s:property value="listisok[#st.index][1]" /></td>
												<td><s:if test="listisok[#st.index][2] == 1">必修</s:if>
													<s:else>选修</s:else></td>
												<td><s:property value="listisok[#st.index][3]" /></td>
												<td><s:if test="listisok[#st.index][2] == 1">
														<s:property value="listisok[#st.index][4]" />
													</s:if> <s:else>
														合格
													</s:else></td>
											</tr>
										</s:iterator>
									</tbody>
								</table>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="panel panel-default bootstrap-admin-no-table-panel">
							<div class="panel-heading" style="color: red">所有不及格的成绩</div>
							<div class="scoretable">
								<table class="table table-hover">
									<thead>
										<th>#</th>
										<th>课程号</th>
										<th>课程名称</th>
										<th>课程属性</th>
										<th>教师</th>
										<th>成绩</th>
									</thead>
									<tbody>
										<s:iterator value="listisnotok" status="st">
											<tr>
												<td><s:property value="#st.index" /></td>
												<td class="course_num"><s:property
														value="listisnotok[#st.index][0]" /></td>
												<td><s:property value="listisnotok[#st.index][1]" /></td>
												<td><s:if test="listisnotok[#st.index][2] == 1">必修</s:if>
													<s:else>选修</s:else></td>
												<td><s:property value="listisnotok[#st.index][3]" /></td>
												<td><s:if test="listisnotok[#st.index][4] == -1">成绩为录入</s:if>
													<s:else>
														<s:if test="listisnotok[#st.index][2] == 1">
															<s:property value="listisnotok[#st.index][4]" />
														</s:if>
														<s:else>不合格</s:else>
													</s:else></td>
											</tr>
										</s:iterator>
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
