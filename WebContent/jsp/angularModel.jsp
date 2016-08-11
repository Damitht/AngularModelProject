<html>
<script	src="http://ajax.googleapis.com/ajax/libs/angularjs/1.3.15/angular.min.js"></script>
<script>
		var app = angular.module('calculateorOperation', []);
		app.controller('calculatorController', function($scope, $http) {
			
			$scope.calculateorOperationFunc = function() {
				alert($scope.pathVal);
				$http.get("/AngularModelProject/CalculatorOperation/"+ $scope.pathVal).success(
						function(response) {
							$scope.answer = response.answer;
						});
			};
		});
</script>

<body>
	<table border="0" width="100%">
		<tr>
			<td>
				<div ng-app="calculateorOperation">
					<form ng-controller="calculatorController" name="mathForm">
						<table class="leftRightForm">
							<tr>
				    			<td align="center" colspan="4" ><font size="2" style="color:black"><b>Test</b></font></td>
				  			</tr>
							<tr>
				    			<td colspan="4">&nbsp;</td>
				  			</tr>
							<tr>
								<td width="40%">&nbsp;</td>
				       			<td width="15%"><b>Path :</b></td>
				          		<td width="15%">
			          				<input type="text" name="pathVal" ng-model="pathVal" placeholder="pathVal" min="1" max="200" required>
			          				<span class="error" style="color:red" ng-show="mathForm.power.$error.required"></span>
			          				<span class="error" style="color:red" ng-show="mathForm.input.$error.number"></span>
				          		</td>
				          		<td width="30%">&nbsp;</td>
				    		</tr>
					    		<tr>
				    			<td>&nbsp;</td>
				    			<td><button ng-click="calculateorOperationFunc()">Calculate</button></td>
				    			<td>
				    				<span style="color:black"><b>{{answer}}</b></span>
				    			</td>
				    			<td>&nbsp;</td>
				    		</tr>
						</table>
					</form>
				</div>
			</td>
		</tr>
	</table>
</body>
</html>
