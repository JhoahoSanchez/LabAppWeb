package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.TareaBean;


@WebServlet("/ListaTareasController")
public class ListaTareasController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ListaTareasController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("listar tareas");
		List<TareaBean> tareas = new TareaBean().getTareas();
		for (TareaBean tarea : tareas) {
			System.out.println(tarea);
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
