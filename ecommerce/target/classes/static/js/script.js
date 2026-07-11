let cartButtons=document.querySelectorAll(".product-card button");

cartButtons.forEach(function(btn){

btn.onclick=function(){

alert("Product Added to Cart");

};

});
let checkout=document.querySelector(".checkout button");

if(checkout){

checkout.onclick=function(){

alert("Order Placed Successfully!");

window.location.href="orders.html";

};

}
let editBtn=document.querySelector(".edit-btn");

if(editBtn){

editBtn.onclick=function(){

alert("Profile Updated Successfully!");

};

}