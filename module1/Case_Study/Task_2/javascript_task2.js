let getName = document.getElementById("nameCustomer");
let getID = document.getElementById("passportID");
let getBirthday = document.getElementById("birthday");
let getEmail = document.getElementById("email");
let getAddress = document.getElementById("address");
let getTypeCustomer = document.getElementById("typeCustomer");
let getDiscount = document.getElementById("discount");
let getAmount = document.getElementById("amount");
let getRentDay = document.getElementById("rentDay");
let getTypeHouse = document.getElementById("typeHouse");
let getRoom = document.getElementById("typeRoom")
let totaPrice = 0;
let discount = 0;
function showAllInformation () {
    let result = "<h3>Confirm Information Booking:</h3>" + "<hr>" +
        "<span class='spanLeft'>Full Name: </span>" + "<span class='spanRight'>" + getName.value + "</span>" +"</br>"
        + "<span class='spanLeft'>Passport ID:  </span>" + "<span class='spanRight'>" + getID.value + "</span>" +"</br>"
        + "<span class='spanLeft'>Birthday:  </span>" + "<span class='spanRight'>" + getBirthday.value + "</span>" +"</br>"
        + "<span class='spanLeft'>Email:  </span>" + "<span class='spanRight'>" + getEmail.value + "</span>" +"</br>"
        + "<span class='spanLeft'>Address:  </span>" + "<span class='spanRight'>" + getAddress.value + "</span>" +"</br>"
        + "<span class='spanLeft'>Type Of Customer:  </span>" + "<span class='spanRight'>" + getTypeCustomer.value + "</span>" +"</br>"
        + "<span class='spanLeft'>Discount:  </span>" + "<span class='spanRight'>" + getDiscount.value + "</span>" +"</br>"
        + "<span class='spanLeft'>Amount:  </span>" + "<span class='spanRight'>" + getAmount.value + "</span>" +"</br>"
        + "<span class='spanLeft'>Rent Day:  </span>" + "<span class='spanRight'>" + getRentDay.value + "</span>" +"</br>"
        + "<span class='spanLeft'>Type Of House:  </span>" + "<span class='spanRight'>" + getTypeHouse.value + "</span>" +"</br>"
        + "<span class='spanLeft'>Type of Room: </span>" + "<span class='spanRight'>" + getRoom.value + "</span>" +"</br>"

    if (getTypeHouse.value === "Villa") {
        totalPrice = 500 * parseInt(getRentDay.value) * (1-getDiscount.value) ;
    } else if (getTypeHouse.value === "House") {
        totalPrice = 300 * parseInt(getRentDay.value) * (1-getDiscount.value) ;
    } else {
        totalPrice = 100 * parseInt(getRentDay.value) * (1-getDiscount.value) ;
    }
    result += "<span class='spanLeft'>Total Price:  </span>" + "<span class='spanRight'>" + totalPrice + "</span>" + "<br>";
    document.getElementById("result").innerHTML = result;

}
