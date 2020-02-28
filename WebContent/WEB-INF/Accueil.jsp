<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<style type="text/css"><%@ include file="bootstrap.min.css"%></style>
<title>Accueil</title>
</head>
<body style="background-color: #910035;">
<nav class="navbar navbar-dark bg-dark">
  <a class="navbar-brand" href="/TD2JEE/Accueil">
    <img src="http://localhost:8080/TD2JEE/livre.png" width="30" height="30" class="d-inline-block align-top" alt="">
    Bibliothèque Ross
  </a>
</nav>
<div class="container-fuild">
<div class="row">
<div class="col-lg-3">
<a href="/TD2JEE/retour" style="color:white;">Enregistrement </a><br>
<a href="/TD2JEE/ListeAuteur" style="color:white;">Liste des auteurs </a><br>
<a href="/TD2JEE/ListeLivre" style="color:white;">Liste des livres </a>
</div>
<div class="col-lg-6" style="background-color: #e6d3da; border-bottom-right-radius: 25px; border-bottom-left-radius: 25px; ">
<h1 style="text-align:center;">Bienvenue sur le site de la <br>Bibliothèque Ross!</h1>
<img alt="" src="http://localhost:8080/TD2JEE/images-bibliotheque.jpg" style="width:100%;border-radius:5px;"><br><br>

</div>
<div class="col-lg-3">
</div>
</div>
</div>
</body>
</html>