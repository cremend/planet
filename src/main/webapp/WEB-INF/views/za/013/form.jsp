<%--
  Created by IntelliJ IDEA.
  User: xperad
  Date: 西暦.13/04/20
  Time: 22:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>

<c:url var="root" value="/"/>
<c:url var="listUrl" value="/ZA/013"/>
<c:url var="submitUrl" value="/ZA/013/form/${tech.basicTechCode}"/>

<html>
<head>
    <title>PLANET_ZA013</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="${root}resources/css/style01.css"/>
</head>
<body>
<header>
    <h2>PLANET_ZA013</h2>

    <p>기술 입력폼</p>

    <p>/za/013/form.jsp</p>
</header>
<hr/>

<div class="buttonArea">
    <button onclick="location.href='${listUrl}'" class="button1">Back</button>
</div>

<f:form method="post" action="${submitUrl}" modelAttribute="tech">
    <label for="name">Name</label>
    <f:input path="basicTechName" id="name"/>
    <input type="submit" class="button1"/>
</f:form>
</body>
</html>