<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<style type="text/css"><%@ include file="bootstrap.min.css"%></style>
<title>Affichage</title>
</head>
<body style="background-color: #910035;">
<nav class="navbar navbar-dark bg-dark">
  <a class="navbar-brand" href="/TD2JEE/Accueil">
    <img src="http://localhost:8080/TD2JEE/livre.png" width="30" height="30" class="d-inline-block align-top" alt="">
    Bibliothèque 
  </a>
</nav>
<div class="container-fuild">
<div class="row">
<div class="col-lg-3">
<a href="/TD2JEE/retour" style="color:white;">Enregistrement </a><br>
<a href="/TD2JEE/ListeLivre" style="color:white;">Liste des livres </a><br>
<a href="/TD2JEE/ListeAuteur" style="color:white;">Liste des auteurs </a>
</div>
<div class="col-lg-6" style="background-color: #e6d3da; border-bottom-right-radius: 25px; border-bottom-left-radius: 25px; height:500px; ">
<h1 style="text-align:center;">Informations du livre</h1>
<table style=" padding-left: 30px;width:400px; height: 200px; display: block;margin-left:auto;margin-right:auto;">
<tr><td>
<h3>Titre:</h3>
</td><td style="padding-left:10px;">
<h3> ${livre.titre}</h3>
</td>
</tr>
<tr><td>
<h3>Catégorie:</h3>
</td><td style="padding-left:10px;">
<h3> ${livre.categorie}</h3>
</td>
</tr>
<tr><td>
<h3>Numéro ISBN:</h3>
</td><td style="padding-left:10px;">
<h3> ${livre.isbn}</h3>
</td>
</tr>
<tr><td>
<h3>ID Auteur:</h3>
</td><td style="padding-left:10px;">
<h3> ${livre.idAuteur}</h3>
</td>
</tr>
<tr><td>
<h3>Prénom auteur:</h3>
</td><td style="padding-left:10px;">
<h3> ${auteur.nom}</h3>
</td>
</tr>
<tr><td>
<h3>Prénom auteur:</h3>
</td><td style="padding-left:10px;">
<h3> ${auteur.prenom}</h3>
</td>
</tr>
</table><br><br>
</div>
<div class="col-lg-3">
</div>
</div>
</div>
</body>
</html>