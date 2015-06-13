<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%--
  Version 1.0  2015/06/11  T.Hayashi  ADD: XXXXX
 --%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Battle-Osaisen</title>
<script type="text/javascript">
<!--

//-->
</script>
</head>
<body>

<s:form id="checkout" method="post" action="checkout">
  <div id="payment-form"></div>
  <input type="submit" value="Pay $10">
</s:form>


<h1>悩みリスト</h1>

<table border="0">
<tr>
<th>Name</th><th>Anxiety</th><th>Achieved(\)</th><th>Target(\)</th><th>Support</th>
</tr>
<s:iterator value="nayamiList" status="st">
<tr>

<td><s:property value="name" /></td>
<td><s:property value="nayami" /></td>
<td><s:property value="achievedMoney" /></td>
<td><s:property value="targetMoney" /></td>
<td>
<s:form action="addTarget">
    <s:submit value="+" />
</s:form>
</td>

</tr>
</s:iterator>
</table>




<s:form action="target">
    <s:submit value="目標" />
</s:form>

</body>
</html>