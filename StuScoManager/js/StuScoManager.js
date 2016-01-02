$(document).ready(function(){
	$(".teacher_name_list").hide();
	$(".course_name_list").hide();
	$(".input_teacher_name").keyup(function(){
		$(".teacher_name_list").slideDown(300);
	});
	$(".input_course_name").keyup(function(){
		$(".course_name_list").slideDown(300);
	});
	// $(".input_teacher_name").blur(function(){
	// 	$(".teacher_name_list").slideUp(1000);
	// });
	// $(".input_course_name").blur(function(){
	// 	$(".course_name_list").slideUp(1000);
	// });
	$(".teacher_name_list button").click(function(){
		$(".teacher_name_list").slideUp(300);
		var context = $(this).html();
		var info = context.split(" _ ");
		var name = info[0];
		var id = info[1];
		$(".input_teacher_name").val(name);
		$(".input_teacher_id").val(id);
	});
	$(".course_name_list button").click(function(){
		$(".course_name_list").slideUp(300);
		var context = $(this).html();
		var info = context.split(" _ ");
		var name = info[0];
		var id = info[1];
		$(".input_course_name").val(name);
		$(".input_course_id").val(id);
	});
	/*admin_editadmin*/
	$(".edit_oneadmin").hide();
	$(".teacher_edit").click(function(){
		$(".show_alladmin").hide();
		$(".edit_oneadmin").slideDown(200);
		var parenttr = $(this).parent();
		var newadminnum = parenttr.find(".teacher_num").text();
		var newadminname = parenttr.find(".teacher_name").text();
		$(".new_adminname").val(newadminname);
		$(".new_adminnum").val(newadminnum);
	});
	$(".return_show_alladmin").click(function(){
		$(".edit_oneadmin").hide();
		$(".show_alladmin").slideDown(200);
	});
	/*admin_editcourse*/
	$(".edit_onecourse").hide();
	$(".course_edit").click(function(){
		$(".show_allcourse").hide();
		$(".edit_onecourse").slideDown(200);
		var parenttr = $(this).parent();
		var newcoursenum = parenttr.find(".course_num").text();
		var newcoursename = parenttr.find(".course_name").text();
		$(".new_coursename").val(newcoursename);
		$(".new_coursenum").val(newcoursenum);
	});
	$(".return_show_allcourse").click(function(){
		$(".edit_onecourse").hide();
		$(".show_allcourse").slideDown(200);
	});
	/*admin_editstudent*/
	$(".show_onestudent").hide();
	$(".student_edit").click(function(){
		$(".show_allstudent").hide();
		$(".show_onestudent").slideDown(200);
		var parenttr = $(this).parent();
		var newstudentnum = parenttr.find(".student_num").text();
		var newstudentname = parenttr.find(".student_name").text();
		var newstudentsex = parenttr.find(".student_sex").text();
		var newstudentage = parenttr.find(".student_age").text();
		var newstudentcollage = parenttr.find(".student_collage").text();
		var newstudentmajor = parenttr.find(".student_major").text();
		var newstudentclass = parenttr.find(".student_class").text();
		$(".newstudentnum").val(newstudentnum);
		$(".newstudentname").val(newstudentname);
		$(".newstudentage").val(newstudentage);
		if(newstudentsex == "女"){
			$("#inlineRadio2").attr("checked","checked");
		}else{
			$("#inlineRadio1").attr("checked","checked");
		}
		if(newstudentclass == "1301"){
			$(".class_t1").attr("selected","selected");
		}else if(newstudentclass == "1302"){
			$(".class_t2").attr("selected","selected");
		}else{
			$(".class_t3").attr("selected","selected");
		}
	});
	$(".return_show_allstudent").click(function(){
		$(".show_onestudent").hide();
		$(".show_allstudent").slideDown(200);
	});
});


