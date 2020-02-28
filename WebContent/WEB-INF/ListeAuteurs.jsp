<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<style type="text/css"><%@ include file="bootstrap.min.css"%></style>
<title>ListeAuteurs</title>
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
<a href="/TD2JEE/retour" style="color:white;">Enregistrements </a><br>
<a href="/TD2JEE/ListeLivre" style="color:white;">Liste des livres </a>
</div>
<div class="col-lg-6" style="background-color: #e6d3da; border-bottom-right-radius: 25px; border-bottom-left-radius: 25px; ">
<h1 style="text-align:center;">Liste des auteurs</h1>
<table class="table">
  <thead class="thead-dark">
    <tr>
      <th scope="col">idAuteur</th>
      <th scope="col">Nom</th>
      <th scope="col">Prénom</th>
      
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${auteurs}" var="auteur">
    <tr>
      <th scope="row">${auteur.idAuteur}</th>
      <td>${auteur.nom}</td>
      <td>${auteur.prenom}</td>
      
    </tr>
    </c:forEach>
  </tbody>
</table><br>
<form action="/TD2JEE/supAuteur" method="post">
<select name="idAuteur" class="form-control">
<c:forEach items="${auteurs}" var="auteur">
<option value="${auteur.idAuteur}">${auteur.idAuteur}-${auteur.nom}-${auteur.prenom}</option>
 </c:forEach>
</select>
<input type="submit" value="Supprimer" ><br><br>
</form>
</div>
<div class="col-lg-3">
</div>
</div>
</div>
</body>
</html>