package ServletJSP;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecurityServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html"); // html File로 보내는것을 알려주는 Line
		PrintWriter out = response.getWriter(); // 객체 해당하는것을 쓸 준비를 하는것
		String host = request.getContextPath(); //이서버의 정보를 가져오서 다른 server에서도 사용할 수 있게 해줌
		
		out.print(
				"<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n"
						+ "<html>\r\n" + "<head>\r\n"
						+ "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n"
						+ "    <!-- Bootstrap Core CSS -->\r\n"
						+ "	<link type=\"text/css\" href=\"./resources/css/bootstrap.min.css\" rel=\"stylesheet\" />\r\n"
						+ "\r\n" + "<title>Edit</title>\r\n" + "</head>\r\n" + "<body>\r\n"
						+ "    <div id=\"wrapper\">\r\n" + "       <!-- /.row -->\r\n"
						+ "       <div class=\"row\">\r\n" + "           <div class=\"col-lg-12\">\r\n"
						+ "               <div class=\"panel panel-default\">\r\n"
						+ "                   <div class=\"panel-heading\">\r\n"
						+ "                       Form Elements \r\n" + "                   </div>\r\n"
						+ "                   <div class=\"panel-body\">\r\n"
						+ "                       <!-- /.row (nested) -->\r\n"
						+ "                   <form role=\"form\" action=\"" + host + "/security/LoginStatusServlet\" method=\"POST\">\r\n"
						+ "                       <fieldset>\r\n"
						+ "                           <div class=\"form-group\">\r\n"
						+ "                               <input class=\"form-control\" placeholder=\"member ID\" name=\"email\" type=\"text\" autofocus=\"\">\r\n"
						+ "                           </div>\r\n"
						+ "                           <div class=\"form-group\">\r\n"
						+ "                               <input class=\"form-control\" placeholder=\"Password\" name=\"password\" type=\"password\" value=\"\">\r\n"
						+ "                           </div>\r\n"
						+ "                           <div class=\"checkbox\">\r\n"
						+ "                               <label>\r\n"
						+ "                                   <input name=\"remember-me\" type=\"checkbox\" value=\"true\" checked=\"\">Remember Me\r\n"
						+ "                               </label>\r\n" + "                           </div>\r\n"
						+ "                           <!-- Change this to a button or input when using this as a form -->\r\n"
						+ "                           <input type=\"submit\" class=\"btn btn-lg btn-success btn-block\" value=\"Login\">\r\n"
						+ "                       </fieldset>\r\n" + "                   </form>\r\n"
						+ "                       <!-- /.row (nested) -->\r\n" + "                   </div>\r\n"
						+ "                   <!-- /.panel-body -->\r\n" + "               </div>\r\n"
						+ "               <!-- /.panel -->\r\n" + "           </div>\r\n"
						+ "           <!-- /.col-lg-12 -->\r\n" + "       </div>\r\n" + "       <!-- /.row -->\r\n"
						+ "    </div>\r\n" + "    <!-- /#wrapper -->\r\n" + "\r\n" + "</body>\r\n" + "</html>");

	}
}