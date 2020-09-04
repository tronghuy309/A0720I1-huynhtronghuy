

let sout="<table border='3px solid black' width='800px' height='300' cellspacing='0' cellpadding= '3'>";
for (let i=2;i <= 9; i ++) {
    sout=sout + "<tr>";
    for ( let j = 1; j <=10 ; j ++) {
        sout = sout + "<td style='padding: 40px 40px 40px 40px'>" + j + "x" + i + "=" + i*j + "</td>";
    }
    sout = sout + "</tr>";
}

sout = sout + "</table>";
document.getElementById("result").innerHTML = sout;
