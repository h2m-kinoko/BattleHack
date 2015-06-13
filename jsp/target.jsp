<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%--
  Version 1.0  2015/06/11  X.Xxxxxx  ADD: XXX
 --%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>BattleHack GetStarted</title>
<script type="text/javascript">
<!--
	// code javascript here
//-->
</script>
</head>
<body BGCOLOR="#FFFF00">

	<h1>Johnさんを支援中：日本の定食屋にいきたいんだけど、いまいち怖くていけません。</h1>

	<s:form method="post" action="">
		<div id="task01"></div>
		<s:textfield name="Achieved.todo" label="設定課題" />
		<s:textfield name="Achieved.money" label="お賽銭" />円
		<s:submit value="お賽銭追加" />
	</s:form>
	<s:form method="post" action="achieved">
		<s:submit value="課題達成" />
	</s:form>
</body>
</html>