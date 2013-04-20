<%--
  Created by IntelliJ IDEA.
  User: xperad
  Date: 西暦.13/04/20
  Time: 22:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:url var="root" value="/"/>
<c:url var="addUrl" value="/ZA/009/form"/>

<html>
<head>
    <title>PLANET_ZA009</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="${root}resources/css/style01.css"/>
</head>
<body>
<header>
    <h2>PLANET_ZA009</h2>

    <p>국가 정보</p>

    <p>/za/009/list.jsp</p>
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
    <c:forEach var="nation" items="${nationList}">
        <tr>
            <td>${nation.basicNationCode}</td>
            <td>${nation.basicNationName}</td>
            <td>
                <c:url var="editUrl" value="/ZA/009/form/${nation.basicNationCode}"/>
                <c:url var="deleteUrl" value="/ZA/009/delete/${nation.basicNationCode}"/>
                <button onclick="location.href='${editUrl}'" class="button1">Edit</button>
                <button onclick="location.href='${deleteUrl}'" class="button1">Delete</button>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>