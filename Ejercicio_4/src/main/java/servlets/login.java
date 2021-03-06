package servlets;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelo.entidad.identidad;

@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public login() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("username");
		String password = request.getParameter("password");
		identidad i = new identidad();
    	i.setUsername(nombre);
    	i.setPassword(password);
    	 if (nombre == null || password == null || !validar(nombre, password)) {
             RequestDispatcher rd = request.getRequestDispatcher("JSP_errorPage.jsp"); //utilic? jsp ya que con html no me cargaban las p?ginas
             rd.forward(request, response);
         } 
    	 else {
    		 HttpSession sesion=request.getSession();
    		 sesion.setAttribute("nombre", nombre);
             RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
             rd.forward(request, response);
         }
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	//m?todo utilizado para la b?squeda de credenciales validas en nuestro sistema. Al final utilic? HasMap, pero en el primer intento 
	//cre? un array de objetos identidad, e hice la b?squeda con un for comparando nombre y password. 
	boolean validar(String nombre, String password) {
        Map<String, String> usuarios = new HashMap<String, String>();
        usuarios.put("Alice","poison");
        usuarios.put("Robert", "extremoduro");
    	usuarios.put("Fito","fitipaldis");
        return usuarios.containsKey(nombre) && usuarios.get(nombre).equals(password);
 
    }

}
