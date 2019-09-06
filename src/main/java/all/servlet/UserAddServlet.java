package all.servlet;

import all.model.User;
import all.service.UserServiceImpl;


import javax.jws.soap.SOAPBinding;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet("/add")
public class UserAddServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("addUser.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserServiceImpl userService = UserServiceImpl.getInstance();
        String name = req.getParameter("name");
        String mail = req.getParameter("mail");

        if (name != null && mail != null) {
            userService.addUser(new User(name, mail));
        }
        List<User> list = userService.getAllUsers();
        req.setAttribute("list", list);
        req.getRequestDispatcher("userIndex.jsp").forward(req, resp);
    }
}