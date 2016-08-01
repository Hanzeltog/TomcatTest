angular.module("AMail").controller("DetailCtrl", ["$scope", "$location", "$routeParams", 
    function($scope, $location, $routeParams) {
		$scope.id = $routeParams.id;
		console.log(items + items[0].id + $scope.id);
		for (var i = 0; i < items.length; i++){
			console.log(items[i].id);
			console.log($scope.id);
			if(parseInt(items[i].id) === parseInt($scope.id)){
				console.log(true);
				$scope.item = items[i];
			}
		}
		
		$scope.navigate = {};
		
		$scope.navigate.back = function() {
			$location.path(".//");
		};
	}
]);	