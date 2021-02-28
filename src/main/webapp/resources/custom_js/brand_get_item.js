function click_item(brand_id) {

    $.ajax({
        type:'GET',
        contentType: "application/json",
        url: "shop/brands_items_all",
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

