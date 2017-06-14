/**
 * Created by tongchen on 2016-11-11.
 */
var carpool = {
    URL: {
        detail: function (requestId) {
            return '/request/' + requestId + '/detail';
        },
        exposer: function (seckillId) {
            return '/seckill/' + seckillId + '/exposer';
        }
    },
    UnixToDate: function (unixTime) {
        var timestamp = unixTime;
        timestamp = parseInt(timestamp);
        var time = new Date(timestamp);
        var year = time.getFullYear();
        var month = (time.getMonth() + 1) > 9 && (time.getMonth() + 1) || ('0' + (time.getMonth() + 1))
        var date = time.getDate() > 9 && time.getDate() || ('0' + time.getDate())
        var hour = time.getHours() > 9 && time.getHours() || ('0' + time.getHours())
        var minute = time.getMinutes() > 9 && time.getMinutes() || ('0' + time.getMinutes())
        var YmdHis = year + '-' + month + '-' + date
            + ' ' + hour + ':' + minute;
        return YmdHis;
    },
    detail: function () {
        $('#checkDetailBtn').click(function () {
            var requestId = $('#checkDetailBtn').attr("value");
            var requestDetail = $('#request-detail');
            $.ajax({
                type: "get",
                dataType: "json",
                url: "/request/" + 1003 + "/detail",
                success: function (data) {
                    console.log(data);
                    $('#request-detail').append(
                        '<h3>' + data.beginPlace + '<span>  to  </span>' + data.endPlace + '</h3>' +
                        '<p>Driver: ' + data.user.userName + '</p>' +
                        '<p>PhoneNumber: ' + data.user.userTele + '</p>' +
                        '<p>Car Brand: ' + data.car.carType + '</p>' +
                        '<p>departure time: ' + carpool.UnixToDate(data.beginTime) + '</p>'
                    )
                    // $('#detail-driver-name').append(data.user.userName);
                }
            });
        }),

            $('#reserveBtn').click(function () {
                var requestId = $('#checkDetailBtn').attr("value");
                var requestDetail = $('#request-detail');
                $.ajax({
                    type: "post",
                    dataType: "json",
                    data: {"userId": userId},
                    url: "/request/" + requestId + "/reserve",
                    success: function (data) {
                        console.log(data);
                        $('#request-detail').html(
                            '<h3>' + data.beginPlace + '<span>  to  </span>' + data.endPlace + '</h3>' +
                            '<p>Driver:' + data.user.userName + '</p>' +
                            '<p>Driver PhoneNumber:' + data.user.userTele + '</p>' +
                            '<p>departure time:<fmt:formatDate value=' + data.beginTime + 'pattern="yyyy-MM-dd HH:mm"/></p>'
                        )
                        // $('#detail-driver-name').append(data.user.userName);
                    }
                });
            })
    }
}
var ajaxFormOption = {
    dataType: 'json',
    //data: myData,
    success: function (data) {
        location.href="/request/"+data+"/list";
    }
};
$(function () {
    carpool.detail();
    $('#sign_up_Btn').click(function () {
        $('#signUpForm').ajaxSubmit(ajaxFormOption);
        return false;
    })
});