<%@ page import="vo.Category" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: lenconda
  Date: 2019/11/11
  Time: 11:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>网上书店</title>
    <link rel="stylesheet" href="https://unpkg.com/bootstrap@3.3.7/dist/css/bootstrap.min.css">
  </head>
  <body>
  <nav class="navbar navbar-default navbar-static-top">
    <div class="container">
      <div class="row">
        <div class="col-md-4">
          <h1>欢迎来到<strong>我的</strong>书店</h1>
        </div>
      </div>
      <div class="row text-right color-red">
        <a class="login" href="" rel="tooltip" data-placement="bottom" data-toggle="modal" data-target="#login">登录</a>
        <a class="register" href="" rel="tooltip" data_placement="bottom">注册</a>
      </div>
    </div>
  </nav>

  <div class="container-fluid">
    <div class="row">
      <div class="col-md-3">
        <ul class="nav nav-pills nav-stacked">
          <li role="presentation">
            <a href="">文学</a>
          </li>
          <li role="presentation">
            <a href="">体育</a>
          </li>
        </ul>
        <%
          Object categories = request.getAttribute("categories");
          List<Category> categoryList = null;
          if (categories instanceof List) {
            categoryList = (List<Category>)categories;
          }
          if (categories != null) {
            for (Category category:categoryList) {
        %>
        <li>
          <a href="<%=category.getId()%>")>
            <%=category.getName()%>
          </a>
        </li>
        <%
            }
          }
        %>
      </div>
      <div class="col-md-9">

      </div>
    </div>
  </div>

  <div class="modal fade" id="login">
    <div class="modal-dialog">
      <div class="modal-content">
        <div class="modal-header"></div>
        <div class="modal-body"></div>
        <div class="modal-footer"></div>
      </div>
    </div>
  </div>
  </body>
  <script src="https://unpkg.com/axios/dist/axios.min.js"></script>
  <script src="https://unpkg.com/jquery@3.4.1/dist/jquery.js"></script>
  <script src="https://unpkg.com/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
</html>
