<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home | E-Shopper</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css">
    <link rel="script" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.bundle.min.js">

    <link rel="script" href="https://code.jquery.com/jquery-3.3.1.slim.min.js"
          integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
          crossorigin="anonymous">
    <link rel="script" href="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
          integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
          crossorigin="anonymous">
    <link rel="script" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
          integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
          crossorigin="anonymous">
    <link rel="script" href="https://cdnjs.cloudflare.com/ajax/libs/gsap/2.1.3/TweenMax.min.js">
    <link rel="script" href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js">
    <link rel="script" href="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js">


    <link rel="script" href="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js">
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
          integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.2.0/css/all.css"
          integrity="sha384-hWVjflwFxL6sNzntih27bfxkr27PmbbK/iSvJ+a4+0owXq79v+lsFkW54bOGbiDQ" crossorigin="anonymous">

</head>
<body>

<!-- Header -->
<header class="header">
    <!-- Top Bar -->
    <div class="top_bar">
        <div class="container">
            <div class="row">
                <div class="col d-flex flex-row">
                    <div class="top_bar_contact_item">
                        <div class="top_bar_icon"><img
                                src="https://res.cloudinary.com/dxfq3iotg/image/upload/v1560918577/phone.png"
                                alt=""></div>
                        +375-25-777-77-77
                    </div>
                    <div class="top_bar_contact_item">
                        <div class="top_bar_icon"><img
                                src="https://res.cloudinary.com/dxfq3iotg/image/upload/v1560918597/mail.png" alt="">
                        </div>
                        <a href="mailto:fastsales@gmail.com">infoEuroShop@gmail.com</a>
                    </div>
                    <div class="top_bar_content ml-auto">
                        <div class="top_bar_menu">
                            <ul class="standard_dropdown top_bar_dropdown">
                                <li><a href="#">English<i class="fas fa-chevron-down"></i></a>
                                    <ul>
                                        <li><a href="#">Italian</a></li>
                                        <li><a href="#">Spanish</a></li>
                                        <li><a href="#">Japanese</a></li>
                                    </ul>
                                </li>
                            </ul>
                        </div>
                        <div class="top_bar_user">
                            <div class="user_icon"><img
                                    src="https://res.cloudinary.com/dxfq3iotg/image/upload/v1560918647/user.svg"
                                    alt=""></div>
                            <div><a href="#">Register</a></div>
                            <div><a href="#">Sign in</a></div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div> <!-- Header Main -->
    <div class="header_main">
        <div class="container">
            <div class="row">
                <!-- Logo -->
                <div class="col-lg-2 col-sm-3 col-3 order-1">
                    <div class="logo_container">
                        <div class="logo"><a href="#">EuroShop</a></div>
                    </div>
                </div> <!-- Search -->
                <div class="col-lg-6 col-12 order-lg-2 order-3 text-lg-left text-right">
                    <div class="header_search">
                        <div class="header_search_content">
                            <div class="header_search_form_container">
                                <form action="#" class="header_search_form clearfix"><input type="search"
                                                                                            required="required"
                                                                                            class="header_search_input"
                                                                                            placeholder="Search for products...">
                                    <div class="custom_dropdown" style="display: none;">
                                        <div class="custom_dropdown_list"><span
                                                class="custom_dropdown_placeholder clc"></span> <i
                                                class="fas fa-chevron-down"></i>
                                            <ul class="custom_list clc">
                                                <li></li>
                                            </ul>
                                        </div>
                                    </div>
                                    <button type="submit" class="header_search_button trans_300" value="Submit"><img
                                            src="https://res.cloudinary.com/dxfq3iotg/image/upload/v1560918770/search.png"
                                            alt=""></button>
                                </form>
                            </div>
                        </div>
                    </div>
                </div> <!-- Wishlist -->
                <div class="col-lg-4 col-9 order-lg-3 order-2 text-lg-left text-right">
                    <div class="wishlist_cart d-flex flex-row align-items-center justify-content-end">
                        <div class="cart">
                            <div class="cart_container d-flex flex-row align-items-center justify-content-end">
                                <div class="cart_icon"><img
                                        src="https://res.cloudinary.com/dxfq3iotg/image/upload/v1560918704/cart.png"
                                        alt="">
                                    <div class="cart_count"><span>3</span></div>
                                </div>
                                <div class="cart_content">
                                    <div class="cart_text"><a href="#">Cart</a></div>
                                    <div class="cart_price">$185</div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div> <!-- Main Navigation -->
    <nav class="main_nav">
        <div class="container">
            <div class="row">
                <div class="col">
                    <div class="main_nav_content d-flex flex-row">
                        <!-- Categories Menu -->
                        <!-- Main Nav Menu -->
                        <div class="main_nav_menu">
                            <ul class="standard_dropdown main_nav_dropdown">
                                <li><a href="#">Home<i class="fas fa-chevron-down"></i></a></li>
                                <li class="hassubs"><a href="#">Laptop<i class="fas fa-chevron-down"></i></a>
                                    <ul>
                                        <li><a href="#">Lenovo<i class="fas fa-chevron-down"></i></a>
                                            <ul>
                                                <li><a href="#">Lenovo 1<i class="fas fa-chevron-down"></i></a></li>
                                                <li><a href="#">Lenovo 3<i class="fas fa-chevron-down"></i></a></li>
                                                <li><a href="#">Lenovo 2<i class="fas fa-chevron-down"></i></a></li>
                                            </ul>
                                        </li>
                                        <li><a href="#">DELL<i class="fas fa-chevron-down"></i></a></li>
                                        <li><a href="#">APPLE<i class="fas fa-chevron-down"></i></a></li>
                                        <li><a href="#">HP<i class="fas fa-chevron-down"></i></a></li>
                                    </ul>
                                </li>
                                <li class="hassubs"><a href="#">Featured Brands<i
                                        class="fas fa-chevron-down"></i></a>
                                    <ul>
                                        <li><a href="#">APPLE<i class="fas fa-chevron-down"></i></a>
                                            <ul>
                                                <li><a href="#">Laptop<i class="fas fa-chevron-down"></i></a></li>
                                                <li><a href="#">Mobiles<i class="fas fa-chevron-down"></i></a></li>
                                                <li><a href="#">Ipads<i class="fas fa-chevron-down"></i></a></li>
                                            </ul>
                                        </li>
                                        <li><a href="#">Samsung<i class="fas fa-chevron-down"></i></a></li>
                                        <li><a href="#">Lenovo<i class="fas fa-chevron-down"></i></a></li>
                                        <li><a href="#">DELL<i class="fas fa-chevron-down"></i></a></li>
                                    </ul>
                                </li>
                            </ul>
                        </div> <!-- Menu Trigger -->
                        <div class="menu_trigger_container ml-auto">
                            <div class="menu_trigger d-flex flex-row align-items-center justify-content-end">
                                <div class="menu_burger">
                                    <div class="menu_trigger_text">menu</div>
                                    <div class="cat_burger menu_burger_inner">
                                        <span></span><span></span><span></span></div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </nav> <!-- Menu -->
    <div class="page_menu">
        <div class="container">
            <div class="row">
                <div class="col">
                    <div class="page_menu_content">
                        <div class="page_menu_search">
                            <form action="#"><input type="search" required="required" class="page_menu_search_input"
                                                    placeholder="Search for products..."></form>
                        </div>
                        <ul class="page_menu_nav">
                            <li class="page_menu_item has-children"><a href="#">Language<i
                                    class="fa fa-angle-down"></i></a>
                                <ul class="page_menu_selection">
                                    <li><a href="#">English<i class="fa fa-angle-down"></i></a></li>
                                    <li><a href="#">Italian<i class="fa fa-angle-down"></i></a></li>
                                    <li><a href="#">Spanish<i class="fa fa-angle-down"></i></a></li>
                                    <li><a href="#">Japanese<i class="fa fa-angle-down"></i></a></li>
                                </ul>
                            </li>

                            <li class="page_menu_item"><a href="#">Home<i class="fa fa-angle-down"></i></a></li>
                            <li class="page_menu_item has-children"><a href="#">Featured Brands<i
                                    class="fa fa-angle-down"></i></a>
                                <ul class="page_menu_selection">
                                    <li><a href="#">Featured Brands<i class="fa fa-angle-down"></i></a></li>
                                    <li><a href="#">Menu Item<i class="fa fa-angle-down"></i></a></li>
                                    <li><a href="#">Menu Item<i class="fa fa-angle-down"></i></a></li>
                                    <li><a href="#">Menu Item<i class="fa fa-angle-down"></i></a></li>
                                </ul>
                            </li>
                            <li class="page_menu_item has-children"><a href="#">Trending Styles<i
                                    class="fa fa-angle-down"></i></a>
                                <ul class="page_menu_selection">
                                    <li><a href="#">Trending Styles<i class="fa fa-angle-down"></i></a></li>
                                    <li><a href="#">Menu Item<i class="fa fa-angle-down"></i></a></li>
                                    <li><a href="#">Menu Item<i class="fa fa-angle-down"></i></a></li>
                                    <li><a href="#">Menu Item<i class="fa fa-angle-down"></i></a></li>
                                </ul>
                            </li>
                        </ul>
                        <div class="menu_contact">
                            <div class="menu_contact_item">
                                <div class="menu_contact_icon"><img src="images/phone_white.png" alt=""></div>
                                +375-25-777-77-77
                            </div>
                            <div class="menu_contact_item">
                                <div class="menu_contact_icon"><img src="images/mail_white.png" alt=""></div>
                                <a href="mailto:fastsales@gmail.com">infoEuroShop@gmail.com</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</header>


