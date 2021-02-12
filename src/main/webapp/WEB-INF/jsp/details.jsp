<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>

<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    <title>View Details</title>


</head>
<body>
<a href="../display">Back to Display</a>
    <div class="container">
        <h1>User Details</h1>
        <div class="row">
            <div class="col-2">
                <p>First Name: ${name.name}</p>
            </div>
            <div class="col-2">
                <p>Surname: ${name.surname}</p>
            </div>
            <div class="col-2">
                <p>Birth Date: ${name.birthDate}</p>
            </div>
            <div class="col-2">
                <p>Gender: ${name.gender}</p>
            </div>
            <div class="col-2">
                <p>Home Address: ${address.homeAddress}</p>
            </div>
            <div class="col-2">
                <p>Work Address: ${address.workAddress}</p>
            </div>
        </div>
    </div>
</body>
</html>