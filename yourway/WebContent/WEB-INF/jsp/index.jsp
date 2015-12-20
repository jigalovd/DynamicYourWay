<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	
<meta http-equiv="Content-Type" content="text/html">

<script src="//ajax.googleapis.com/ajax/libs/angularjs/1.5.0-beta.2/angular.min.js"></script>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>


<div class="container">
	<div class="row">
		<div class="page-header">
			<h3>New Document Form</h3>
		</div>	
	</div>    
	    <div class="row">    
	
	        <form method="POST" action="/yourway/uploadFile" enctype="multipart/form-data">
	         <label>Set form name: <input type="text"  name="name" id="title" /></label><br>
	       <label>Form image select:<input type="file" name="file"  id="file"/></label>
			<input type="submit" value="Send">
	       
	    </form>
	    </div> 
	 <div class="row"></div>
 </div>    
    
    
    
    
    <script>
   
    </script>


</body>

</html>