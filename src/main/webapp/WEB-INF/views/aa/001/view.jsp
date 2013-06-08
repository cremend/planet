<%--
  Created by IntelliJ IDEA.
  User: xperad
  Date: AD.13/05/18
  Time: 20:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../../template/header.jsp" %>
<%@include file="../template/side.jsp" %>


<div class="ui-layout-center">
    <header>
        <h2>PLANET_AA001</h2>

        <p>사원정보 조회</p>

        <p>/aa/001/view.jsp</p>
    </header>

    <hr/>

    <div id="tabs">
        <%--<ul>
            <li><a href="#tabs-1">개인정보</a></li>
            <li><a href="#tabs-2">체류정보</a></li>
            <li><a href="#tabs-3">사원정보</a></li>
        </ul>--%>

        <dl id="tabs-1" class="dtd-style1">
            <dt>사원코드</dt>
            <dd>${empInfo.empCode}</dd>
            <dt>사원명</dt>
            <dd>${empInfo.empName}</dd>
            <dt>성별</dt>
            <dd>${empInfo.empGender}</dd>
            <dt>생년월일</dt>
            <dd>${empInfo.empBirth}</dd>
            <dt>우편번호</dt>
            <dd>${empInfo.basicZipCode.basicZipCode}</dd>
            <dt>주소</dt>
            <dd>${empInfo.empAddress}</dd>
            <dt>전화번호1</dt>
            <dd>${empInfo.empPhone}</dd>
            <dt>전화번호2</dt>
            <dd>${empInfo.empPhone2}</dd>
            <dt>개인이메일</dt>
            <dd>${empInfo.empEmail}</dd>
            <dt>회사이메일</dt>
            <dd>${empInfo.empEmail2}</dd>
        </dl>

        <div id="tabs-2">
            <table class="table-style1">
                <thead>
                <tr>
                    <th>여권번호</th>
                    <th>시작일</th>
                    <th>만료일</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="empPassport" items="${empPassportList}">
                    <tr>
                        <td>${empPassport.empPassportNo}</td>
                        <td>${empPassport.empPassportStartDate}</td>
                        <td>${empPassport.empPassportEndDate}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>

            <hr/>

            <%--
            <table class="table-style1">
                <thead>
                <tr>
                    <th>재류등록번호</th>
                    <th>비자종류</th>
                    <th>시작일</th>
                    <th>만료일</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="empResidence" items="${empResidenceList}">
                    <tr>
                        <td>${empResidence.empResidenceNo}</td>
                        <td>${empResidence.basicVisa.basicVisaName}</td>
                        <td>${empResidence.empResidenceStartDate}</td>
                        <td>${empResidence.empResidenceEndDate}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
            --%>
        </div>

        <div id="tabs-3">
            not yet
        </div>
    </div>
</div>

<%@ include file="../../template/footer.jsp" %>