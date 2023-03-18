<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1 ">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<title>Delete Result Page</title>
</head>
<%System.err.println("++++++++++++++++"+(String)request.getAttribute("status"));
String str=(String)request.getAttribute("status");%>
<body bgcolor="lightblue">
	<br />
	<br />
	<br />
		<%if(str.equalsIgnoreCase("success")){ %>
			<h1 style="color: green; text-align: center;">RECORD DELETED
				SUCCESFULLY</h1>
		<%} else if(str.equalsIgnoreCase("failure")){  %>
			<h1 style="color: red; text-align: center;">RECORD DELETION
				FAILED</h1>
		<%}else{ %>
		
			<h1 style="color: green; text-align: center;">RECORD NOT AVAILABLE FOR DELETION</h1>
		<%} %>
</body>
</html>