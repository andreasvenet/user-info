<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>

<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
    <link rel="stylesheet" href="/resources/demos/style.css">
    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
    <script>
        $( function() {
            $( "#datepicker" ).datepicker({ dateFormat: 'yy-mm-dd'});
        } );
    </script>

    <title>Register new user</title>

</head>

<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a class="navbar-brand" href="#">Welcome</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav">
            <li class="nav-item active">
                <a class="nav-link" href="index">Home <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="display">Display Users</a>
            </li>
        </ul>
    </div>
</nav>

<p>Register new user</p>

<div class="container">
    <h1>User Register Form:</h1>
    <div class="card">
        <div class="card-body">
            <form:form name="myForm" action="register" method="post" modelAttribute="user">

                <div class="form-group row">
                    <form:label path="name" class="col-sm-2 col-form-label">Name</form:label>
                    <div class="col-sm-7">
                        <form:input path="name" type="text" class="form-control" name="name"
                               placeholder="Enter first name" required="true" />
                    </div>
                </div>

                <div class="form-group row">
                    <form:label path="surname" class="col-sm-2 col-form-label">Surname</form:label>
                    <div class="col-sm-7">
                        <form:input path="surname" type="text" class="form-control" name="surname"
                               placeholder="Enter surname" required="true" />
                    </div>
                </div>

                <div class=" form-group row">
                    <form:label path="gender" class="col-sm-2 col-form-label">Gender</form:label>
                    <div class="col-sm-7">
                        <form:select path="gender" name="gender" id="gender" required="true">
                            <option value="M">M</option>
                            <option value="F">F</option>
                        </form:select>
                    </div>
                </div>

                <div class="form-group row">
                    <form:label path="birthDate" class="col-sm-2 col-form-label">Birthdate</form:label>
                    <div class="col-sm-7">
                        <form:input path="birthDate"  type="text" id="datepicker" class="form-control" name="birthdate"
                               placeholder="Enter birthdate" required="true"/>
                    </div>
                </div>

                <div class="form-group row">
                    <label class="col-sm-2 col-form-label">Home Address</label>
                    <div class="col-sm-7">
                        <input type="text" class="form-control" name="homeAddress"
                               placeholder="Enter Home Address"/>
                    </div>
                </div>

                <div class="form-group row">
                    <label  class="col-sm-2 col-form-label">Work Address</label>
                    <div class="col-sm-7">
                        <input  type="text" class="form-control" name="workAddress"
                               placeholder="Enter Work Address"/>
                    </div>
                </div>

                <button type="submit" class="btn btn-primary">Submit</button>
            </form:form>
        </div>
    </div>

</div>


</body>

</html>