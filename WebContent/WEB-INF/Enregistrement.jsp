<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<style type="text/css"><%@ include file="bootstrap.min.css"%></style>
<title>Enregistrement</title>
</head>
<body style="background-color: #910035;">
<!-- Image and text -->
<nav class="navbar navbar-dark bg-dark">
  <a class="navbar-brand" href="/TD2JEE/Accueil">
    <img src="http://localhost:8080/TD2JEE/livre.png" width="30" height="30" class="d-inline-block align-top" alt="">
    Bibliothèque
  </a>
</nav>
<div class="container-fuild">
<div class="row">
<div class="col-lg-3">
<a href="/TD2JEE/ListeLivre" style="color:white;">Liste des livres </a><br>
<a href="/TD2JEE/ListeAuteur" style="color:white;">Liste des auteurs </a>
</div>
<div class="col-lg-6" style="background-color: #e6d3da; border-bottom-right-radius: 25px; border-bottom-left-radius: 25px; ">
<form action="/TD2JEE/Save" method="post">

<h1 style="text-align:center;">Enregistrement d'un livre</h1>


<h2>Le livre:</h2>

<table style="background-color: #f5f0f1; border-radius: 15px; padding-left: 30px;width:400px; height: 200px; display: block;margin-left:auto;margin-right:auto;">
<tr>
<td style="width: 30%">
<label style="margin-top: 20px;">Titre:</label>
</td>
<td >
<input type="text" name="titre" placeholder="saisir le titre" class="form-control" style="margin-top: 20px;"><br>
</td>
</tr>
<tr>
<td style="width: 30%">
<label >Catégorie:</label>
</td>
<td>
<select name="categorie" class="form-control">
<option value="Roman">Roman</option>
<option value="Policier">Policier</option>
<option value="Junior">Junior</option>
<option value="Philosophie">Philosophie</option>
<option value="Science-fiction">Science-fiction</option>
</select><br>
</td>
</tr>
<tr>
<td style="width: 30%">
<label >Numéro ISBN:</label>
</td>
<td>
<input type="text" name="ISBN" placeholder="saisir le numéro ISBN" class="form-control">
</td>
</tr>
</table>


<h2 >L'auteur:</h2>
<table style="background-color: #f5f0f1; border-radius: 15px; padding-left: 30px;width:400px; height: 200px; display: block;margin-left:auto;margin-right:auto;">
<tr>
<td style="width: 30%">
<label style="margin-top: 20px;">Nom:</label>
</td>
<td>
<input type="text" name="nom" placeholder="saisir le nom" class="form-control">
</td>
</tr>
<tr>
<td style="width: 30%">
<label>Prénom:</label>
</td>
<td>
<input type="text" name="prenom" placeholder="saisir le prénom" class="form-control">
</td>
</tr>
<tr>
<td>
<input type="submit" value="Valider">
</td>
</tr>

</table><br>

</form>
</div>
<div class="col-lg-3">
</div>
</div>
</div>
</body>
</html>