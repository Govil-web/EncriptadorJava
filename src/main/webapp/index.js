function copiar(){
    console.log('Llamada la funcion copiar');
    var met = 'POST';
    var copiarTexto = document.getElementById("textarea2");
    copiarTexto.select();
    document.execCommand("copy");
    
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function(){
        if(this.readyState === 4 && this.status === 200){
            document.getElementById("copiarBoton").value = "texto copiado";
        }
    };
    
    xhttp.open(met,true);
    xhttp.send();

}


