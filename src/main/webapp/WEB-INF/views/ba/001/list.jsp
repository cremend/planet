<%--
  Created by IntelliJ IDEA.
  User: xperad
  Date: AD.13/05/18
  Time: 21:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../../template/header.jsp" %>
<%@include file="../template/side.jsp" %>

<c:url var="addUrl" value="/BA/001/form"/>

<div class="ui-layout-center">
    <header>
        <h2>PLANET_BA001</h2>

        <p>계약 일람</p>

        <p>/ba/001/list.jsp</p>
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
        </tr>
        </thead>
        <tbody>
        </tbody>
    </table>
</div>