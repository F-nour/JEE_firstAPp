<%--
  Created by IntelliJ IDEA.
  User: nour
  Date: 14/10/2022
  Time: 17:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="fr">
<head>
    <title>Essai</title>
</head>
<body>
    <%@ include file="/_menu.jsp"%>
    <h1>Bonjour!</h1>
    <c:if test="${ !empty sessionScope.firstname && !empty sessionScope.name }">
        <p>Vous êtes ${ sessionScope.firstname } ${ sessionScope.name } !</p>
    </c:if>
    <form method="post" action="bonjour">
        <label for="name">Nom : </label>
        <input type="text" name="name" id="name" />
        <label for="firstname">Prénom : </label>
        <input type="text" name="firstname" id="firstname" />
        <input type="submit" />
    </form>
</body>
</html>
