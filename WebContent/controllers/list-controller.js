angular.module("AMail").controller("ListCtrl", ["$scope", "$location", "$http", "$interval",
    function($scope, $location, $http, $interval) {
		$scope.navigate = {};
		$scope.navigate.add = function() {
			$location.path("/add");
		};
		
		$scope.navigate.getList = function(){
			$location.path("/getList");
		};
		
		$scope.action = {};
		$scope.action.clear = function() {
			$scope.$parent.succesMessage = "";
		};
		
	 	//$scope.items = items;
	
		
	    $scope.getItems = function() {

	        $http({method : 'GET', url : "resources/list"})
	            .success(function(data, status) {
	            	
	            	items = data.item;
	                $scope.items = items;
	                console.log(items);
	            })
	            .error(function(data, status) {
	                alert("Error");
	            });
	    };
	    
	    $scope.repeatFunction = $interval(function() {
	    	$scope.getItems();
	    }, 30000);
	}
]);