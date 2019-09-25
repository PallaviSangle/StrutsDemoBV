<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
</head>
<body>
<s:if test="hasActionMessages()">
<s:actionmessage/>
</s:if>
Hello<s:property value="username"/><br/>
<s:property value="gender"/><br/>
<s:property value="hobbies"/><br/>
<s:property value="age"/><br/>
<s:property value="doubleSelectRole"/><br/>
<s:property value="doubleSelectExpertise"/><br/>
<s:property value="skills"/><br/>
<s:property value="aboutYourself"/><br/>
<s:property value="dob"/>
<p>File uploaded successfully</p>
  User Image: <s:property value="userImage" /><br/>  
        Content Type:<s:property value="userImageContentType" /><br/>  
        File Name:  <s:property value="userImageFileName" /><br/>  
        Uploaded Image: <img src="userimages/<s:property value="userImageFileName"/>"   
                            width="100" height="100" />   
<a href="HelloForm.jsp">HelloForm</a>

</body>
</html>