<div class="wrapper rounded bg-white">
    <hr>
    <div class="row px-sm-2 px-0 pt-3">
        <div class="container">
            <figure>
                <a href="#" class="buttons"><img src="resources/images/americanFlag.png" class="button_images">
                    <figcaption>Nercn</figcaption>
                </a>
                <a href="#" class="buttons"><img src="resources/images/americanFlag.png" class="button_images">
                    <figcaption>Nercn</figcaption>
                </a>
                <a href="#" class="buttons"><img src="resources/images/americanFlag.png" class="button_images">
                    <figcaption>Nercn</figcaption>
                </a>
                <a href="#" class="buttons"><img src="resources/images/americanFlag.png" class="button_images">
                    <figcaption>Nercn</figcaption>
                </a> <a href="#" class="buttons"><img src="resources/images/americanFlag.png" class="button_images">
                <figcaption>Nercn</figcaption>
            </a> <a href="#" class="buttons"><img src="resources/images/americanFlag.png" class="button_images">
                <figcaption>Nercn</figcaption>
            </a> <a href="#" class="buttons"><img src="resources/images/americanFlag.png" class="button_images">
                <figcaption>Nercn</figcaption>
            </a>
            </figure>
        </div>
        <div class="container">
            <figure>
                <a href="#" class="buttons"><img src="resources/images/americanFlag.png" class="button_images"></a>
                <a href="#" class="buttons"><img src="resources/images/americanFlag.png" class="button_images"></a>
                <a href="#" class="buttons"><img src="resources/images/americanFlag.png" class="button_images"></a>
                <a href="#" class="buttons"><img src="resources/images/americanFlag.png" class="button_images"></a>
                <a href="#" class="buttons"><img src="resources/images/americanFlag.png" class="button_images"></a>
                <a href="#" class="buttons"><img src="resources/images/americanFlag.png" class="button_images"></a>
                <a href="#" class="buttons"><img src="resources/images/americanFlag.png" class="button_images"></a>
            </figure>
        </div>
        <div class="col-md-4 offset-md-0 offset-sm-2 offset-1 col-sm-8 col-10 offset-sm-2 offset-1 mb-3">
            <div class="card">
                <div class="px-2 red text-uppercase">new</div>
                <div class="d-flex justify-content-center"> <img src="https://coolshoes.by/image/cache/catalog/models/Adidas/Closes/CE2408-406x406.jpg " class="product images" alt=""> </div> <b class="px-2">
                <p class="h4">The Little Botanical Haworthia</p>
            </b>
                <div class="d-flex align-items-center justify-content-start rating border-top border-bottom py-2">
                    <div class="text-muted text-uppercase px-2 border-right">insto2007</div>
                    <div class="px-lg-2 px-1"> <span class="fas fa-star"></span> <span class="fas fa-star"></span> <span class="fas fa-star"></span> <span class="fas fa-star"></span> <span class="fas fa-star"></span> <a href="#" class="px-lg-2 px-1 reviews">{3 Reviews}</a> </div>
                </div>
                <div class="d-flex align-items-center justify-content-between py-2 px-3">
                    <div class="h4"><span>&#xa3;</span>10.99</div>
                    <div> <button class="btn btn-dark text-uppercase"> buy now </button> </div>
                </div>
            </div>
        </div>
        <div class="col-md-4 offset-md-0 offset-sm-2 offset-1 col-sm-8 col-10 offset-sm-2 offset-1 my-md-0 my-3">
            <div class="card">
                <div class="px-2 red text-uppercase">new</div>
                <div class="d-flex justify-content-center"> <img src="https://images.by.prom.st/136743868_w640_h640_krossovki-nike-air.jpg" class="product images" alt=""> </div> <b class="px-2">
                <p class="h4">The Little Botanical Haworthia</p>
            </b>
                <div class="d-flex align-items-center justify-content-start rating border-top border-bottom py-2">
                    <div class="text-muted text-uppercase px-2 border-right">insto2007</div>
                    <div class="px-lg-2 px-1"> <span class="fas fa-star"></span> <span class="fas fa-star"></span> <span class="fas fa-star"></span> <span class="fas fa-star"></span> <span class="fas fa-star"></span> <a href="#" class="px-lg-2 px-1 reviews">{3 Reviews}</a> </div>
                </div>
                <div class="d-flex align-items-center justify-content-between py-2 px-3">
                    <div class="h4"><span>&#xa3;</span>10.99</div>
                    <div> <button class="btn btn-dark text-uppercase"> buy now </button> </div>
                </div>
            </div>
        </div>
        <div class="col-md-4 offset-md-0 offset-sm-2 offset-1 col-sm-8 col-10 offset-sm-2 offset-1 my-md-0 my-3">
            <div class="card">
                <div class="px-2 red text-uppercase">new</div>
                <div class="d-flex justify-content-center"> <img src="http://g03.a.alicdn.com/kf/HTB1495WHXXXXXcgaXXXq6xXFXXX3/221740355/HTB1495WHXXXXXcgaXXXq6xXFXXX3.jpg" class="product images" alt=""> </div> <b class="px-2">
                <p class="h4">The Little Botanical Haworthia</p>
            </b>
                <div class="d-flex align-items-center justify-content-start rating border-top border-bottom py-2">
                    <div class="text-muted text-uppercase px-2 border-right">insto2007</div>
                    <div class="px-lg-2 px-1"> <span class="fas fa-star"></span> <span class="fas fa-star"></span> <span class="fas fa-star"></span> <span class="fas fa-star"></span> <span class="fas fa-star"></span> <a href="#" class="px-lg-2 px-1 reviews">{3 Reviews}</a> </div>
                </div>
                <div class="d-flex align-items-center justify-content-between py-2 px-3">
                    <div class="h4"><span>&#xa3;</span>10.99</div>
                    <div> <button class="btn btn-dark text-uppercase"> buy now </button> </div>
                </div>
            </div>
        </div>
    </div>
    <div class="row px-sm-2 px-0 pt-3">
        <div class="col-md-4 offset-md-0 offset-sm-2 offset-1 col-sm-8 col-10 offset-sm-2 offset-1 mb-3">
            <div class="card">
                <div class="px-2 red text-uppercase">new</div>
                <div class="d-flex justify-content-center"> <img src="https://sneakerbardetroit.com/wp-content/uploads/2015/06/nike-air-presto-unholy-cumulus-2015.jpg" class="product images" alt=""> </div> <b class="px-2">
                <p class="h4">The Little Botanical Haworthia</p>
            </b>
                <div class="d-flex align-items-center justify-content-start rating border-top border-bottom py-2">
                    <div class="text-muted text-uppercase px-2 border-right">insto2007</div>
                    <div class="px-lg-2 px-1"> <span class="fas fa-star"></span> <span class="fas fa-star"></span> <span class="fas fa-star"></span> <span class="fas fa-star"></span> <span class="fas fa-star"></span> <a href="#" class="px-lg-2 px-1 reviews">{3 Reviews}</a> </div>
                </div>
                <div class="d-flex align-items-center justify-content-between py-2 px-3">
                    <div class="h4"><span>&#xa3;</span>10.99</div>
                    <div> <button class="btn btn-dark text-uppercase"> buy now </button> </div>
                </div>
            </div>
        </div>
        <div class="col-md-4 offset-md-0 offset-sm-2 offset-1 col-sm-8 col-10 offset-sm-2 offset-1 my-md-0 my-3">
            <div class="card">
                <div class="px-2 red text-uppercase">new</div>
                <div class="d-flex justify-content-center"> <img src="https://i.pinimg.com/originals/49/62/91/496291914bb165b2586e4ca493fa97a8.jpg" class="product images" alt=""> </div> <b class="px-2">
                <p class="h4">The Little Botanical Haworthia</p>
            </b>
                <div class="d-flex align-items-center justify-content-start rating border-top border-bottom py-2">
                    <div class="text-muted text-uppercase px-2 border-right">insto2007</div>
                    <div class="px-lg-2 px-1"> <span class="fas fa-star"></span> <span class="fas fa-star"></span> <span class="fas fa-star"></span> <span class="fas fa-star"></span> <span class="fas fa-star"></span> <a href="#" class="px-lg-2 px-1 reviews">{3 Reviews}</a> </div>
                </div>
                <div class="d-flex align-items-center justify-content-between py-2 px-3">
                    <div class="h4"><span>&#xa3;</span>10.99</div>
                    <div> <button class="btn btn-dark text-uppercase"> buy now </button> </div>
                </div>
            </div>
        </div>
        <div class="col-md-4 offset-md-0 offset-sm-2 offset-1 col-sm-8 col-10 offset-sm-2 offset-1 my-md-0 my-3">
            <div class="card">
                <div class="px-2 red text-uppercase">new</div>
                <div class="d-flex justify-content-center"> <img src="https://img.klubok.com/img/used/2020/05/25/25731/l/25731240_2.jpg" class="product images" alt=""> </div> <b class="px-2">
                <p class="h4">The Little Botanical Haworthia</p>
            </b>
                <div class="d-flex align-items-center justify-content-start rating border-top border-bottom py-2">
                    <div class="text-muted text-uppercase px-2 border-right">insto2007</div>
                    <div class="px-lg-2 px-1"> <span class="fas fa-star"></span> <span class="fas fa-star"></span> <span class="fas fa-star"></span> <span class="fas fa-star"></span> <span class="fas fa-star"></span> <a href="#" class="px-lg-2 px-1 reviews">{3 Reviews}</a> </div>
                </div>
                <div class="d-flex align-items-center justify-content-between py-2 px-3">
                    <div class="h4"><span>&#xa3;</span>10.99</div>
                    <div> <button class="btn btn-dark text-uppercase"> buy now </button> </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!--footer starts from here-->
