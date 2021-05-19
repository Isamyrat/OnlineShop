<html>
<body>
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

</div>
</body>
</html>
