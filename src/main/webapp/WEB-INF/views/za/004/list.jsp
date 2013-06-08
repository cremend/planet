<%--
  Created by IntelliJ IDEA.
  User: xperad
  Date: 西暦.13/04/20
  Time: 21:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../../template/header.jsp" %>
<%@include file="../template/side.jsp" %>

<c:url var="addUrl" value="/ZA/004/form"/>

<div class="ui-layout-center">
    <header>
        <h2>PLANET_ZA004</h2>

        <p>직책 정보</p>

        <p>/za/004/list.jsp</p>
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
        <c:forEach var="duty" items="${dutyList}">
            <tr>
                <td>${duty.basicDutyCode}</td>
                <td>${duty.basicDutyName}</td>
                <td>
                    <c:url var="editUrl" value="/ZA/004/form/${duty.basicDutyCode}"/>
                    <c:url var="deleteUrl" value="/ZA/004/delete/${duty.basicDutyCode}"/>
                    <button onclick="location.href='${editUrl}'" class="button1">Edit</button>
                    <button onclick="location.href='${deleteUrl}'" class="button1">Delete</button>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<%@include file="../../template/footer.jsp" %>