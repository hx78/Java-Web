<%--
  Created by IntelliJ IDEA.
  User: linming
  Date: 2015/8/19 0019
  Time: 8:45
  To change this template use File | Settings | File Templates.
--%>
<%--page指令--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jsp grammar</title>
</head>
<body>
<%-- jsp:include 动作 --%>
<h1>
    <jsp:include page="dataJSP.jsp" flush="true"/>
</h1>
<%-- jsp:useBean jsp:setProperty jsp:getProperty 动作 --%>
<h1>
    <jsp:useBean id="testBean" class="com.hx78.webapps.MessageBean"/>

    <jsp:setProperty name="testBean"
                     property="message"
                     value="Hello JSP..."/>

    <p>Got message:
        <jsp:getProperty name="testBean" property="message"/>
    </p>

</h1>
<%-- jsp:forward 动作，似乎不能和其他动作一起使用 --%>
<%--<h1>The forward action Example--%>
    <%--<jsp:forward page="dataJSP.jsp"/>--%>
<%--</h1>--%>
</body>
</html>
