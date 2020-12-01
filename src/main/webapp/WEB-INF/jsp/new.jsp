<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<head>
    <title>Contact form</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

<div class="container">
    <h2>contact Details form</h2>
    <form action="/contact/create" method="post">
        <c:if test="${errorCode eq 'inValidData'}">
            <div class="alert alert-danger" role="alert">
               Invalid form details
            </div>
        </c:if>

         <div class="form-group">
              <label for="name">Name:</label>
              <input type="text" class="form-control" id="name" placeholder="Enter your name" name="name" value="${contact.name}">
         </div>

        <div class="form-group">
            <label for="email">Email:</label>
            <input type="email" class="form-control" id="email" placeholder="Enter email" name="email" value="${contact.email}">
        </div>

        <div class="form-group">
                    <label for="country">Country:</label>
                    <input type="text" class="form-control" id="country" placeholder="Enter country" name="country" value="${contact.country}">
        </div>

        <button type="submit" class="btn btn-default">Submit</button>
    </form>
</div>

</body>
</html>