<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %><%--
  Created by IntelliJ IDEA.
  User: lenconda
  Date: 2019/11/4
  Time: 10:27 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>网上书店</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" />
    <link rel="stylesheet" href="css/style.css" />
  </head>
  <body onload="initAJAX()">
  <div class="container-fluid">
    <div class="row">
      <div class="login col-4">
        <h1>
          <a href="#">欢迎来到<strong>我的</strong>书店</a>
        </h1>
      </div>
      <div class="links col-8">
        <a href="" class="login" rel="tooltip" data-placement="bottom" data-toggle="modal" data-target="#myModal"></a>
        <a href="" class="register" rel="tooltip" data-placement="bottom"></a>
      </div>
    </div>
    <div class="row">
      <div class="col-3">
        <div class="nav flex-column nav-pills" id="v-pills-tab" role="tablist" aria-orientation="vertical">
          <%
            Class.forName("org.sqlite.JDBC");
            String url = "jdbc:sqlite:/Users/lenconda/workspace/javaweb/project6/bookstore.db";
            String sql = "select id,name,description from category";
            Connection conn = DriverManager.getConnection(url);
            Statement stat = conn.createStatement();
            ResultSet rs = stat.executeQuery(sql);
            while (rs.next()) {
          %>
          <a class="nav-link" data-toggle="pill" href="" onclick="showBook('<%=rs.getString("id")%>')">
            <%=rs.getString("name")%>
          </a>
          <%}%>
        </div>
      </div>
      <div class="col-9">
        <div class="row" id="book"></div>
      </div>
    </div>
  </div>
  <div class="modal fade" tabindex="-1" role="dialog" id="myModal" data-backdrop="static" role="dialog" aria-labelledby="staticBackdropLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
      <div class="modal-content">
        <div class="modal-header">
          <h5 class="modal-title">登录</h5>
          <button type="button" class="close" data-dismiss="modal" aria-label="Close">
            <span aria-hidden="true">&times;</span>
          </button>
        </div>
        <div class="modal-body">
          <form class="form-group" action="show.jsp" method="post">
            <div class="form-group">
              <label>用户名</label>
              <input name="id" class="form-control" type="text" placeholder="请输入用户名">
            </div>
            <div class="form-group">
              <label>密码</label>
              <input name="pwd" class="form-control" type="password" placeholder="请输入密码">
            </div>

            <div class="text-right">
              <button class="btn btn-primary" type="submit">登录</button>
              <button class="btn btn-danger" data-dismiss="modal">取消</button>
            </div>
          </form>
        </div>
      </div>
    </div>
  </div>
  </body>
  <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
  <script src="https://unpkg.com/axios/dist/axios.min.js"></script>
  <script src="js/commons.js"></script>
  <script language="JavaScript">
    function showBook(categoryID) {
      console.log(111);
      xmlHttp.onreadystatechange = function() {
        if (xmlHttp.readyState == 4) {
          if(xmlHttp.status == 200) {
            var data = xmlHttp.responseText;
            document.getElementById("book").innerHTML = data;
            console.log(data);
          }
        }
      }
      xmlHttp.open("GET", "get_book.jsp?id="+categoryID, true);
      xmlHttp.send();
    }
  </script>
</html>
