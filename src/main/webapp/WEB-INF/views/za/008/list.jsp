<%--
  Created by IntelliJ IDEA.
  User: xperad
  Date: 西暦.13/04/20
  Time: 21:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../../template/header.jsp" %>
<%@include file="../template/side.jsp" %>

<c:url var="addUrl" value="/ZA/008/form"/>

<div class="ui-layout-center">
    <header>
        <h2>PLANET_ZA008</h2>

        <p>우편번호 정보</p>

        <p>/za/008/list.jsp</p>
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
        <c:forEach var="zip" items="${zipList}">
            <tr>
                <td>${zip.basicZipCode}</td>
                <td>${zip.basicZipName}</td>
                <td>
                    <c:url var="editUrl" value="/ZA/008/form/${zip.basicZipCode}"/>
                    <c:url var="deleteUrl" value="/ZA/008/delete/${zip.basicZipCode}"/>
                    <button onclick="location.href='${editUrl}'" class="button1">Edit</button>
                    <button onclick="location.href='${deleteUrl}'" class="button1">Delete</button>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<%@include file="../../template/footer.jsp" %>