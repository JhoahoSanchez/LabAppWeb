package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.TareaBean;


@WebServlet("/InsertarTareaController")
public class InsertarTareaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public InsertarTareaController() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("jsp/insertarTarea.jsp");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String codigo = request.getParameter("txtCodigo");
		String nombre = request.getParameter("txtNombre");
		
		TareaBean tarea = new TareaBean();
		tarea.setCodigo(codigo);
		tarea.setNombre(nombre);
		tarea.setEstado("Por asignar");
		
		TareaBean modeloTarea = new TareaBean();
		modeloTarea.create(tarea);
		/*
		for (TareaBean tarea1 : modeloTarea.getTareas()) {
			System.out.println(tarea1);
		}*/
		
		response.sendRedirect("ListaTareasController");
	}

}
