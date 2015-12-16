var formApp = angular.module("formApp",[]);

formApp.controller("formCtrl", function($scope, $http) {
	
	
	$scope.addRowAsyncAsJSON = function(){		
		$scope.companies.push({ 'name':$scope.name, 'employees': $scope.employees, 'headoffice':$scope.headoffice });
		// Writing it to the server
		//		
		var dataObj = {
				name : $scope.name,
				employees : $scope.employees,
				headoffice : $scope.headoffice
		};	
		var res = $http.post('/savecompany_json', dataObj);
		res.success(function(data, status, headers, config) {
			$scope.message = data;
		});
		res.error(function(data, status, headers, config) {
			alert( "failure message: " + JSON.stringify({data: data}));
		});		
		// Making the fields empty
		//
		$scope.name='';
		$scope.employees='';
		$scope.headoffice='';
	};
});