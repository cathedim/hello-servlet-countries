package hello;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/bandeiras")
public class BandeirasServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String msg = "";

        String lang = request.getParameter("lang");
        if(lang==null)
            lang = "pt";
        switch(lang){
            case "pt":
                msg = "https://revista-images.querobolsa.com.br/revista/post_images/32586/6236f6bfe3ce8db35bdc1cd57ab59842b3958101.jpg?1605793577";
                break;
            case "en":
                msg = "https://upload.wikimedia.org/wikipedia/commons/thumb/a/ae/Flag_of_the_United_Kingdom.svg/290px-Flag_of_the_United_Kingdom.svg.png";
                break;
            case "fr":
                msg = "https://upload.wikimedia.org/wikipedia/commons/c/c3/Flag_of_France.svg";
                break;
            case "de":
                msg = "http://geo5.net/imagens/Bandeira-da-Alemanha-2000px.png";
                break;
            case "es":
                msg = "https://upload.wikimedia.org/wikipedia/commons/9/9a/Flag_of_Spain.svg";
                break;
        }

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Bandeiras</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Bandeiras</h1>");
            out.println("<p><img src=\"" + msg + "\"></p>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
