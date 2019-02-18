<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.2/css/all.css" integrity="sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" media="screen" href="<c:url value="/resources/css/style.css" />" >
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    <title>berkay22demirel Web Store</title>
  </head>
  <body>
    
<!-- NAVBAR -->

    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <div class="container">
                
                <a class="navbar-brand" href="#"><i class="fas fa-shopping-cart"></i> Web Store</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                  <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                  <form class="form-inline mx-auto my-2 my-lg-0">
                    <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                    <button class="btn btn-outline-primary my-2 my-sm-0" type="submit">Search</button>
                  </form>
                  <ul class="navbar-nav ml-auto">
                        <li class="nav-item active">
                          <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
                        </li>
                        <li class="nav-item">
                          <a class="nav-link" href="#">Phone</a>
                        </li>
                        <li class="nav-item">
                          <a class="nav-link" href="#">Laptop</a>
                        </li>
                        <li class="nav-item dropdown">
                          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Other Categories
                          </a>
                          <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <a class="dropdown-item" href="#">Tablet</a>
                            <a class="dropdown-item" href="#">Camera</a>
                            <a class="dropdown-item" href="#">Audio</a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item" href="#">Other</a>
                          </div>
                        </li>
                      </ul>
                </div>
        </div>
      </nav>

    <!-- Carousel -->

    <section id="carousel" >

            <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
                    <ol class="carousel-indicators">
                      <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
                      <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
                      <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
                    </ol>
                    <div class="carousel-inner">
                      <div class="carousel-item active">
                        <img class="d-block w-100" alt="Phone" src="<c:url value="/resources/images/carousel.jpg" />" >
                        <div class="carousel-caption d-none d-md-block">
                                <p>Nulla vitae elit libero, a pharetra augue mollis interdum.</p>
                              </div>
                        </div>
                      <div class="carousel-item">
                        <img class="d-block w-100" alt="Laptop" src="<c:url value="/resources/images/carousel2.jpg" />" >
                        <div class="carousel-caption d-none d-md-block">
                                <p>Nulla vitae elit libero, a pharetra augue mollis interdum.</p>
                              </div>
                        </div>
                      <div class="carousel-item">
                        <img class="d-block w-100" alt="Camera" src="<c:url value="/resources/images/carousel3.jpg" />" >
                        <div class="carousel-caption d-none d-md-block">
                                <p>Nulla vitae elit libero, a pharetra augue mollis interdum.</p>
                              </div>
                        </div>
                    </div>
                    <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
                      <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                      <span class="sr-only">Previous</span>
                    </a>
                    <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
                      <span class="carousel-control-next-icon" aria-hidden="true"></span>
                      <span class="sr-only">Next</span>
                    </a>
                  </div>

    </section>  
        
    <!-- Products -->

    <section id="product" class="mt-5">
            <div class="container"> 
              <div class="row">
                  <div class="col-md-10">
                    <h1 class="display-4">${product.name}</h1>
                  </div>
                  <div id="stars" class="col-md-2 d-flex align-content-center flex-wrap">
                    <p class="h5">
                    	<c:forEach begin="1" end="${product.stars}" varStatus="loop">
    						<i id="star" class="fas fa-star"></i>
						</c:forEach>
                    </p>
                  </div>
                  <div class="col-md-12">
                    <img id="productImage" src="<c:url value="/resources/images/${product.visual}"/>" class="d-block w-100 img-fluid" alt="düzelt">
                  </div>
                  <div class="col-md-12 mt-3">
                        <p class="h4">${product.description}</p>
                  </div>
                  <div class="col-md-12 mt-3 d-flex justify-content-end align-content-center flex-wrap">
                  		<small><s>${product.listPrice}$</s></small> <h4>${product.price}$</h4> 
                        <button class="btn btn-outline-primary my-2 mx-4 my-sm-0" type="submit"><i class="fas fa-shopping-cart"></i>  Buy Now</button>
                        
                  </div>
                  <div class="col-md-6 mt-5">
                	<div class="list-group">
               			<c:forEach items="${product.comments}" var="comment">
                 			<div class="list-group-item list-group-item-action">
                  				<div class="d-flex w-100 justify-content-between">
                      				<h5 class="mb-1">${comment.messageHeading}</h5>
                                    <small>${comment.date}</small>
                      			</div>
                       				<p class="mb-1">${comment.message}</p>
                     				<small>${comment.userName}</small>
                                </div>
                      	</c:forEach>
                  	</div>     
       			   </div>
       			   <div class="col-md-6 mt-5">
                        <form>
                                <div class="form-group">
                                    <div class="input-group mb-3">
                                        <div class="input-group-prepend">
                                          <span class="input-group-text" id="basic-addon1"><i class="far fa-user"></i></span>
                                        </div>
                                        <input type="name" class="form-control" id="exampleInputName1" aria-describedby="nameHelp" placeholder="Enter Name Surname">
                                      </div>
                                </div>
                                <div class="form-group">
                                    <div class="input-group mb-3">
                                        <div class="input-group-prepend">
                                          <span class="input-group-text" id="basic-addon1"><i class="far fa-envelope"></i></span>
                                        </div>
                                        <input type="email" class="form-control" id="exampleInputEMail1" placeholder="Enter E-Mail">
                                      </div>
                                </div>
                                <div class="form-group">
                                        <div class="input-group mb-3">
                                            <div class="input-group-prepend">
                                              <span class="input-group-text" id="basic-addon1"><i class="far fa-envelope"></i></span>
                                            </div>
                                            <input type="name" class="form-control" id="exampleInputMessageHeading" placeholder="Enter Your Message Heading">
                                          </div>
                                    </div>
                                <div class="form-group">
                                    <div class="input-group">
                                        <div class="input-group-prepend">
                                          <span class="input-group-text" id="basic-addon1"><i class="far fa-comment"></i></span>
                                        </div>
                                        <textarea class="form-control" aria-label="With textarea" placeholder="Enter Your Message" rows="5"></textarea>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="input-group">
                                        <select class="custom-select my-1" id="inlineFormCustomSelectPref">
                                            <option selected>Choose Star</option>
                                            <option value="1">One</option>
                                            <option value="2">Two</option>
                                            <option value="3">Three</option>
                                            <option value="4">Four</option>
                                            <option value="53">Five</option>
                                        </select>
                                    </div>
                                </div>
                                
                                <button type="submit" class="btn btn-outline-primary">Add Comment</button>
                              </form>    
                  </div>
              </div>  
            </div>  
          </section>

        <!-- Footer Section -->
        <section id="footer" class="mt-5 py-3">
                <div class="overlay">
                  <div class="container">
                      <div class="row">
                          <div class="col-md-6">
                            <div class="lend text-white">Copyright &copy; 2019 Berkay Demirel</div>
                          </div>
                        </div>
                      </div>
                  </div>
        </section>        

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
  </body>
</html>