<%--
  Created by IntelliJ IDEA.
  User: xperad
  Date: 西暦.13/04/22
  Time: 4:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<c:url var="root" value="/"/>
<html>
<head>
    <title></title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script type="text/javascript" src="${root}resources/js/libs/jquery-1.9.1.min.js"></script>
    <script type="text/javascript" src="${root}resources/js/libs/jquery.layout-1.3.0.js"></script>
    <script type="text/javascript" src="${root}resources/js/layoutSetting.js"></script>
    <script type="text/javascript" src="${root}resources/js/navigation.js"></script>
    <link rel="stylesheet" type="text/css" href="${root}resources/css/jquery-layout-ui.css"/>
    <link rel="stylesheet" type="text/css" href="${root}resources/css/style01.css"/>
    <link rel="stylesheet" type="text/css" href="${root}resources/css/design.css"/>
    <script>
        $(document).ready(function () {
            $('body').layout({
                applyDefaultStyles: true
            });
        });
    </script>
</head>
<body>

<div class="ui-layout-north">
    <div class="nav">
        <ul>
            <li><a href="javascript:MenuRedirect('AA', '001')">사원정보</a></li>
            <li><a href="javascript:MenuRedirect('BA', '001')">근무정보</a></li>
            <li><a href="javascript:MenuRedirect('CA', '001')">지출정보</a></li>
            <li><a href="javascript:MenuRedirect('ZA', '001')">관리</a></li>
        </ul>
    </div>
</div>

<div class="ui-layout-east">East</div>
