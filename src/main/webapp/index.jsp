<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="style.css">
        <title>Encriptador</title>
        <script src="index.js"></script>
    </head>
    <body>
        <header>
            <h1><img class="titulo" src="img/logoCompleto.png" alt="Logo encriptador - by govil.web"></h1>
        </header>
        <main>
            <form action="${pageContext.request.contextPath}/Servlet" method="POST">
                <section class="seccion1">
                    <textarea name="textarea1" id="textarea1" class="encriptarMensaje" placeholder="Ingresa el texto aquí">
                        <%
                            String msg = (String) request.getAttribute("textarea2");
                            if (msg == null) {
                                msg = "";
                            } else {
                                out.print(request.getAttribute("textarea2"));
                            }
                        %>
                    </textarea>
                    <h5>
                        &#9888; Solo minusculas y sin acentos
                    </h5>

                    <button name="botonEncriptar"  id="encriptarTexto" type="submit" value="Encriptar" class="botonEncriptar" 
                            formaction="${pageContext.request.contextPath}/Servlet?accion=encriptar">

                        Encriptar
                    </button>


                    <button name="botonDesencriptar" id="desencriptarTexto" type="submit" value="Desencriptar" class="botonDesencriptar"
                            formaction="${pageContext.request.contextPath}/Servlet?accion=desencriptar">
                        Desencriptar
                    </button>

                </section>

                <section class="seccion2">
                    <textarea name="textarea2" id="textarea2" class="textarea2" placeholder="No hay mensajes">
                        <%
                            String msg1 = (String) request.getAttribute("textarea1");
                            if (msg1 == null) {
                                msg1 = "";
                            } else {
                                out.print(request.getAttribute("textarea1"));
                            }
                        %>
                                    
                    </textarea>
                    <div class="boton">

                        <input id="copiarBoton" type="button" value="Copiar" class="botonCopiar" onclick="copiar()">
                    </div>
                </section>
            </form>
        </main>
        <footer>
            <img class="piePagina" src="img/logo.png">
        </footer>
    </body>
    
</html>




