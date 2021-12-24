
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class checkuser
 */
@WebServlet("/checkuser")
public class checkuser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public checkuser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    		throws ServletException, IOException {
    	response.setContentType("text/html;charset=UTF-8");
    	try (PrintWriter out = response.getWriter()) {
    		
    		persistencia base = new persistencia();
    		ResultSet rs = base.consultaSQL("select * from usuarios where usuario = "
    				+ "'" + request.getParameter("inputEmail") + "'"
    				+ " and clave = " + "'" + request.getParameter("inputPassword") + "'");
    		
    		while(rs.next()) {
    			out.println(rs.getString("usuario"));
    			out.println(rs.getString("clave"));
    			out.println(rs.getString("nombreyapellido")+ "<br>");
    		}
    		
    		if (rs.first()==false) {
    			out.println("No hay usuarios que coincidan con la búsqueda");
    			out.println("<h1>Proyecto: " + request.getContextPath() + "</h1>");
        		out.println("<h1>El usuario es: " + request.getParameter("inputEmail") + "</h1>");
    		}
    		
    		
    	} catch (SQLException ex) {
    		Logger.getLogger(checkuser.class.getName()).log(Level.SEVERE, null, ex);
		}
    }
    		                                       		                                      
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}
	
}
