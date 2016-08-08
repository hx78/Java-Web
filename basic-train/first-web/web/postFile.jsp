<%--
  Created by IntelliJ IDEA.
  User: linming
  Date: 2016/3/14 0014
  Time: 14:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>post file</title>
</head>
<body>
<form id="upload-form" action="http://10.10.10.233:8081/post" method="post" enctype="multipart/form-data">
    　　　　<input type="file" id="upload" name="upload"/> <br/>
    　　　　<input type="submit" value="Upload"/>
    　　
</form>

</body>
</html>
