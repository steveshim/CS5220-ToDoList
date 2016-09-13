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
 * Servlet implementation class Add
 */
@WebServlet("/Add")
public class Add extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ItemList items = (ItemList) request.getSession().getAttribute("items");
		if (items == null){
			items = new ItemList();
			request.getSession().setAttribute("items", items);
		}
		Item item = new Item(request.getParameter("item"));
		items.getItems().add(item);
		response.sendRedirect("ToDo");
	}

}
