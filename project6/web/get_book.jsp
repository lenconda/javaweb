<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %><%--
  Created by IntelliJ IDEA.
  User: lenconda
  Date: 2019/12/11
  Time: 11:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
<%
  Class.forName("org.sqlite.JDBC");
  String url = "jdbc:sqlite:/Users/lenconda/workspace/javaweb/project6/bookstore.db";
  String sql = "select id,name,author,price,image,description,category_id from book" +
      " where category_id = ?";
  String categoryID = request.getParameter("id");
  Connection conn = DriverManager.getConnection(url);
  PreparedStatement pstat = conn.prepareStatement(sql);
  pstat.setString(1, categoryID);
  ResultSet rs = pstat.executeQuery();
  while (rs.next()) {
%>
<div class="col-sm-9 col-md-3">
  <div class="card" style="margin: 10px 0;">
    <img src="images/book.jpg" width="100%" class="card-img-top">
    <div class="card-body">
      <h5 class="card-title"><%=rs.getString("name")%></h5>
      <p class="card-text">
        <%=rs.getString("description")%>
      </p>
      <a href="#" class="btn btn-primary" role="button" style="margin: 4px;">加入购物车</a>
      <a href="#" class="btn btn-secondary" role="button" style="margin: 4px;">查看详情</a>
    </div>
  </div>
</div>
<%
  }
  pstat.close();
  conn.close();
%>
</body>
</html>
