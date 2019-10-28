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
        var inputs = ['stuno', 'name'];
        var elems = inputs.map(function (value) {
          return document.querySelector('#' + value);
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
          <div class="card-header">请登录</div>
          <div class="card-body">
            <form action="/project4/first" method="POST">
              <div class="form-group">
                <label for="stuno">学号</label>
                <input type="text" name="stuno" class="form-control" id="stuno" placeholder="1234567890" />
              </div>
              <div class="form-group">
                <label for="name">姓名</label>
                <input type="text" name="name" class="form-control" id="name" placeholder="Mike McIntosh" />
              </div>
              <div class="form-group">
                <input type="submit" disabled="true" id="submit" class="btn btn-primary" value="登录" />
                <a class="btn btn-dark" href="javascript:window.close();">取消</a>
              </div>
            </form>
          </div>
        </div>
      </div>
    </div>
  </div>
  </body>
</html>
