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
<form action="saveAccount"><table>
<tr><td>Name: 			</td><td><input type="text" name="customerName"> </td></tr>
<tr><td>Email-id: 		</td><td><input type="email" name="customerEmail"> </td></tr>
<tr><td>Date of Birth:	</td><td><input type="date" name="dob" min="2010-01-08"></td></tr>
<tr><td>Contact Number: </td><td><input type="tel" min=10 max=10></td></tr>
<tr><td>Account Type:	</td><td><select name="accountType"><option value="saving account" selected="selected">${saving account}</option><option value="current">Current Account</option></select></td></tr>
<tr><td></td><td><jstl:if test='${accountType eq "saving account"}'><input type="radio" name="salary" value="true">Salaried<input type="radio" name="salary" value="false">Not Salaried</jstl:if></td></tr>	
</table></form>
</div>
</body>
</html>

