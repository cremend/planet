<%--
  Created by IntelliJ IDEA.
  User: xperad
  Date: 西暦.13/04/20
  Time: 22:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../../template/header.jsp" %>
<%@include file="../template/side.jsp" %>

<c:url var="listUrl" value="/ZA/012"/>
<c:url var="submitUrl" value="/ZA/012/form/${employ.basicEmployCode}"/>

<div class="ui-layout-center">
    <header>
        <h2>PLANET_ZA012</h2>

        <p>고용형태 입력폼</p>

        <p>/za/012/form.jsp</p>
    </header>
    <hr/>

    <div class="buttonArea">
        <button onclick="location.href='${listUrl}'" class="button1">Back</button>
    </div>

    <f:form method="post" action="${submitUrl}" modelAttribute="employ">
        <label for="name">Name</label>
        <f:input path="basicEmployName" id="name"/>
        <input type="submit" class="button1"/>
    </f:form>
</div>

<%@include file="../../template/footer.jsp" %>