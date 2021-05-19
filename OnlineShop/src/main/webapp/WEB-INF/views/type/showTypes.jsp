<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<div class="col-12">

    <h3 class="text-center">list of products</h3>
    <hr>
    <table class="table">
        <thead class="thead-dark">
        <tr>
            <th scope="col">image</th>
            <th scope="col">name</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${typeOfDevices}" var="type">
            <td><img src="${pageContext.request.contextPath}/product/display/${type.id}" style="width: 100px; height: 100px"/></td>
            <td>${type.name}</td>
        </c:forEach>
        </tbody>

    </table>
    <hr>

</div>
</body>
</html>
