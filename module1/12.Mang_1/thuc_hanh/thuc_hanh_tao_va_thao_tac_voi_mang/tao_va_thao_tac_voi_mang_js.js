

let x=0;
let array=Array();
function add_element_to_array() {
    array[x]=document.getElementById("txtValue").value;
    alert("Element: " + array[x]+ " Added at index" + x);
    x++;
    document.getElementById("txtValue").value="";
}
function display_array() {
    let e="<hr/>";
    for (let i=0;i<array.length;i++)
    {
        e +="Element " + i + " = "+array[i]+"<br/>";
    }
    document.getElementById("result").innerHTML=e;
}

//mục đich của funtion add_element này là lấy giá trị nhập vào array cho index từ 0 lên ++ nên ta bắt
//buộc phải tạo một biến x=0 tức là index và cho chạy lên ++. sau đó trả về giá trị của document = rỗng.
//x laf chỉ số truy cập tới các phần tử trong mảng
//funtion thứ 2 display_aray dùng để xuất mảng ra: muốn xuất mảng thì ta cũng phải tạo ra một biến và cho i chạy lên lengh-1,i++
// và để xuất dữ liệu ra html ta dùng inner.html và gắn với id result bằng cách gán cho biến e đó.
// nhớ cấu trúc let x; cho xuất ra x += array[i] + "<br>"