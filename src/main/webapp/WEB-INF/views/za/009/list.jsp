<%--
  Created by IntelliJ IDEA.
  User: xperad
  Date: 西暦.13/04/20
  Time: 22:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../../template/header.jsp" %>
<%@include file="../template/side.jsp" %>

<c:url var="addUrl" value="/ZA/009/form"/>

<div class="ui-layout-center">
    <header>
        <h2>PLANET_ZA009</h2>

        <p>국가 정보</p>

        <p>/za/009/list.jsp</p>
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
</div>

<%@include file="../../template/footer.jsp" %>