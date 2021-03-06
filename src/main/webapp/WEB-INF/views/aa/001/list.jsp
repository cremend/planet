<%--
  Created by IntelliJ IDEA.
  User: xperad
  Date: 西暦.13/03/31
  Time: 0:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../../template/header.jsp" %>
<%@include file="../template/side.jsp" %>

<c:url var="addUrl" value="/AA/001/form"/>

<div class="ui-layout-center">
    <header>
        <h2>PLANET_AA001</h2>

        <p>사원 리스트</p>

        <p>/aa/001/list.jsp</p>
    </header>

    <hr/>

    <div class="buttonArea">
        <button onclick="location.href='${addUrl}'" class="button1">Add</button>
    </div>

    <table class="table-style1">
        <thead>
        <tr>
            <th>사원번호</th>
            <th>사원명</th>
            <th>그룹명</th>
            <th>팀명</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="empInfo" items="${empInfoList}">
            <tr>
                <td>${empInfo.empJoinList[empInfo.empJoinList.size()-1].empJoinNumber}</td>
                <td>${empInfo.empName}</td>
                <td>${empInfo.empAssignList[empInfo.empAssignList.size()-1].empGroupCode}</td>
                <td>${empInfo.empAssignList[empInfo.empAssignList.size()-1].empTeamCode}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<%@include file="../../template/footer.jsp" %>