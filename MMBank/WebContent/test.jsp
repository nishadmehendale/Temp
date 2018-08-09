<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script>
	function OnSubmitForm(){
		if(document.pressed == 'saving.jsp'){
			document.myform.action = "saving.jsp";
		}
		else if(document.pressed == 'current.jsp'){
			document.myform.action = "current.jsp";
		}
		return true;
	}
</script>
</head>
<body>
<form name="myform" onsubmit="return OnSubmitForm();">
<input type="submit" name="acc"><select><option onsubmit="document.pressed=this.value" value="saving.jsp">Saving</option><option onsubmit="document.pressed=this.value" value="saving.jsp">Current</option></select>
</form>
</body>
</html>