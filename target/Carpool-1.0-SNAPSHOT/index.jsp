<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="x-ua-compatible" content="IE-edge">
    <meta name="viewpoint" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>CarPool Windsor</title>
    <!--Bootstrap Core CSS-->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <!--<link rel="stylesheet" href="bower_components/reset-css/reset.css">-->
    <!--Custom CSS-->
    <link rel="stylesheet" href="resources/css/index.css" type= text/css>
    <link href='https://fonts.googleapis.com/css?family=Lobster' rel='stylesheet'  type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Oswald' rel='stylesheet'  type='text/css'>
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>
<body>
<!--nav begin-->
<nav class="navbar-default navbar-fixed-top" role="navigation">
    <div class="container">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">Carpool Windsor</a>
        </div>
        <div  id="CustomerView-navbar">
            <!--<ul class="nav navbar-nav">-->
            <!--<li>-->
            <!--<a class="nav_item" href="#">About us</a>-->
            <!--</li>-->
            <!--<li>-->
            <!--<a class="nav_item" href="#">Services</a>-->
            <!--</li>-->
            <!--<li>-->
            <!--<a class="nav_item" href="#">Contact</a>-->
            <!--</li>-->

            <!--</ul>-->

            <ul class="nav navbar-nav navbar-right">
                <li><a id="signIn"  data-toggle="modal" data-target="#logInModal" style="font-family: Oswald"><span class="glyphicon glyphicon-user"></span> Login</a ></li>
                <li><a id="signUp"  data-toggle="modal" data-target="#signUpModal" style="font-family: Oswald"><span class="glyphicon glyphicon-log-in"></span> Sign Up</a ></li>
            </ul>
        </div>
    </div>
</nav>


<!--nav end-->

<div class="homepage-hero-module">
    <div class="video-container">
        <div class="filter"></div>
        <video autoplay loop class="fillWidth">
            <source src="resources/video/Going-Places/Mp4/Going-Places.mp4" type="video/mp4" />
            <source src="resources/video/Going-Places/Webm/Going-Places.webm" type="video/webm" />
        </video>
        <div class="poster hidden">
            <img src="resources/video/Going-Places/Snapshots/Going-Places.jpg" alt="">
        </div>
        <div id="home-page-content" style="position: absolute;bottom: 45%;margin-top:200px;text-align: center; left: 0;width: 100%;" class="container">

            <div class="lead"><h1 style="font-family:Oswald;color: #ffffff;text-shadow: 0px 0px 5px rgba(0,0,0,0.55); font-size: 250%">DISCOVER YOUR NEW LIFE</h1>
                <h1 style="font-family:Oswald;color: #ffffff;text-shadow: 0px 0px 5px rgba(0,0,0,0.55); font-size: 150%;margin-top: 7%"><span style="margin-right: 40px">Easy</span><span>Secure</span><span style="margin-left: 40px">Fast</span></h1>
            </div>

        </div>
    </div>

</div>



<div class="modal fade" id="signUpModal">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title">Join us!</h4>
            </div>
            <div class="modal-body">
                <div class="container">
                    <form id="signUpForm" name="signUpForm" action="/user/registration" method="post">
                        <div class="form-group row">
                            <label for="usrNameSignUp" class="col-sm-2 col-form-label">UserName</label>
                            <div class="col-sm-3">
                                <input type="text" class="form-control" id="usrNameSignUp" name="userName" placeholder="Please input your name...">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="usrTelSignUp" class="col-sm-2 col-form-label">PhoneNumber</label>
                            <div class="col-sm-3">
                                <input type="tel" class="form-control" id="usrTelSignUp" name="userTele" placeholder="Phone#...">
                            </div>
                        </div>
                        <!--password and password again-->
                        <div class="form-group row">
                            <label for="password" class="col-sm-2 col-form-label">Password</label>
                            <div class="col-sm-3">
                                <input type="password" class="form-control" id="password" name="userPassword" placeholder="Password...">
                            </div>

                        </div>
                        <div class="form-group row">
                            <label for="password_again" class="col-sm-2 col-form-label">Confirm Password</label>
                            <div class="col-sm-3">
                                <input name="password_again" type="password" class="form-control" id="password_again" placeholder="Confirm Password...">
                            </div>

                        </div>
                        <!--password and password again end-->

                        <label class="form-check-inline">
                            <input class="form-check-input" type="radio" name="userIdentity" id="chkDriver" value=0> Driver

                        </label>
                        <label class="form-check-inline">
                            <input class="form-check-input" type="radio" name="userIdentity" id="chkCostumer" value=1> Costumer
                        </label>
                    </form>
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancel</button>
                <button id="sign_up_Btn"type="button" class="btn btn-primary">Sign Up</button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
</div>
<!-- /.modal -->

<div class="modal fade" id="logInModal">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title">Welcome</h4>
            </div>
            <div class="modal-body">
                <div class="container">
                    <form>
                        <div class="form-group row">
                            <label for="usrLogin" class="col-sm-2 col-form-label">PhoneNumber</label>
                            <div class="col-sm-3">
                                <input type="tel" class="form-control" id="usrLogin" placeholder="Phone#...">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="pswLogin" class="col-sm-2 col-form-label">Password</label>
                            <div class="col-sm-3">
                                <input type="password" class="form-control" id="pswLogin" placeholder="Password...">
                            </div>
                        </div>
                    </form>
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancel</button>
                <button type="button" class="btn btn-primary">Submit</button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
</div>
<!-- /.modal -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="resources/js/video.js"></script>
<script src="https://ajax.aspnetcdn.com/ajax/jquery.validate/1.15.0/jquery.validate.min.js"></script>
<script src="https://ajax.aspnetcdn.com/ajax/jquery.validate/1.15.0/additional-methods.min.js"></script>
<script src="resources/js/jquery.form.min.js"></script>
<script src="resources/js/carpool.js"></script>
</body>
</html>
