<%@ page language="java" pageEncoding="UTF-8"%>
<%--引入JSTL核心标签库 --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <title>显示用户信息</title>
        <style type="text/css">
            table,td{
                border: 1px solid;
                border-collapse: collapse;
            }
        </style>
    </head>
    <body>
        <table>
            <tr>
                <td>用户ID</td>
                <td>用户名</td>
            </tr>
            <%--遍历lstUsers集合中的User对象 --%>
            <c:forEach var="coAccount" items="${lstCoAccounts}">
                <tr>
                    <td><c:out value="${coAccount.coAccountId}"></c:out></td>
                    <td><c:out value="${coAccount.coAccountName}"></c:out></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>