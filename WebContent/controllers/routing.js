var app = angular.module("AMail", ["ngRoute"]);

function emailRouteConfig($routeProvider, $locationProvider){
	$routeProvider.when('/', 
		{
			templateUrl: "views/list.html",
			controller: "ListCtrl"
		}
	).when("/view/:id", 
		{
			templateUrl: "views/detail.html",
			controller: "DetailCtrl"
		}
	).when("/add",
		{
			templateUrl: "views/add.html",
			controller: "AddCtrl"
		}
	).otherwise(
		{
			redirectTo: "/"
		});
	$locationProvider.html5Mode({enabled: true, requireBase: false});
};

// Bind the route configuration to the app module
app.config(emailRouteConfig);


//Initialize items array
items = [];





