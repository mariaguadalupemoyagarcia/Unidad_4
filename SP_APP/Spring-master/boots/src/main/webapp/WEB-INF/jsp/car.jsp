
<!DOCTYPE HTML>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta http-equiv="Pragma" content="no-cache"> 
    <meta http-equiv="Cache-Control" content="no-cache"> 
    <meta http-equiv="Expires" content="Sat, 01 Dec 2001 00:00:00 GMT">
    
    <title>Car Manager | Home</title>
    
    <link href="static/css/bootstrap.min.css" rel="stylesheet">
     <link href="static/css/style.css" rel="stylesheet">
    
    <!--[if lt IE 9]>
		<script src="static/js/html5shiv.min.js"></script>
		<script src="static/js/respond.min.js"></script>
	<![endif]-->
</head>
<body>

	<div role="navigation">
		<div class="navbar navbar-inverse">
			<a href="/" class="navbar-brand">Home</a>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
				
					<li><a href="new-car">New Car</a></li>
					<li><a href="all-cars">All Cars</a></li>
					
					
				</ul>
			</div>
		</div>
	</div>
	
	<c:choose>
		<c:when test="${mode == 'MODE_HOME_CAR'}">
			<div class="container" id="homeDiv">
				<div class="jumbotron text-center">
					<h1>Welcome to the Cars Manager</h1>
				</div>
			</div>
		</c:when>
		
		
		<c:when test="${mode == 'MODE_CARS'}">
			<div class="container text-center" id="carsDiv">
				<h3>My cars</h3>
				<hr>
				<div class="table-responsive">
					<table class="table table-striped table-bordered text-left">
						<thead>
							<tr>
								<th>Id</th>
								<th>Name</th>
								<th>Type</th>
								<th>Model</th>
								<th>Color</th>
								<th>Price</th>
								<th></th>
								<th></th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="car" items="${cars}">
								<tr>
									<td>${car.id}</td>
									<td>${car.name}</td>
									<td>${car.type}</td>
									<td>${car.model}</td>
									<td>${car.color}</td>
									<td>${car.price}</td>
									<td><a href="update-car?id=${car.id}"><span class="glyphicon glyphicon-pencil"></span></a></td>
									<td><a href="delete-car?id=${car.id}"><span class="glyphicon glyphicon-trash"></span></a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</c:when>
		
		
		
		<c:when test="${mode == 'MODE_NEW' || mode == 'MODE_UPDATE'}">
			<div class="container text-center">
				<h3>Manage Car</h3>
				<hr>
				<form class="form-horizontal" method="POST" action="save-car">
					<input type="hidden" name="id" value="${car.id}"/>
					<div class="form-group">
						<label class="control-label col-md-3">Name</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="name" value="${car.name}"/>
						</div>				
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Type</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="type" value="${car.type}"/>
						</div>				
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Model</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="model" value="${car.model}"/>
						</div>				
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Color</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="color" value="${car.color}"/>
						</div>				
					</div>	
					<div class="form-group">
						<label class="control-label col-md-3">Price</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="price" value="${car.price}"/>
						</div>				
					</div>
						
					<div class="form-group">
						<input type="submit" class="btn btn-primary" value="Save"/>
					</div>
				</form>
			</div>
		</c:when>		
		
		
		
		
	
		
	</c:choose>

	<script src="static/js/jquery-1.11.1.min.js"></script>    
    <script src="static/js/bootstrap.min.js"></script>
</body>
</html>
