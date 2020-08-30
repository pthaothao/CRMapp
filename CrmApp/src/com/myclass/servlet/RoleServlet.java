package com.myclass.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myclass.entity.Role;

@WebServlet(name = "RoleServlet", urlPatterns = { "/role", "/role/add", "/role/edit", "/role/delete" })
public class RoleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private List<Role> list = null;

	@Override
	public void init() throws ServletException {
		list = new ArrayList<Role>();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String action = req.getServletPath();
		switch (action) {
		case "/role":
			// gửi danh sách role về cho index.jsp
			req.setAttribute("roles", list);
			req.getRequestDispatcher("/WEB-INF/views/role/index.jsp").forward(req, resp);
			break;
		case "/role/add":
			req.getRequestDispatcher("/WEB-INF/views/role/add.jsp").forward(req, resp);
			break;
		case "/role/edit":
			int id = Integer.parseInt(req.getParameter("id"));
			for (Role role : list) {
				if (role.getId() == id) {
					req.setAttribute("Role", role);
					break;
				}
			}
			req.getRequestDispatcher("/WEB-INF/views/role/edit.jsp").forward(req, resp);
			break;
		case "/role/delete":
			Role quyen = new Role();
			for (Role xoa : list) {
				if (xoa.getId() == quyen.getId()) {
					list.remove(xoa);
				}
			}
			resp.sendRedirect(req.getContextPath() + "/role");
			break;
		default:
			break;
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String action = req.getServletPath();
		Role role = new Role();
		// lấy dữ liệu từ form
		String name = req.getParameter("name");
		String description = req.getParameter("description");

		switch (action) {
		case "/role/add":
			// tạp đối tượng role
			Role role1 = new Role(1, name, description);
			// lưu vào list
			list.add(role);
			// quay về trang danh sách
			resp.sendRedirect(req.getContextPath() + "/role");
			break;
		case "/role/edit":
			System.out.println(role.getId());
			for (Role admin : list) {
				if (admin.getId() == role.getId()) {
					admin.setName(role.getName());
					admin.setDescription(role.getDescription());
					break;
				}
			}
			resp.sendRedirect(req.getContextPath() + "/role");
			break;
		default:
			break;
		}
	}
}
