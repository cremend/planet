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

<c:url var="listUrl" value="/ZA/004"/>
<c:url var="submitUrl" value="/ZA/004/form/${duty.basicDutyCode}"/>

<div class="ui-layout-center">
    <header>
        <h2>PLANET_ZA004</h2>

        <p>직책 입력폼</p>

        <p>/za/004/form.jsp</p>
    </header>
    <hr/>

    <div class="buttonArea">
        <button onclick="location.href='${listUrl}'" class="button1">Back</button>
    </div>

    <f:form method="post" action="${submitUrl}" modelAttribute="duty">
        <label for="name">Name</label>
        <f:input path="basicDutyName" id="name"/>
        <input type="submit" class="button1"/>
    </f:form>
</div>

<%@include file="../../template/footer.jsp" %>