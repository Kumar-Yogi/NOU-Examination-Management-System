package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contactus_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Online Examination System</title>\n");
      out.write("        <link rel=\"shortcut icon\" href=\"Images/favicon.ico\" type=\"image/x-icon\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/bootstrap.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/style.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css\" integrity=\"sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200\" />\n");
      out.write("        <script src=\"JS/bootstrap.bundle.js\"></script>\n");
      out.write("        <script src=\"JS/script.js\"></script>\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid\"> \n");
      out.write("            <!--COntainer Started-->\n");
      out.write("\n");
      out.write("            <!--Header Started-->\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("            <!--Header Closed-->\n");
      out.write("\n");
      out.write("            <div class=\"row page-name\">\n");
      out.write("        <div class=\"col-sm-12\" style=\"display: flex; align-items: center; justify-content: center;\">\n");
      out.write("            <h1 style=\"font-weight: bold;\">CONTACT US</h1>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <!--Contact us div started-->\n");
      out.write("        <div class=\"row contactus-details-row\">\n");
      out.write("            <div class=\"col-sm-4  ps-5\" style=\"display:flex; align-items: center; text-align: justify;\">\n");
      out.write("                <p style=\"font-size: 18px; font-weight: bold;\"><i class=\"fa-solid fa-location-dot me-3\" style=\"font-size: 30px; color: #ffc107;\"></i><span>2nd/3rd Floor, Biscomoun Bhawan, ㅤㅤGandhi Maidan, Patna 800 001 ㅤㅤㅤㅤ(BIHAR).</span></p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-sm-4 pe-5 ps-5\" style=\"display:flex; align-items: center; text-align: center;\">\n");
      out.write("                <p style=\"font-size: 18px; font-weight: bold;\"><i class=\"fa-solid fa-phone me-3\" style=\"font-size: 30px; color: #ffc107;\"></i> +91 9935790781<br/>ㅤㅤㅤ+91 7309868656</p>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"col-sm-4 pe-5 ps-5\" style=\"display:flex; align-items: center; text-align: justify;\">\n");
      out.write("                <p style=\"font-size: 18px; font-weight: bold;\"><i class=\"fa-solid fa-envelope me-3\" style=\"font-size: 30px; color: #ffc107;\"></i>yogi@gpmahoba.in,ㅤㅤㅤㅤㅤㅤㅤㅤ yogendra@gpmahoba.in</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("\n");
      out.write("            <!-- map started -->\n");
      out.write("            <div class=\"col-sm-8 map\">\n");
      out.write("                <iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d918450.8144690121!2d84.43017970458844!3d25.94512294021002!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x39ed585a72898067%3A0x332ef319c1947f5e!2sNalanda%20Open%20University!5e0!3m2!1sen!2sin!4v1694930819601!5m2!1sen!2sin\" width=\"100%\" height=\"100%\" style=\"border:0;\" allowfullscreen=\"\" loading=\"lazy\" referrerpolicy=\"no-referrer-when-downgrade\"></iframe>\n");
      out.write("            </div>\n");
      out.write("            <!-- map closed -->\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!--Enquiry form sstarted-->\n");
      out.write("            <div class=\"col-sm-4\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <form class=\"form\" action=\"\">\n");
      out.write("                        <p class=\"title\">Contact Us</p>\n");
      out.write("                        <input placeholder=\"Name\" class=\"name input\" type=\"text\">\n");
      out.write("                        \n");
      out.write("                        <div class=\"radio-buttons-container input\">\n");
      out.write("                            <span class=\"gender-class\">Gender </span>\n");
      out.write("                        <div class=\"radio-button\">\n");
      out.write("                            \n");
      out.write("                            <input name=\"radio-group\" id=\"radio2\" class=\"radio-button__input\" type=\"radio\">\n");
      out.write("                            <label for=\"radio2\" class=\"radio-button__label\">\n");
      out.write("                              <span class=\"radio-button__custom\"></span>  \n");
      out.write("                                  Male\n");
      out.write("                            </label>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"radio-button\">\n");
      out.write("                            <input name=\"radio-group\" id=\"radio1\" class=\"radio-button__input\" type=\"radio\">\n");
      out.write("                            <label for=\"radio1\" class=\"radio-button__label\">\n");
      out.write("                              <span class=\"radio-button__custom\"></span>\n");
      out.write("                              \n");
      out.write("                              Female\n");
      out.write("                            </label>\n");
      out.write("                          </div>\n");
      out.write("                          </div>\n");
      out.write("                        <textarea name=\"address\" class=\"address input\" placeholder=\"Address\"></textarea>\n");
      out.write("                        <input placeholder=\"Mobile No.\" class=\"mobile input\" type=\"text\">\n");
      out.write("                        <input placeholder=\"Email\" class=\"email input\" type=\"email\">\n");
      out.write("                        <textarea name=\"enquirytext\" class=\"enquirytext input\" placeholder=\"Enquiry Question\"></textarea>\n");
      out.write("                        <button class=\"btn mb-5\" type=\"submit\">Submit</button>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!--Contact us div closed-->\n");
      out.write("    </div>\n");
      out.write("                       \n");
      out.write("            <!--Footer Started-->\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("            <!--Footer Closed-->\n");
      out.write("            <!--Container Closed-->\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
