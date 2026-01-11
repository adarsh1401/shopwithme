var app = angular.module("shopWithMeApp", []);

app.controller("AuthController", function ($scope, $http) {

    const API_BASE = "http://localhost:9000/auth";

    $scope.loginData = {};
    $scope.signupData = {};

    $scope.login = function () {
        $http.post(API_BASE + "/login", $scope.loginData, {
            withCredentials: true
        }).then(
            function () {
                alert("Login successful");
            },
            function () {
                alert("Invalid username or password");
            }
        );
    };

    $scope.signup = function () {
        $http.post(API_BASE + "/register", $scope.signupData)
            .then(
                function () {
                    alert("Signup successful");
                },
                function () {
                    alert("Signup failed");
                }
            );
    };
});
