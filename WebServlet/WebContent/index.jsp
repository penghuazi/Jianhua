<%@ include file="/common/header_1.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Demo</title>
</head>
<body>
Hello World
<%=request.getContextPath() %>
<a href="<%=request.getContextPath() %>/student/createStu.jsp">Create a student</a>
</body>
</html>