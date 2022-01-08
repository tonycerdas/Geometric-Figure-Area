const enviar = document.getElementById("enviarbtn");
const clean = document.getElementById("cleanbtn");
const formulario = document.getElementById("form");
const entradas = document.querySelectorAll('#form input');
const areaResult = document.getElementById("areaResult");
const ladoA = document.getElementById("ladoA");
const ladoB = document.getElementById("ladoB");
var select = document.getElementById('selectFigura');
var selectValue = select.options[select.selectedIndex].value;
let topics = "";
var AState = "";
var BState = "";
var FState = "";
const expresiones = {
    numero: /^[0-9]+([,][0-9]+)?$/
};
enviar.onclick = enviarButton;
clean.onclick = cleanbtn;
document.getElementById('selectFigura').addEventListener('change', function () {
    if (this.value === 'tr') {
        document.querySelector('#labelA').innerText = 'Base';
        document.querySelector('#labelB').innerText = 'Altura';
    }
    if (this.value === 'cu') {
        document.querySelector('#labelA').innerText = 'Lado 1';
        document.querySelector('#labelB').innerText = 'Lado 2';
    }
    if (this.value === 're') {
        document.querySelector('#labelA').innerText = 'Base ';
        document.querySelector('#labelB').innerText = 'Altura';
    }
    if (this.value === 'ro') {
        document.querySelector('#labelA').innerText = 'Diagonal Menor ';
        document.querySelector('#labelB').innerText = 'Diagonal Mayor';
    }
});
function cleanbtn() {
    ladoA.value = "";
    ladoB.value = "";
    areaResult.value = "";
    select.value = 'tr';
    document.querySelector('#labelA').innerText = 'Base';
    document.querySelector('#labelB').innerText = 'Altura';
    document.querySelector('#labelArea').innerText = '---';
    document.getElementById('divA').classList.remove('inputInvalido');
    document.getElementById('divA').classList.remove('inputValido');
    document.getElementById('divB').classList.remove('inputInvalido');
    document.getElementById('divB').classList.remove('inputValido');
}

function enviarButton(x) {
    if (AState === "invalid") {
        ladoA.value = "0";
        ladoB.value = "0";
    } else if (BState === "invalid") {
        ladoB.value = "0";
    }
}


const validarFormulario = (e) => {
    switch (e.target.name) {
        case "LadoA":
            if (expresiones.numero.test(e.target.value) && ladoA.value !== "") {
                document.getElementById('divA').classList.remove('inputInvalido');
                document.getElementById('divA').classList.add('inputValido');
                AState = 'valid';
            } else if (ladoA.value === "") {
                document.getElementById('divA').classList.remove('inputInvalido');
                document.getElementById('divA').classList.remove('inputValido');
            } else {
                document.getElementById('divA').classList.remove('inputValido');
                document.getElementById('divA').classList.add('inputInvalido');
                AState = 'invalid';
            }
            break;
        case "LadoB":
            if (expresiones.numero.test(e.target.value) && ladoB.value !== "") {
                document.getElementById('divB').classList.remove('inputInvalido');
                document.getElementById('divB').classList.add('inputValido');
                BState = 'valid';
            } else if (ladoA.value === "") {
                document.getElementById('divB').classList.remove('inputInvalido');
                document.getElementById('divA').classList.remove('inputValido');
            } else {
                document.getElementById('divB').classList.remove('inputValido');
                document.getElementById('divB').classList.add('inputInvalido');
                BState = 'invalid';
            }
            break;
    }
};
entradas.forEach((input) => {
    input.addEventListener('keyup', validarFormulario);
    input.addEventListener('blur', validarFormulario);
}
);



 