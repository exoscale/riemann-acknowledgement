var app = angular.module('acks', []);

app.factory('$acks', function ($http) {
   return {
       create: function (ack) {
           return $http.post('/acks', ack);
       },
       list: function() {
           return $http.get('/acks');
       },
       rm: function(ack) {
           return $http.put('/acks', ack);
       }
   };
});

app.controller('Acks', function($scope, $acks) {

    $scope.acks = [];

    var update = function (data) {
        $scope.acks = data;
    }

    $acks.list().success(update);


    $scope.add_ack = function (h,s) {
        $acks.create([h,s]).success(update);
    };

    $scope.delete_ack = function (ack) {
        $acks.rm(ack).success(update);
    };
});
