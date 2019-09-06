<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>UserTable</title>
</head>
<body>
<p>
    <a href="/add">Add User</a> |
    <a href="/update">Update User</a> |
    <a href="/del">Delete User</a>
</p>
<h3>User Table</h3>
<c:if test="${list.size() > 0}">
    <table border="1px solid black">
        <tr>
            <td>Id</td>
            <td>Name</td>
            <td>Mail</td>
        </tr>
        <c:forEach var="user" items="${list}">
            <tr>
                <td><c:out value="${user.getId()}"/></td>
                <td><c:out value="${user.getName()}"/></td>
                <td><c:out value="${user.getMail()}"/></td>
            </tr>

        </c:forEach>
    </table>
</c:if>

<c:if test="${list.size() == 0}">
    <c:out value="${qwe}" default="Table is empty"/>
</c:if>




<table border="1px solid black">
    <!--  <tr>
          <td>Id</td>
          <td>Name</td>
          <td>Mail</td>
      </tr> -->
    <%
        /* UserServise userServise = UserServise.getInstance();
         List<User> allUser = userServise.getAllUsers();
         if (allUser.size() == 0) {*/
        //   out.print("<p> Table is empty</p>");
       /* } else {
            out.println("<tr>");
            out.println("<td>Id</td>");
            out.println("<td>Name</td>");
            out.println("<td>Mail</td>");
            out.println("</tr>");
            for (User user : allUser) {
                out.println("<tr>");
                out.println("<td>" + user.getId() + "</td>");
                out.println("<td>" + user.getName() + "</td>");
                out.println("<td>" + user.getMail() + "</td>");
                out.println("</tr>");
            }
        }*/
    %>
</table>

</body>
</html>
