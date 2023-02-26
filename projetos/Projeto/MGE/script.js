const formulario = document.querySelector("form");
const Inome = document.querySelector(".nome");
const Iemail = document.querySelector(".email");
const Itel = document.querySelector(".tel");
const Idata = document.querySelector(".data");
const Sevento = document.querySelector(".evento")

function cadastrar() {

    fetch("http://localhost:8080/reserva",
        {
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            method: "POST",
            body: JSON.stringify({
                nome: Inome.value,
                email: Iemail.value,
                telefone: Itel.value,
                data: Idata.value,
                evento: Sevento.value
            })
        })
        .then(function (res) { console.log(res) })
        .catch(function (res) {console.log(res) })

};

function limpar () {
    Inome.value = "";
    Iemail.value = "";
    Itel.value = "";
    Idata.value = "";
    Sevento.value = "";
};

formulario.addEventListener('submit', function (event) {
    event.preventDefault();

    cadastrar();
    limpar();
});
