package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<div class=\"row Header\">\n");
      out.write("              <div class=\"col-sm-12\">\n");
      out.write("                  <div class=\"row header-details-section pt-2\">\n");
      out.write("                      <div class=\"col-sm-3\"></div>\n");
      out.write("                      <div class=\"col-sm-3\" style=\"border-right: 1px solid white;\"><i class=\"fa-solid fa-phone me-2\"></i> +91 9935790781, 7309858656</div>\n");
      out.write("                      \n");
      out.write("                      <div class=\"col-sm-3\" style=\"border-right: 1px solid white;\"><i class=\"fa-solid fa-envelope me-2\"></i> yogichaurasiya@gpmahoba.in</div>\n");
      out.write("                \n");
      out.write("                      <div class=\"col-sm-3\" style=\"font-size: 20px;\"><i class=\"fa-brands fa-facebook ms-2 me-2\"></i><i class=\"fa-brands fa-twitter ms-2 me-2\"></i><i class=\"fa-brands fa-instagram ms-2 me-2\"></i><i class=\"fa-brands fa-linkedin ms-2 me-2\"></i><i class=\"fa-brands fa-youtube ms-2 me-2\"></i><i class=\"fa-brands fa-github ms-2\"></i></div>\n");
      out.write("                  </div>\n");
      out.write("                  <!--Title section closed-->\n");
      out.write("      \n");
      out.write("                   <!--Navbar Started-->\n");
      out.write("                   <div class=\"row header-menu-section\">\n");
      out.write("      \n");
      out.write("                      <div class=\"col-sm-12\">\n");
      out.write("                          <div class=\"row second-row\">\n");
      out.write("                              <nav class=\"navbar navbar-expand-lg\">\n");
      out.write("                                  <div class=\"container-fluid\">\n");
      out.write("      \n");
      out.write("                                    <!--Logo Started-->\n");
      out.write("                                    <div class=\"logo-name-img\">\n");
      out.write("                                      <img src=\"Images/logo.jpeg\" style=\"align-items: center; border:3px solid goldenrod; border-radius: 50%;\" class=\"ms-3 me-3\" height=\"50px;\" width=\"50px;\" alt=\"Logo\"/>\n");
      out.write("                                      <b style=\"font-size: 25px; align-items: center;\">NOU</b>\n");
      out.write("                                    </div>\n");
      out.write("                                    <!--Logo Finished-->\n");
      out.write("      \n");
      out.write("                                  <!--Toggler button started-->\n");
      out.write("                                    <button class=\"navbar-toggler\" style=\"float: right; margin-right: 0px;\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                                      <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                                    </button>\n");
      out.write("                                  <!--Toggler Button Closed-->\n");
      out.write("                                  \n");
      out.write("      \n");
      out.write("                                  <div class=\"menubar\">\n");
      out.write("                                    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                                      <ul class=\"navbar-nav ms-5 mb-2 mb-lg-0\">\n");
      out.write("      \n");
      out.write("                                        <li class=\"nav-item ms-5\" >\n");
      out.write("                                            <a class=\"nav-link\" aria-current=\"page\" href=\"index.jsp\"><i class=\"fa-solid fa-house me-2\"></i>Home</a>\n");
      out.write("                                        </li>\n");
      out.write("                              \n");
      out.write("                                        <li class=\"nav-item ms-3\">\n");
      out.write("                                          <a class=\"nav-link\" href=\"#\"><i class=\"fa-solid fa-address-book me-2\"></i>About Us</a>\n");
      out.write("                                        </li>\n");
      out.write("                              \n");
      out.write("                                        <li class=\"nav-item ms-3\">\n");
      out.write("                                            <a class=\"nav-link\" href=\"registration.jsp\"><i class=\"fa-solid fa-users me-2\"></i>Register<i class=\"fa-solid fa-angle-down ms-2\"></i></a>\n");
      out.write("                                        </li>\n");
      out.write("                              \n");
      out.write("                                        <li class=\"nav-item ms-3\">\n");
      out.write("                                            <a class=\"nav-link\" href=\"login.jsp\"><i class=\"fa-solid fa-user me-2\"></i>Login<i class=\"fa-solid fa-angle-down ms-2\"></i></a>\n");
      out.write("                                          \n");
      out.write("                              \n");
      out.write("                                        </li>\n");
      out.write("                              \n");
      out.write("                                        <li class=\"nav-item ms-3 me-5\">\n");
      out.write("                                            <a class=\"nav-link\" href=\"contactus.jsp\"><i class=\"fa-solid fa-phone me-2\"></i>Contact Us</a>\n");
      out.write("                                        </li>\n");
      out.write("                                        \n");
      out.write("                                      </ul>\n");
      out.write("                                    </div>\n");
      out.write("                                  </div>  \n");
      out.write("                                  </div>\n");
      out.write("                                </nav>\n");
      out.write("                          </div>\n");
      out.write("                      </div>\n");
      out.write("          <!--Navbar Closed-->\n");
      out.write("      \n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("            <!--Header Section Closed-->");
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
