<%--
  Created by IntelliJ IDEA.
  User: xperad
  Date: 西暦.13/04/20
  Time: 22:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../../template/header.jsp" %>
<%@include file="../template/side.jsp" %>

<c:url var="listUrl" value="/ZA/014"/>
<c:url var="submitUrl" value="/ZA/014/form/${jobCategory.basicJobCategoryCode}"/>

<div class="ui-layout-center">
    <header>
        <h2>PLANET_ZA014</h2>

        <p>업무형태 입력폼</p>

        <p>/za/014/form.jsp</p>
    </header>
    <hr/>

    <div class="buttonArea">
        <button onclick="location.href='${listUrl}'" class="button1">Back</button>
    </div>

    <f:form method="post" action="${submitUrl}" modelAttribute="jobCategory">
        <label for="name">Name</label>
        <f:input path="basicJobCategoryName" id="name"/>
        <input type="submit" class="button1"/>
    </f:form>
</div>

<%@include file="../../template/footer.jsp" %>