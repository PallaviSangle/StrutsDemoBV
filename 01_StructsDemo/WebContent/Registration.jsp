<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html>
<html>
<head>
<sx:head/>
<meta charset="ISO-8859-1">
<title>register</title>
</head>

<body>
	<s:actionerror/>
	<s:form action="login" method="post" enctype="multipart/form-data">
		<s:textfield name="username" label="Username"></s:textfield>
		<s:password name="password" label="Password"></s:password>
		<s:password name="confirmPassword" label="confirmPassword"></s:password>
		<s:radio list="{'male','female'}" name="gender" label="Gender"></s:radio>

		<s:checkboxlist
			list="{'Swimming','Dancing','Cooking','Reading','Other'}"
			name="hobbies" label="Hobbies"></s:checkboxlist>


		<s:textfield name="age" key="age" label="Age" />

		<s:textfield name="email" label="email"></s:textfield>
		<s:textfield name="mobileno" label="mobileno"></s:textfield>
		<s:textfield name="percentage" label="percentage"></s:textfield>
<%-- 
		<sx:datetimepicker name="dob" label="Format (dd-MMM-yyyy)"
			displayFormat="dd-MMM-yyyy" /> --%>
		<sx:textarea></sx:textarea>
		<s:doubleselect list="{'Developer','Manager','Tester'}"
			name="doubleSelectRole" label="Occupation"
			doubleList="top == 'Developer' ? {'Java','PHP'} : (top == 'Manager' ? {'HR Manager', 'Finance Manager'} : {'UI Testing', 'Functional Testing'})"
			doubleName="doubleSelectExpertise"></s:doubleselect>


		<s:select list="{'Java','PHP','Python','.Net'}" name="skills"
			multiple="true" label="Skills"></s:select>

		<s:textarea name="aboutYourself" label="About Yourself"></s:textarea>

<%-- <s:file name="myFile" label="Upload file"></s:file> --%>
<s:file name="userImage" label="Image"/>   
		<s:submit value="Login"></s:submit>
	</s:form>
</body>
</html>