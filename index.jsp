addkinoko

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%--
  Version 1.0  2015/06/12  T.Hayashi  Created. Former index.jsp is transfered to purchase.jsp
 --%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>BattleHack Osaisen</title>
</head>
<body>
<h1>Osaisen</h1>
<center>
<s:form action="nayami">
    <s:submit value="悩みリスト" />
</s:form>

<s:form action="login">
      <s:textfield name="personBean.id" label="ID" />
      <s:textfield  name="personBean.password" label="password" />
      <s:submit value="Login" />
</s:form>
</center>
</body>
</html>