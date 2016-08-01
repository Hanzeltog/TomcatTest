angular.module("AMail").controller("AddCtrl", ["$scope", "$location", "$filter", "$http",
    function($scope, $location, $filter, $http) {
		$scope.sender = "";
		$scope.subject = "";
		$scope.receiver = "";
		$scope.message = "";
			
			
		$scope.navigate = {};
		$scope.navigate.back = function() {
			$location.path(".//");
		};
		
		$scope.action = {};
		$scope.action.add = function() {
			console.log($scope.sender + $scope.receiver + $scope.subject + $scope.message);
			$http({
			    method : 'POST',
			    url : "resources/addItem",
			    params : {
			        'sender' : $scope.sender,
			        'receiver' : $scope.receiver,
			        'subject' : $scope.subject,
			         'message' : $scope.message
			    },
			    headers : {
			        'Content-Type' : 'application/x-www-form-urlencoded'
			    }
			}).success(function (data) {
			    console.log(' data ');
			});
			
			
			
			$scope.action.resetFields();
			$scope.$parent.succesMessage = "Your e-mail is now saved.";
			$location.path(".//");
		};
		
		$scope.action.resetFields = function() {
			$scope.sender = "";
			$scope.subject = "";
			$scope.receiver = "";
			$scope.message = "";
		};
		
		$scope.action.getNewId = function() {
			var highestId = -1;
			for(var i = 0; i < items.length; i++) {
				if(items[i].id > highestId) {
					highestId = items[i].id;
				}
			}
			return highestId + 1;
		};
	}
]);