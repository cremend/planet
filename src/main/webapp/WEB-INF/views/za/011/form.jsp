<%--
  Created by IntelliJ IDEA.
  User: xperad
  Date: 西暦.13/04/20
  Time: 22:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../../template/header.jsp" %>
<%@include file="../template/side.jsp" %>

<c:url var="listUrl" value="/ZA/011"/>
<c:url var="submitUrl" value="/ZA/011/form/${visa.basicVisaCode}"/>

<div class="ui-layout-center">
    <header>
        <h2>PLANET_ZA011</h2>

        <p>비자 입력폼</p>

        <p>/za/011/form.jsp</p>
    </header>
    <hr/>

    <div class="buttonArea">
        <button onclick="location.href='${listUrl}'" class="button1">Back</button>
    </div>

    <f:form method="post" action="${submitUrl}" modelAttribute="visa">
        <label for="name">Name</label>
        <f:input path="basicVisaName" id="name"/>
        <input type="submit" class="button1"/>
    </f:form>
</div>

<%@include file="../../template/footer.jsp" %>