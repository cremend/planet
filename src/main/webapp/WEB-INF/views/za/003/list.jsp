<%--
  Created by IntelliJ IDEA.
  User: xperad
  Date: 西暦.13/04/20
  Time: 20:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../../template/header.jsp" %>
<%@include file="../template/side.jsp" %>

<c:url var="addUrl" value="/ZA/003/form"/>

<div class="ui-layout-center">
    <header>
        <h2>PLANET_ZA003</h2>

        <p>팀 정보</p>

        <p>/za/003/list.jsp</p>
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
        <c:forEach var="team" items="${teamList}">
            <tr>
                <td>${team.basicTeamCode}</td>
                <td>${team.basicTeamName}</td>
                <td>
                    <c:url var="editUrl" value="/ZA/003/form/${team.basicTeamCode}"/>
                    <c:url var="deleteUrl" value="/ZA/003/delete/${team.basicTeamCode}"/>
                    <button onclick="location.href='${editUrl}'" class="button1">Edit</button>
                    <button onclick="location.href='${deleteUrl}'" class="button1">Delete</button>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<%@include file="../../template/footer.jsp" %>