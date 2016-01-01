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
});
