<%--
  Created by IntelliJ IDEA.
  User: xperad
  Date: 西暦.13/04/20
  Time: 20:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../../template/header.jsp" %>
<%@include file="../template/side.jsp" %>

<c:url var="listUrl" value="/ZA/003"/>
<c:url var="submitUrl" value="/ZA/003/form/${team.basicTeamCode}"/>

<div class="ui-layout-center">
    <header>
        <h2>PLANET_ZA003</h2>

        <p>팀 입력폼</p>

        <p>/za/003/form.jsp</p>
    </header>
    <hr/>

    <div class="buttonArea">
        <button onclick="location.href='${listUrl}'" class="button1">Back</button>
    </div>

    <f:form method="post" action="${submitUrl}" modelAttribute="team">
        <label for="name">Name</label>
        <f:input path="basicTeamName" id="name"/>
        <f:select path="basicGroup.basicGroupCode">
            <f:options items="${groupList}" itemLabel="basicGroupName" itemValue="basicGroupCode"/>
        </f:select>
        <input type="submit" class="button1"/>
    </f:form>
</div>

<%@include file="../../template/footer.jsp" %>