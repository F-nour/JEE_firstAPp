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
    <c:if test="${ !empty nom }"><p><c:out value="Vous vous appelez ${ nom }" /></p></c:if>

    <form method="post" action="bonjour">
        <label for="nom">Nom : </label>
        <input type="text" name="nom" id="nom" />

        <input type="submit" />
    </form>
</body>
</html>
