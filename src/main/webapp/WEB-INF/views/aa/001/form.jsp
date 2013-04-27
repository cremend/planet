<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>

<c:url var="root" value="/"/>
<c:url var="listUrl" value="/AA/001"/>
<c:url var="submitUrl" value="/AA/001/form/${empInfo.empCode}"/>

<html>
<head>
    <title>PLANET_AA001</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="${root}resources/css/style01.css"/>
</head>
<body>
<header>
    <h2>PLANET_AA001</h2>

    <p>empInfo 입력폼</p>

    <p>/aa/001/form.jsp</p>
</header>
<hr/>

<div class="buttonArea">
    <button onclick="location.href='${listUrl}'" class="button1">Back</button>
</div>

<f:form method="post" action="${submitUrl}" modelAttribute="empInfo">
    <label for="name">Name</label>
    <f:input path="empName" id="name"/>
    <input type="submit" class="button1"/>
</f:form>
</body>
</html>