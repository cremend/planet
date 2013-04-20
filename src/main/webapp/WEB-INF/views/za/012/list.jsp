<%--
  Created by IntelliJ IDEA.
  User: xperad
  Date: 西暦.13/04/20
  Time: 22:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:url var="root" value="/"/>
<c:url var="addUrl" value="/ZA/012/form"/>

<html>
<head>
    <title>PLANET_ZA012</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="${root}resources/css/style01.css"/>
</head>
<body>
<header>
    <h2>PLANET_ZA012</h2>

    <p>고용형태 정보</p>

    <p>/za/012/list.jsp</p>
</header>

<hr/>

<div class="buttonArea">
    <button onclick="location.href='${addUrl}'" class="button1">Add</button>
</div>

<table>
    <thead>
    <tr>
        <th>Code</th>
        <th>Name</th>
        <th>Event</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="employ" items="${employList}">
        <tr>
            <td>${employ.basicEmployCode}</td>
            <td>${employ.basicEmployName}</td>
            <td>
                <c:url var="editUrl" value="/ZA/012/form/${employ.basicEmployCode}"/>
                <c:url var="deleteUrl" value="/ZA/012/delete/${employ.basicEmployCode}"/>
                <button onclick="location.href='${editUrl}'" class="button1">Edit</button>
                <button onclick="location.href='${deleteUrl}'" class="button1">Delete</button>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>