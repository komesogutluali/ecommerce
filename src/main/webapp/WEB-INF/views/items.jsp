<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sprig" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<h2 class="title text-center">Features Items</h2>

<c:forEach items="${itemsDtos}"  var="item">
    <div class="col-sm-4">
        <div class="product-image-wrapper">
            <div class="single-products">
                <div class="productinfo text-center">
                    <img src="${pageContext.request.contextPath}/item_images/${item.itemImageName}.jpg" alt="" />
                    <h2>${item.itemPrice}</h2>
                    <p>${item.itemName}</p>
                    <a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
                </div>
                <div class="product-overlay">
                    <div class="overlay-content">
                        <h2><fmt:formatNumber  type="number" value="${item.itemPrice}" maxIntegerDigits="2"/></h2>
                        <p>${item.itemName}</p>
                        <a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
                        <a href="<c:url value="/shop/product-details/${item.itemId.intValue()}"/>" class="btn btn-default add-to-cart">Product details</a>

                    </div>
                </div>
            </div>
            <div class="choose">
                <ul class="nav nav-pills nav-justified">
                    <li><a href="#"><i class="fa fa-plus-square"></i>Add to wishlist</a></li>
                    <li><a href="#"><i class="fa fa-plus-square"></i>Add to compare</a></li>
                </ul>
            </div>
        </div>
    </div>
</c:forEach>