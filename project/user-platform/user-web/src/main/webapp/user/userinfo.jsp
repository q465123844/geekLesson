<%@ page isELIgnored="false" %>
<html>
<head>
    <jsp:directive.include file="/WEB-INF/jsp/prelude/include-head-meta.jspf" />
    <title>用户信息页面</title>
</head>
<body>
    <table>
        <thead>
            <tr>
                <td>用户名</td>
                <td>邮箱</td>
                <td>电话</td>
                <td>密码</td>
            </tr>
        </thead>
        <tbody>
            <c:forEach items ="${userList}" var = "user">
                    <tr>
                        <td>${user.name}</td>
                        <td>${user.email}</td>
                        <td>${user.phoneNumber}</td>
                        <td>${user.password}</td>
                    </tr>
            </c:forEach>
        </tbody>
    </table>

</body>
</html>
