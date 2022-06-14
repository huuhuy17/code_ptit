const numbers = document.getElementsByClassName('phim');
const display = document.getElementById("ketqua");


for (let number of numbers) {
    number.addEventListener('click', function () {
        display.innerHTML += this.value
    });
}

function equal() {
    let kq = display.innerHTML
    let output = eval(kq)
    display.innerHTML = output
}

function clean() {
    display.innerHTML = " "
}

function del() {
    let kq = display.innerHTML
    display.innerHTML = kq.substring(0, kq.length - 1);
}



