<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="UTF-8">
<meta http-equiv="Content-Type" content="text/html">

<script src="//ajax.googleapis.com/ajax/libs/angularjs/1.5.0-beta.2/angular.min.js"></script>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" 
integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" 
integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" 
integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
<title>Insert title here</title>
</head>
<body>


<div class="container">
<div class="row"></div>    
    <div class="row">    

        <form ng-submit="uploadFile()" enctype="multipart/form-data">
         <label>Set form name: <input type="text" ng-model="document.title" id="title" /></label><br>
       <label>Form image select:<input type="file" name="file" ng-model="document.fileInput" id="file" onchange="angular.element(this).scope().setTitle(this)" /></label>

       <button class="btn btn-primary btn-sm" type="submit">
             Submit
        </button>
    </form>
    </div> 
 <div class="row"></div>
 </div>    
    
    
    
    
    <script>
    var formApp = angular.module("formApp",[]);

formApp.controller("formCtrl", function($scope, $http) {
	
	
	$scope.document = {};
    
    $scope.setTitle = function(fileInput){
        var file = fileInput.value;
        var filename = file.replace(/^.*[\\\/]/, '');
        var title = filename.substr(0, filename.lastIndexOf('.'));
        $("#title").val(title);
        $("#title").focus();
        $scope.document.title=title;
    };
    
    $scope.uploadFile = function(){
        var formData = new FormData();
        formData.append("file", file.files[0]);
        
        $http({
            method:'POST',
            url:'yourway/rest/uploadFile',
            headers:{'Content-Type': 'undefined'},
            data:formData
        }).;
    }
}]);
    </script>


</body>
</html>
</html>