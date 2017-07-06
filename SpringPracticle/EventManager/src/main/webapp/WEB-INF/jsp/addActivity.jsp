<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

I need to read in <a href="?language=en"> English </a> ||<a href="?language=si"> Sinhala </a> ||<a href="?language=ta"> Tamil </a>


	<h2>Add Activity</h2>

	<form:form commandName="activities">
		<div>
			<div>
				<div><spring:message code="activity.entercaption"/></div>
				<div>
					<form:input path="activityName" />
				</div>
			</div>
			<div>
				<input type="submit" value="Save">
			</div>
		</div>
	</form:form>
</body>
</html>