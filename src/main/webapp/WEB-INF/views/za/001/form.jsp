<%--
  Created by IntelliJ IDEA.
  User: xperad
  Date: 西暦.13/03/31
  Time: 2:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../../template/header.jsp" %>
<%@include file="../template/side.jsp" %>

<c:url var="listUrl" value="/ZA/001"/>
<c:url var="submitUrl" value="/ZA/001/form/${position.basicPositionCode}"/>

<div class="ui-layout-center">
    <header>
        <h2>PLANET_ZA001</h2>

        <p>직위 입력폼</p>

        <p>/za/001/form.jsp</p>
    </header>
    <hr/>

    <div class="buttonArea">
        <button onclick="location.href='${listUrl}'" class="button1">Back</button>
    </div>

    <f:form method="post" action="${submitUrl}" modelAttribute="position">
        <label for="name">Name</label>
        <f:input path="basicPositionName" id="name"/>
        <input type="submit" class="button1"/>
    </f:form>
</div>

<%@ include file="../../template/footer.jsp" %>