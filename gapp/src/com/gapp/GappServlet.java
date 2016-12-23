package com.gapp;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class GappServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello world 2!");
	}
}
