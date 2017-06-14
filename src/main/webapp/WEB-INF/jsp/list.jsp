<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- 引入jstl -->
<%@include file="common/tag.jsp"%>

<!DOCTYPE html>
<html>
<head>
    <title>Request List</title>
    <%@include file="common/head.jsp"%>
    <style>
        .row .col-lg-6{

            border-style: solid ;
            border-width: 1px;
            border-color: #e1e3e8;
        }
        .row .col-lg-6:hover{
            background-color: white;
            box-shadow: 10px 10px 20px #e1e3e8, -10px 10px 20px #e1e3e8;
        }
    </style>
</head>
<body>
<!-- 页面显示部分 -->
<div class="container">
    <div class="panel panel-default">
        <div class="panel-heading text-center">
            <h2>Request List</h2>
        </div>
        <div class="panel-body">
                <c:forEach var="request" items="${list}">
                    <div class="row">
                        <a class="col-lg-3"></a >
                        <div class="col-lg-6">
                            <h3>${request.beginPlace}<span>  to  </span>${request.endPlace}</h3>
                            <p>Driver: ${request.user.userName}</p>
                            <p>Driver PhoneNumber: ${request.user.userTele}</p>
                            <p>departure time:<fmt:formatDate value="${request.beginTime}" pattern="yyyy-MM-dd HH:mm"/></p >
                            <%--<button type="button" class="btn btn-primary btn-lg" id="detailBtn" data-toggle="modal" data-target="#myModal">Detail</button>--%>
                            <a class="btn btn-info" id="checkDetailBtn" target="_blank" value="${request.requestId}" data-toggle="modal" data-target="#myModal">link</a>
                        </div>
                        <a class="col-lg-3"></a >
                    </div>
                </c:forEach>
        </div>
    </div>
</div>
<!-- Modal -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
                <h4 class="modal-title" id="myModalLabel">Offer Detail</h4>
            </div>
            <div class="modal-body" id="request-detail">
                <%--<h3><span>  to  </span></h3>--%>
                <%--<p>Driver: <span id="detail-driver-name"></span></p>--%>
                <%--<p>Driver PhoneNumber:</p>--%>
                <%--<p>Departure time:<fmt:formatDate value="${request.beginTime}" pattern="yyyy-MM-dd HH:mm"/></p>--%>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                <button type="button" class="btn btn-primary" id="reserveBtn">Reserve</button>
            </div>
        </div>
    </div>
</div>


</body>
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="http://apps.bdimg.com/libs/jquery/2.0.0/jquery.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="http://apps.bdimg.com/libs/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="/resources/js/carpool.js"></script>
</html>