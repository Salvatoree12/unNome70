<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/EsempioJDBCWeb/user-form.html" method="get">
        <label for="nome">Inserisci nome</label>
        <input type="text" name="nome" id="nome">
        <label for="email">Inserisci email</label>
        <input type="email" name="email" id="email">
        <label for="citta">Inserisci città</label>
        <input type="text" name="citta" id="citta">
        <button type="submit">Invia dati</button>
    </form>

</body>
</html>