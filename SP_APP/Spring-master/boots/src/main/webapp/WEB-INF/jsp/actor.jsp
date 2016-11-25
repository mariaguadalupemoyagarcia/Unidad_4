
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
    
    <title>Actor Manager | Home</title>
    
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
				
					<li><a href="new-actor">New Actor</a></li>
					<li><a href="all-actors">All Actors</a></li>
					
					
				</ul>
			</div>
		</div>
	</div>
	
	<c:choose>
		<c:when test="${mode == 'MODE_HOME_ACTOR'}">
			<div class="container" id="homeDiv">
				<div class="jumbotron text-center">
					<h1>Welcome to the Actors Manager</h1>
				</div>
			</div>
		</c:when>
		
		
		<c:when test="${mode == 'MODE_ACTORS'}">
			<div class="container text-center" id="actorsDiv">
				<h3>My Actors</h3>
				<hr>
				<div class="table-responsive">
					<table class="table table-striped table-bordered text-left">
						<thead>
							<tr>
								<th>Id</th>
								<th>Name</th>
								<th>Age</th>
								<th>Date start</th>
								<th>State</th>
								
								<th></th>
								<th></th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="actor" items="${actors}">
								<tr>
									<td>${actor.id}</td>
									<td>${actor.name}</td>
									<td>${actor.age}</td>
										<td><fmt:formatDate pattern="yyyy-MM-dd" value="${actor.dateStart}"/></td>
									<td>${actor.state}</td>
									
									<td><a href="update-actor?id=${actor.id}"><span class="glyphicon glyphicon-pencil"></span></a></td>
									<td><a href="delete-actor?id=${actor.id}"><span class="glyphicon glyphicon-trash"></span></a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</c:when>
		
		
		
		<c:when test="${mode == 'MODE_NEW' || mode == 'MODE_UPDATE'}">
			<div class="container text-center">
				<h3>Manage Actor</h3>
				<hr>
				<form class="form-horizontal" method="POST" action="save-actor">
					<input type="hidden" name="id" value="${actor.id}"/>
					<div class="form-group">
						<label class="control-label col-md-3">Name</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="name" value="${actor.name}"/>
						</div>				
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">age</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="age" value="${actor.age}"/>
						</div>				
					</div>
				
					<div class="form-group">
						<label class="control-label col-md-3">State</label>
						<div class="col-md-7">
							<input type="radio" class="col-sm-1" name="state" value="true"/>
							<div class="col-sm-1">Yes</div>
							<input type="radio" class="col-sm-1" name="state" value="false" checked/>
							<div class="col-sm-1">No</div>
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
