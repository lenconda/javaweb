<%--
  Created by IntelliJ IDEA.
  User: lenconda
  Date: 2019/10/14
  Time: 10:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Submit Your Info</title>
    <link rel="stylesheet" href="//stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" crossorigin="anonymous">
    <script>
      window.onload = function () {
        var inputs = ['email', 'name', 'address', 'resume'];
        var elems = inputs.map(function (value) {
          return document.querySelector('#input_' + value);
        });

        function check(elems) {
          for (var i = 0; i < elems.length; i++) {
            if (elems[i].value === '') {
              return false;
            }
          }

          return true;
        }

        elems.forEach(function (value) {
          var submitButton = document.querySelector('#submit');

          value.addEventListener('input', function () {
            if (check(elems)) {
              submitButton.removeAttribute('disabled');
            } else {
              submitButton.setAttribute('disabled', true);
            }
          });
        });
      }
    </script>
  </head>
  <body>
  <div class="container">
    <div class="row">
      <div class="col-sm-12 col-md-8 col-lg-6 offset-md-2 offset-md-3">
        <div class="card" style="margin: 20px 0;">
          <div class="card-header">Submit Information</div>
          <div class="card-body">
            <form action="/project2/result" method="GET">
              <div class="form-group">
                <label for="input_email">Email</label>
                <input type="text" name="email" class="form-control" id="input_email" placeholder="name@example.com" />
              </div>
              <div class="form-group">
                <label for="input_name">Name</label>
                <input type="text" name="name" class="form-control" id="input_name" placeholder="Mike McIntosh" />
              </div>
              <div class="form-group">
                <label for="input_email">Address</label>
                <input type="text" name="address" class="form-control" id="input_address" placeholder="103, Brooklyn St." />
              </div>
              <div class="form-group">
                <label for="input_resume">Resume</label>
                <textarea type="text" class="form-control" id="input_resume" style="height: 10em;"></textarea>
              </div>
              <div class="form-group">
                <input type="submit" disabled="true" id="submit" class="btn btn-primary" value="Submit" />
              </div>
            </form>
          </div>
        </div>
      </div>
    </div>
  </div>
  </body>
</html>