<footer class="footer">
    <div class="container bottom_border">
        <div class="row">
            <div class=" col-sm-4 col-md col-sm-4  col-12 col">
                <h5 class="headin5_amrc col_white_amrc pt2">Find us</h5>
                <!--headin5_amrc-->
                <p class="mb10">EuroShop</p>
                <p><i class="fa fa-location-arrow"></i> Minsk, Bisuness Center </p>
                <p><i class="fa fa-phone"></i> +375-25-777-77-77 </p>
                <p><i class="fa fa fa-envelope"></i> infoEuroShop@gmail.com </p>


            </div>


            <div class=" col-sm-4 col-md  col-6 col">
                <h5 class="headin5_amrc col_white_amrc pt2">Brands</h5>
                <!--headin5_amrc-->
                <ul class="footer_ul_amrc">
                    <li><a href="#">Adidas</a></li>
                    <li><a href="#">Nike</a></li>
                    <li><a href="#">HP</a></li>
                    <li><a href="#">Samsung</a></li>
                    <li><a href="#">Bosch</a></li>
                    <li><a href="#">Logitech</a></li>
                </ul>
                <!--footer_ul_amrc ends here-->
            </div>


            <div class=" col-sm-4 col-md  col-6 col">
                <h5 class="headin5_amrc col_white_amrc pt2">Types</h5>
                <!--headin5_amrc-->
                <ul class="footer_ul_amrc">
                    <li><a href="#">Computers</a></li>
                    <li><a href="#">Earphones</a></li>
                    <li><a href="#">Sneakers</a></li>
                    <li><a href="#">Jackets</a></li>
                    <li><a href="#">Phones</a></li>
                    <li><a href="#">Watches</a></li>
                </ul>
                <!--footer_ul_amrc ends here-->
            </div>


            <div class=" col-sm-4 col-md  col-12 col">
                <h5 class="headin5_amrc col_white_amrc pt2">Follow us</h5>
                <!--headin5_amrc ends here-->

                <ul class="footer_ul2_amrc">
                    <li><a href="#"><i class="fab fa-instagram fleft padding-right"></i> </a>
                        <p>Instagram</p></li>
                    <li><a href="#"><i class="fab fa-twitter fleft padding-right"></i> </a>
                        <p>Twitter</p></li>
                    <li><a href="#"><i class="fab fa-facebook fleft padding-right"></i> </a>
                        <p>Facebook</p></li>
                </ul>
                <!--footer_ul2_amrc ends here-->
            </div>
        </div>
    </div>


    <div class="container">
        <ul class="foote_bottom_ul_amrc">
            <li><a href="#">Home</a></li>
            <li><a href="#">About</a></li>
        </ul>
        <!--foote_bottom_ul_amrc ends here-->
        <p class="text-center">Copyright @2021 | Designed With by <a href="#">EuroShop</a></p>

        <ul class="social_footer_ul">
            <li><a href="#"><i class="fab fa-facebook-f"></i></a></li>
            <li><a href="#"><i class="fab fa-twitter"></i></a></li>
            <li><a href="#"><i class="fab fa-linkedin"></i></a></li>
            <li><a href="#"><i class="fab fa-instagram"></i></a></li>
        </ul>
        <!--social_footer_ul ends here-->
    </div>

</footer>

</body>

<style>
    <%@include file ="../views/resources/css/bootstrap.min.css"%>
    <%@include file ="../views/resources/css/header.css"%>
    <%@include file ="../views/resources/css/footer.css"%>
    <%@include file ="../views/resources/css/mainBody.css"%>
    <%@include file ="../views/resources/js/jquery-1.7.2.min.js"%>
    <%@include file ="../views/resources/js/jquery.js"%>
    <%@include file ="../views/resources/js/bootstrap.min.js"%>
    <%@include file ="../views/resources/js/header.js"%>
</style>
</html>
