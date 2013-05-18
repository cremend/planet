<%--
  Created by IntelliJ IDEA.
  User: xperad
  Date: 西暦.13/04/20
  Time: 22:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../../template/header.jsp" %>
<%@include file="../template/side.jsp" %>

<c:url var="listUrl" value="/ZA/013"/>
<c:url var="submitUrl" value="/ZA/013/form/${tech.basicTechCode}"/>

<div class="ui-layout-center">
    <header>
        <h2>PLANET_ZA013</h2>

        <p>기술 입력폼</p>

        <p>/za/013/form.jsp</p>
    </header>
    <hr/>

    <div class="buttonArea">
        <button onclick="location.href='${listUrl}'" class="button1">Back</button>
    </div>

    <f:form method="post" action="${submitUrl}" modelAttribute="tech">
        <label for="name">Name</label>
        <f:input path="basicTechName" id="name"/>
        <input type="submit" class="button1"/>
    </f:form>
</div>

<%@include file="../../template/footer.jsp" %>