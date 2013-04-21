<%--
  Created by IntelliJ IDEA.
  User: xperad
  Date: 西暦.13/04/20
  Time: 21:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>

<c:url var="root" value="/"/>
<c:url var="listUrl" value="/ZA/006"/>
<c:url var="submitUrl" value="/ZA/006/form/${site.basicSiteCode}"/>

<html>
<head>
    <title>PLANET_ZA006</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="${root}resources/css/style01.css"/>
</head>
<body>
<header>
    <h2>PLANET_ZA006</h2>

    <p>근무처 입력폼</p>

    <p>/za/006/form.jsp</p>
</header>
<hr/>

<div class="buttonArea">
    <button onclick="location.href='${listUrl}'" class="button1">Back</button>
</div>

<f:form method="post" action="${submitUrl}" modelAttribute="site">
    <label for="name">Name</label>
    <f:input path="basicSiteName" id="name"/>
    <f:select path="basicCompany.basicCompanyCode">
        <f:options items="${companyList}" itemLabel="basicCompanyName" itemValue="basicCompanyCode"/>
    </f:select>
    <input type="submit" class="button1"/>
</f:form>
</body>
</html>