<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<script type="text/javascript" src="js/main.js"></script>
<title>Insert title here</title>
</head>
<body>
<h1>Home Page</h1>
<hr>
		<DIV align="center">
		<B>RICERCA ATTORE TRAMITE CODICE</B>
		
		<FORM action="AttoriController" method="POST">
		
		<TABLE BORDER="1">
				
				<TR>
					<TD><b>inserisci il codice attore</b></TD>
					<TD><INPUT type="text" name="codAttore" onclick="msg()"></TD>	
				
				</TR>
				<TR>
					<TD><INPUT type="submit"></TD>
					<TD><INPUT type="reset"></TD>
				
				
				</TR>
		
		
		
		
		</TABLE>
		</FORM>
		</DIV>
		<hr>
	<a href="AttoriController?lista=all">visualizza tutti gli attori</a><br><hr>
	
	<p>Inserisci un indirizzo email e verificane il formato:</p>
		<input id='email' name='email' value =''>
		<input type='button' id='verifica' value='Verifica la validità' onclick='checkEmail();' />
	<br />
	<p id='risultato'></p>	
		
</body>
</html>