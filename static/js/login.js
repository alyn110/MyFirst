/**
 * Created by hp on 2017/11/22.
 */
var app = angular.module('myApp', []);
app.controller('myCtrl', function($scope, $http) {
    var data = {};
    $scope.login = function () {
        data.userName = $scope.name;
        data.password = $scope.password;
        $http({
            method: 'POST',
            url: 'http://localhost:8088/login/doLogin',
            data: data
        }).then(function successCallback(response) {
            console.log(response);
            // 请求成功执行代码
        }, function errorCallback(response) {
            // 请求失败执行代码
        });
    }

});