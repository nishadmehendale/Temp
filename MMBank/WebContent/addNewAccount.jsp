<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- 1.AddNewAccount.jsp - customer details and Account details.

	1.AccountHolderName -(ie customer name) - 1 text box
	2.CustomerEmailId    -			- Accept only email address
	3.CustomerDOB	     - min 18 years old - validation
        4.CustomerPhoneNumber -only numbers of 10 - validation 
        5.AccountType - drop down - Savings and Current.
        if account type is savings 	
		5.1 - Salaried /not salaried - Radio button
			if it is salaried minimum balance should be zero.
		5.2 - Enter the account balance.	

	if  not salaried 
		5.2 - user must enter minimum balance - 5000 - Accept it

        if account type is current
		5.1 -Enter the Overdraft limit 
		5.2 - Enter account balance that should be min 10000.(validation)

Add the submit and on click of this should show success message like "Created the account"and
display the account number with a "Back" button that will redirect the user to Home page(home.jsp)
 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MM Bank</title>

</head>
<body>
<div align="center">
<h3>Enter Account Holder Details</h3>
<form id="basic" method="post">
Name: 			<input type="text" name="customerName"> <br>
Email-id: 		<input type="email" name="customerEmail"> <br>
Date of Birth:	<input type="date" name="dob" min="2010-01-08"><br>
Contact Number: <input type="tel" min=10 max=10><br>
Account Type:	<select id="accountType"  onchange="setButton();">
<option value="default" selected="selected">----SELECT----</option>
<option value="savingaccount">Saving Account</option>
<option value="currentaccount" >Current Account</option>
</select><br>
<div id="sa" style="display:none" onchange="setBalance();">
<input type="radio" id="salary" name="salary" value="yessss" >Salary<input type="radio" id="salary" name="salary" value="no">Not Salaried
</div>
<div id="bal" style="display:none">
Enter Opening Balance: <input type="number" min=5000>
</div>
<div id="salbal" style="display:none">
Enter Opening Balance: <input type="number" min=0>
</div>
<div id="ca" style="display:none">
Enter Over Draft Limit:<input type="number" min=0>
Enter account balance:<input type="number" min=10000>
</div>
<input type="submit" value="Create Account">
</form>
</div>
</body>
<script>
function setButton(){
	var dropdown = document.getElementById("accountType");
	var type= dropdown.options[dropdown.selectedIndex].value;
	
	if(type == "savingaccount"){
		document.getElementById("sa").style.display = "block";
		document.getElementById("ca").style.display = "none";
		var drop = document.getElementByName("salary");
		var s = drop.options[drop.selectedIndex].value;

		if(s == "yessss"){
			document.getElementById("salbal").style.display = "block";	
		}
		else{
			document.getElementById("bal").style.display = "block";
		}
	}else if(type == "currentaccount"){
		document.getElementById("ca").style.display = "block";
		document.getElementById("sa").style.display = "none";
	}
else if(type == "default"){
		document.getElementById("sa").style.display = "none";
		document.getElementById("ca").style.display = "none";
	} 
}
</script>
</html>