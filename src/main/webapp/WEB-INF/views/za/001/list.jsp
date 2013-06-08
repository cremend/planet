<%--
  Created by IntelliJ IDEA.
  User: xperad
  Date: 西暦.13/03/31
  Time: 0:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../../template/header.jsp" %>
<%@include file="../template/side.jsp" %>

<c:url var="addUrl" value="/ZA/001/form"/>

<div class="ui-layout-center">
    <header>
        <h2>PLANET_ZA001</h2>

        <p>직위 정보</p>

        <p>/za/001/list.jsp</p>
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
        <c:forEach var="position" items="${positionList}">
            <tr>
                <td>${position.basicPositionCode}</td>
                <td>${position.basicPositionName}</td>
                <td>
                    <c:url var="editUrl" value="/ZA/001/form/${position.basicPositionCode}"/>
                    <c:url var="deleteUrl" value="/ZA/001/delete/${position.basicPositionCode}"/>
                    <button onclick="location.href='${editUrl}'" class="button1">Edit</button>
                    <button onclick="location.href='${deleteUrl}'" class="button1">Delete</button>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<%@include file="../../template/footer.jsp" %>