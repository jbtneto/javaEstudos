function fazerLogin(event) {
    event.preventDefault();
    let user = document.getElementById("inputUser").value;
    let password = document.getElementById("inputPassword").value;
    /* Roda do lado cliente (chrome do usuario) */
    // alert('ola'); mostra a saida OLA no button HTML <button onclick="validar()"> ENVIAR</button>
    console.log('Voce digitou ' + user + " : " + password); // modo debug para ver os codigos de saida do HTML/JAVASCRIPT direto na pagina utilizando inspect/inspecionar

    // 
    let loginMsg = {
        email: user,
        cpf: user,
        password: password
    }
    let msg = {
        method: 'POST',
        body: JSON.stringify(loginMsg),
        headers: {
            'Content-type': 'application/json'
        }
    }
    // fetch envia a 'msg' para o servidor
    fetch("http://localhost:8080/user/login", msg)
        .then(res => tratarRetorno(res)) // quando a resposta voltar...
}

function tratarRetorno(retorno) {
    if (retorno.status == 200) {
        document.getElementById("resultado").innerHTML = "Login com sucesso";
        retorno.json().then(res => acessoPermitido(res));
    } else {
        document.getElementById("resultado").innerHTML = "Falha no login";
    }
}

function acessoPermitido(user) {
    localStorage.setItem("userLogged", JSON.stringify(user))
    //console.log(user);
    window.location = "interna.html";
}
