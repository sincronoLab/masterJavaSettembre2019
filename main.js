/**
 * 
 */

function msg(){
	
	
	alert("inserisci un valore intero");
}
function validaEmail(email) {
    var regexp =/^([A-Za-z0-9_\-\.])+\@([A-Za-z0-9_\-\.])+\.([A-Za-z]{2,4})$/;
    return regexp.test(email);
}


function checkEmail(){
  risultato = document.getElementById("risultato");
  email = document.getElementById("email").value;
  risultato.innerHTML = "";
  if (validaEmail(email)) {
    risultato.innerHTML = email + " indirizzo valido";
    risultato.style.color = 'green';
  } else {
    risultato.innerHTML = email + " indirizzo non valido";
    risultato.style.color = 'red';
  }
}