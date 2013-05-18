<%--
  Created by IntelliJ IDEA.
  User: xperad
  Date: 西暦.13/04/20
  Time: 22:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../../template/header.jsp" %>
<%@include file="../template/side.jsp" %>

<c:url var="addUrl" value="/ZA/013/form"/>

<div class="ui-layout-center">
    <header>
        <h2>PLANET_ZA013</h2>

        <p>기술 정보</p>

        <p>/za/013/list.jsp</p>
    </header>

    <hr/>

    <div class="buttonArea">
        <button onclick="location.href='${addUrl}'" class="button1">Add</button>
    </div>

    <table class="table-style1">
        <thead>
        <tr>
            <th>Code</th>
            <th>Name</th>
            <th>Event</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="tech" items="${techList}">
            <tr>
                <td>${tech.basicTechCode}</td>
                <td>${tech.basicTechName}</td>
                <td>
                    <c:url var="editUrl" value="/ZA/013/form/${tech.basicTechCode}"/>
                    <c:url var="deleteUrl" value="/ZA/013/delete/${tech.basicTechCode}"/>
                    <button onclick="location.href='${editUrl}'" class="button1">Edit</button>
                    <button onclick="location.href='${deleteUrl}'" class="button1">Delete</button>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<%@include file="../../template/footer.jsp" %>