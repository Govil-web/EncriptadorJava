package web;

import datos.Datos;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "Servlet", urlPatterns = {"/Servlet"})
public class Servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String accion = request.getParameter("accion");
        if (accion != null) {
            switch (accion) {
                case "encriptar":
                    this.encriptar(request, response);
                    break;
                case "desencriptar":
                    this.desencriptar(request, response);
                    break;
//                case "copiar":
//                    this.copiar(request, response);
//                    break;
                default:
                    this.accionDefault(request, response);
            }
        } else {
            this.accionDefault(request, response);
        }
    }

    private void accionDefault(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String encriptador = null;
        HttpSession sesion = request.getSession();
        sesion.setAttribute("encriptador", encriptador);
        response.sendRedirect("index.jsp");
    }

    private void encriptar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String texto = request.getParameter("textarea1").toLowerCase();
        String textoEncriptado = Datos.encriptarTexto(texto);
        request.setAttribute("textarea1", textoEncriptado);
        request.getRequestDispatcher("index.jsp").forward(request, response);

    }

    private void desencriptar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String texto = request.getParameter("textarea1").toLowerCase();
        String textoDesencriptado = Datos.desencriptarTexto(texto);
        request.setAttribute("textarea1", textoDesencriptado);
        request.getRequestDispatcher("index.jsp").forward(request, response);

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.accionDefault(request, response);
    }

//    private void copiar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String texto1 = request.getParameter("textarea2");
//        System.out.println("texto copiado = " + texto1);
//        request.setAttribute("textarea2", texto1);
//        request.getRequestDispatcher("index.jsp").forward(request, response);
//
//    }

}
