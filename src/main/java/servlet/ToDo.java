package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Item;
import model.ItemList;

@WebServlet("/ToDo")
public class ToDo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ToDo() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ItemList items = (ItemList) request.getSession().getAttribute("items");
		if (items == null){
			items = new ItemList();
			request.getSession().setAttribute("items", items);
		}
		
		request.getRequestDispatcher( "/WEB-INF/ToDo.jsp" ).forward(request, response );
	}




}
