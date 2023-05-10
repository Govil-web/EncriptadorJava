package datos;

public class Datos {

    public static String encriptarTexto(String texto) {

        String textoEncriptado = texto.replaceAll("e", "enter");
        textoEncriptado = textoEncriptado.replaceAll("o", "ober");
        textoEncriptado = textoEncriptado.replaceAll("i", "imes");
        textoEncriptado = textoEncriptado.replaceAll("a", "ai");
        textoEncriptado = textoEncriptado.replaceAll("u", "ufat");

        System.out.println("Texto Encriptado = " + textoEncriptado);

        return textoEncriptado;

    }

    public static String desencriptarTexto(String texto) {

        String textoDesencriptado = texto.replaceAll("enter", "e");
        textoDesencriptado = textoDesencriptado.replaceAll("ober", "o");
        textoDesencriptado = textoDesencriptado.replaceAll("imes", "i");
        textoDesencriptado = textoDesencriptado.replaceAll("ai", "a");
        textoDesencriptado = textoDesencriptado.replaceAll("ufat", "u");

        System.out.println("Texto Desencriptado = " + textoDesencriptado);

        return textoDesencriptado;
    }

}
