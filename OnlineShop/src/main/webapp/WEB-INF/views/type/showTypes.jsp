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


    <%--<hr>
    <h2>Hello World!</h2>
    <div class="card">
        <div class="card-header">
            <p class="h4 mb-2 text-center">Add Type</p>
        </div>
        <div class="card-body">
            <form enctype="multipart/form-data" class="text-center border border-light p-5" action="/addTypeOfDevice" method="post">

                <!-- Name -->
                <input type="text" name="name" id="name" class="form-control mb-4"
                       placeholder="Product Name">


                <div class="custom-file mb-4">
                    <input type="file" name="file" accept="image/*" class="custom-file-input"
                           id="customFile"> <label>Type Image</label>
                </div>

                <!-- Sign in button -->
                <button class="btn btn-info btn-block" type="submit">add</button>
            </form>
        </div>
        <a href="/listTypeOfDevices">List </a>

    </div>--%>

</div>
</body>
</html>
