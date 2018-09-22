var app = angular.module("myApp", []);
app.controller('ItemController', function($scope, $http) {
	$scope.item;
	$scope.itembyid;
	$scope.ifget=false;
	$scope.items=[];
	
	$scope.getAllItems = function getAllItems(){
		$http({
	        method: 'GET',
	        url: '/item'
	    }).then(
	        function(res) { // success
	        	console.log("Success");
	            $scope.items = res.data;
	        },
	        function(res) { // error
	            console.log("Error: " + res.status + " : " + res.data);
	        }
	    );	
	}
	$scope.addItem = function addItem(){
	    $http({
	        method: "POST",
	        url: "/item",
	        data: angular.toJson($scope.item),
	        headers: {
	            'Content-Type': 'application/json'
	        }
	    }).then(
		        function(res) { // success
		        	console.log("Success");
		        	$scope.getAllItems();
		        },
		        function(res) { // error
		            console.log("Error: " + res.status + " : " + res.data);
		        }
		    );	
	}
	$scope.deleteItem = function(id) {
	    $http({
	        method: 'DELETE',
	        url: '/item/' + id
	    }).then(
		        function(res) { // success
		        	console.log("Success");
		        	$scope.getAllItems();
		        },
		        function(res) { // error
		            console.log("Error: " + res.status + " : " + res.data);
		        }
		    );	
	}
	$scope.getItem = function getItem(id){
		$http({
	        method: 'GET',
	        url: '/item/'+ id
	    }).then(
	        function(res) { // success
	        	console.log("Success");
	            $scope.itembyid = res.data;
	            $scope.ifget=true;
	            $scope.getAllItems();
	        },
	        function(res) { // error
	            console.log("Error: " + res.status + " : " + res.data);
	        }
	    );	
	}
	$scope.depositItem = function depositItem(id,amount){
		$http({
	        method: 'PUT',
	        url: '/item/' + id + '/deposit',
	        params: {amount:amount}
	    }).then(
	        function(res) { // success
	        	console.log("Success");
	        	$scope.getAllItems();
	        },
	        function(res) { // error
	            console.log("Error: " + res.status + " : " + res.data);
	        }
	    );	
	}
	$scope.withdrawalItem = function withdrawalItem(id,amount){
		$http({
	        method: 'PUT',
	        url: '/item/' + id + '/withdrawal',
	        params: {amount:amount}
	    }).then(
	        function(res) { // success
	        	console.log("Success");
	        	$scope.getAllItems();
	        },
	        function(res) { // error
	            console.log("Error: " + res.status + " : " + res.data);
	        }
	    );	
	}
});