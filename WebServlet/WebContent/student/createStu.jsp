
<%@ include file="/common/header_1.jsp" %>
<html>
<head>
<script type="text/javascript" language="JavaScript">
function checkSubmit(){
	var name =$("#student_name").val;
	alert(name);
	if(name ==""){
		alert("Student name can not empty!");
		return false;
	};
	return true;
}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form name="createForm" onsubmit=" return checkSubmit();"  action="<%=request.getContextPath() %>/CreateHandler" method="POST">
<div id="stu_name" class="normal">Student:&nbsp;&nbsp;&nbsp;&nbsp; <input id="student_name" name="studeng_name" value=""/></div>
<div id="stu_desc" class="normal">Desc:&nbsp;&nbsp;&nbsp;&nbsp; <input id="student_desc" name="studeng_desc" value=""/></div>
<div id="stu_level" class="normal">Level:&nbsp;&nbsp;&nbsp;&nbsp;
<select id ="student_level" name ="student_level">
<option value="0">----</option>
<option value="1">normal</option>
<option value="2">low</option>
<option value="3">high</option>
</select>
</div>
<div><input type="submit" value="submit"/></div>
</form>
</body>
</html>