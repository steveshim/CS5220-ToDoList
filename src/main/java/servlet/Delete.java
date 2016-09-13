package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Item;
import model.ItemList;

/**
 * Servlet implementation class Delete
 */
@WebServlet("/Delete")
public class Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ItemList items = (ItemList) request.getSession().getAttribute("items");
		String task = request.getParameter("task");
		String date = request.getParameter("date");
		Item tempItem = new Item(task);
		tempItem.setDate(date);
		
		int index = items.getItems().indexOf(tempItem);
		items.getItems().remove(index);
		tempItem.setComplete(true);
		items.getItems().add(tempItem);
		response.sendRedirect("ToDo");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
