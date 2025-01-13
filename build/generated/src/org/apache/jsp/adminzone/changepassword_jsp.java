package org.apache.jsp.adminzone;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class changepassword_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Change Password</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"../CSS/bootstrap.css\">\n");
      out.write("    <!-- <link rel=\"stylesheet\" href=\"CSS/style.css\"> -->\n");
      out.write("    <script src=\"../JS/bootstrap.bundle.js\"></script>\n");
      out.write("    <style>\n");
      out.write("  \n");
      out.write("  .page-name{\n");
      out.write("  height: 100px;\n");
      out.write("  /* border: 1px solid black; */\n");
      out.write("  color: #ffc107;\n");
      out.write("  /*background-color: #04014a;*/\n");
      out.write("    background: linear-gradient(60deg, #04014a 0% 27.5%, #ffc107 27.5% 28%, #04014a 28% 28.5%, #ffc107 28.5% 29%, #04014a 29% 100%);\n");
      out.write("\n");
      out.write("  /* position: fixed; */\n");
      out.write("  /* position: fixed; */\n");
      out.write("}\n");
      out.write("\n");
      out.write(".changepassword-menubar{\n");
      out.write("     height: 70px;\n");
      out.write("  /* border: 1px solid black; */\n");
      out.write("  color: #04014a;\n");
      out.write("  /*background-color: #04014a;*/\n");
      out.write("    background: linear-gradient(60deg, #ffc107 0% 29.5%, #04014a 29.5% 30%, #ffc107 30% 30.5%, #04014a 30.5% 31%, #ffc107 31% 100%);\n");
      out.write("}\n");
      out.write(" \n");
      out.write(".form {\n");
      out.write("    width: auto;\n");
      out.write("    height: auto;\n");
      out.write("    /* background-image: linear-gradient(to bottom, #424242,#212121); */\n");
      out.write("    background-color: white;\n");
      out.write("    border: 1px solid #04014a;\n");
      out.write("    display: flex;\n");
      out.write("    align-items: center;\n");
      out.write("    flex-direction: column;\n");
      out.write("    border-radius: 0.5rem;\n");
      out.write("    /* background-color: rgb(4, 1, 74, 0.6); */\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  .title-name {\n");
      out.write("    color: #ffc107;\n");
      out.write("    margin: 1rem 0;\n");
      out.write("    font-size: 2rem;\n");
      out.write("    font-weight: bold;\n");
      out.write("    font-weight: 600;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  .input {\n");
      out.write("    margin: 0.5rem 0;\n");
      out.write("    padding: 1rem 0.5rem;\n");
      out.write("    width: 80%;\n");
      out.write("    background-color: inherit;\n");
      out.write("    color: #04014a;\n");
      out.write("    border: none;\n");
      out.write("    outline: none;\n");
      out.write("  }\n");
      out.write(" \n");
      out.write("  \n");
      out.write("  .password {\n");
      out.write("    border-bottom: 1px solid #04014a;\n");
      out.write("    transition: all 400ms;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  .password:hover {\n");
      out.write("    background-color: #ffc107;\n");
      out.write("    border: none;\n");
      out.write("    border-radius: 0.5rem;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  .btn {\n");
      out.write("    height: 3rem;\n");
      out.write("    width: 20rem;\n");
      out.write("    margin-top: 3rem;\n");
      out.write("    background-color: #ffc107;\n");
      out.write("    border-radius: 0.5rem;\n");
      out.write("    border: none;\n");
      out.write("    font-size: 1.2rem;\n");
      out.write("    transition: all 400ms;\n");
      out.write("    box-shadow: 0 0 10px  #ffc107, 0 0 10px #ffc107;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  .btn:hover {\n");
      out.write("    background-color: #04014a;\n");
      out.write("    box-shadow: none;\n");
      out.write("    color: #ffc107;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  .change-password{\n");
      out.write("    align-items: center;\n");
      out.write("    justify-content: center;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  .back-button-box:hover{\n");
      out.write("     color:#04014a; \n");
      out.write("  }\n");
      out.write("  </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("        <script>\n");
      out.write("            function validate()\n");
      out.write("            {\n");
      out.write("                var op=document.getElementById(\"oldpassword\");\n");
      out.write("                var np=document.getElementById(\"newpassword\");\n");
      out.write("                var cp=document.getElementById(\"confirmpassword\");\n");
      out.write("                \n");
      out.write("                if(op.value==\"\" || op.value==null){\n");
      out.write("                    alert('please enter old password');\n");
      out.write("                    op.focus();\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("                else if(np.value==\"\" || np.value==null){\n");
      out.write("                    alert('please enter new password');\n");
      out.write("                    op.focus();\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("                else if(cp.value==\"\" || cp.value==null){\n");
      out.write("                    alert('please enter confirm password');\n");
      out.write("                    cp.focus();\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("                else if(np.value!=cp.value){\n");
      out.write("                    alert('new password and confirm password are not matched');\n");
      out.write("                    cp.focus();\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("                else{\n");
      out.write("                    document.getElementById(\"frmchangepassword\").submit();\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    \n");
      out.write("    <div class=\"container-fluid \">\n");
      out.write("        <div class=\"row page-name\">\n");
      out.write("            <div class=\"col-sm-12\" style=\"display: flex; align-items: center; justify-content: center;\">\n");
      out.write("                <h1 style=\"font-weight: bold;\">CHANGE PASSWORD</h1>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"row changepassword-menubar\">\n");
      out.write("            <div class=\"col-sm-12 align-items-center\">\n");
      out.write("                <span style=\"font-size: 30px; font-weight: 500; text-decoration: none; color: #fff;\" class=\"back-button-box\"><a href=\"adminhome.jsp\" style=\"text-decoration: none; color: #fff;\">Back</a> >> <a>Change Password</a></span>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"row change-password-page\">\n");
      out.write("          <div class=\"col-sm-3\"></div>\n");
      out.write("          <div class=\"col-sm-6\">\n");
      out.write("            <form class=\"form mt-5 ms-5 me-5\" method=\"post\" id=\"frmchangepassword\" onsubmit=\"event.preventDefault(); validate();\" action=\"admincontroller.jsp\">\n");
      out.write("              <p class=\"title-name\">Change Password</p>\n");
      out.write("              <input type=\"hidden\" name=\"page\" value=\"changepassword\"/>\n");
      out.write("              \n");
      out.write("              <input placeholder=\"Old Password\" name=\"oldpassword\" class=\"password input\" type=\"password\" id=\"oldpassword\" required>\n");
      out.write("\n");
      out.write("              <input placeholder=\"New Password\" name=\"newpassword\" class=\"password input\" type=\"password\" id=\"newpassword\" required>\n");
      out.write("\n");
      out.write("              <input placeholder=\"Confirm Password\" name=\"confirmpassowrd\" class=\"password input\" type=\"password\" id=\"confirmpassword\" required>\n");
      out.write("              <button class=\"btn mb-5\" type=\"submit\">Login</button>\n");
      out.write("          </form>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-sm-3\"></div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
