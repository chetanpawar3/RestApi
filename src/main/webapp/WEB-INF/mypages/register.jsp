<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sign up</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<style>
.center_div
{
margin: 0 auto;
    width:40%;
}
</style>
</head>
<body>
<h2 class="text-center">Welcome to Sign up page.</h2>

<div class="container center_div">
            <h3 class="text-center">Register</h3>
            <form method="POST" action="/registervalidate">
              <div class="form-label-group">
               <label for="inputEmail">Username</label>
                <input type="text" id="inputEmail" class="form-control" placeholder="Enter username" name="uname" required autofocus>
               	<br/>
              </div>

              <div class="form-label-group">
               <label for="inputPassword">Password</label>
                <input type="password" id="inputPassword" class="form-control" placeholder="Enter Password"name="pwd" required>
               <br/>
              </div>
              <button class="btn btn-lg btn-primary btn-block text-uppercase" type="submit">Register</button>
            </form>
  </div>
</body>
</html>