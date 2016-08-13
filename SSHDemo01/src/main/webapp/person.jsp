<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
  <head>
      <title>person.jsp</title>
  </head>
  <body>
  	<s:form action="personAction_save.action" method="post" namespace="/person">
			<table border=1>
				<tr>
					<td>姓名:</td>
					<td><s:textfield name="name"/></td>
				</tr>
				<tr>
					<td>&nbsp;&nbsp;<s:submit value="保存"/></td>
					<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				        <s:reset value="重置"/>
					</td>
				</tr>
			</table>
	</s:form>
    <br>
  </body>
</html>