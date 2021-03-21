function category_brand_click(category_id,brand_id) {

      $.ajax({
        type:'GET',
        contentType: "application/json",
        url: "shop/brands_items",
        data:{'category_id':category_id,'brand_id':brand_id},
        success:function(data, status){


           $(".features_items").empty();
            $(".features_items").html(data);
        },
        error:function(xhr, status, errorThrown){

            console.log(xhr);
            console.log(status);
            console.log(errorThrown);
        }

    });


}

function click_item(brand_id) {

    $.ajax({
        type:'GET',
        contentType: "application/json",
        url: "http://localhost:8080/ecommerce_war_exploded/shop/brands_items_all",
        data:{'brand_id':brand_id},
        success:function(data, status){


            $(".features_items").empty();
            $(".features_items").html(data);
        },
        error:function(xhr, status, errorThrown){

            console.log(xhr);
            console.log(status);
            console.log(errorThrown);
        }

    });


}

function click_wsize(val) {
var wlsize=val.split('+');
var wsize_id=parseInt(wlsize[0]);
var item_id=parseInt(wlsize[1]);
    $.ajax({
        type:'GET',
        contentType: "application/json",
        url: "http://localhost:8080/ecommerce_war_exploded/index/click_wsize_select",
        data:{'wsize_id':wsize_id,'item_id':item_id},
        success:function(data, status){

data=JSON.parse(data);

$("#listl").empty();
            Object.keys(data).forEach(function(key) {
                $("#listl").append(new Option(data[key].toString(),key.toString()));
            })

        },
        error:function(xhr, status, errorThrown){

            console.log(xhr);
            console.log(status);
            console.log(errorThrown);
        }

    });


}
function addto_cart() {
    var wlsize=$("#listw  :selected").val().split('+');
    var wsize_id=parseInt(wlsize[0]);
    var item_id=parseInt(wlsize[1]);
    var lsize_id=parseInt($("#listl  :selected").val());
    $.ajax({
        type:'GET',
        contentType: "application/json",
        url: "http://localhost:8080/ecommerce_war_exploded/index/add_to_cart",
        data:{'item_id':item_id,'wsize_id':wsize_id,'lsize_id':lsize_id},
        success:function(data, status){

        },
        error:function(xhr, status, errorThrown){

            console.log(xhr);
            console.log(status);
            console.log(errorThrown);
        }

    });


}

