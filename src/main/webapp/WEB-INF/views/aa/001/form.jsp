<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../../template/header.jsp" %>
<%@include file="../template/side.jsp" %>

<c:url var="listUrl" value="/AA/001"/>
<c:url var="submitUrl" value="/AA/001/form/${empInfo.empCode}"/>

<div class="ui-layout-center">
    <header>
        <h2>PLANET_AA001</h2>

        <p>empInfo 입력폼</p>

        <p>/aa/001/form.jsp</p>
    </header>
    <hr/>

    <div class="buttonArea">
        <button onclick="location.href='${listUrl}'" class="button1">Back</button>
    </div>

    <f:form method="post" action="${submitUrl}" modelAttribute="empInfo">
        <label for="name">Name</label>
        <f:input path="empName" id="name"/>
        <input type="submit" class="button1"/>
    </f:form>
</div>

<%@ include file="../../template/footer.jsp" %>