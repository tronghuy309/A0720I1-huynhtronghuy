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
let discountCountry ;
let discountRentDay ;
let discountCus ;


function showMenu () {
    let choose = parseInt(Promt("1. Show Customer Information" + "\n"+
    "2. Edit Customer Information" + "\n" +
    "3. Show Price After Discount"));
    switch (choose) {
        case 1:
            showAllInformation ();
            break;
        case 2:
           return false;
        case 3:
            showPrice();
            break;
        default:
            alert("Please Choose Right Number")

    }
}

let showPrice = () => {
    // Giảm giá theo địa phương
    switch (get_country.value) {
        case 'Da Nang':
            discount_Country = 20;
            break;
        case 'Hue':
            discount_Country = 10;
            break;
        case "Quang Nam":
            discount_Country = 5;
            break;
        default:
            discount_Country = 0;
    }
    // Giảm giá theo số ngày thuê
    if (parseInt(get_rentDay.value) > 7){
        discount_RentDay = 30;
    }else if (parseInt(get_rentDay.value)>=5){
        discount_RentDay = 20;
    }else if (parseInt(get_rentDay.value)>=2){
        discount_RentDay = 10;
    }else {
        discount_RentDay = 0;
    }
    //Giảm giá theo loại khách hàng
    switch (get_typeCus.value) {
        case 'Diamond':
            discount_Cus = 15;
            break;
        case 'Platium':
            discount_Cus = 10;
            break;
        case "Gold":
            discount_Cus = 5;
            break;
        case "Silver":
            discount_Cus = 2;
            break;
        default:
            discount_Cus = 0;
    }
    //tính giảm giá
    discount = discount_Country + discount_RentDay + discount_Cus;

    // Tính tổng tiền theo loại Nhà
    if (get_typeHouse.value === "Villa") {
        total_Price = (500 * parseInt(get_rentDay.value)) - discount;
    } else if (get_typeHouse.value === "House") {
        total_Price = (300 * parseInt(get_rentDay.value)) - discount;
    } else {
        total_Price = (100 * parseInt(get_rentDay.value) )- discount;
    }
    // console.log(total_Price);
    let result1 = "<h3>Priced Booking!</h3>" + "<hr color='red'>" +
        "<span class='spanLeft'>Total Price: </span>" + "<span class='spanRight'>" + total_Price + "</span>" + "<br>";
    document.getElementById("result").innerHTML = result1;
}



let showAllInformation = () => {
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
