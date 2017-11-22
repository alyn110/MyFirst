/**
 * Created by hp on 2017/11/22.
 */
var app = angular.module('myApp', []);
app.controller('myCtrl', function($scope) {
    var data = {};
    data.name = $scope.name;
    data.password = $scope.password;

    $scope.login = function () {
        $http({
            method: 'POST',
            url: 'http://localhost:8080/login/doLogin',
            data: data
        }).then(function successCallback(response) {
            // 请求成功执行代码
        }, function errorCallback(response) {
            // 请求失败执行代码
        });
    }

});