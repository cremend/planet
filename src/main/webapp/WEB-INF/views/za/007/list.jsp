<%--
  Created by IntelliJ IDEA.
  User: xperad
  Date: 西暦.13/04/20
  Time: 21:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../../template/header.jsp" %>
<%@include file="../template/side.jsp" %>

<c:url var="addUrl" value="/ZA/007/form"/>

<div class="ui-layout-center">
    <header>
        <h2>PLANET_ZA007</h2>

        <p>근태종류 정보</p>

        <p>/za/007/list.jsp</p>
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
        <c:forEach var="workType" items="${workTypeList}">
            <tr>
                <td>${workType.basicWorkTypeCode}</td>
                <td>${workType.basicWorkTypeName}</td>
                <td>
                    <c:url var="editUrl" value="/ZA/007/form/${workType.basicWorkTypeCode}"/>
                    <c:url var="deleteUrl" value="/ZA/007/delete/${workType.basicWorkTypeCode}"/>
                    <button onclick="location.href='${editUrl}'" class="button1">Edit</button>
                    <button onclick="location.href='${deleteUrl}'" class="button1">Delete</button>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<%@include file="../../template/footer.jsp" %>