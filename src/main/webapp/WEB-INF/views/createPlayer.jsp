<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Create Player</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
</head>
<body>
<center>
<div class="container">
  <h2>Create Player</h2>
  <p>Please enter player information.</p>
  <form class="form-horizontal" role="form" method="post" action="homepage">
    <div class="form-group form-group-fn">
      <label class="col-sm-2 control-label" for="firstname">First Name</label>
      <div class="col-sm-10">
        <input class="form-control" type="text" name="firstname" placeholder="First Name">
      </div>
    </div>
    <div class="form-group form-group-ln">
      <label class="col-sm-2 control-label" for="lastname">Last Name</label>
      <div class="col-sm-10">
        <input class="form-control" type="text" name="lastname" placeholder="Last Name">
      </div>
    </div>
    <div class="form-group form-group-email">
      <label class="col-sm-2 control-label" for="email">Email</label>
      <div class="col-sm-10">
        <input class="form-control" type="text" name="email" placeholder="Email">
      </div>
    </div>
    <div class="form-group form-group-org">
      <label class="col-sm-2 control-label" for="description">Description</label>
      <div class="col-sm-10">
        <input class="form-control" type="text" name="description" placeholder="description">
      </div>
    </div>
    <div class="form-group form-group-addr">
      <label class="col-sm-2 control-label" for="street">Street</label>
      <div class="col-sm-10">
        <input class="form-control" type="text" name="street" placeholder="street">
      </div>
    </div>
    <div class="form-group form-group-addr">
      <label class="col-sm-2 control-label" for="city">City</label>
      <div class="col-sm-10">
        <input class="form-control" type="text" name="city" placeholder="city">
      </div>
    </div>
    <div class="form-group form-group-addr">
      <label class="col-sm-2 control-label" for="state">State</label>
      <div class="col-sm-10">
        <input class="form-control" type="text" name="state" placeholder="state">
      </div>
    </div>
    <div class="form-group form-group-addr">
      <label class="col-sm-2 control-label" for="zip">Zip</label>
      <div class="col-sm-10">
        <input class="form-control" type="text" name="zip" placeholder="zip">
      </div>
    </div>
    <div class="form-group form-group-about">
      <label class="col-sm-2 control-label" for="sponsorName">Sponsor Name</label>
      <div class="col-sm-10">
        <input class="form-control" type="text" name="sponsorName" placeholder="sponsorName">
      </div>
    </div>
    <div class="form-group form-group-about">
      <label class="col-sm-2 control-label" for="sponsorDescription">Sponsor Description</label>
      <div class="col-sm-10">
        <input class="form-control" type="text" name="sponsorDescription" placeholder="sponsorDescription">
      </div>
    </div>
    <div class="form-group form-group-about">
      <label class="col-sm-2 control-label" for="sponsorAddress">Sponsor Address</label>
      <div class="col-sm-10">
        <input class="form-control" type="text" name="sponsorAddress" placeholder="sponsorAddress">
      </div>
    </div>
    <input class="btn btn-primary" type="submit">
  </form>
</div>
</center>
</body>
</html>