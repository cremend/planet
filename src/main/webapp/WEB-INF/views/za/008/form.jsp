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

<c:url var="listUrl" value="/ZA/008"/>
<c:url var="submitUrl" value="/ZA/008/form/${zip.basicZipCode}"/>

<div class="ui-layout-center">
    <header>
        <h2>PLANET_ZA008</h2>

        <p>우편번호 입력폼</p>

        <p>/za/008/form.jsp</p>
    </header>
    <hr/>

    <div class="buttonArea">
        <button onclick="location.href='${listUrl}'" class="button1">Back</button>
    </div>

    <f:form method="post" action="${submitUrl}" modelAttribute="zip">
        <label for="code">Code</label>
        <f:input path="basicZipCode" id="code"/>
        <label for="name">Name</label>
        <f:input path="basicZipName" id="name"/>
        <input type="submit" class="button1"/>
    </f:form>
</div>

<%@include file="../../template/footer.jsp" %>