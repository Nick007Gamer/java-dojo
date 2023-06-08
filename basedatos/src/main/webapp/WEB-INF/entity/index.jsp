<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<h1>All Books</h1>
<table>
    <thead>
        <tr>
            <th>ID</th>
            <th>NAME</th>
            <th>CONTINENT</th>
            <th>REGION </th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${entity}" var="book">
        <tr>
            <td><c:out value="${book.id}"/></td>
            <td><c:out value="${book.name}"/></td>
            <td><c:out value="${book.continent}"/></td>
            <td><c:out value="${book.region}"/></td>
        </tr>
        </c:forEach>
    </tbody>
</table>
<a href="/entity/new">New Book</a>